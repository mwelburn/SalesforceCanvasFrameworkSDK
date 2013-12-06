
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileLoginIpRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileLoginIpRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileLoginIpRange", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "endAddress",
    "startAddress"
})
public class ProfileLoginIpRange {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String endAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String startAddress;

    /**
     * Gets the value of the endAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * Sets the value of the endAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAddress(String value) {
        this.endAddress = value;
    }

    /**
     * Gets the value of the startAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAddress() {
        return startAddress;
    }

    /**
     * Sets the value of the startAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAddress(String value) {
        this.startAddress = value;
    }

}
