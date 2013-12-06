
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportChartComponentLayoutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportChartComponentLayoutItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cacheData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contextFilterableField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeContext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="showTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="size" type="{http://soap.sforce.com/2006/04/metadata}ReportChartComponentSize" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportChartComponentLayoutItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "cacheData",
    "contextFilterableField",
    "hideOnError",
    "includeContext",
    "reportName",
    "showTitle",
    "size"
})
public class ReportChartComponentLayoutItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean cacheData;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String contextFilterableField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean hideOnError;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean includeContext;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String reportName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showTitle;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportChartComponentSize size;

    /**
     * Gets the value of the cacheData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCacheData() {
        return cacheData;
    }

    /**
     * Sets the value of the cacheData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCacheData(Boolean value) {
        this.cacheData = value;
    }

    /**
     * Gets the value of the contextFilterableField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextFilterableField() {
        return contextFilterableField;
    }

    /**
     * Sets the value of the contextFilterableField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextFilterableField(String value) {
        this.contextFilterableField = value;
    }

    /**
     * Gets the value of the hideOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideOnError() {
        return hideOnError;
    }

    /**
     * Sets the value of the hideOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideOnError(Boolean value) {
        this.hideOnError = value;
    }

    /**
     * Gets the value of the includeContext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeContext() {
        return includeContext;
    }

    /**
     * Sets the value of the includeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeContext(Boolean value) {
        this.includeContext = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTitle(Boolean value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ReportChartComponentSize }
     *     
     */
    public ReportChartComponentSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportChartComponentSize }
     *     
     */
    public void setSize(ReportChartComponentSize value) {
        this.size = value;
    }

}
