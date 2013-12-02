/**
 * ForecastingSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ForecastingSettings  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AdjustmentsSettings adjustmentsSettings;

    private com.sforce.soap._2006._04.metadata.DataSourceSettings dataSourceSettings;

    private com.sforce.soap._2006._04.metadata.DisplayCurrency displayCurrency;

    private java.lang.Boolean enableForecasts;

    private com.sforce.soap._2006._04.metadata.ForecastRangeSettings forecastRangeSettings;

    private java.lang.String[] opportunityListFieldsSelectedSettings;

    private com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings;

    public ForecastingSettings() {
    }

    public ForecastingSettings(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.AdjustmentsSettings adjustmentsSettings,
           com.sforce.soap._2006._04.metadata.DataSourceSettings dataSourceSettings,
           com.sforce.soap._2006._04.metadata.DisplayCurrency displayCurrency,
           java.lang.Boolean enableForecasts,
           com.sforce.soap._2006._04.metadata.ForecastRangeSettings forecastRangeSettings,
           java.lang.String[] opportunityListFieldsSelectedSettings,
           com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings) {
        super(
            fullName);
        this.adjustmentsSettings = adjustmentsSettings;
        this.dataSourceSettings = dataSourceSettings;
        this.displayCurrency = displayCurrency;
        this.enableForecasts = enableForecasts;
        this.forecastRangeSettings = forecastRangeSettings;
        this.opportunityListFieldsSelectedSettings = opportunityListFieldsSelectedSettings;
        this.quotasSettings = quotasSettings;
    }


    /**
     * Gets the adjustmentsSettings value for this ForecastingSettings.
     * 
     * @return adjustmentsSettings
     */
    public com.sforce.soap._2006._04.metadata.AdjustmentsSettings getAdjustmentsSettings() {
        return adjustmentsSettings;
    }


    /**
     * Sets the adjustmentsSettings value for this ForecastingSettings.
     * 
     * @param adjustmentsSettings
     */
    public void setAdjustmentsSettings(com.sforce.soap._2006._04.metadata.AdjustmentsSettings adjustmentsSettings) {
        this.adjustmentsSettings = adjustmentsSettings;
    }


    /**
     * Gets the dataSourceSettings value for this ForecastingSettings.
     * 
     * @return dataSourceSettings
     */
    public com.sforce.soap._2006._04.metadata.DataSourceSettings getDataSourceSettings() {
        return dataSourceSettings;
    }


    /**
     * Sets the dataSourceSettings value for this ForecastingSettings.
     * 
     * @param dataSourceSettings
     */
    public void setDataSourceSettings(com.sforce.soap._2006._04.metadata.DataSourceSettings dataSourceSettings) {
        this.dataSourceSettings = dataSourceSettings;
    }


    /**
     * Gets the displayCurrency value for this ForecastingSettings.
     * 
     * @return displayCurrency
     */
    public com.sforce.soap._2006._04.metadata.DisplayCurrency getDisplayCurrency() {
        return displayCurrency;
    }


    /**
     * Sets the displayCurrency value for this ForecastingSettings.
     * 
     * @param displayCurrency
     */
    public void setDisplayCurrency(com.sforce.soap._2006._04.metadata.DisplayCurrency displayCurrency) {
        this.displayCurrency = displayCurrency;
    }


    /**
     * Gets the enableForecasts value for this ForecastingSettings.
     * 
     * @return enableForecasts
     */
    public java.lang.Boolean getEnableForecasts() {
        return enableForecasts;
    }


    /**
     * Sets the enableForecasts value for this ForecastingSettings.
     * 
     * @param enableForecasts
     */
    public void setEnableForecasts(java.lang.Boolean enableForecasts) {
        this.enableForecasts = enableForecasts;
    }


    /**
     * Gets the forecastRangeSettings value for this ForecastingSettings.
     * 
     * @return forecastRangeSettings
     */
    public com.sforce.soap._2006._04.metadata.ForecastRangeSettings getForecastRangeSettings() {
        return forecastRangeSettings;
    }


    /**
     * Sets the forecastRangeSettings value for this ForecastingSettings.
     * 
     * @param forecastRangeSettings
     */
    public void setForecastRangeSettings(com.sforce.soap._2006._04.metadata.ForecastRangeSettings forecastRangeSettings) {
        this.forecastRangeSettings = forecastRangeSettings;
    }


    /**
     * Gets the opportunityListFieldsSelectedSettings value for this ForecastingSettings.
     * 
     * @return opportunityListFieldsSelectedSettings
     */
    public java.lang.String[] getOpportunityListFieldsSelectedSettings() {
        return opportunityListFieldsSelectedSettings;
    }


    /**
     * Sets the opportunityListFieldsSelectedSettings value for this ForecastingSettings.
     * 
     * @param opportunityListFieldsSelectedSettings
     */
    public void setOpportunityListFieldsSelectedSettings(java.lang.String[] opportunityListFieldsSelectedSettings) {
        this.opportunityListFieldsSelectedSettings = opportunityListFieldsSelectedSettings;
    }


    /**
     * Gets the quotasSettings value for this ForecastingSettings.
     * 
     * @return quotasSettings
     */
    public com.sforce.soap._2006._04.metadata.QuotasSettings getQuotasSettings() {
        return quotasSettings;
    }


    /**
     * Sets the quotasSettings value for this ForecastingSettings.
     * 
     * @param quotasSettings
     */
    public void setQuotasSettings(com.sforce.soap._2006._04.metadata.QuotasSettings quotasSettings) {
        this.quotasSettings = quotasSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastingSettings)) return false;
        ForecastingSettings other = (ForecastingSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustmentsSettings==null && other.getAdjustmentsSettings()==null) || 
             (this.adjustmentsSettings!=null &&
              this.adjustmentsSettings.equals(other.getAdjustmentsSettings()))) &&
            ((this.dataSourceSettings==null && other.getDataSourceSettings()==null) || 
             (this.dataSourceSettings!=null &&
              this.dataSourceSettings.equals(other.getDataSourceSettings()))) &&
            ((this.displayCurrency==null && other.getDisplayCurrency()==null) || 
             (this.displayCurrency!=null &&
              this.displayCurrency.equals(other.getDisplayCurrency()))) &&
            ((this.enableForecasts==null && other.getEnableForecasts()==null) || 
             (this.enableForecasts!=null &&
              this.enableForecasts.equals(other.getEnableForecasts()))) &&
            ((this.forecastRangeSettings==null && other.getForecastRangeSettings()==null) || 
             (this.forecastRangeSettings!=null &&
              this.forecastRangeSettings.equals(other.getForecastRangeSettings()))) &&
            ((this.opportunityListFieldsSelectedSettings==null && other.getOpportunityListFieldsSelectedSettings()==null) || 
             (this.opportunityListFieldsSelectedSettings!=null &&
              java.util.Arrays.equals(this.opportunityListFieldsSelectedSettings, other.getOpportunityListFieldsSelectedSettings()))) &&
            ((this.quotasSettings==null && other.getQuotasSettings()==null) || 
             (this.quotasSettings!=null &&
              this.quotasSettings.equals(other.getQuotasSettings())));
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
        if (getAdjustmentsSettings() != null) {
            _hashCode += getAdjustmentsSettings().hashCode();
        }
        if (getDataSourceSettings() != null) {
            _hashCode += getDataSourceSettings().hashCode();
        }
        if (getDisplayCurrency() != null) {
            _hashCode += getDisplayCurrency().hashCode();
        }
        if (getEnableForecasts() != null) {
            _hashCode += getEnableForecasts().hashCode();
        }
        if (getForecastRangeSettings() != null) {
            _hashCode += getForecastRangeSettings().hashCode();
        }
        if (getOpportunityListFieldsSelectedSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunityListFieldsSelectedSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunityListFieldsSelectedSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuotasSettings() != null) {
            _hashCode += getQuotasSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastingSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastingSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentsSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "adjustmentsSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AdjustmentsSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataSourceSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DataSourceSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "displayCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "DisplayCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableForecasts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableForecasts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastRangeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forecastRangeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ForecastRangeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityListFieldsSelectedSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "opportunityListFieldsSelectedSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotasSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "quotasSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuotasSettings"));
        elemField.setMinOccurs(0);
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
