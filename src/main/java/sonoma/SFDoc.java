package sonoma;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sforce.soap._2006._04.metadata.AsyncRequestState;
import com.sforce.soap._2006._04.metadata.AsyncResult;
import com.sforce.soap._2006._04.metadata.FileProperties;
import com.sforce.soap._2006._04.metadata.ListMetadataQuery;
import com.sforce.soap._2006._04.metadata.MetadataBindingStub;
import com.sforce.soap._2006._04.metadata.MetadataServiceLocator;
import com.sforce.soap._2006._04.metadata.PackageTypeMembers;
import com.sforce.soap._2006._04.metadata.Profile;
import com.sforce.soap._2006._04.metadata.RetrieveMessage;
import com.sforce.soap._2006._04.metadata.RetrieveRequest;
import com.sforce.soap._2006._04.metadata.RetrieveResult;
import com.sforce.soap._2006._04.metadata._package;

/*
 * Code referenced from:
 * 		http://www.salesforce.com/us/developer/docs/api_meta/Content/meta_retrieve.htm
 */
public class SFDoc 
{
    // one second in milliseconds
    private static final long ONE_SECOND = 1000;
    // maximum number of attempts to retrieve the results
    private static final int MAX_NUM_POLL_REQUESTS = 50; 

    // manifest file that controls which components get retrieved
    private static final String MANIFEST_FILE = "package.xml"; 
    
    private static final double API_VERSION = 29.0; 
    
	protected MetadataBindingStub metadatabinding;
	
	public void initMetadataBinding(String instanceUrl, String sessionId) throws ServiceException
	{
		if (metadatabinding == null)
		{
			metadatabinding = (MetadataBindingStub)new MetadataServiceLocator().getMetadata();
	        // TODO - remove hardcoded url
			metadatabinding._setProperty(MetadataBindingStub.ENDPOINT_ADDRESS_PROPERTY, instanceUrl);
	
	        SessionHeader sh = new SessionHeader();
	        sh.setSessionId(sessionId);
	        
	        metadatabinding.setHeader(new MetadataServiceLocator().getServiceName().getNamespaceURI(), "SessionHeader", sh);
		}
	}
	
	public List<String> getProfiles() throws RemoteException 
	{	
		ListMetadataQuery query = new ListMetadataQuery();
		query.setType("Profile");
		//query.setFolder(null);
		ListMetadataQuery query2 = new ListMetadataQuery();
		query2.setType("CustomTab");
		//query2.setFolder(null);
		
		List<String> mylist = new ArrayList<String>();
		double asOfVersion = 29.0;
		// Assuming that the SOAP binding has already been established.
		FileProperties[] lmr = metadatabinding.listMetadata(new ListMetadataQuery[] {query, query2}, asOfVersion);
		if (lmr != null) {
			for (FileProperties n : lmr) {
				System.out.println("Component fullName: " + n.getFullName());
				System.out.println("Component type: " + n.getType());
				mylist.add(n.getFullName() + " : " + n.getType());
			}
		}
		return mylist;
	}
	
	public void test() throws Exception
	{
		RetrieveRequest req = new RetrieveRequest();
		req.setApiVersion(API_VERSION);
		setUnpackaged(req);
		
		AsyncResult asyncResult = metadatabinding.retrieve(req);
		int poll = 0;
        long waitTimeMilliSecs = ONE_SECOND;
        while (!asyncResult.isDone()) {
            Thread.sleep(waitTimeMilliSecs);
            // double the wait time for the next iteration
            waitTimeMilliSecs *= 2;
            if (poll++ > MAX_NUM_POLL_REQUESTS) {
                throw new Exception("Request timed out.  If this is a large set " +
                		"of metadata components, check that the time allowed " +
                		"by MAX_NUM_POLL_REQUESTS is sufficient.");
            }
            asyncResult = metadatabinding.checkStatus(
            		new String[] {asyncResult.getId()})[0];
            System.out.println("Status is: " + asyncResult.getState());
        }

        if (asyncResult.getState() != AsyncRequestState.Completed) {
            throw new Exception(asyncResult.getStatusCode() + " msg: " +
                    asyncResult.getMessage());
        }

        RetrieveResult result = metadatabinding.checkRetrieveStatus(asyncResult.getId());
        
        // Print out any warning messages
        StringBuilder buf = new StringBuilder();
        if (result.getMessages() != null) {
            for (RetrieveMessage rm : result.getMessages()) {
                buf.append(rm.getFileName() + " - " + rm.getProblem());
            }
        }
        if (buf.length() > 0) {
            System.out.println("Retrieve warnings:\n" + buf);
        }
        
     // Write the zip to the file system
        System.out.println("Writing results to zip file");
        ByteArrayInputStream bais = new ByteArrayInputStream(result.getZipFile());
        File resultsFile = new File("retrieveResults.zip");
        FileOutputStream os = new FileOutputStream(resultsFile);
        try {
            ReadableByteChannel src = Channels.newChannel(bais);
            FileChannel dest = os.getChannel();
            copy(src, dest);
            
            System.out.println("Results written to " + resultsFile.getAbsolutePath());
        }
        finally {
            os.close();
        }
	}
	
