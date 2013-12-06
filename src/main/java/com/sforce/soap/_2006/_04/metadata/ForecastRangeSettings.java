
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastRangeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastRangeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginning" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displaying" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="periodType" type="{http://soap.sforce.com/2006/04/metadata}PeriodTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastRangeSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "beginning",
    "displaying",
    "periodType"
})
public class ForecastRangeSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int beginning;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int displaying;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected PeriodTypes periodType;

    /**
     * Gets the value of the beginning property.
     * 
     */
    public int getBeginning() {
        return beginning;
    }

    /**
     * Sets the value of the beginning property.
     * 
     */
    public void setBeginning(int value) {
        this.beginning = value;
    }

    /**
     * Gets the value of the displaying property.
     * 
     */
    public int getDisplaying() {
        return displaying;
    }

    /**
     * Sets the value of the displaying property.
     * 
     */
    public void setDisplaying(int value) {
        this.displaying = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodTypes }
     *     
     */
    public PeriodTypes getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodTypes }
     *     
     */
    public void setPeriodType(PeriodTypes value) {
        this.periodType = value;
    }

}
