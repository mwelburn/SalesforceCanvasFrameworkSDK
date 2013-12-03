

/**
 * MetadataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.sforce.soap._2006._04.metadata;

    /*
     *  MetadataService java interface
     */

    public interface MetadataService {
          

        /**
          * Auto generated method signature
          * Updates metadata entries asyncronously.
                    * @param update18
                
                    * @param sessionHeader19
                
                    * @param callOptions20
                
         */

         
                     public com.sforce.soap._2006._04.metadata.UpdateResponse update(

                        com.sforce.soap._2006._04.metadata.Update update18,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader19,com.sforce.soap._2006._04.metadata.CallOptions callOptions20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Updates metadata entries asyncronously.
                * @param update18
            
                * @param sessionHeader19
            
                * @param callOptions20
            
          */
        public void startupdate(

            com.sforce.soap._2006._04.metadata.Update update18,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader19,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions20,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes metadata entries asyncronously.
                    * @param delete22
                
                    * @param sessionHeader23
                
                    * @param callOptions24
                
         */

         
                     public com.sforce.soap._2006._04.metadata.DeleteResponse delete(

                        com.sforce.soap._2006._04.metadata.Delete delete22,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader23,com.sforce.soap._2006._04.metadata.CallOptions callOptions24)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes metadata entries asyncronously.
                * @param delete22
            
                * @param sessionHeader23
            
                * @param callOptions24
            
          */
        public void startdelete(

            com.sforce.soap._2006._04.metadata.Delete delete22,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader23,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions24,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Describes features of the metadata API.
                    * @param describeMetadata26
                
                    * @param sessionHeader27
                
                    * @param callOptions28
                
         */

         
                     public com.sforce.soap._2006._04.metadata.DescribeMetadataResponse describeMetadata(

                        com.sforce.soap._2006._04.metadata.DescribeMetadata describeMetadata26,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader27,com.sforce.soap._2006._04.metadata.CallOptions callOptions28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Describes features of the metadata API.
                * @param describeMetadata26
            
                * @param sessionHeader27
            
                * @param callOptions28
            
          */
        public void startdescribeMetadata(

            com.sforce.soap._2006._04.metadata.DescribeMetadata describeMetadata26,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader27,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions28,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deploys a zipfile full of metadata entries asynchronously.
                    * @param deploy30
                
                    * @param sessionHeader31
                
                    * @param debuggingHeader32
                
                    * @param callOptions33
                
         */

         
                     public com.sforce.soap._2006._04.metadata.DeployResponse deploy(

                        com.sforce.soap._2006._04.metadata.Deploy deploy30,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader31,com.sforce.soap._2006._04.metadata.DebuggingHeader debuggingHeader32,com.sforce.soap._2006._04.metadata.CallOptions callOptions33)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deploys a zipfile full of metadata entries asynchronously.
                * @param deploy30
            
                * @param sessionHeader31
            
                * @param debuggingHeader32
            
                * @param callOptions33
            
          */
        public void startdeploy(

            com.sforce.soap._2006._04.metadata.Deploy deploy30,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader31,
                com.sforce.soap._2006._04.metadata.DebuggingHeader debuggingHeader32,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions33,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Check the current status of an asyncronous call.
                    * @param checkStatus35
                
                    * @param sessionHeader36
                
                    * @param callOptions37
                
         */

         
                     public com.sforce.soap._2006._04.metadata.CheckStatusResponse checkStatus(

                        com.sforce.soap._2006._04.metadata.CheckStatus checkStatus35,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader36,com.sforce.soap._2006._04.metadata.CallOptions callOptions37)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Check the current status of an asyncronous call.
                * @param checkStatus35
            
                * @param sessionHeader36
            
                * @param callOptions37
            
          */
        public void startcheckStatus(

            com.sforce.soap._2006._04.metadata.CheckStatus checkStatus35,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader36,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions37,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves a set of individually specified metadata entries.
                    * @param retrieve39
                
                    * @param sessionHeader40
                
                    * @param callOptions41
                
         */

         
                     public com.sforce.soap._2006._04.metadata.RetrieveResponse retrieve(

                        com.sforce.soap._2006._04.metadata.Retrieve retrieve39,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader40,com.sforce.soap._2006._04.metadata.CallOptions callOptions41)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves a set of individually specified metadata entries.
                * @param retrieve39
            
                * @param sessionHeader40
            
                * @param callOptions41
            
          */
        public void startretrieve(

            com.sforce.soap._2006._04.metadata.Retrieve retrieve39,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader40,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions41,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Check the current status of an asyncronous deploy call.
                    * @param checkRetrieveStatus43
                
                    * @param sessionHeader44
                
                    * @param callOptions45
                
         */

         
                     public com.sforce.soap._2006._04.metadata.CheckRetrieveStatusResponse checkRetrieveStatus(

                        com.sforce.soap._2006._04.metadata.CheckRetrieveStatus checkRetrieveStatus43,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader44,com.sforce.soap._2006._04.metadata.CallOptions callOptions45)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Check the current status of an asyncronous deploy call.
                * @param checkRetrieveStatus43
            
                * @param sessionHeader44
            
                * @param callOptions45
            
          */
        public void startcheckRetrieveStatus(

            com.sforce.soap._2006._04.metadata.CheckRetrieveStatus checkRetrieveStatus43,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader44,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions45,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Lists the available metadata components.
                    * @param listMetadata47
                
                    * @param sessionHeader48
                
                    * @param callOptions49
                
         */

         
                     public com.sforce.soap._2006._04.metadata.ListMetadataResponse listMetadata(

                        com.sforce.soap._2006._04.metadata.ListMetadata listMetadata47,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader48,com.sforce.soap._2006._04.metadata.CallOptions callOptions49)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Lists the available metadata components.
                * @param listMetadata47
            
                * @param sessionHeader48
            
                * @param callOptions49
            
          */
        public void startlistMetadata(

            com.sforce.soap._2006._04.metadata.ListMetadata listMetadata47,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader48,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions49,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Creates new metadata entries asyncronously.
                    * @param create51
                
                    * @param sessionHeader52
                
                    * @param callOptions53
                
         */

         
                     public com.sforce.soap._2006._04.metadata.CreateResponse create(

                        com.sforce.soap._2006._04.metadata.Create create51,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader52,com.sforce.soap._2006._04.metadata.CallOptions callOptions53)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Creates new metadata entries asyncronously.
                * @param create51
            
                * @param sessionHeader52
            
                * @param callOptions53
            
          */
        public void startcreate(

            com.sforce.soap._2006._04.metadata.Create create51,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader52,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions53,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Check the current status of an asyncronous deploy call.
                    * @param checkDeployStatus55
                
                    * @param sessionHeader56
                
                    * @param callOptions57
                
         */

         
                     public com.sforce.soap._2006._04.metadata.CheckDeployStatusResponse checkDeployStatus(

                        com.sforce.soap._2006._04.metadata.CheckDeployStatus checkDeployStatus55,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader56,com.sforce.soap._2006._04.metadata.CallOptions callOptions57)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Check the current status of an asyncronous deploy call.
                * @param checkDeployStatus55
            
                * @param sessionHeader56
            
                * @param callOptions57
            
          */
        public void startcheckDeployStatus(

            com.sforce.soap._2006._04.metadata.CheckDeployStatus checkDeployStatus55,com.sforce.soap._2006._04.metadata.SessionHeader sessionHeader56,
                com.sforce.soap._2006._04.metadata.CallOptions callOptions57,
                

            final com.sforce.soap._2006._04.metadata.MetadataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    