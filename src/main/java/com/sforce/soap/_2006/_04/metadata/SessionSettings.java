
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disableTimeoutWarning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableCSRFOnGet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableCSRFOnPost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableCacheAndAutocomplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableClickjackNonsetupSFDC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableClickjackNonsetupUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableClickjackSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSMSIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forceRelogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lockSessionsToIp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sessionTimeout" type="{http://soap.sforce.com/2006/04/metadata}SessionTimeout" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "disableTimeoutWarning",
    "enableCSRFOnGet",
    "enableCSRFOnPost",
    "enableCacheAndAutocomplete",
    "enableClickjackNonsetupSFDC",
    "enableClickjackNonsetupUser",
    "enableClickjackSetup",
    "enableSMSIdentity",
    "forceRelogin",
    "lockSessionsToIp",
    "sessionTimeout"
})
public class SessionSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean disableTimeoutWarning;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableCSRFOnGet;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableCSRFOnPost;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableCacheAndAutocomplete;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableClickjackNonsetupSFDC;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableClickjackNonsetupUser;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableClickjackSetup;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSMSIdentity;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean forceRelogin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean lockSessionsToIp;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SessionTimeout sessionTimeout;

    /**
     * Gets the value of the disableTimeoutWarning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableTimeoutWarning() {
        return disableTimeoutWarning;
    }

    /**
     * Sets the value of the disableTimeoutWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableTimeoutWarning(Boolean value) {
        this.disableTimeoutWarning = value;
    }

    /**
     * Gets the value of the enableCSRFOnGet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCSRFOnGet() {
        return enableCSRFOnGet;
    }

    /**
     * Sets the value of the enableCSRFOnGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCSRFOnGet(Boolean value) {
        this.enableCSRFOnGet = value;
    }

    /**
     * Gets the value of the enableCSRFOnPost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCSRFOnPost() {
        return enableCSRFOnPost;
    }

    /**
     * Sets the value of the enableCSRFOnPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCSRFOnPost(Boolean value) {
        this.enableCSRFOnPost = value;
    }

    /**
     * Gets the value of the enableCacheAndAutocomplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCacheAndAutocomplete() {
        return enableCacheAndAutocomplete;
    }

    /**
     * Sets the value of the enableCacheAndAutocomplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCacheAndAutocomplete(Boolean value) {
        this.enableCacheAndAutocomplete = value;
    }

    /**
     * Gets the value of the enableClickjackNonsetupSFDC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableClickjackNonsetupSFDC() {
        return enableClickjackNonsetupSFDC;
    }

    /**
     * Sets the value of the enableClickjackNonsetupSFDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableClickjackNonsetupSFDC(Boolean value) {
        this.enableClickjackNonsetupSFDC = value;
    }

    /**
     * Gets the value of the enableClickjackNonsetupUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableClickjackNonsetupUser() {
        return enableClickjackNonsetupUser;
    }

    /**
     * Sets the value of the enableClickjackNonsetupUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableClickjackNonsetupUser(Boolean value) {
        this.enableClickjackNonsetupUser = value;
    }

    /**
     * Gets the value of the enableClickjackSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableClickjackSetup() {
        return enableClickjackSetup;
    }

    /**
     * Sets the value of the enableClickjackSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableClickjackSetup(Boolean value) {
        this.enableClickjackSetup = value;
    }

    /**
     * Gets the value of the enableSMSIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSMSIdentity() {
        return enableSMSIdentity;
    }

    /**
     * Sets the value of the enableSMSIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSMSIdentity(Boolean value) {
        this.enableSMSIdentity = value;
    }

    /**
     * Gets the value of the forceRelogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceRelogin() {
        return forceRelogin;
    }

    /**
     * Sets the value of the forceRelogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceRelogin(Boolean value) {
        this.forceRelogin = value;
    }

    /**
     * Gets the value of the lockSessionsToIp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockSessionsToIp() {
        return lockSessionsToIp;
    }

    /**
     * Sets the value of the lockSessionsToIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockSessionsToIp(Boolean value) {
        this.lockSessionsToIp = value;
    }

    /**
     * Gets the value of the sessionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTimeout }
     *     
     */
    public SessionTimeout getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTimeout }
     *     
     */
    public void setSessionTimeout(SessionTimeout value) {
        this.sessionTimeout = value;
    }

}
