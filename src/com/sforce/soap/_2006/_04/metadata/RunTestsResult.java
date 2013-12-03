
/**
 * RunTestsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.sforce.soap._2006._04.metadata;
            

            /**
            *  RunTestsResult bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RunTestsResult
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RunTestsResult
                Namespace URI = http://soap.sforce.com/2006/04/metadata
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CodeCoverage
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeCoverageResult[] localCodeCoverage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodeCoverageTracker = false ;

                           public boolean isCodeCoverageSpecified(){
                               return localCodeCoverageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeCoverageResult[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeCoverageResult[] getCodeCoverage(){
                               return localCodeCoverage;
                           }

                           
                        


                               
                              /**
                               * validate the array for CodeCoverage
                               */
                              protected void validateCodeCoverage(com.sforce.soap._2006._04.metadata.CodeCoverageResult[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CodeCoverage
                              */
                              public void setCodeCoverage(com.sforce.soap._2006._04.metadata.CodeCoverageResult[] param){
                              
                                   validateCodeCoverage(param);

                               localCodeCoverageTracker = param != null;
                                      
                                      this.localCodeCoverage=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeCoverageResult
                             */
                             public void addCodeCoverage(com.sforce.soap._2006._04.metadata.CodeCoverageResult param){
                                   if (localCodeCoverage == null){
                                   localCodeCoverage = new com.sforce.soap._2006._04.metadata.CodeCoverageResult[]{};
                                   }

                            
                                 //update the setting tracker
                                localCodeCoverageTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCodeCoverage);
                               list.add(param);
                               this.localCodeCoverage =
                             (com.sforce.soap._2006._04.metadata.CodeCoverageResult[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeCoverageResult[list.size()]);

                             }
                             

                        /**
                        * field for CodeCoverageWarnings
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] localCodeCoverageWarnings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodeCoverageWarningsTracker = false ;

                           public boolean isCodeCoverageWarningsSpecified(){
                               return localCodeCoverageWarningsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.CodeCoverageWarning[]
                           */
                           public  com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] getCodeCoverageWarnings(){
                               return localCodeCoverageWarnings;
                           }

                           
                        


                               
                              /**
                               * validate the array for CodeCoverageWarnings
                               */
                              protected void validateCodeCoverageWarnings(com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CodeCoverageWarnings
                              */
                              public void setCodeCoverageWarnings(com.sforce.soap._2006._04.metadata.CodeCoverageWarning[] param){
                              
                                   validateCodeCoverageWarnings(param);

                               localCodeCoverageWarningsTracker = param != null;
                                      
                                      this.localCodeCoverageWarnings=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.CodeCoverageWarning
                             */
                             public void addCodeCoverageWarnings(com.sforce.soap._2006._04.metadata.CodeCoverageWarning param){
                                   if (localCodeCoverageWarnings == null){
                                   localCodeCoverageWarnings = new com.sforce.soap._2006._04.metadata.CodeCoverageWarning[]{};
                                   }

                            
                                 //update the setting tracker
                                localCodeCoverageWarningsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCodeCoverageWarnings);
                               list.add(param);
                               this.localCodeCoverageWarnings =
                             (com.sforce.soap._2006._04.metadata.CodeCoverageWarning[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.CodeCoverageWarning[list.size()]);

                             }
                             

                        /**
                        * field for Failures
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.RunTestFailure[] localFailures ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailuresTracker = false ;

                           public boolean isFailuresSpecified(){
                               return localFailuresTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.RunTestFailure[]
                           */
                           public  com.sforce.soap._2006._04.metadata.RunTestFailure[] getFailures(){
                               return localFailures;
                           }

                           
                        


                               
                              /**
                               * validate the array for Failures
                               */
                              protected void validateFailures(com.sforce.soap._2006._04.metadata.RunTestFailure[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Failures
                              */
                              public void setFailures(com.sforce.soap._2006._04.metadata.RunTestFailure[] param){
                              
                                   validateFailures(param);

                               localFailuresTracker = param != null;
                                      
                                      this.localFailures=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.RunTestFailure
                             */
                             public void addFailures(com.sforce.soap._2006._04.metadata.RunTestFailure param){
                                   if (localFailures == null){
                                   localFailures = new com.sforce.soap._2006._04.metadata.RunTestFailure[]{};
                                   }

                            
                                 //update the setting tracker
                                localFailuresTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFailures);
                               list.add(param);
                               this.localFailures =
                             (com.sforce.soap._2006._04.metadata.RunTestFailure[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.RunTestFailure[list.size()]);

                             }
                             

                        /**
                        * field for NumFailures
                        */

                        
                                    protected int localNumFailures ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumFailures(){
                               return localNumFailures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumFailures
                               */
                               public void setNumFailures(int param){
                            
                                            this.localNumFailures=param;
                                    

                               }
                            

                        /**
                        * field for NumTestsRun
                        */

                        
                                    protected int localNumTestsRun ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumTestsRun(){
                               return localNumTestsRun;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumTestsRun
                               */
                               public void setNumTestsRun(int param){
                            
                                            this.localNumTestsRun=param;
                                    

                               }
                            

                        /**
                        * field for Successes
                        * This was an Array!
                        */

                        
                                    protected com.sforce.soap._2006._04.metadata.RunTestSuccess[] localSuccesses ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuccessesTracker = false ;

                           public boolean isSuccessesSpecified(){
                               return localSuccessesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.sforce.soap._2006._04.metadata.RunTestSuccess[]
                           */
                           public  com.sforce.soap._2006._04.metadata.RunTestSuccess[] getSuccesses(){
                               return localSuccesses;
                           }

                           
                        


                               
                              /**
                               * validate the array for Successes
                               */
                              protected void validateSuccesses(com.sforce.soap._2006._04.metadata.RunTestSuccess[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Successes
                              */
                              public void setSuccesses(com.sforce.soap._2006._04.metadata.RunTestSuccess[] param){
                              
                                   validateSuccesses(param);

                               localSuccessesTracker = param != null;
                                      
                                      this.localSuccesses=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.sforce.soap._2006._04.metadata.RunTestSuccess
                             */
                             public void addSuccesses(com.sforce.soap._2006._04.metadata.RunTestSuccess param){
                                   if (localSuccesses == null){
                                   localSuccesses = new com.sforce.soap._2006._04.metadata.RunTestSuccess[]{};
                                   }

                            
                                 //update the setting tracker
                                localSuccessesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSuccesses);
                               list.add(param);
                               this.localSuccesses =
                             (com.sforce.soap._2006._04.metadata.RunTestSuccess[])list.toArray(
                            new com.sforce.soap._2006._04.metadata.RunTestSuccess[list.size()]);

                             }
                             

                        /**
                        * field for TotalTime
                        */

                        
                                    protected double localTotalTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTotalTime(){
                               return localTotalTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalTime
                               */
                               public void setTotalTime(double param){
                            
                                            this.localTotalTime=param;
                                    

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
                           namespacePrefix+":RunTestsResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RunTestsResult",
                           xmlWriter);
                   }

               
                   }
                if (localCodeCoverageTracker){
                                       if (localCodeCoverage!=null){
                                            for (int i = 0;i < localCodeCoverage.length;i++){
                                                if (localCodeCoverage[i] != null){
                                                 localCodeCoverage[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","codeCoverage"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("codeCoverage cannot be null!!");
                                        
                                    }
                                 } if (localCodeCoverageWarningsTracker){
                                       if (localCodeCoverageWarnings!=null){
                                            for (int i = 0;i < localCodeCoverageWarnings.length;i++){
                                                if (localCodeCoverageWarnings[i] != null){
                                                 localCodeCoverageWarnings[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","codeCoverageWarnings"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("codeCoverageWarnings cannot be null!!");
                                        
                                    }
                                 } if (localFailuresTracker){
                                       if (localFailures!=null){
                                            for (int i = 0;i < localFailures.length;i++){
                                                if (localFailures[i] != null){
                                                 localFailures[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","failures"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("failures cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numFailures", xmlWriter);
                             
                                               if (localNumFailures==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numFailures cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumFailures));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "numTestsRun", xmlWriter);
                             
                                               if (localNumTestsRun==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numTestsRun cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumTestsRun));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localSuccessesTracker){
                                       if (localSuccesses!=null){
                                            for (int i = 0;i < localSuccesses.length;i++){
                                                if (localSuccesses[i] != null){
                                                 localSuccesses[i].serialize(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","successes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("successes cannot be null!!");
                                        
                                    }
                                 }
                                    namespace = "http://soap.sforce.com/2006/04/metadata";
                                    writeStartElement(null, namespace, "totalTime", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localTotalTime)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totalTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalTime));
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

                 if (localCodeCoverageTracker){
                             if (localCodeCoverage!=null) {
                                 for (int i = 0;i < localCodeCoverage.length;i++){

                                    if (localCodeCoverage[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "codeCoverage"));
                                         elementList.add(localCodeCoverage[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("codeCoverage cannot be null!!");
                                    
                             }

                        } if (localCodeCoverageWarningsTracker){
                             if (localCodeCoverageWarnings!=null) {
                                 for (int i = 0;i < localCodeCoverageWarnings.length;i++){

                                    if (localCodeCoverageWarnings[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "codeCoverageWarnings"));
                                         elementList.add(localCodeCoverageWarnings[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("codeCoverageWarnings cannot be null!!");
                                    
                             }

                        } if (localFailuresTracker){
                             if (localFailures!=null) {
                                 for (int i = 0;i < localFailures.length;i++){

                                    if (localFailures[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "failures"));
                                         elementList.add(localFailures[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("failures cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numFailures"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumFailures));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "numTestsRun"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumTestsRun));
                             if (localSuccessesTracker){
                             if (localSuccesses!=null) {
                                 for (int i = 0;i < localSuccesses.length;i++){

                                    if (localSuccesses[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                          "successes"));
                                         elementList.add(localSuccesses[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("successes cannot be null!!");
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata",
                                                                      "totalTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalTime));
                            

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
        public static RunTestsResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RunTestsResult object =
                new RunTestsResult();

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
                    
                            if (!"RunTestsResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RunTestsResult)com.sforce.soap._2006._04.metadata.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","codeCoverage").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.sforce.soap._2006._04.metadata.CodeCoverageResult.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","codeCoverage").equals(reader.getName())){
                                                                    list1.add(com.sforce.soap._2006._04.metadata.CodeCoverageResult.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCodeCoverage((com.sforce.soap._2006._04.metadata.CodeCoverageResult[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeCoverageResult.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","codeCoverageWarnings").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.sforce.soap._2006._04.metadata.CodeCoverageWarning.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","codeCoverageWarnings").equals(reader.getName())){
                                                                    list2.add(com.sforce.soap._2006._04.metadata.CodeCoverageWarning.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCodeCoverageWarnings((com.sforce.soap._2006._04.metadata.CodeCoverageWarning[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.CodeCoverageWarning.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","failures").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.sforce.soap._2006._04.metadata.RunTestFailure.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","failures").equals(reader.getName())){
                                                                    list3.add(com.sforce.soap._2006._04.metadata.RunTestFailure.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFailures((com.sforce.soap._2006._04.metadata.RunTestFailure[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.RunTestFailure.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numFailures").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numFailures" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumFailures(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","numTestsRun").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numTestsRun" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumTestsRun(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","successes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.sforce.soap._2006._04.metadata.RunTestSuccess.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
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
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","successes").equals(reader.getName())){
                                                                    list6.add(com.sforce.soap._2006._04.metadata.RunTestSuccess.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSuccesses((com.sforce.soap._2006._04.metadata.RunTestSuccess[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.sforce.soap._2006._04.metadata.RunTestSuccess.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata","totalTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totalTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
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
           
    