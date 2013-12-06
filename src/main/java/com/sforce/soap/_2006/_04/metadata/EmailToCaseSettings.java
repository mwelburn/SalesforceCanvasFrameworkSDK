
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailToCaseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailToCaseSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableEmailToCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableHtmlEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableOnDemandEmailToCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableThreadIDInBody" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableThreadIDInSubject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOwnerOnNewCaseEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overEmailLimitAction" type="{http://soap.sforce.com/2006/04/metadata}EmailToCaseOnFailureActionType" minOccurs="0"/>
 *         &lt;element name="routingAddresses" type="{http://soap.sforce.com/2006/04/metadata}EmailToCaseRoutingAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unauthorizedSenderAction" type="{http://soap.sforce.com/2006/04/metadata}EmailToCaseOnFailureActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailToCaseSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableEmailToCase",
    "enableHtmlEmail",
    "enableOnDemandEmailToCase",
    "enableThreadIDInBody",
    "enableThreadIDInSubject",
    "notifyOwnerOnNewCaseEmail",
    "overEmailLimitAction",
    "routingAddresses",
    "unauthorizedSenderAction"
})
public class EmailToCaseSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableEmailToCase;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableHtmlEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableOnDemandEmailToCase;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableThreadIDInBody;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableThreadIDInSubject;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean notifyOwnerOnNewCaseEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected EmailToCaseOnFailureActionType overEmailLimitAction;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<EmailToCaseRoutingAddress> routingAddresses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected EmailToCaseOnFailureActionType unauthorizedSenderAction;

    /**
     * Gets the value of the enableEmailToCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEmailToCase() {
        return enableEmailToCase;
    }

    /**
     * Sets the value of the enableEmailToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEmailToCase(Boolean value) {
        this.enableEmailToCase = value;
    }

    /**
     * Gets the value of the enableHtmlEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHtmlEmail() {
        return enableHtmlEmail;
    }

    /**
     * Sets the value of the enableHtmlEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHtmlEmail(Boolean value) {
        this.enableHtmlEmail = value;
    }

    /**
     * Gets the value of the enableOnDemandEmailToCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOnDemandEmailToCase() {
        return enableOnDemandEmailToCase;
    }

    /**
     * Sets the value of the enableOnDemandEmailToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOnDemandEmailToCase(Boolean value) {
        this.enableOnDemandEmailToCase = value;
    }

    /**
     * Gets the value of the enableThreadIDInBody property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableThreadIDInBody() {
        return enableThreadIDInBody;
    }

    /**
     * Sets the value of the enableThreadIDInBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableThreadIDInBody(Boolean value) {
        this.enableThreadIDInBody = value;
    }

    /**
     * Gets the value of the enableThreadIDInSubject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableThreadIDInSubject() {
        return enableThreadIDInSubject;
    }

    /**
     * Sets the value of the enableThreadIDInSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableThreadIDInSubject(Boolean value) {
        this.enableThreadIDInSubject = value;
    }

    /**
     * Gets the value of the notifyOwnerOnNewCaseEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOwnerOnNewCaseEmail() {
        return notifyOwnerOnNewCaseEmail;
    }

    /**
     * Sets the value of the notifyOwnerOnNewCaseEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOwnerOnNewCaseEmail(Boolean value) {
        this.notifyOwnerOnNewCaseEmail = value;
    }

    /**
     * Gets the value of the overEmailLimitAction property.
     * 
     * @return
     *     possible object is
     *     {@link EmailToCaseOnFailureActionType }
     *     
     */
    public EmailToCaseOnFailureActionType getOverEmailLimitAction() {
        return overEmailLimitAction;
    }

    /**
     * Sets the value of the overEmailLimitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailToCaseOnFailureActionType }
     *     
     */
    public void setOverEmailLimitAction(EmailToCaseOnFailureActionType value) {
        this.overEmailLimitAction = value;
    }

    /**
     * Gets the value of the routingAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailToCaseRoutingAddress }
     * 
     * 
     */
    public List<EmailToCaseRoutingAddress> getRoutingAddresses() {
        if (routingAddresses == null) {
            routingAddresses = new ArrayList<EmailToCaseRoutingAddress>();
        }
        return this.routingAddresses;
    }

    /**
     * Gets the value of the unauthorizedSenderAction property.
     * 
     * @return
     *     possible object is
     *     {@link EmailToCaseOnFailureActionType }
     *     
     */
    public EmailToCaseOnFailureActionType getUnauthorizedSenderAction() {
        return unauthorizedSenderAction;
    }

    /**
     * Sets the value of the unauthorizedSenderAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailToCaseOnFailureActionType }
     *     
     */
    public void setUnauthorizedSenderAction(EmailToCaseOnFailureActionType value) {
        this.unauthorizedSenderAction = value;
    }

}
