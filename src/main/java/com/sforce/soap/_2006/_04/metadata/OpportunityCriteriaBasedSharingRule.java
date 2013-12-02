/**
 * OpportunityCriteriaBasedSharingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class OpportunityCriteriaBasedSharingRule  extends com.sforce.soap._2006._04.metadata.CriteriaBasedSharingRule  implements java.io.Serializable {
    private java.lang.String booleanFilter;

    private java.lang.String description;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit opportunityAccessLevel;

    public OpportunityCriteriaBasedSharingRule() {
    }

    public OpportunityCriteriaBasedSharingRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo,
           com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems,
           java.lang.String booleanFilter,
           java.lang.String description,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit opportunityAccessLevel) {
        super(
            fullName,
            sharedTo,
            criteriaItems);
        this.booleanFilter = booleanFilter;
        this.description = description;
        this.name = name;
        this.opportunityAccessLevel = opportunityAccessLevel;
    }


    /**
     * Gets the booleanFilter value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the description value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the opportunityAccessLevel value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @return opportunityAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit getOpportunityAccessLevel() {
        return opportunityAccessLevel;
    }


    /**
     * Sets the opportunityAccessLevel value for this OpportunityCriteriaBasedSharingRule.
     * 
     * @param opportunityAccessLevel
     */
    public void setOpportunityAccessLevel(com.sforce.soap._2006._04.metadata.ShareAccessLevelReadEdit opportunityAccessLevel) {
        this.opportunityAccessLevel = opportunityAccessLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunityCriteriaBasedSharingRule)) return false;
        OpportunityCriteriaBasedSharingRule other = (OpportunityCriteriaBasedSharingRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opportunityAccessLevel==null && other.getOpportunityAccessLevel()==null) || 
             (this.opportunityAccessLevel!=null &&
              this.opportunityAccessLevel.equals(other.getOpportunityAccessLevel())));
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
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpportunityAccessLevel() != null) {
            _hashCode += getOpportunityAccessLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunityCriteriaBasedSharingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "OpportunityCriteriaBasedSharingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelReadEdit"));
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
