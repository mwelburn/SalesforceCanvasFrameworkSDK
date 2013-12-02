/**
 * DataSourceSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class DataSourceSettings  implements java.io.Serializable {
    private boolean enableQuantity;

    private boolean enableRevenue;

    public DataSourceSettings() {
    }

    public DataSourceSettings(
           boolean enableQuantity,
           boolean enableRevenue) {
           this.enableQuantity = enableQuantity;
           this.enableRevenue = enableRevenue;
    }


    /**
     * Gets the enableQuantity value for this DataSourceSettings.
     * 
     * @return enableQuantity
     */
    public boolean isEnableQuantity() {
        return enableQuantity;
    }


    /**
     * Sets the enableQuantity value for this DataSourceSettings.
     * 
     * @param enableQuantity
     */
    public void setEnableQuantity(boolean enableQuantity) {
        this.enableQuantity = enableQuantity;
    }


    /**
     * Gets the enableRevenue value for this DataSourceSettings.
     * 
     * @return enableRevenue
     */
    public boolean isEnableRevenue() {
        return enableRevenue;
    }


    /**
     * Sets the enableRevenue value for this DataSourceSettings.
     * 
     * @param enableRevenue
     */
    public void setEnableRevenue(boolean enableRevenue) {
        this.enableRevenue = enableRevenue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSourceSettings)) return false;
        DataSourceSettings other = (DataSourceSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.enableQuantity == other.isEnableQuantity() &&
            this.enableRevenue == other.isEnableRevenue();
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
        _hashCode += (isEnableQuantity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnableRevenue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSourceSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataSourceSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
