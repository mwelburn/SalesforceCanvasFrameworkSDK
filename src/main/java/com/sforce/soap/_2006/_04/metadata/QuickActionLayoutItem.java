
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionLayoutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickActionLayoutItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emptySpace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uiBehavior" type="{http://soap.sforce.com/2006/04/metadata}UiBehavior" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickActionLayoutItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "emptySpace",
    "field",
    "uiBehavior"
})
public class QuickActionLayoutItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean emptySpace;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String field;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected UiBehavior uiBehavior;

    /**
     * Gets the value of the emptySpace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmptySpace() {
        return emptySpace;
    }

    /**
     * Sets the value of the emptySpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmptySpace(Boolean value) {
        this.emptySpace = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the uiBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link UiBehavior }
     *     
     */
    public UiBehavior getUiBehavior() {
        return uiBehavior;
    }

    /**
     * Sets the value of the uiBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiBehavior }
     *     
     */
    public void setUiBehavior(UiBehavior value) {
        this.uiBehavior = value;
    }

}
