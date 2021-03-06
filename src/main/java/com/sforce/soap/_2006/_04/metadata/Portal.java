
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Portal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Portal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailSenderAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailSenderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableSelfCloseCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="footerDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forgotPassTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headerDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSelfRegistrationActivated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loginHeaderDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoutUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCommentTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPassTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newUserTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerNotifyTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfRegNewUserUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfRegUserDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfRegUserDefaultRole" type="{http://soap.sforce.com/2006/04/metadata}PortalRoles" minOccurs="0"/>
 *         &lt;element name="selfRegUserTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showActionConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stylesheetDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://soap.sforce.com/2006/04/metadata}PortalType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portal", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "admin",
    "defaultLanguage",
    "description",
    "emailSenderAddress",
    "emailSenderName",
    "enableSelfCloseCase",
    "footerDocument",
    "forgotPassTemplate",
    "headerDocument",
    "isSelfRegistrationActivated",
    "loginHeaderDocument",
    "logoDocument",
    "logoutUrl",
    "newCommentTemplate",
    "newPassTemplate",
    "newUserTemplate",
    "ownerNotifyTemplate",
    "selfRegNewUserUrl",
    "selfRegUserDefaultProfile",
    "selfRegUserDefaultRole",
    "selfRegUserTemplate",
    "showActionConfirmation",
    "stylesheetDocument",
    "type"
})
public class Portal
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String admin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultLanguage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String emailSenderAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String emailSenderName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSelfCloseCase;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String footerDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String forgotPassTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String headerDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isSelfRegistrationActivated;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String loginHeaderDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String logoDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String logoutUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String newCommentTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String newPassTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String newUserTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String ownerNotifyTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String selfRegNewUserUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String selfRegUserDefaultProfile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PortalRoles selfRegUserDefaultRole;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String selfRegUserTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showActionConfirmation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String stylesheetDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected PortalType type;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin(String value) {
        this.admin = value;
    }

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the emailSenderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSenderAddress() {
        return emailSenderAddress;
    }

    /**
     * Sets the value of the emailSenderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSenderAddress(String value) {
        this.emailSenderAddress = value;
    }

    /**
     * Gets the value of the emailSenderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSenderName() {
        return emailSenderName;
    }

    /**
     * Sets the value of the emailSenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSenderName(String value) {
        this.emailSenderName = value;
    }

    /**
     * Gets the value of the enableSelfCloseCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSelfCloseCase() {
        return enableSelfCloseCase;
    }

    /**
     * Sets the value of the enableSelfCloseCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSelfCloseCase(Boolean value) {
        this.enableSelfCloseCase = value;
    }

    /**
     * Gets the value of the footerDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooterDocument() {
        return footerDocument;
    }

    /**
     * Sets the value of the footerDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooterDocument(String value) {
        this.footerDocument = value;
    }

    /**
     * Gets the value of the forgotPassTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgotPassTemplate() {
        return forgotPassTemplate;
    }

    /**
     * Sets the value of the forgotPassTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgotPassTemplate(String value) {
        this.forgotPassTemplate = value;
    }

    /**
     * Gets the value of the headerDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderDocument() {
        return headerDocument;
    }

    /**
     * Sets the value of the headerDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderDocument(String value) {
        this.headerDocument = value;
    }

    /**
     * Gets the value of the isSelfRegistrationActivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelfRegistrationActivated() {
        return isSelfRegistrationActivated;
    }

    /**
     * Sets the value of the isSelfRegistrationActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelfRegistrationActivated(Boolean value) {
        this.isSelfRegistrationActivated = value;
    }

    /**
     * Gets the value of the loginHeaderDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginHeaderDocument() {
        return loginHeaderDocument;
    }

    /**
     * Sets the value of the loginHeaderDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginHeaderDocument(String value) {
        this.loginHeaderDocument = value;
    }

    /**
     * Gets the value of the logoDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoDocument() {
        return logoDocument;
    }

    /**
     * Sets the value of the logoDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoDocument(String value) {
        this.logoDocument = value;
    }

    /**
     * Gets the value of the logoutUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutUrl() {
        return logoutUrl;
    }

    /**
     * Sets the value of the logoutUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutUrl(String value) {
        this.logoutUrl = value;
    }

    /**
     * Gets the value of the newCommentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCommentTemplate() {
        return newCommentTemplate;
    }

    /**
     * Sets the value of the newCommentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCommentTemplate(String value) {
        this.newCommentTemplate = value;
    }

    /**
     * Gets the value of the newPassTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassTemplate() {
        return newPassTemplate;
    }

    /**
     * Sets the value of the newPassTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassTemplate(String value) {
        this.newPassTemplate = value;
    }

    /**
     * Gets the value of the newUserTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUserTemplate() {
        return newUserTemplate;
    }

    /**
     * Sets the value of the newUserTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUserTemplate(String value) {
        this.newUserTemplate = value;
    }

    /**
     * Gets the value of the ownerNotifyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerNotifyTemplate() {
        return ownerNotifyTemplate;
    }

    /**
     * Sets the value of the ownerNotifyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerNotifyTemplate(String value) {
        this.ownerNotifyTemplate = value;
    }

    /**
     * Gets the value of the selfRegNewUserUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfRegNewUserUrl() {
        return selfRegNewUserUrl;
    }

    /**
     * Sets the value of the selfRegNewUserUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfRegNewUserUrl(String value) {
        this.selfRegNewUserUrl = value;
    }

    /**
     * Gets the value of the selfRegUserDefaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfRegUserDefaultProfile() {
        return selfRegUserDefaultProfile;
    }

    /**
     * Sets the value of the selfRegUserDefaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfRegUserDefaultProfile(String value) {
        this.selfRegUserDefaultProfile = value;
    }

    /**
     * Gets the value of the selfRegUserDefaultRole property.
     * 
     * @return
     *     possible object is
     *     {@link PortalRoles }
     *     
     */
    public PortalRoles getSelfRegUserDefaultRole() {
        return selfRegUserDefaultRole;
    }

    /**
     * Sets the value of the selfRegUserDefaultRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalRoles }
     *     
     */
    public void setSelfRegUserDefaultRole(PortalRoles value) {
        this.selfRegUserDefaultRole = value;
    }

    /**
     * Gets the value of the selfRegUserTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfRegUserTemplate() {
        return selfRegUserTemplate;
    }

    /**
     * Sets the value of the selfRegUserTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfRegUserTemplate(String value) {
        this.selfRegUserTemplate = value;
    }

    /**
     * Gets the value of the showActionConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowActionConfirmation() {
        return showActionConfirmation;
    }

    /**
     * Sets the value of the showActionConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowActionConfirmation(Boolean value) {
        this.showActionConfirmation = value;
    }

    /**
     * Gets the value of the stylesheetDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStylesheetDocument() {
        return stylesheetDocument;
    }

    /**
     * Sets the value of the stylesheetDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStylesheetDocument(String value) {
        this.stylesheetDocument = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PortalType }
     *     
     */
    public PortalType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalType }
     *     
     */
    public void setType(PortalType value) {
        this.type = value;
    }

}
