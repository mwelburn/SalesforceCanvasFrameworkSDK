
/**
 * CodeCoverageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sforce.soap._2006._04.metadata;
            

            /**
            *  CodeCoverageResult bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CodeCoverageResult
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CodeCoverageResult
                Namespace URI = http://soap.sforce.com/2006/04/metadata
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for DmlInfo
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeLocation[] localDmlInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDmlInfoTracker = false ;

                           public boolean isDmlInfoSpecified(){
                               return localDmlInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeLocation[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeLocation[] getDmlInfo(){
                               return localDmlInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for DmlInfo
                               */
                              protected void validateDmlInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DmlInfo
                              */
                              public void setDmlInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                              
                                   validateDmlInfo(param);

                               localDmlInfoTracker = param != null;
                                      
                                      this.localDmlInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeLocation
                             */
                             public void addDmlInfo(com.sforce.soap._2006._04.metadata.CodeLocation param){
                                   if (localDmlInfo == null){
                                   localDmlInfo = new com.sforce.soap._2006._04.metadata.CodeLocation[]{};
                                   }

                            
                                 //update the setting tracker
                                localDmlInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDmlInfo);
                               list.add(param);
                               this.localDmlInfo =
                             (com.sforce.soap._2006._04.metadata.CodeLocation[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeLocation[list.size()]);

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
                        * field for LocationsNotCovered
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeLocation[] localLocationsNotCovered ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationsNotCoveredTracker = false ;

                           public boolean isLocationsNotCoveredSpecified(){
                               return localLocationsNotCoveredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeLocation[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeLocation[] getLocationsNotCovered(){
                               return localLocationsNotCovered;
                           }

                           
                        


                               
                              /**
                               * validate the array for LocationsNotCovered
                               */
                              protected void validateLocationsNotCovered(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LocationsNotCovered
                              */
                              public void setLocationsNotCovered(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                              
                                   validateLocationsNotCovered(param);

                               localLocationsNotCoveredTracker = param != null;
                                      
                                      this.localLocationsNotCovered=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeLocation
                             */
                             public void addLocationsNotCovered(com.sforce.soap._2006._04.metadata.CodeLocation param){
                                   if (localLocationsNotCovered == null){
                                   localLocationsNotCovered = new com.sforce.soap._2006._04.metadata.CodeLocation[]{};
                                   }

                            
                                 //update the setting tracker
                                localLocationsNotCoveredTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLocationsNotCovered);
                               list.add(param);
                               this.localLocationsNotCovered =
                             (com.sforce.soap._2006._04.metadata.CodeLocation[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeLocation[list.size()]);

                             }
                             

                        /**
                        * field for MethodInfo
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeLocation[] localMethodInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMethodInfoTracker = false ;

                           public boolean isMethodInfoSpecified(){
                               return localMethodInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeLocation[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeLocation[] getMethodInfo(){
                               return localMethodInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for MethodInfo
                               */
                              protected void validateMethodInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MethodInfo
                              */
                              public void setMethodInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                              
                                   validateMethodInfo(param);

                               localMethodInfoTracker = param != null;
                                      
                                      this.localMethodInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeLocation
                             */
                             public void addMethodInfo(com.sforce.soap._2006._04.metadata.CodeLocation param){
                                   if (localMethodInfo == null){
                                   localMethodInfo = new com.sforce.soap._2006._04.metadata.CodeLocation[]{};
                                   }

                            
                                 //update the setting tracker
                                localMethodInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMethodInfo);
                               list.add(param);
                               this.localMethodInfo =
                             (com.sforce.soap._2006._04.metadata.CodeLocation[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeLocation[list.size()]);

                             }
                             

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Namespace
                        */

                        
                                    protected java.lang.String localNamespace ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNamespace(){
                               return localNamespace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Namespace
                               */
                               public void setNamespace(java.lang.String param){
                            
                                            this.localNamespace=param;
                                    

                               }
                            

                        /**
                        * field for NumLocations
                        */

                        
                                    protected int localNumLocations ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumLocations(){
                               return localNumLocations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumLocations
                               */
                               public void setNumLocations(int param){
                            
                                            this.localNumLocations=param;
                                    

                               }
                            

                        /**
                        * field for NumLocationsNotCovered
                        */

                        
                                    protected int localNumLocationsNotCovered ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumLocationsNotCovered(){
                               return localNumLocationsNotCovered;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumLocationsNotCovered
                               */
                               public void setNumLocationsNotCovered(int param){
                            
                                            this.localNumLocationsNotCovered=param;
                                    

                               }
                            

                        /**
                        * field for SoqlInfo
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeLocation[] localSoqlInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSoqlInfoTracker = false ;

                           public boolean isSoqlInfoSpecified(){
                               return localSoqlInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeLocation[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeLocation[] getSoqlInfo(){
                               return localSoqlInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for SoqlInfo
                               */
                              protected void validateSoqlInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SoqlInfo
                              */
                              public void setSoqlInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                              
                                   validateSoqlInfo(param);

                               localSoqlInfoTracker = param != null;
                                      
                                      this.localSoqlInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeLocation
                             */
                             public void addSoqlInfo(com.sforce.soap._2006._04.metadata.CodeLocation param){
                                   if (localSoqlInfo == null){
                                   localSoqlInfo = new com.sforce.soap._2006._04.metadata.CodeLocation[]{};
                                   }

                            
                                 //update the setting tracker
                                localSoqlInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSoqlInfo);
                               list.add(param);
                               this.localSoqlInfo =
                             (com.sforce.soap._2006._04.metadata.CodeLocation[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeLocation[list.size()]);

                             }
                             

                        /**
                        * field for SoslInfo
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeLocation[] localSoslInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSoslInfoTracker = false ;

                           public boolean isSoslInfoSpecified(){
                               return localSoslInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeLocation[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeLocation[] getSoslInfo(){
                               return localSoslInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for SoslInfo
                               */
                              protected void validateSoslInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SoslInfo
                              */
                              public void setSoslInfo(com.sforce.soap._2006._04.metadata.CodeLocation[] param){
                              
                                   validateSoslInfo(param);

                               localSoslInfoTracker = param != null;
                                      
                                      this.localSoslInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeLocation
                             */
                             public void addSoslInfo(com.sforce.soap._2006._04.metadata.CodeLocation param){
                                   if (localSoslInfo == null){
                                   localSoslInfo = new com.sforce.soap._2006._04.metadata.CodeLocation[]{};
                                   }

                            
                                 //update the setting tracker
                                localSoslInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSoslInfo);
                               list.add(param);
                               this.localSoslInfo =
                             (com.sforce.soap._2006._04.metadata.CodeLocation[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeLocation[list.size()]);

                             }
                             

                        /**
                        * field for Type
                        */

                        
                                    protected java.lang.String localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(java.lang.String param){
                            
                                            this.localType=param;
                                    

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
                           namespacePrefix+":CodeCoverageResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CodeCoverageResult",
                           xmlWriter);
                   }

               
                   }
                if (localDmlInfoTracker){
                                       if (localDmlInfo!=null){
                                            for (int i = 0;i < localDmlInfo.length;i++){
                                                if (localDmlInfo[i] != null){
                                                 localDmlInfo[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","dmlInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("dmlInfo cannot be null!!");
                                        
                                    }
                                 }
                                            if (localId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                            }
                                           localId.serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","id"),
                                               xmlWriter);
                                         if (localLocationsNotCoveredTracker){
                                       if (localLocationsNotCovered!=null){
                                            for (int i = 0;i < localLocationsNotCovered.length;i++){
                                                if (localLocationsNotCovered[i] != null){
                                                 localLocationsNotCovered[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","locationsNotCovered"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("locationsNotCovered cannot be null!!");
                                        
                                    }
                                 } if (localMethodInfoTracker){
                                       if (localMethodInfo!=null){
                                            for (int i = 0;i < localMethodInfo.length;i++){
                                                if (localMethodInfo[i] != null){
                                                 localMethodInfo[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","methodInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("methodInfo cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "namespace", xmlWriter);
                             

                                          if (localNamespace==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNamespace);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numLocations", xmlWriter);
                             
                                               if (localNumLocations==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numLocations cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumLocations));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numLocationsNotCovered", xmlWriter);
                             
                                               if (localNumLocationsNotCovered==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numLocationsNotCovered cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumLocationsNotCovered));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localSoqlInfoTracker){
                                       if (localSoqlInfo!=null){
                                            for (int i = 0;i < localSoqlInfo.length;i++){
                                                if (localSoqlInfo[i] != null){
                                                 localSoqlInfo[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","soqlInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("soqlInfo cannot be null!!");
                                        
                                    }
                                 } if (localSoslInfoTracker){
                                       if (localSoslInfo!=null){
                                            for (int i = 0;i < localSoslInfo.length;i++){
                                                if (localSoslInfo[i] != null){
                                                 localSoslInfo[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","soslInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("soslInfo cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "type", xmlWriter);
                             

                                          if (localType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localType);
                                            
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

                 if (localDmlInfoTracker){
                             if (localDmlInfo!=null) {
                                 for (int i = 0;i < localDmlInfo.length;i++){

                                    if (localDmlInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "dmlInfo"));
                                         elementList.add(localDmlInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("dmlInfo cannot be null!!");
                                    
                             }

                        }
                            elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "id"));
                            
                            
                                    if (localId==null){
                                         throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                    }
                                    elementList.add(localId);
                                 if (localLocationsNotCoveredTracker){
                             if (localLocationsNotCovered!=null) {
                                 for (int i = 0;i < localLocationsNotCovered.length;i++){

                                    if (localLocationsNotCovered[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "locationsNotCovered"));
                                         elementList.add(localLocationsNotCovered[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("locationsNotCovered cannot be null!!");
                                    
                             }

                        } if (localMethodInfoTracker){
                             if (localMethodInfo!=null) {
                                 for (int i = 0;i < localMethodInfo.length;i++){

                                    if (localMethodInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "methodInfo"));
                                         elementList.add(localMethodInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("methodInfo cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "namespace"));
                                 
                                         elementList.add(localNamespace==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNamespace));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numLocations"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumLocations));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numLocationsNotCovered"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumLocationsNotCovered));
                             if (localSoqlInfoTracker){
                             if (localSoqlInfo!=null) {
                                 for (int i = 0;i < localSoqlInfo.length;i++){

                                    if (localSoqlInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "soqlInfo"));
                                         elementList.add(localSoqlInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("soqlInfo cannot be null!!");
                                    
                             }

                        } if (localSoslInfoTracker){
                             if (localSoslInfo!=null) {
                                 for (int i = 0;i < localSoslInfo.length;i++){

                                    if (localSoslInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "soslInfo"));
                                         elementList.add(localSoslInfo[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("soslInfo cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "type"));
                                 
                                        if (localType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");
                                        }
                                    

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
        public static CodeCoverageResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CodeCoverageResult object =
                new CodeCoverageResult();

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
                    
                            if (!"CodeCoverageResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CodeCoverageResult)com.sforce.soap._2006._04.metadata.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","dmlInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","dmlInfo").equals(reader.getName())){
                                                                    list1.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDmlInfo((com.sforce.soap._2006._04.metadata.CodeLocation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeLocation.class,
                                                                list1));
                                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","locationsNotCovered").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","locationsNotCovered").equals(reader.getName())){
                                                                    list3.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLocationsNotCovered((com.sforce.soap._2006._04.metadata.CodeLocation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeLocation.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","methodInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","methodInfo").equals(reader.getName())){
                                                                    list4.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMethodInfo((com.sforce.soap._2006._04.metadata.CodeLocation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeLocation.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","namespace").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNamespace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numLocations").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numLocations" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumLocations(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numLocationsNotCovered").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numLocationsNotCovered" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumLocationsNotCovered(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","soqlInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","soqlInfo").equals(reader.getName())){
                                                                    list9.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSoqlInfo((com.sforce.soap._2006._04.metadata.CodeLocation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeLocation.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","soslInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","soslInfo").equals(reader.getName())){
                                                                    list10.add(com.sforce.soap._2006._04.metadata.CodeLocation.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSoslInfo((com.sforce.soap._2006._04.metadata.CodeLocation[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeLocation.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","type").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"type" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
           
    