
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportColorRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportColorRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggregate" type="{http://soap.sforce.com/2006/04/metadata}ReportSummaryType" minOccurs="0"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highBreakpoint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="highColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lowBreakpoint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lowColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="midColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportColorRange", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "aggregate",
    "columnName",
    "highBreakpoint",
    "highColor",
    "lowBreakpoint",
    "lowColor",
    "midColor"
})
public class ReportColorRange {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportSummaryType aggregate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String columnName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double highBreakpoint;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String highColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double lowBreakpoint;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String lowColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String midColor;

    /**
     * Gets the value of the aggregate property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSummaryType }
     *     
     */
    public ReportSummaryType getAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSummaryType }
     *     
     */
    public void setAggregate(ReportSummaryType value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the highBreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHighBreakpoint() {
        return highBreakpoint;
    }

    /**
     * Sets the value of the highBreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHighBreakpoint(Double value) {
        this.highBreakpoint = value;
    }

    /**
     * Gets the value of the highColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighColor() {
        return highColor;
    }

    /**
     * Sets the value of the highColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighColor(String value) {
        this.highColor = value;
    }

    /**
     * Gets the value of the lowBreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowBreakpoint() {
        return lowBreakpoint;
    }

    /**
     * Sets the value of the lowBreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowBreakpoint(Double value) {
        this.lowBreakpoint = value;
    }

    /**
     * Gets the value of the lowColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowColor() {
        return lowColor;
    }

    /**
     * Sets the value of the lowColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowColor(String value) {
        this.lowColor = value;
    }

    /**
     * Gets the value of the midColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidColor() {
        return midColor;
    }

    /**
     * Sets the value of the midColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidColor(String value) {
        this.midColor = value;
    }

}
