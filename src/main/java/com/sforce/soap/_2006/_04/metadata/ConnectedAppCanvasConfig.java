/**
 * ConnectedAppCanvasConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ConnectedAppCanvasConfig  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AccessMethod accessMethod;

    private java.lang.String canvasUrl;

    private com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] locations;

    public ConnectedAppCanvasConfig() {
    }

    public ConnectedAppCanvasConfig(
           com.sforce.soap._2006._04.metadata.AccessMethod accessMethod,
           java.lang.String canvasUrl,
           com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] locations) {
           this.accessMethod = accessMethod;
           this.canvasUrl = canvasUrl;
           this.locations = locations;
    }


    /**
     * Gets the accessMethod value for this ConnectedAppCanvasConfig.
     * 
     * @return accessMethod
     */
    public com.sforce.soap._2006._04.metadata.AccessMethod getAccessMethod() {
        return accessMethod;
    }


    /**
     * Sets the accessMethod value for this ConnectedAppCanvasConfig.
     * 
     * @param accessMethod
     */
    public void setAccessMethod(com.sforce.soap._2006._04.metadata.AccessMethod accessMethod) {
        this.accessMethod = accessMethod;
    }


    /**
     * Gets the canvasUrl value for this ConnectedAppCanvasConfig.
     * 
     * @return canvasUrl
     */
    public java.lang.String getCanvasUrl() {
        return canvasUrl;
    }


    /**
     * Sets the canvasUrl value for this ConnectedAppCanvasConfig.
     * 
     * @param canvasUrl
     */
    public void setCanvasUrl(java.lang.String canvasUrl) {
        this.canvasUrl = canvasUrl;
    }


    /**
     * Gets the locations value for this ConnectedAppCanvasConfig.
     * 
     * @return locations
     */
    public com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this ConnectedAppCanvasConfig.
     * 
     * @param locations
     */
    public void setLocations(com.sforce.soap._2006._04.metadata.CanvasLocationOptions[] locations) {
        this.locations = locations;
    }

    public com.sforce.soap._2006._04.metadata.CanvasLocationOptions getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, com.sforce.soap._2006._04.metadata.CanvasLocationOptions _value) {
        this.locations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedAppCanvasConfig)) return false;
        ConnectedAppCanvasConfig other = (ConnectedAppCanvasConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessMethod==null && other.getAccessMethod()==null) || 
             (this.accessMethod!=null &&
              this.accessMethod.equals(other.getAccessMethod()))) &&
            ((this.canvasUrl==null && other.getCanvasUrl()==null) || 
             (this.canvasUrl!=null &&
              this.canvasUrl.equals(other.getCanvasUrl()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccessMethod() != null) {
            _hashCode += getAccessMethod().hashCode();
        }
        if (getCanvasUrl() != null) {
            _hashCode += getCanvasUrl().hashCode();
        }
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedAppCanvasConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ConnectedAppCanvasConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccessMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "canvasUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CanvasLocationOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
