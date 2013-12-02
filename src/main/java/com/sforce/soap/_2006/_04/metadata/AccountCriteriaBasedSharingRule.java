/**
 * AccountCriteriaBasedSharingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class AccountCriteriaBasedSharingRule  extends com.sforce.soap._2006._04.metadata.CriteriaBasedSharingRule  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ShareAccessLevelNoNone accountAccessLevel;

    private java.lang.String booleanFilter;

    private com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll caseAccessLevel;

    private com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll contactAccessLevel;

    private java.lang.String description;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll opportunityAccessLevel;

    public AccountCriteriaBasedSharingRule() {
    }

    public AccountCriteriaBasedSharingRule(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.SharedTo sharedTo,
           com.sforce.soap._2006._04.metadata.FilterItem[] criteriaItems,
           com.sforce.soap._2006._04.metadata.ShareAccessLevelNoNone accountAccessLevel,
           java.lang.String booleanFilter,
           com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll caseAccessLevel,
           com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll contactAccessLevel,
           java.lang.String description,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll opportunityAccessLevel) {
        super(
            fullName,
            sharedTo,
            criteriaItems);
        this.accountAccessLevel = accountAccessLevel;
        this.booleanFilter = booleanFilter;
        this.caseAccessLevel = caseAccessLevel;
        this.contactAccessLevel = contactAccessLevel;
        this.description = description;
        this.name = name;
        this.opportunityAccessLevel = opportunityAccessLevel;
    }


    /**
     * Gets the accountAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @return accountAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.ShareAccessLevelNoNone getAccountAccessLevel() {
        return accountAccessLevel;
    }


    /**
     * Sets the accountAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @param accountAccessLevel
     */
    public void setAccountAccessLevel(com.sforce.soap._2006._04.metadata.ShareAccessLevelNoNone accountAccessLevel) {
        this.accountAccessLevel = accountAccessLevel;
    }


    /**
     * Gets the booleanFilter value for this AccountCriteriaBasedSharingRule.
     * 
     * @return booleanFilter
     */
    public java.lang.String getBooleanFilter() {
        return booleanFilter;
    }


    /**
     * Sets the booleanFilter value for this AccountCriteriaBasedSharingRule.
     * 
     * @param booleanFilter
     */
    public void setBooleanFilter(java.lang.String booleanFilter) {
        this.booleanFilter = booleanFilter;
    }


    /**
     * Gets the caseAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @return caseAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll getCaseAccessLevel() {
        return caseAccessLevel;
    }


    /**
     * Sets the caseAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @param caseAccessLevel
     */
    public void setCaseAccessLevel(com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll caseAccessLevel) {
        this.caseAccessLevel = caseAccessLevel;
    }


    /**
     * Gets the contactAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @return contactAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll getContactAccessLevel() {
        return contactAccessLevel;
    }


    /**
     * Sets the contactAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @param contactAccessLevel
     */
    public void setContactAccessLevel(com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll contactAccessLevel) {
        this.contactAccessLevel = contactAccessLevel;
    }


    /**
     * Gets the description value for this AccountCriteriaBasedSharingRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountCriteriaBasedSharingRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this AccountCriteriaBasedSharingRule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountCriteriaBasedSharingRule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the opportunityAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @return opportunityAccessLevel
     */
    public com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll getOpportunityAccessLevel() {
        return opportunityAccessLevel;
    }


    /**
     * Sets the opportunityAccessLevel value for this AccountCriteriaBasedSharingRule.
     * 
     * @param opportunityAccessLevel
     */
    public void setOpportunityAccessLevel(com.sforce.soap._2006._04.metadata.ShareAccessLevelNoAll opportunityAccessLevel) {
        this.opportunityAccessLevel = opportunityAccessLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountCriteriaBasedSharingRule)) return false;
        AccountCriteriaBasedSharingRule other = (AccountCriteriaBasedSharingRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountAccessLevel==null && other.getAccountAccessLevel()==null) || 
             (this.accountAccessLevel!=null &&
              this.accountAccessLevel.equals(other.getAccountAccessLevel()))) &&
            ((this.booleanFilter==null && other.getBooleanFilter()==null) || 
             (this.booleanFilter!=null &&
              this.booleanFilter.equals(other.getBooleanFilter()))) &&
            ((this.caseAccessLevel==null && other.getCaseAccessLevel()==null) || 
             (this.caseAccessLevel!=null &&
              this.caseAccessLevel.equals(other.getCaseAccessLevel()))) &&
            ((this.contactAccessLevel==null && other.getContactAccessLevel()==null) || 
             (this.contactAccessLevel!=null &&
              this.contactAccessLevel.equals(other.getContactAccessLevel()))) &&
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
        if (getAccountAccessLevel() != null) {
            _hashCode += getAccountAccessLevel().hashCode();
        }
        if (getBooleanFilter() != null) {
            _hashCode += getBooleanFilter().hashCode();
        }
        if (getCaseAccessLevel() != null) {
            _hashCode += getCaseAccessLevel().hashCode();
        }
        if (getContactAccessLevel() != null) {
            _hashCode += getContactAccessLevel().hashCode();
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
        new org.apache.axis.description.TypeDesc(AccountCriteriaBasedSharingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AccountCriteriaBasedSharingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "accountAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelNoNone"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "booleanFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelNoAll"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAccessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "contactAccessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelNoAll"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ShareAccessLevelNoAll"));
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
