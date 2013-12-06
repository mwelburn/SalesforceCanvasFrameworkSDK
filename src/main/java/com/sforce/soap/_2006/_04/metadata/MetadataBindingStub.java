/**
 * MetadataBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class MetadataBindingStub extends org.apache.axis.client.Stub implements com.sforce.soap._2006._04.metadata.MetadataPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkDeployStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asyncProcessId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "includeDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.DeployResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkRetrieveStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asyncProcessId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.RetrieveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asyncProcessId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.AsyncResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "metadata"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Metadata"), com.sforce.soap._2006._04.metadata.Metadata[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.AsyncResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "metadata"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Metadata"), com.sforce.soap._2006._04.metadata.Metadata[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.AsyncResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deploy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ZipFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployOptions"), com.sforce.soap._2006._04.metadata.DeployOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.AsyncResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeMetadata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asOfVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeMetadataResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.DescribeMetadataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listMetadata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "queries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListMetadataQuery"), com.sforce.soap._2006._04.metadata.ListMetadataQuery[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "asOfVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileProperties"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.FileProperties[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "retrieveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveRequest"), com.sforce.soap._2006._04.metadata.RetrieveRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.AsyncResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UpdateMetadata"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UpdateMetadata"), com.sforce.soap._2006._04.metadata.UpdateMetadata[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult"));
        oper.setReturnClass(com.sforce.soap._2006._04.metadata.AsyncResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public MetadataBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MetadataBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MetadataBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccessMethod");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccessMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccountCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccountOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccountSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccountSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountTerritorySharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccountTerritorySharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountTerritorySharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AccountTerritorySharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionEmailRecipientTypes");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ActionEmailRecipientTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionEmailSenderType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ActionEmailSenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ActionOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionOverrideType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ActionOverrideType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActionTaskAssignedToTypes");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ActionTaskAssignedToTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ActivitiesSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ActivitiesSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AddressSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AddressSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AdjustmentsSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AdjustmentsSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AgentConfigAssignments");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AgentConfigAssignments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AgentConfigProfileAssignments");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "profile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AgentConfigUserAssignments");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "user");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AnalyticSnapshot");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AnalyticSnapshot.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AnalyticSnapshotMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AnalyticSnapshotMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexClass");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApexClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexCodeUnitStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApexCodeUnitStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApexComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexPage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApexPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApexTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApexTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "APIAccessLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.APIAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowActionReference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalEntryCriteria");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApprovalEntryCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalPageField");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApprovalProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStep");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApprovalStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStepApprover");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApprovalStepApprover.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalStepRejectBehavior");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApprovalStepRejectBehavior.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ApprovalSubmitter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ApprovalSubmitter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Approver");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Approver.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Article");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ArticleTypeChannelDisplay");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ArticleTypeTemplate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ArticleTypeTemplate");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "articleTypeTemplates");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ArticleTypeTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ArticleTypeTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AssignmentRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AssignmentRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AssignmentRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AssignmentRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AssignToLookupValueType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AssignToLookupValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncRequestState");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AsyncRequestState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AsyncResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AsyncResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Attachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthenticationProtocol");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AuthenticationProtocol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthProvider");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AuthProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AuthProviderType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AuthProviderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AutoResponseRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AutoResponseRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AutoResponseRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.AutoResponseRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BaseSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.BaseSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Branding");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Branding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.BusinessHoursEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.BusinessHoursSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessHoursSourceType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.BusinessHoursSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "BusinessProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.BusinessProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CallCenter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CallCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CallCenterItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CallCenterItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CallCenterSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CallCenterSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CampaignCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CampaignCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CampaignOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CampaignOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CampaignSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CampaignSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CanvasLocationOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CanvasLocationOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CaseCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CaseOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CaseSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CaseSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CaseType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Channel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Channel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartAxis");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartAxis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartBackgroundDirection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartBackgroundDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartLegendPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartLegendPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartRangeType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartSummary");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChartUnits");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChartUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChatterAnswersReputationLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChatterAnswersReputationLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChatterAnswersSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChatterAnswersSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ChatterMobileSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ChatterMobileSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeCoverageResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CodeCoverageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeCoverageWarning");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CodeCoverageWarning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CodeLocation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CodeLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Community");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Community.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CompactLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CompactLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CompanySettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CompanySettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Complexity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Complexity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ComponentInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ComponentInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ComponentInstanceProperty");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ComponentInstanceProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedApp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppAttribute");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedAppAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppCanvasConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedAppCanvasConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppIpRange");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedAppIpRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppOauthAccessScope");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedAppOauthAccessScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppOauthConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedAppOauthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppSamlConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConnectedAppSamlConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConsoleComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConsoleComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContactCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ContactCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContactOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ContactOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContactSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ContactSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ContractSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ContractSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CountriesAndStates");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Country[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Country");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "countries");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Country");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Country.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CurrencyIsoCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CurrencyIsoCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplication");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomApplicationComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationComponents");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomApplicationComponents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomApplicationTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomConsoleComponents");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomConsoleComponents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataTypeComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomDataTypeComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataTypeComponentTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomDataTypeComponentTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomDataTypeTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomDataTypeTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomFieldTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomFieldTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomLabel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomLabels");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomLabelTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomLabelTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomObjectSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomObjectTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomPageWebLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomPageWebLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomPageWebLinkTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomPageWebLinkTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomSettingsType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomSettingsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomSettingsVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomSettingsVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomShortcut");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomShortcut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomSite");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomSite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomTab");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomTabTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.CustomTabTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Dashboard");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Dashboard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardComponentFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardComponentSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentSize");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardComponentSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardComponentType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardComponentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilterColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardFilterColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilterOperation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardFilterOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFilterOption");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardFilterOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardFolder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardMobileSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardMobileSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardTableColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardTableColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DashboardType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DashboardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataCategory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DataCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataCategoryGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DataCategoryGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataSourceSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DataSourceSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DefaultShortcut");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DefaultShortcut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeleteConstraint");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeleteConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployDetails");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeployDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeploymentStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeploymentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeployMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeployOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployProblemType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeployProblemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeployResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DeployStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DeployStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeMetadataObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DescribeMetadataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DescribeMetadataResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DescribeMetadataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DisplayCurrency");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DisplayCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Document");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DocumentFolder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.DocumentFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DomainWhitelist");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "domain");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailFolder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplateStyle");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailTemplateStyle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailTemplateType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailTemplateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseOnFailureActionType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailToCaseOnFailureActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseRoutingAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseRoutingAddressType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailToCaseRoutingAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EmailToCaseSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EmailToCaseSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Encoding");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Encoding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EncryptedFieldMaskChar");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EncryptedFieldMaskChar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EncryptedFieldMaskType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EncryptedFieldMaskType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EntitlementProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcessMilestoneItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementProcessMilestoneTimeTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EntitlementProcessMilestoneTimeTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EntitlementSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EntitlementTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EntitlementTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EscalationAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EscalationRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EscalationRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "EscalationStartTimeType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.EscalationStartTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Expiration");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Expiration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ExternalDataSource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ExternalDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ExternalDataSourceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ExternalPrincipalType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ExternalPrincipalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FieldOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FieldSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldSetItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FieldSetItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FieldUpdateOperation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FieldUpdateOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FileProperties");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FileProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FilterItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterOperation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FilterOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FilterScope");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FilterScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FindSimilarOppFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FindSimilarOppFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FiscalYearSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FiscalYearSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlexiPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageRegion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlexiPageRegion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Flow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Flow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCall");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowApexPluginCall.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCallInputParameter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowApexPluginCallInputParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCallOutputParameter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowApexPluginCallOutputParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowAssignmentItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowAssignmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowAssignmentOperator");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowAssignmentOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowChoice");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowChoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowChoiceUserInput");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowChoiceUserInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConnector");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowConnector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConstant");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowConstant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDataType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDecision");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowDecision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDynamicChoiceSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowElement");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowElementReferenceOrValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowElementReferenceOrValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowFormula");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowFormula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowInputFieldAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowInputFieldAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowInputValidationRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowInputValidationRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowNode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowOutputFieldAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowOutputFieldAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordCreate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRecordCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordDelete");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRecordDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRecordFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordFilterOperator");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRecordFilterOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordLookup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRecordLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordUpdate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRecordUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreen");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowScreen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreenField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowScreenField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreenFieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowScreenFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowStep");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowSubflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflowInputAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowSubflowInputAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflowOutputAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowSubflowOutputAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowTextTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowTextTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowVariable");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FlowVariable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Folder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderAccessTypes");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FolderAccessTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FolderShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderShareAccessLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FolderShareAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FolderSharedToType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.FolderSharedToType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastCategories");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ForecastCategories.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ForecastingSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastRangeSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ForecastRangeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Gender");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "GlobalQuickActionTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.GlobalQuickActionTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Group");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "HomePageComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.HomePageComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "HomePageLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.HomePageLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IdeaReputationLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.IdeaReputationLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IdeasSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.IdeasSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "InstalledPackage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.InstalledPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IpRange");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.IpRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KeyboardShortcuts");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KeyboardShortcuts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeAnswerSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeAnswerSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeCaseEditor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeCaseEditor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeCaseSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeCaseSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguageLookupValueType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeLanguageLookupValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguageSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeLanguage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeLanguage");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeSitesSettings");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KnowledgeWorkflowAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.KnowledgeWorkflowAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Language");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Layout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Layout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSectionStyle");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutSectionStyle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutSectionTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutSectionTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LayoutTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LayoutTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LeadCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LeadCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LeadOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LeadOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LeadSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LeadSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Letterhead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Letterhead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadHeaderFooter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LetterheadHeaderFooter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadHorizontalAlignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LetterheadHorizontalAlignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadLine");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LetterheadLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LetterheadVerticalAlignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LetterheadVerticalAlignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListMetadataQuery");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ListMetadataQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListPlacement");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ListPlacement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListViewFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ListViewFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveAgentConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveAgentConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveAgentSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveAgentSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatAgentConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatAgentConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonDeployments");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deployment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonInviteEndPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatButtonInviteEndPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonInviteStartPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatButtonInviteStartPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonPresentation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatButtonPresentation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonRoutingType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatButtonRoutingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonSkills");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skill");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatButtonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatDeployment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LiveChatDeployment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatDeploymentDomainWhitelist");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "domain");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LockoutInterval");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LockoutInterval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LookupValueType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.LookupValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ManageableState");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ManageableState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MaxLoginAttempts");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MaxLoginAttempts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Metadata");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Metadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MetadataWithContent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MetadataWithContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MilestoneTimeUnits");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MilestoneTimeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MilestoneType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MilestoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MilestoneTypeRecurrenceType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MilestoneTypeRecurrenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MiniLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MiniLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MinPasswordLength");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MinPasswordLength.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MobileSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.MobileSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NamedFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NamedFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NamedFilterTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NamedFilterTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Network");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Network.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.IpRange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "IpRange");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ipRanges");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkMemberGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NetworkMemberGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NetworkStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkTabSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NetworkTabSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NextAutomatedApprover");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NextAutomatedApprover.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NextOwnerType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.NextOwnerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectFilterOperator");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ObjectFilterOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectNameCaseValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ObjectNameCaseValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectRelationship");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ObjectRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ObjectUsage");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "object");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunityCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.OpportunityCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunityListFieldsSelectedSettings");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunityOwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.OpportunityOwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunitySettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.OpportunitySettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunitySharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.OpportunitySharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OwnerSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.OwnerSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Package");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Package.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PackageTypeMembers");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PackageTypeMembers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PackageVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PackageVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PageComponentType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PageComponentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PageComponentWidth");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PageComponentWidth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PagesToOpen");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageToOpen");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PasswordPolicies");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PasswordPolicies.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PeriodTypes");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PeriodTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetApexClassAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetApexClassAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetApexPageAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetApexPageAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetApplicationVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetApplicationVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetExternalDataSourceAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetExternalDataSourceAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetFieldPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetFieldPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetObjectPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetObjectPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetRecordTypeVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetRecordTypeVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetTabSetting");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetTabSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetTabVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetTabVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PermissionSetUserPermission");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PermissionSetUserPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Picklist");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Picklist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PicklistValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PicklistValueTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PicklistValueTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Portal");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Portal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PortalRoles");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PortalRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PortalType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PortalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Possessive");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Possessive.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PostTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PostTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PrimaryTabComponents");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConsoleComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConsoleComponent");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "component");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProcessSubmitterType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProcessSubmitterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProductSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProductSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Profile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Profile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileApexClassAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileApexClassAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileApexPageAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileApexPageAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileApplicationVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileApplicationVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileExternalDataSourceAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileExternalDataSourceAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileFieldLevelSecurity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileFieldLevelSecurity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLayoutAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileLayoutAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLoginHours");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileLoginHours.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileLoginIpRange");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileLoginIpRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileObjectPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileObjectPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileRecordTypeVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileRecordTypeVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileTabVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileTabVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ProfileUserPermission");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ProfileUserPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PublicFolderAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PublicFolderAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PushNotification");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PushNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PushNotifications");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.PushNotification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PushNotification");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pushNotification");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuestionRestriction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuestionRestriction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Queue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Queue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QueueSobject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QueueSobject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLabel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayoutColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionLayoutItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayoutItem");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionLayoutItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionList");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionListItem");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionListItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionListItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuickActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuotasSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuotasSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuoteSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.QuoteSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordEditabilityType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RecordEditabilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordTypePicklistValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RecordTypePicklistValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RecordTypeTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RecordTypeTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RelatedContent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RelatedContentItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RelatedContentItem");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "relatedContentItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RelatedContentItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RelatedContentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RelatedListItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RelatedListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RemoteSiteSetting");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RemoteSiteSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Report");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportAggregate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportAggregate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportAggregateDatatype");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportAggregateDatatype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportAggregateReference");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportAggregateReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBlockInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportBlockInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportBucketField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketFieldNullTreatment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportBucketFieldNullTreatment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketFieldSourceValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportBucketFieldSourceValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketFieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportBucketFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketFieldValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportBucketFieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChart");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportChart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChartComponentLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportChartComponentLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChartComponentSize");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportChartComponentSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChartSize");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportChartSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportColorRange");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportColorRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportCrossFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportCrossFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilterItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportFilterItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFolder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFormat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportGrouping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportGrouping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportHistoricalSelector");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "snapshot");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportJobSourceTypes");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportJobSourceTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportParam");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportSummaryType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportSummaryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTimeFrameFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportTimeFrameFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeCategory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportTypeCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportTypeColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeColumnTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportTypeColumnTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeSectionTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportTypeSectionTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTypeTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReportTypeTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReputationLevels");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ReputationLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RetrieveMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RetrieveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RetrieveResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RetrieveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Role");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Role.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RoleOrTerritory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RoleOrTerritory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RoutingType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RoutingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RuleEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RuleEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestFailure");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RunTestFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RunTestsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "RunTestSuccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.RunTestSuccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlIdentityLocationType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SamlIdentityLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlIdentityType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SamlIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlNameIdFormatType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SamlNameIdFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlSsoConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SamlSsoConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlSubjectType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SamlSubjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SamlType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SamlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Scontrol");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Scontrol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SControlContentSource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SControlContentSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ScontrolTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ScontrolTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SearchLayouts");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SearchLayouts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SecuritySettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SecuritySettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SendAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SendAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SessionSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionTimeout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SessionTimeout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SFDCMobileSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SFDCMobileSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelNoAll");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelNoNone");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ShareAccessLevelNoNone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelReadEdit");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharedTo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SharedTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingModel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SharingModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingReason");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SharingReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingReasonTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SharingReasonTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingRecalculation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SharingRecalculation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteRedirect");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SiteRedirect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteRedirectMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SiteRedirectMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SiteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SiteWebAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SiteWebAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Skill");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Skill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SkillAssignments");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SkillAssignments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SkillProfileAssignments");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "profile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SkillUserAssignments");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "user");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StartsWith");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.StartsWith.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "State");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StaticResource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.StaticResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StaticResourceCacheControl");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.StaticResourceCacheControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StepCriteriaNotMetType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.StepCriteriaNotMetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "StepRejectBehaviorType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.StepRejectBehaviorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SubtabComponents");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ConsoleComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConsoleComponent");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "component");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SummaryLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SummaryLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryLayoutStyle");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SummaryLayoutStyle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SummaryOperations");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SummaryOperations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SupervisorAgentConfigSkills");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skill");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SupervisorAgentStatusFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SupervisorAgentStatusFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SynonymDictionary");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SynonymDictionary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SynonymGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.SynonymGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TabVisibility");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.TabVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Template");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Template.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Territory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Territory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TouchMobileSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.TouchMobileSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Translations");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Translations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TreatBlanksAs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.TreatBlanksAs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UiBehavior");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UiBehavior.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UpdateMetadata");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UpdateMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserCriteriaBasedSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserDateGranularity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UserDateGranularity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserDateInterval");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UserDateInterval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserMembershipSharingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UserMembershipSharingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserSharingRules");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.UserSharingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValidationRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ValidationRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ValidationRuleTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.ValidationRuleTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkAvailability");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLinkAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkDisplayType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLinkDisplayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLinkPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLinkTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebLinkWindowType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebLinkWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WebToCaseSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WebToCaseSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Workflow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.Workflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionReference");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowActionReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowActionType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowAlert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowAlert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowEmailRecipient");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowEmailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowFieldUpdate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowFieldUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowKnowledgePublish");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowKnowledgePublish.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowOutboundMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowOutboundMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowSend");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowSend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTask");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTaskTranslation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowTaskTranslation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTimeTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowTimeTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTimeUnits");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowTimeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkflowTriggerTypes");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkflowTriggerTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkspaceMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkspaceMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkspaceMappings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._04.metadata.WorkspaceMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkspaceMapping");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sforce.soap._2006._04.metadata.DeployResult checkDeployStatus(java.lang.String asyncProcessId, boolean includeDetails) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "checkDeployStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {asyncProcessId, new java.lang.Boolean(includeDetails)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.DeployResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.DeployResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.DeployResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.RetrieveResult checkRetrieveStatus(java.lang.String asyncProcessId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "checkRetrieveStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {asyncProcessId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.RetrieveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.RetrieveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.RetrieveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.AsyncResult[] checkStatus(java.lang.String[] asyncProcessId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "checkStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {asyncProcessId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.AsyncResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.AsyncResult[] create(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {metadata});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.AsyncResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.AsyncResult[] delete(com.sforce.soap._2006._04.metadata.Metadata[] metadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {metadata});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.AsyncResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.AsyncResult deploy(byte[] zipFile, com.sforce.soap._2006._04.metadata.DeployOptions deployOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deploy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zipFile, deployOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.AsyncResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.AsyncResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.AsyncResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.DescribeMetadataResult describeMetadata(double asOfVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "describeMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Double(asOfVersion)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.DescribeMetadataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.DescribeMetadataResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.DescribeMetadataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.FileProperties[] listMetadata(com.sforce.soap._2006._04.metadata.ListMetadataQuery[] queries, double asOfVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "listMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queries, new java.lang.Double(asOfVersion)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.FileProperties[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.FileProperties[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.FileProperties[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.AsyncResult retrieve(com.sforce.soap._2006._04.metadata.RetrieveRequest retrieveRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.AsyncResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.AsyncResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.AsyncResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._04.metadata.AsyncResult[] update(com.sforce.soap._2006._04.metadata.UpdateMetadata[] updateMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateMetadata});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._04.metadata.AsyncResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._04.metadata.AsyncResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
