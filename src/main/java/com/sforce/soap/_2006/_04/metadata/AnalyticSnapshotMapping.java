
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalyticSnapshotMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticSnapshotMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggregateType" type="{http://soap.sforce.com/2006/04/metadata}ReportSummaryType" minOccurs="0"/>
 *         &lt;element name="sourceField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceType" type="{http://soap.sforce.com/2006/04/metadata}ReportJobSourceTypes"/>
 *         &lt;element name="targetField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticSnapshotMapping", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "aggregateType",
    "sourceField",
    "sourceType",
    "targetField"
})
public class AnalyticSnapshotMapping {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportSummaryType aggregateType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String sourceField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ReportJobSourceTypes sourceType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String targetField;

    /**
     * Gets the value of the aggregateType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSummaryType }
     *     
     */
    public ReportSummaryType getAggregateType() {
        return aggregateType;
    }

    /**
     * Sets the value of the aggregateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSummaryType }
     *     
     */
    public void setAggregateType(ReportSummaryType value) {
        this.aggregateType = value;
    }

    /**
     * Gets the value of the sourceField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceField() {
        return sourceField;
    }

    /**
     * Sets the value of the sourceField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceField(String value) {
        this.sourceField = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportJobSourceTypes }
     *     
     */
    public ReportJobSourceTypes getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportJobSourceTypes }
     *     
     */
    public void setSourceType(ReportJobSourceTypes value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the targetField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetField() {
        return targetField;
    }

    /**
     * Sets the value of the targetField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetField(String value) {
        this.targetField = value;
    }

}
