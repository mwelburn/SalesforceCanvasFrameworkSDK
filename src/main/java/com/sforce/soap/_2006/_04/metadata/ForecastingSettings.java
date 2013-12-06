
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastingSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="adjustmentsSettings" type="{http://soap.sforce.com/2006/04/metadata}AdjustmentsSettings" minOccurs="0"/>
 *         &lt;element name="dataSourceSettings" type="{http://soap.sforce.com/2006/04/metadata}DataSourceSettings" minOccurs="0"/>
 *         &lt;element name="displayCurrency" type="{http://soap.sforce.com/2006/04/metadata}DisplayCurrency" minOccurs="0"/>
 *         &lt;element name="enableForecasts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forecastRangeSettings" type="{http://soap.sforce.com/2006/04/metadata}ForecastRangeSettings" minOccurs="0"/>
 *         &lt;element name="opportunityListFieldsSelectedSettings" type="{http://soap.sforce.com/2006/04/metadata}OpportunityListFieldsSelectedSettings" minOccurs="0"/>
 *         &lt;element name="quotasSettings" type="{http://soap.sforce.com/2006/04/metadata}QuotasSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastingSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "adjustmentsSettings",
    "dataSourceSettings",
    "displayCurrency",
    "enableForecasts",
    "forecastRangeSettings",
    "opportunityListFieldsSelectedSettings",
    "quotasSettings"
})
public class ForecastingSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected AdjustmentsSettings adjustmentsSettings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DataSourceSettings dataSourceSettings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DisplayCurrency displayCurrency;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableForecasts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ForecastRangeSettings forecastRangeSettings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected OpportunityListFieldsSelectedSettings opportunityListFieldsSelectedSettings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected QuotasSettings quotasSettings;

    /**
     * Gets the value of the adjustmentsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentsSettings }
     *     
     */
    public AdjustmentsSettings getAdjustmentsSettings() {
        return adjustmentsSettings;
    }

    /**
     * Sets the value of the adjustmentsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentsSettings }
     *     
     */
    public void setAdjustmentsSettings(AdjustmentsSettings value) {
        this.adjustmentsSettings = value;
    }

    /**
     * Gets the value of the dataSourceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceSettings }
     *     
     */
    public DataSourceSettings getDataSourceSettings() {
        return dataSourceSettings;
    }

    /**
     * Sets the value of the dataSourceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceSettings }
     *     
     */
    public void setDataSourceSettings(DataSourceSettings value) {
        this.dataSourceSettings = value;
    }

    /**
     * Gets the value of the displayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayCurrency }
     *     
     */
    public DisplayCurrency getDisplayCurrency() {
        return displayCurrency;
    }

    /**
     * Sets the value of the displayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayCurrency }
     *     
     */
    public void setDisplayCurrency(DisplayCurrency value) {
        this.displayCurrency = value;
    }

    /**
     * Gets the value of the enableForecasts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableForecasts() {
        return enableForecasts;
    }

    /**
     * Sets the value of the enableForecasts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableForecasts(Boolean value) {
        this.enableForecasts = value;
    }

    /**
     * Gets the value of the forecastRangeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastRangeSettings }
     *     
     */
    public ForecastRangeSettings getForecastRangeSettings() {
        return forecastRangeSettings;
    }

    /**
     * Sets the value of the forecastRangeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastRangeSettings }
     *     
     */
    public void setForecastRangeSettings(ForecastRangeSettings value) {
        this.forecastRangeSettings = value;
    }

    /**
     * Gets the value of the opportunityListFieldsSelectedSettings property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityListFieldsSelectedSettings }
     *     
     */
    public OpportunityListFieldsSelectedSettings getOpportunityListFieldsSelectedSettings() {
        return opportunityListFieldsSelectedSettings;
    }

    /**
     * Sets the value of the opportunityListFieldsSelectedSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityListFieldsSelectedSettings }
     *     
     */
    public void setOpportunityListFieldsSelectedSettings(OpportunityListFieldsSelectedSettings value) {
        this.opportunityListFieldsSelectedSettings = value;
    }

    /**
     * Gets the value of the quotasSettings property.
     * 
     * @return
     *     possible object is
     *     {@link QuotasSettings }
     *     
     */
    public QuotasSettings getQuotasSettings() {
        return quotasSettings;
    }

    /**
     * Sets the value of the quotasSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotasSettings }
     *     
     */
    public void setQuotasSettings(QuotasSettings value) {
        this.quotasSettings = value;
    }

}
