/**
 * UserSharingRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class UserSharingRules  extends com.sforce.soap._2006._04.metadata.SharingRules  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule[] criteriaBasedRules;

    private com.sforce.soap._2006._04.metadata.UserMembershipSharingRule[] membershipRules;

    public UserSharingRules() {
    }

    public UserSharingRules(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule[] criteriaBasedRules,
           com.sforce.soap._2006._04.metadata.UserMembershipSharingRule[] membershipRules) {
        super(
            fullName);
        this.criteriaBasedRules = criteriaBasedRules;
        this.membershipRules = membershipRules;
    }


    /**
     * Gets the criteriaBasedRules value for this UserSharingRules.
     * 
     * @return criteriaBasedRules
     */
    public com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule[] getCriteriaBasedRules() {
        return criteriaBasedRules;
    }


    /**
     * Sets the criteriaBasedRules value for this UserSharingRules.
     * 
     * @param criteriaBasedRules
     */
    public void setCriteriaBasedRules(com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule[] criteriaBasedRules) {
        this.criteriaBasedRules = criteriaBasedRules;
    }

    public com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule getCriteriaBasedRules(int i) {
        return this.criteriaBasedRules[i];
    }

    public void setCriteriaBasedRules(int i, com.sforce.soap._2006._04.metadata.UserCriteriaBasedSharingRule _value) {
        this.criteriaBasedRules[i] = _value;
    }


    /**
     * Gets the membershipRules value for this UserSharingRules.
     * 
     * @return membershipRules
     */
    public com.sforce.soap._2006._04.metadata.UserMembershipSharingRule[] getMembershipRules() {
        return membershipRules;
    }


    /**
     * Sets the membershipRules value for this UserSharingRules.
     * 
     * @param membershipRules
     */
    public void setMembershipRules(com.sforce.soap._2006._04.metadata.UserMembershipSharingRule[] membershipRules) {
        this.membershipRules = membershipRules;
    }

    public com.sforce.soap._2006._04.metadata.UserMembershipSharingRule getMembershipRules(int i) {
        return this.membershipRules[i];
    }

    public void setMembershipRules(int i, com.sforce.soap._2006._04.metadata.UserMembershipSharingRule _value) {
        this.membershipRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSharingRules)) return false;
        UserSharingRules other = (UserSharingRules) obj;
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
            ((this.membershipRules==null && other.getMembershipRules()==null) || 
             (this.membershipRules!=null &&
              java.util.Arrays.equals(this.membershipRules, other.getMembershipRules())));
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
        if (getMembershipRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembershipRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembershipRules(), i);
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
        new org.apache.axis.description.TypeDesc(UserSharingRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserSharingRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaBasedRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criteriaBasedRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserCriteriaBasedSharingRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "membershipRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "UserMembershipSharingRule"));
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
