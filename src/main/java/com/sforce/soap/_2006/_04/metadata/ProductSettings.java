
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="enableCascadeActivateToRelatedPrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableQuantitySchedule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableRevenueSchedule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableCascadeActivateToRelatedPrices",
    "enableQuantitySchedule",
    "enableRevenueSchedule"
})
public class ProductSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableCascadeActivateToRelatedPrices;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableQuantitySchedule;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableRevenueSchedule;

    /**
     * Gets the value of the enableCascadeActivateToRelatedPrices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCascadeActivateToRelatedPrices() {
        return enableCascadeActivateToRelatedPrices;
    }

    /**
     * Sets the value of the enableCascadeActivateToRelatedPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCascadeActivateToRelatedPrices(Boolean value) {
        this.enableCascadeActivateToRelatedPrices = value;
    }

    /**
     * Gets the value of the enableQuantitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableQuantitySchedule() {
        return enableQuantitySchedule;
    }

    /**
     * Sets the value of the enableQuantitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableQuantitySchedule(Boolean value) {
        this.enableQuantitySchedule = value;
    }

    /**
     * Gets the value of the enableRevenueSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRevenueSchedule() {
        return enableRevenueSchedule;
    }

    /**
     * Sets the value of the enableRevenueSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRevenueSchedule(Boolean value) {
        this.enableRevenueSchedule = value;
    }

}
