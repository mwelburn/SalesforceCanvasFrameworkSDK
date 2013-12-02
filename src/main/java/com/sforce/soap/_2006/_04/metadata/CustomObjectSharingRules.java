/**
 * CustomObjectSharingRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomObjectSharingRules  extends com.sforce.soap._2006._04.metadata.SharingRules  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule[] criteriaBasedRules;

    private com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule[] ownerRules;

    public CustomObjectSharingRules() {
    }

    public CustomObjectSharingRules(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule[] criteriaBasedRules,
           com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule[] ownerRules) {
        super(
            fullName);
        this.criteriaBasedRules = criteriaBasedRules;
        this.ownerRules = ownerRules;
    }


    /**
     * Gets the criteriaBasedRules value for this CustomObjectSharingRules.
     * 
     * @return criteriaBasedRules
     */
    public com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule[] getCriteriaBasedRules() {
        return criteriaBasedRules;
    }


    /**
     * Sets the criteriaBasedRules value for this CustomObjectSharingRules.
     * 
     * @param criteriaBasedRules
     */
    public void setCriteriaBasedRules(com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule[] criteriaBasedRules) {
        this.criteriaBasedRules = criteriaBasedRules;
    }

    public com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule getCriteriaBasedRules(int i) {
        return this.criteriaBasedRules[i];
    }

    public void setCriteriaBasedRules(int i, com.sforce.soap._2006._04.metadata.CustomObjectCriteriaBasedSharingRule _value) {
        this.criteriaBasedRules[i] = _value;
    }


    /**
     * Gets the ownerRules value for this CustomObjectSharingRules.
     * 
     * @return ownerRules
     */
    public com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule[] getOwnerRules() {
        return ownerRules;
    }


    /**
     * Sets the ownerRules value for this CustomObjectSharingRules.
     * 
     * @param ownerRules
     */
    public void setOwnerRules(com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule[] ownerRules) {
        this.ownerRules = ownerRules;
    }

    public com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule getOwnerRules(int i) {
        return this.ownerRules[i];
    }

    public void setOwnerRules(int i, com.sforce.soap._2006._04.metadata.CustomObjectOwnerSharingRule _value) {
        this.ownerRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomObjectSharingRules)) return false;
        CustomObjectSharingRules other = (CustomObjectSharingRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criteriaBasedRules==null && other.getCriteriaBasedRules()==null) || 
             (this.criteriaBasedRules!=null &&
              java.util.Arrays.equals(this.criteriaBasedRules, other.getCriteriaBasedRules()))) &&
            ((this.ownerRules==null && other.getOwnerRules()==null) || 
             (this.ownerRules!=null &&
              java.util.Arrays.equals(this.ownerRules, other.getOwnerRules())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCriteriaBasedRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteriaBasedRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteriaBasedRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwnerRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnerRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnerRules(), i);
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
        new org.apache.axis.description.TypeDesc(CustomObjectSharingRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectSharingRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaBasedRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criteriaBasedRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectCriteriaBasedSharingRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ownerRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomObjectOwnerSharingRule"));
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
