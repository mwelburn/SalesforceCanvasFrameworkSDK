
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggregate" type="{http://soap.sforce.com/2006/04/metadata}ReportSummaryType" minOccurs="0"/>
 *         &lt;element name="axisBinding" type="{http://soap.sforce.com/2006/04/metadata}ChartAxis" minOccurs="0"/>
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartSummary", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "aggregate",
    "axisBinding",
    "column"
})
public class ChartSummary {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportSummaryType aggregate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartAxis axisBinding;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String column;

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
     * Gets the value of the axisBinding property.
     * 
     * @return
     *     possible object is
     *     {@link ChartAxis }
     *     
     */
    public ChartAxis getAxisBinding() {
        return axisBinding;
    }

    /**
     * Sets the value of the axisBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartAxis }
     *     
     */
    public void setAxisBinding(ChartAxis value) {
        this.axisBinding = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

}