	/**
     * Helper method to copy from a readable channel to a writable channel,
     * using an in-memory buffer.
     */
    private void copy(ReadableByteChannel src, WritableByteChannel dest)
        throws IOException
    {
        // use an in-memory byte buffer
        ByteBuffer buffer = ByteBuffer.allocate(8092);
        while (src.read(buffer) != -1) {
            buffer.flip();
            while(buffer.hasRemaining()) {
                dest.write(buffer);
            }
            buffer.clear();
        }
    }
	
    private void setUnpackaged(RetrieveRequest request) throws Exception
    {
        // Edit the path, if necessary, if your package.xml file is located elsewhere
        File unpackedManifest = new File(MANIFEST_FILE);
        System.out.println("Manifest file: " + unpackedManifest.getAbsolutePath());
        
        if (!unpackedManifest.exists() || !unpackedManifest.isFile())
            throw new Exception("Should provide a valid retrieve manifest " +
                    "for unpackaged content. " +
                    "Looking for " + unpackedManifest.getAbsolutePath());

        // Note that we populate the _package object by parsing a manifest file here.
        // You could populate the _package based on any source for your
        // particular application.
        _package p = parsePackage(unpackedManifest);
        request.setUnpackaged(p);
    }
	
    private _package parsePackage(File file) throws Exception {
        try {
            InputStream is = new FileInputStream(file);
            List<PackageTypeMembers> pd = new ArrayList<PackageTypeMembers>();
            DocumentBuilder db =
                DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Element d = db.parse(is).getDocumentElement();
            for (Node c = d.getFirstChild(); c != null; c = c.getNextSibling()) {
                if (c instanceof Element) {
                    Element ce = (Element)c;
                    //
                    NodeList namee = ce.getElementsByTagName("name");
                    if (namee.getLength() == 0) {
                        // not
                        continue;
                    }
                    String name = namee.item(0).getTextContent();
                    NodeList m = ce.getElementsByTagName("members");
                    List<String> members = new ArrayList<String>();
                    for (int i = 0; i < m.getLength(); i++) {
                        Node mm = m.item(i);
                        members.add(mm.getTextContent());
                    }
                    PackageTypeMembers pdi = new PackageTypeMembers();
                    pdi.setName(name);
                    pdi.setMembers(members.toArray(new String[members.size()]));
                    pd.add(pdi);
                }
            }
            _package r = new _package();
            r.setTypes(pd.toArray(new PackageTypeMembers[pd.size()]));
            r.setVersion(API_VERSION + "");
            return r;
        } catch (ParserConfigurationException pce) {
            throw new Exception("Cannot create XML parser", pce);
        } catch (IOException ioe) {
            throw new Exception(ioe);
        } catch (SAXException se) {
            throw new Exception(se);
        }
    }
    
    private void retrieveZip() throws RemoteException, Exception
    {
        RetrieveRequest retrieveRequest = new RetrieveRequest();
        retrieveRequest.setApiVersion(API_VERSION);
        setUnpackaged(retrieveRequest);

        AsyncResult asyncResult = metadatabinding.retrieve(retrieveRequest);
        // Wait for the retrieve to complete
        int poll = 0;
        long waitTimeMilliSecs = ONE_SECOND;
        while (!asyncResult.isDone()) {
            Thread.sleep(waitTimeMilliSecs);
            // double the wait time for the next iteration
            waitTimeMilliSecs *= 2;
            if (poll++ > MAX_NUM_POLL_REQUESTS) {
                throw new Exception("Request timed out.  If this is a large set " +
                		"of metadata components, check that the time allowed " +
                		"by MAX_NUM_POLL_REQUESTS is sufficient.");
            }
            asyncResult = metadatabinding.checkStatus(
            		new String[] {asyncResult.getId()})[0];
            System.out.println("Status is: " + asyncResult.getState());
        }

        if (asyncResult.getState() != AsyncRequestState.Completed) {
            throw new Exception(asyncResult.getStatusCode() + " msg: " +
                    asyncResult.getMessage());
        }

        RetrieveResult result = metadatabinding.checkRetrieveStatus(asyncResult.getId());
        
        // Print out any warning messages
        StringBuilder buf = new StringBuilder();
        if (result.getMessages() != null) {
            for (RetrieveMessage rm : result.getMessages()) {
                buf.append(rm.getFileName() + " - " + rm.getProblem());
            }
        }
        if (buf.length() > 0) {
            System.out.println("Retrieve warnings:\n" + buf);
        }
/*
        // Write the zip to the file system
        System.out.println("Writing results to zip file");
        ByteArrayInputStream bais = new ByteArrayInputStream(result.getZipFile());
        File resultsFile = new File("retrieveResults.zip");
        FileOutputStream os = new FileOutputStream(resultsFile);
        try {
            ReadableByteChannel src = Channels.newChannel(bais);
            FileChannel dest = os.getChannel();
            copy(src, dest);
            
            System.out.println("Results written to " + resultsFile.getAbsolutePath());
        }
        finally {
            os.close();
        }
*/
        ByteArrayInputStream bais = new ByteArrayInputStream(result.getZipFile());
        ZipInputStream zis = new ZipInputStream(bais);
        
        //ZipFile zip = new ZipFile()
    }
    
	public class SessionHeader
	{
		public String _sessionId;
		
		public void setSessionId(String sessionId)
		{
			this._sessionId = sessionId;
		}
		
		public String getSessionId()
		{
			return this._sessionId;
		}
	}
}
