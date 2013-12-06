
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Network complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Network">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="allowMembersToFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="branding" type="{http://soap.sforce.com/2006/04/metadata}Branding" minOccurs="0"/>
 *         &lt;element name="caseCommentEmailTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changePasswordTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailSenderAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailSenderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableInvitation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forgotPasswordTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkMemberGroups" type="{http://soap.sforce.com/2006/04/metadata}NetworkMemberGroup" minOccurs="0"/>
 *         &lt;element name="newSenderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfRegProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendWelcomeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://soap.sforce.com/2006/04/metadata}NetworkStatus"/>
 *         &lt;element name="tabs" type="{http://soap.sforce.com/2006/04/metadata}NetworkTabSet"/>
 *         &lt;element name="urlPathPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="welcomeTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Network", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "allowMembersToFlag",
    "branding",
    "caseCommentEmailTemplate",
    "changePasswordTemplate",
    "description",
    "emailSenderAddress",
    "emailSenderName",
    "enableInvitation",
    "forgotPasswordTemplate",
    "networkMemberGroups",
    "newSenderAddress",
    "selfRegProfile",
    "selfRegistration",
    "sendWelcomeEmail",
    "site",
    "status",
    "tabs",
    "urlPathPrefix",
    "welcomeTemplate"
})
public class Network
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean allowMembersToFlag;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Branding branding;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseCommentEmailTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String changePasswordTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String emailSenderAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String emailSenderName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableInvitation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String forgotPasswordTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected NetworkMemberGroup networkMemberGroups;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String newSenderAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String selfRegProfile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean selfRegistration;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean sendWelcomeEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String site;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected NetworkStatus status;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected NetworkTabSet tabs;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String urlPathPrefix;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String welcomeTemplate;

    /**
     * Gets the value of the allowMembersToFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMembersToFlag() {
        return allowMembersToFlag;
    }

    /**
     * Sets the value of the allowMembersToFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMembersToFlag(Boolean value) {
        this.allowMembersToFlag = value;
    }

    /**
     * Gets the value of the branding property.
     * 
     * @return
     *     possible object is
     *     {@link Branding }
     *     
     */
    public Branding getBranding() {
        return branding;
    }

    /**
     * Sets the value of the branding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branding }
     *     
     */
    public void setBranding(Branding value) {
        this.branding = value;
    }

    /**
     * Gets the value of the caseCommentEmailTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCommentEmailTemplate() {
        return caseCommentEmailTemplate;
    }

    /**
     * Sets the value of the caseCommentEmailTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCommentEmailTemplate(String value) {
        this.caseCommentEmailTemplate = value;
    }

    /**
     * Gets the value of the changePasswordTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePasswordTemplate() {
        return changePasswordTemplate;
    }

    /**
     * Sets the value of the changePasswordTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePasswordTemplate(String value) {
        this.changePasswordTemplate = value;
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
     * Gets the value of the enableInvitation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableInvitation() {
        return enableInvitation;
    }

    /**
     * Sets the value of the enableInvitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableInvitation(Boolean value) {
        this.enableInvitation = value;
    }

    /**
     * Gets the value of the forgotPasswordTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgotPasswordTemplate() {
        return forgotPasswordTemplate;
    }

    /**
     * Sets the value of the forgotPasswordTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgotPasswordTemplate(String value) {
        this.forgotPasswordTemplate = value;
    }

    /**
     * Gets the value of the networkMemberGroups property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkMemberGroup }
     *     
     */
    public NetworkMemberGroup getNetworkMemberGroups() {
        return networkMemberGroups;
    }

    /**
     * Sets the value of the networkMemberGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkMemberGroup }
     *     
     */
    public void setNetworkMemberGroups(NetworkMemberGroup value) {
        this.networkMemberGroups = value;
    }

    /**
     * Gets the value of the newSenderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSenderAddress() {
        return newSenderAddress;
    }

    /**
     * Sets the value of the newSenderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSenderAddress(String value) {
        this.newSenderAddress = value;
    }

    /**
     * Gets the value of the selfRegProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfRegProfile() {
        return selfRegProfile;
    }

    /**
     * Sets the value of the selfRegProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfRegProfile(String value) {
        this.selfRegProfile = value;
    }

    /**
     * Gets the value of the selfRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfRegistration() {
        return selfRegistration;
    }

    /**
     * Sets the value of the selfRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfRegistration(Boolean value) {
        this.selfRegistration = value;
    }

    /**
     * Gets the value of the sendWelcomeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendWelcomeEmail() {
        return sendWelcomeEmail;
    }

    /**
     * Sets the value of the sendWelcomeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendWelcomeEmail(Boolean value) {
        this.sendWelcomeEmail = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkStatus }
     *     
     */
    public NetworkStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkStatus }
     *     
     */
    public void setStatus(NetworkStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the tabs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkTabSet }
     *     
     */
    public NetworkTabSet getTabs() {
        return tabs;
    }

    /**
     * Sets the value of the tabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTabSet }
     *     
     */
    public void setTabs(NetworkTabSet value) {
        this.tabs = value;
    }

    /**
     * Gets the value of the urlPathPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPathPrefix() {
        return urlPathPrefix;
    }

    /**
     * Sets the value of the urlPathPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPathPrefix(String value) {
        this.urlPathPrefix = value;
    }

    /**
     * Gets the value of the welcomeTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeTemplate() {
        return welcomeTemplate;
    }

    /**
     * Sets the value of the welcomeTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeTemplate(String value) {
        this.welcomeTemplate = value;
    }

}
