
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileApexClassAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileApexClassAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apexClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileApexClassAccess", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apexClass",
    "enabled"
})
public class ProfileApexClassAccess {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String apexClass;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enabled;

    /**
     * Gets the value of the apexClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexClass() {
        return apexClass;
    }

    /**
     * Sets the value of the apexClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexClass(String value) {
        this.apexClass = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

}
