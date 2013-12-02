/**
 * FlexiPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class FlexiPage  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlexiPageRegion[] flexiPageRegions;

    private java.lang.String masterLabel;

    private com.sforce.soap._2006._04.metadata.QuickActionListItem[] quickActionList;

    public FlexiPage() {
    }

    public FlexiPage(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.FlexiPageRegion[] flexiPageRegions,
           java.lang.String masterLabel,
           com.sforce.soap._2006._04.metadata.QuickActionListItem[] quickActionList) {
        super(
            fullName);
        this.flexiPageRegions = flexiPageRegions;
        this.masterLabel = masterLabel;
        this.quickActionList = quickActionList;
    }


    /**
     * Gets the flexiPageRegions value for this FlexiPage.
     * 
     * @return flexiPageRegions
     */
    public com.sforce.soap._2006._04.metadata.FlexiPageRegion[] getFlexiPageRegions() {
        return flexiPageRegions;
    }


    /**
     * Sets the flexiPageRegions value for this FlexiPage.
     * 
     * @param flexiPageRegions
     */
    public void setFlexiPageRegions(com.sforce.soap._2006._04.metadata.FlexiPageRegion[] flexiPageRegions) {
        this.flexiPageRegions = flexiPageRegions;
    }

    public com.sforce.soap._2006._04.metadata.FlexiPageRegion getFlexiPageRegions(int i) {
        return this.flexiPageRegions[i];
    }

    public void setFlexiPageRegions(int i, com.sforce.soap._2006._04.metadata.FlexiPageRegion _value) {
        this.flexiPageRegions[i] = _value;
    }


    /**
     * Gets the masterLabel value for this FlexiPage.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this FlexiPage.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the quickActionList value for this FlexiPage.
     * 
     * @return quickActionList
     */
    public com.sforce.soap._2006._04.metadata.QuickActionListItem[] getQuickActionList() {
        return quickActionList;
    }


    /**
     * Sets the quickActionList value for this FlexiPage.
     * 
     * @param quickActionList
     */
    public void setQuickActionList(com.sforce.soap._2006._04.metadata.QuickActionListItem[] quickActionList) {
        this.quickActionList = quickActionList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexiPage)) return false;
        FlexiPage other = (FlexiPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flexiPageRegions==null && other.getFlexiPageRegions()==null) || 
             (this.flexiPageRegions!=null &&
              java.util.Arrays.equals(this.flexiPageRegions, other.getFlexiPageRegions()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.quickActionList==null && other.getQuickActionList()==null) || 
             (this.quickActionList!=null &&
              java.util.Arrays.equals(this.quickActionList, other.getQuickActionList())));
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
        if (getFlexiPageRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlexiPageRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlexiPageRegions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getQuickActionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuickActionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuickActionList(), i);
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
        new org.apache.axis.description.TypeDesc(FlexiPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexiPageRegions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "flexiPageRegions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlexiPageRegion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickActionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionListItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quickActionListItems"));
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
