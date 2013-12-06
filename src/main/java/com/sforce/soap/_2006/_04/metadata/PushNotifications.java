
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PushNotifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PushNotifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pushNotification" type="{http://soap.sforce.com/2006/04/metadata}PushNotification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotifications", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "pushNotification"
})
public class PushNotifications {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PushNotification> pushNotification;

    /**
     * Gets the value of the pushNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pushNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPushNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PushNotification }
     * 
     * 
     */
    public List<PushNotification> getPushNotification() {
        if (pushNotification == null) {
            pushNotification = new ArrayList<PushNotification>();
        }
        return this.pushNotification;
    }

}
