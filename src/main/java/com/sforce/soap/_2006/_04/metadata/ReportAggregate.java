
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportAggregate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportAggregate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acrossGroupingContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculatedFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datatype" type="{http://soap.sforce.com/2006/04/metadata}ReportAggregateDatatype"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="downGroupingContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isCrossBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportAggregate", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "acrossGroupingContext",
    "calculatedFormula",
    "datatype",
    "description",
    "developerName",
    "downGroupingContext",
    "isActive",
    "isCrossBlock",
    "masterLabel",
    "reportType",
    "scale"
})
public class ReportAggregate {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String acrossGroupingContext;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String calculatedFormula;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ReportAggregateDatatype datatype;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String developerName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String downGroupingContext;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean isActive;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isCrossBlock;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String masterLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String reportType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer scale;

    /**
     * Gets the value of the acrossGroupingContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrossGroupingContext() {
        return acrossGroupingContext;
    }

    /**
     * Sets the value of the acrossGroupingContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrossGroupingContext(String value) {
        this.acrossGroupingContext = value;
    }

    /**
     * Gets the value of the calculatedFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedFormula() {
        return calculatedFormula;
    }

    /**
     * Sets the value of the calculatedFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedFormula(String value) {
        this.calculatedFormula = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link ReportAggregateDatatype }
     *     
     */
    public ReportAggregateDatatype getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportAggregateDatatype }
     *     
     */
    public void setDatatype(ReportAggregateDatatype value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the downGroupingContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownGroupingContext() {
        return downGroupingContext;
    }

    /**
     * Sets the value of the downGroupingContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownGroupingContext(String value) {
        this.downGroupingContext = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isCrossBlock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCrossBlock() {
        return isCrossBlock;
    }

    /**
     * Sets the value of the isCrossBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCrossBlock(Boolean value) {
        this.isCrossBlock = value;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

}
