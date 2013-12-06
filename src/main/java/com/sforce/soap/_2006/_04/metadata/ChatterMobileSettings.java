
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChatterMobileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChatterMobileSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enablePushNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChatterMobileSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enablePushNotifications"
})
public class ChatterMobileSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enablePushNotifications;

    /**
     * Gets the value of the enablePushNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePushNotifications() {
        return enablePushNotifications;
    }

    /**
     * Sets the value of the enablePushNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePushNotifications(Boolean value) {
        this.enablePushNotifications = value;
    }

}
