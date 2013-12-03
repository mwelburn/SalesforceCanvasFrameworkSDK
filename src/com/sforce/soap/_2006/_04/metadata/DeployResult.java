
/**
 * DeployResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sforce.soap._2006._04.metadata;
            

            /**
            *  DeployResult bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DeployResult
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DeployResult
                Namespace URI = http://soap.sforce.com/2006/04/metadata
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CheckOnly
                        */

                        
                                    protected boolean localCheckOnly ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCheckOnly(){
                               return localCheckOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckOnly
                               */
                               public void setCheckOnly(boolean param){
                            
                                            this.localCheckOnly=param;
                                    

                               }
                            

                        /**
                        * field for CompletedDate
                        */

                        
                                    protected java.util.Calendar localCompletedDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompletedDateTracker = false ;

                           public boolean isCompletedDateSpecified(){
                               return localCompletedDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCompletedDate(){
                               return localCompletedDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompletedDate
                               */
                               public void setCompletedDate(java.util.Calendar param){
                            localCompletedDateTracker = param != null;
                                   
                                            this.localCompletedDate=param;
                                    

                               }
                            

                        /**
                        * field for CreatedDate
                        */

                        
                                    protected java.util.Calendar localCreatedDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedDate(){
                               return localCreatedDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedDate
                               */
                               public void setCreatedDate(java.util.Calendar param){
                            
                                            this.localCreatedDate=param;
                                    

                               }
                            

                        /**
                        * field for Details
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.DeployDetails localDetails ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.DeployDetails
                           */
                           public  com.sforce.soap._2006._04.metadata.DeployDetails getDetails(){
                               return localDetails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Details
                               */
                               public void setDetails(com.sforce.soap._2006._04.metadata.DeployDetails param){
                            
                                            this.localDetails=param;
                                    

                               }
                            

                        /**
                        * field for Done
                        */

                        
                                    protected boolean localDone ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDone(){
                               return localDone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Done
                               */
                               public void setDone(boolean param){
                            
                                            this.localDone=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;

                           public boolean isErrorMessageSpecified(){
                               return localErrorMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            localErrorMessageTracker = param != null;
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

                        /**
                        * field for ErrorStatusCode
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.StatusCode localErrorStatusCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorStatusCodeTracker = false ;

                           public boolean isErrorStatusCodeSpecified(){
                               return localErrorStatusCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.StatusCode
                           */
                           public  com.sforce.soap._2006._04.metadata.StatusCode getErrorStatusCode(){
                               return localErrorStatusCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorStatusCode
                               */
                               public void setErrorStatusCode(com.sforce.soap._2006._04.metadata.StatusCode param){
                            localErrorStatusCodeTracker = param != null;
                                   
                                            this.localErrorStatusCode=param;
                                    

                               }
                            

                        /**
                        * field for Id
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.ID localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.ID
                           */
                           public  com.sforce.soap._2006._04.metadata.ID getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(com.sforce.soap._2006._04.metadata.ID param){
                            
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for IgnoreWarnings
                        */

                        
                                    protected boolean localIgnoreWarnings ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIgnoreWarnings(){
                               return localIgnoreWarnings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IgnoreWarnings
                               */
                               public void setIgnoreWarnings(boolean param){
                            
                                            this.localIgnoreWarnings=param;
                                    

                               }
                            

                        /**
                        * field for LastModifiedDate
                        */

                        
                                    protected java.util.Calendar localLastModifiedDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastModifiedDateTracker = false ;

                           public boolean isLastModifiedDateSpecified(){
                               return localLastModifiedDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastModifiedDate(){
                               return localLastModifiedDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastModifiedDate
                               */
                               public void setLastModifiedDate(java.util.Calendar param){
                            localLastModifiedDateTracker = param != null;
                                   
                                            this.localLastModifiedDate=param;
                                    

                               }
                            

                        /**
                        * field for NumberComponentErrors
                        */

                        
                                    protected int localNumberComponentErrors ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberComponentErrors(){
                               return localNumberComponentErrors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberComponentErrors
                               */
                               public void setNumberComponentErrors(int param){
                            
                                            this.localNumberComponentErrors=param;
                                    

                               }
                            

                        /**
                        * field for NumberComponentsDeployed
                        */

                        
                                    protected int localNumberComponentsDeployed ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberComponentsDeployed(){
                               return localNumberComponentsDeployed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberComponentsDeployed
                               */
                               public void setNumberComponentsDeployed(int param){
                            
                                            this.localNumberComponentsDeployed=param;
                                    

                               }
                            

                        /**
                        * field for NumberComponentsTotal
                        */

                        
                                    protected int localNumberComponentsTotal ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberComponentsTotal(){
                               return localNumberComponentsTotal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberComponentsTotal
                               */
                               public void setNumberComponentsTotal(int param){
                            
                                            this.localNumberComponentsTotal=param;
                                    

                               }
                            

                        /**
                        * field for NumberTestErrors
                        */

                        
                                    protected int localNumberTestErrors ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberTestErrors(){
                               return localNumberTestErrors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberTestErrors
                               */
                               public void setNumberTestErrors(int param){
                            
                                            this.localNumberTestErrors=param;
                                    

                               }
                            

                        /**
                        * field for NumberTestsCompleted
                        */

                        
                                    protected int localNumberTestsCompleted ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberTestsCompleted(){
                               return localNumberTestsCompleted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberTestsCompleted
                               */
                               public void setNumberTestsCompleted(int param){
                            
                                            this.localNumberTestsCompleted=param;
                                    

                               }
                            

                        /**
                        * field for NumberTestsTotal
                        */

                        
                                    protected int localNumberTestsTotal ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberTestsTotal(){
                               return localNumberTestsTotal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberTestsTotal
                               */
                               public void setNumberTestsTotal(int param){
                            
                                            this.localNumberTestsTotal=param;
                                    

                               }
                            

                        /**
                        * field for RollbackOnError
                        */

                        
                                    protected boolean localRollbackOnError ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRollbackOnError(){
                               return localRollbackOnError;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RollbackOnError
                               */
                               public void setRollbackOnError(boolean param){
                            
                                            this.localRollbackOnError=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected java.util.Calendar localStartDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStartDateTracker = false ;

                           public boolean isStartDateSpecified(){
                               return localStartDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(java.util.Calendar param){
                            localStartDateTracker = param != null;
                                   
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for StateDetail
                        */

                        
                                    protected java.lang.String localStateDetail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateDetailTracker = false ;

                           public boolean isStateDetailSpecified(){
                               return localStateDetailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStateDetail(){
                               return localStateDetail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateDetail
                               */
                               public void setStateDetail(java.lang.String param){
                            localStateDetailTracker = param != null;
                                   
                                            this.localStateDetail=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.DeployStatus localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.DeployStatus
                           */
                           public  com.sforce.soap._2006._04.metadata.DeployStatus getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.sforce.soap._2006._04.metadata.DeployStatus param){
                            
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for Success
                        */

                        
                                    protected boolean localSuccess ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSuccess(){
                               return localSuccess;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Success
                               */
                               public void setSuccess(boolean param){
                            
                                            this.localSuccess=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://soap.sforce.com/2006/04/metadata");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DeployResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DeployResult",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "checkOnly", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("checkOnly cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckOnly));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCompletedDateTracker){
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "completedDate", xmlWriter);
                             

                                          if (localCompletedDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("completedDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompletedDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "createdDate", xmlWriter);
                             

                                          if (localCreatedDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("createdDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("details cannot be null!!");
                                            }
                                           localDetails.serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","details"),
                                               xmlWriter);
                                        
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "done", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("done cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDone));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localErrorMessageTracker){
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "errorMessage", xmlWriter);
                             

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("errorMessage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorStatusCodeTracker){
                                            if (localErrorStatusCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("errorStatusCode cannot be null!!");
                                            }
                                           localErrorStatusCode.serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","errorStatusCode"),
                                               xmlWriter);
                                        }
                                            if (localId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                            }
                                           localId.serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","id"),
                                               xmlWriter);
                                        
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "ignoreWarnings", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ignoreWarnings cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIgnoreWarnings));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localLastModifiedDateTracker){
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "lastModifiedDate", xmlWriter);
                             

                                          if (localLastModifiedDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("lastModifiedDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModifiedDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numberComponentErrors", xmlWriter);
                             
                                               if (localNumberComponentErrors==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberComponentErrors cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberComponentErrors));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numberComponentsDeployed", xmlWriter);
                             
                                               if (localNumberComponentsDeployed==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberComponentsDeployed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberComponentsDeployed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numberComponentsTotal", xmlWriter);
                             
                                               if (localNumberComponentsTotal==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberComponentsTotal cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberComponentsTotal));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numberTestErrors", xmlWriter);
                             
                                               if (localNumberTestErrors==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberTestErrors cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberTestErrors));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numberTestsCompleted", xmlWriter);
                             
                                               if (localNumberTestsCompleted==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberTestsCompleted cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberTestsCompleted));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numberTestsTotal", xmlWriter);
                             
                                               if (localNumberTestsTotal==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberTestsTotal cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberTestsTotal));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "rollbackOnError", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("rollbackOnError cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRollbackOnError));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localStartDateTracker){
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "startDate", xmlWriter);
                             

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("startDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateDetailTracker){
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "stateDetail", xmlWriter);
                             

                                          if (localStateDetail==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("stateDetail cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStateDetail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","status"),
                                               xmlWriter);
                                        
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "success", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("success cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccess));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://soap.sforce.com/2006/04/metadata")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "checkOnly"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckOnly));
                             if (localCompletedDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "completedDate"));
                                 
                                        if (localCompletedDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompletedDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("completedDate cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "createdDate"));
                                 
                                        if (localCreatedDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("createdDate cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "details"));
                            
                            
                                    if (localDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("details cannot be null!!");
                                    }
                                    elementList.add(localDetails);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "done"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDone));
                             if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "errorMessage"));
                                 
                                        if (localErrorMessage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("errorMessage cannot be null!!");
                                        }
                                    } if (localErrorStatusCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "errorStatusCode"));
                            
                            
                                    if (localErrorStatusCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("errorStatusCode cannot be null!!");
                                    }
                                    elementList.add(localErrorStatusCode);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "id"));
                            
                            
                                    if (localId==null){
                                         throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                    }
                                    elementList.add(localId);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "ignoreWarnings"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIgnoreWarnings));
                             if (localLastModifiedDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "lastModifiedDate"));
                                 
                                        if (localLastModifiedDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModifiedDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("lastModifiedDate cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numberComponentErrors"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberComponentErrors));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numberComponentsDeployed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberComponentsDeployed));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numberComponentsTotal"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberComponentsTotal));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numberTestErrors"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberTestErrors));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numberTestsCompleted"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberTestsCompleted));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numberTestsTotal"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberTestsTotal));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "rollbackOnError"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRollbackOnError));
                             if (localStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "startDate"));
                                 
                                        if (localStartDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("startDate cannot be null!!");
                                        }
                                    } if (localStateDetailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "stateDetail"));
                                 
                                        if (localStateDetail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateDetail));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("stateDetail cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "success"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuccess));
                            

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static DeployResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DeployResult object =
                new DeployResult();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"DeployResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DeployResult)com.sforce.soap._2006._04.metadata.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","checkOnly").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"checkOnly" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckOnly(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","completedDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"completedDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompletedDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","createdDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"createdDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","details").equals(reader.getName())){
                                
                                                object.setDetails(com.sforce.soap._2006._04.metadata.DeployDetails.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","done").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"done" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","errorMessage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"errorMessage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","errorStatusCode").equals(reader.getName())){
                                
                                                object.setErrorStatusCode(com.sforce.soap._2006._04.metadata.StatusCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","id").equals(reader.getName())){
                                
                                                object.setId(com.sforce.soap._2006._04.metadata.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","ignoreWarnings").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ignoreWarnings" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIgnoreWarnings(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","lastModifiedDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"lastModifiedDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastModifiedDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numberComponentErrors").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberComponentErrors" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberComponentErrors(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numberComponentsDeployed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberComponentsDeployed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberComponentsDeployed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numberComponentsTotal").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberComponentsTotal" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberComponentsTotal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numberTestErrors").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberTestErrors" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberTestErrors(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numberTestsCompleted").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberTestsCompleted" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberTestsCompleted(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numberTestsTotal").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberTestsTotal" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberTestsTotal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","rollbackOnError").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"rollbackOnError" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRollbackOnError(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","startDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"startDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","stateDetail").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"stateDetail" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStateDetail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","status").equals(reader.getName())){
                                
                                                object.setStatus(com.sforce.soap._2006._04.metadata.DeployStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","success").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"success" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSuccess(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    