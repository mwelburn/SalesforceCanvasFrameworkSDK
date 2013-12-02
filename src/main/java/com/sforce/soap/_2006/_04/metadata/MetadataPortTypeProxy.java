package com.sforce.soap._2006._04.metadata;

public class MetadataPortTypeProxy implements com.sforce.soap._2006._04.metadata.MetadataPortType {
  private String _endpoint = null;
  private com.sforce.soap._2006._04.metadata.MetadataPortType metadataPortType = null;
  
  public MetadataPortTypeProxy() {
    _initMetadataPortTypeProxy();
  }
  
  public MetadataPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetadataPortTypeProxy();
  }
  
  private void _initMetadataPortTypeProxy() {
    try {
      metadataPortType = (new com.sforce.soap._2006._04.metadata.MetadataServiceLocator()).getMetadata();
      if (metadataPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metadataPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metadataPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metadataPortType != null)
      ((javax.xml.rpc.Stub)metadataPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap._2006._04.metadata.MetadataPortType getMetadataPortType() {
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType;
  }
  
  public com.sforce.soap._2006._04.metadata.DeployResult checkDeployStatus(java.lang.String asyncProcessId, boolean includeDetails) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.checkDeployStatus(asyncProcessId, includeDetails);
  }
  
  public com.sforce.soap._2006._04.metadata.RetrieveResult checkRetrieveStatus(java.lang.String asyncProcessId) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.checkRetrieveStatus(asyncProcessId);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult[] checkStatus(java.lang.String[] asyncProcessId) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.checkStatus(asyncProcessId);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult[] create(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.create(metadata);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult[] delete(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.delete(metadata);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult deploy(byte[] zipFile, com.sforce.soap._2006._04.metadata.DeployOptions deployOptions) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.deploy(zipFile, deployOptions);
  }
  
  public com.sforce.soap._2006._04.metadata.DescribeMetadataResult describeMetadata(double asOfVersion) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.describeMetadata(asOfVersion);
  }
  
  public com.sforce.soap._2006._04.metadata.FileProperties[] listMetadata(com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries, double asOfVersion) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.listMetadata(queries, asOfVersion);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult retrieve(com.sforce.soap._2006._04.metadata.RetrieveRequest retrieveRequest) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.retrieve(retrieveRequest);
  }
  
  public com.sforce.soap._2006._04.metadata.AsyncResult[] update(com.sforce.soap._2006._04.metadata.UpdateMetadata[] updateMetadata) throws java.rmi.RemoteException{
    if (metadataPortType == null)
      _initMetadataPortTypeProxy();
    return metadataPortType.update(updateMetadata);
  }
  
  
}