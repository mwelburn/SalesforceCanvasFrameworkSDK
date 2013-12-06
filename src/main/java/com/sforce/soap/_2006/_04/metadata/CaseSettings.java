
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="caseAssignNotificationTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseCloseNotificationTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseCommentNotificationTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseCreateNotificationTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closeCaseThroughStatusChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultCaseOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultCaseOwnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultCaseUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailToCase" type="{http://soap.sforce.com/2006/04/metadata}EmailToCaseSettings" minOccurs="0"/>
 *         &lt;element name="enableCaseFeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableDraftEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableEarlyEscalationRuleTriggers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableNewEmailDefaultTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSuggestedArticlesApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSuggestedArticlesCustomerPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSuggestedArticlesPartnerPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSuggestedSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keepRecordTypeOnAssignmentRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="newEmailDefaultTemplateClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifyContactOnCaseComment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyDefaultCaseOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOwnerOnCaseComment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOwnerOnCaseOwnerChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showFewerCloseActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useSystemEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="webToCase" type="{http://soap.sforce.com/2006/04/metadata}WebToCaseSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "caseAssignNotificationTemplate",
    "caseCloseNotificationTemplate",
    "caseCommentNotificationTemplate",
    "caseCreateNotificationTemplate",
    "closeCaseThroughStatusChange",
    "defaultCaseOwner",
    "defaultCaseOwnerType",
    "defaultCaseUser",
    "emailToCase",
    "enableCaseFeed",
    "enableDraftEmails",
    "enableEarlyEscalationRuleTriggers",
    "enableNewEmailDefaultTemplate",
    "enableSuggestedArticlesApplication",
    "enableSuggestedArticlesCustomerPortal",
    "enableSuggestedArticlesPartnerPortal",
    "enableSuggestedSolutions",
    "keepRecordTypeOnAssignmentRule",
    "newEmailDefaultTemplateClass",
    "notifyContactOnCaseComment",
    "notifyDefaultCaseOwner",
    "notifyOwnerOnCaseComment",
    "notifyOwnerOnCaseOwnerChange",
    "showFewerCloseActions",
    "useSystemEmailAddress",
    "webToCase"
})
public class CaseSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseAssignNotificationTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseCloseNotificationTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseCommentNotificationTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseCreateNotificationTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean closeCaseThroughStatusChange;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultCaseOwner;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultCaseOwnerType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultCaseUser;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected EmailToCaseSettings emailToCase;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableCaseFeed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableDraftEmails;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableEarlyEscalationRuleTriggers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableNewEmailDefaultTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSuggestedArticlesApplication;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSuggestedArticlesCustomerPortal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSuggestedArticlesPartnerPortal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSuggestedSolutions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean keepRecordTypeOnAssignmentRule;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String newEmailDefaultTemplateClass;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean notifyContactOnCaseComment;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean notifyDefaultCaseOwner;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean notifyOwnerOnCaseComment;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean notifyOwnerOnCaseOwnerChange;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showFewerCloseActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useSystemEmailAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected WebToCaseSettings webToCase;

    /**
     * Gets the value of the caseAssignNotificationTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAssignNotificationTemplate() {
        return caseAssignNotificationTemplate;
    }

    /**
     * Sets the value of the caseAssignNotificationTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAssignNotificationTemplate(String value) {
        this.caseAssignNotificationTemplate = value;
    }

    /**
     * Gets the value of the caseCloseNotificationTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCloseNotificationTemplate() {
        return caseCloseNotificationTemplate;
    }

    /**
     * Sets the value of the caseCloseNotificationTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCloseNotificationTemplate(String value) {
        this.caseCloseNotificationTemplate = value;
    }

    /**
     * Gets the value of the caseCommentNotificationTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCommentNotificationTemplate() {
        return caseCommentNotificationTemplate;
    }

    /**
     * Sets the value of the caseCommentNotificationTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCommentNotificationTemplate(String value) {
        this.caseCommentNotificationTemplate = value;
    }

    /**
     * Gets the value of the caseCreateNotificationTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCreateNotificationTemplate() {
        return caseCreateNotificationTemplate;
    }

    /**
     * Sets the value of the caseCreateNotificationTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCreateNotificationTemplate(String value) {
        this.caseCreateNotificationTemplate = value;
    }

    /**
     * Gets the value of the closeCaseThroughStatusChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCloseCaseThroughStatusChange() {
        return closeCaseThroughStatusChange;
    }

    /**
     * Sets the value of the closeCaseThroughStatusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloseCaseThroughStatusChange(Boolean value) {
        this.closeCaseThroughStatusChange = value;
    }

    /**
     * Gets the value of the defaultCaseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCaseOwner() {
        return defaultCaseOwner;
    }

    /**
     * Sets the value of the defaultCaseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCaseOwner(String value) {
        this.defaultCaseOwner = value;
    }

    /**
     * Gets the value of the defaultCaseOwnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCaseOwnerType() {
        return defaultCaseOwnerType;
    }

    /**
     * Sets the value of the defaultCaseOwnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCaseOwnerType(String value) {
        this.defaultCaseOwnerType = value;
    }

    /**
     * Gets the value of the defaultCaseUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCaseUser() {
        return defaultCaseUser;
    }

    /**
     * Sets the value of the defaultCaseUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCaseUser(String value) {
        this.defaultCaseUser = value;
    }

    /**
     * Gets the value of the emailToCase property.
     * 
     * @return
     *     possible object is
     *     {@link EmailToCaseSettings }
     *     
     */
    public EmailToCaseSettings getEmailToCase() {
        return emailToCase;
    }

    /**
     * Sets the value of the emailToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailToCaseSettings }
     *     
     */
    public void setEmailToCase(EmailToCaseSettings value) {
        this.emailToCase = value;
    }

    /**
     * Gets the value of the enableCaseFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCaseFeed() {
        return enableCaseFeed;
    }

    /**
     * Sets the value of the enableCaseFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCaseFeed(Boolean value) {
        this.enableCaseFeed = value;
    }

    /**
     * Gets the value of the enableDraftEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDraftEmails() {
        return enableDraftEmails;
    }

    /**
     * Sets the value of the enableDraftEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDraftEmails(Boolean value) {
        this.enableDraftEmails = value;
    }

    /**
     * Gets the value of the enableEarlyEscalationRuleTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEarlyEscalationRuleTriggers() {
        return enableEarlyEscalationRuleTriggers;
    }

    /**
     * Sets the value of the enableEarlyEscalationRuleTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEarlyEscalationRuleTriggers(Boolean value) {
        this.enableEarlyEscalationRuleTriggers = value;
    }

    /**
     * Gets the value of the enableNewEmailDefaultTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNewEmailDefaultTemplate() {
        return enableNewEmailDefaultTemplate;
    }

    /**
     * Sets the value of the enableNewEmailDefaultTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNewEmailDefaultTemplate(Boolean value) {
        this.enableNewEmailDefaultTemplate = value;
    }

    /**
     * Gets the value of the enableSuggestedArticlesApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSuggestedArticlesApplication() {
        return enableSuggestedArticlesApplication;
    }

    /**
     * Sets the value of the enableSuggestedArticlesApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSuggestedArticlesApplication(Boolean value) {
        this.enableSuggestedArticlesApplication = value;
    }

    /**
     * Gets the value of the enableSuggestedArticlesCustomerPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSuggestedArticlesCustomerPortal() {
        return enableSuggestedArticlesCustomerPortal;
    }

    /**
     * Sets the value of the enableSuggestedArticlesCustomerPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSuggestedArticlesCustomerPortal(Boolean value) {
        this.enableSuggestedArticlesCustomerPortal = value;
    }

    /**
     * Gets the value of the enableSuggestedArticlesPartnerPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSuggestedArticlesPartnerPortal() {
        return enableSuggestedArticlesPartnerPortal;
    }

    /**
     * Sets the value of the enableSuggestedArticlesPartnerPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSuggestedArticlesPartnerPortal(Boolean value) {
        this.enableSuggestedArticlesPartnerPortal = value;
    }

    /**
     * Gets the value of the enableSuggestedSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSuggestedSolutions() {
        return enableSuggestedSolutions;
    }

    /**
     * Sets the value of the enableSuggestedSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSuggestedSolutions(Boolean value) {
        this.enableSuggestedSolutions = value;
    }

    /**
     * Gets the value of the keepRecordTypeOnAssignmentRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepRecordTypeOnAssignmentRule() {
        return keepRecordTypeOnAssignmentRule;
    }

    /**
     * Sets the value of the keepRecordTypeOnAssignmentRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepRecordTypeOnAssignmentRule(Boolean value) {
        this.keepRecordTypeOnAssignmentRule = value;
    }

    /**
     * Gets the value of the newEmailDefaultTemplateClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmailDefaultTemplateClass() {
        return newEmailDefaultTemplateClass;
    }

    /**
     * Sets the value of the newEmailDefaultTemplateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmailDefaultTemplateClass(String value) {
        this.newEmailDefaultTemplateClass = value;
    }

    /**
     * Gets the value of the notifyContactOnCaseComment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyContactOnCaseComment() {
        return notifyContactOnCaseComment;
    }

    /**
     * Sets the value of the notifyContactOnCaseComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyContactOnCaseComment(Boolean value) {
        this.notifyContactOnCaseComment = value;
    }

    /**
     * Gets the value of the notifyDefaultCaseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyDefaultCaseOwner() {
        return notifyDefaultCaseOwner;
    }

    /**
     * Sets the value of the notifyDefaultCaseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyDefaultCaseOwner(Boolean value) {
        this.notifyDefaultCaseOwner = value;
    }

    /**
     * Gets the value of the notifyOwnerOnCaseComment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOwnerOnCaseComment() {
        return notifyOwnerOnCaseComment;
    }

    /**
     * Sets the value of the notifyOwnerOnCaseComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOwnerOnCaseComment(Boolean value) {
        this.notifyOwnerOnCaseComment = value;
    }

    /**
     * Gets the value of the notifyOwnerOnCaseOwnerChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOwnerOnCaseOwnerChange() {
        return notifyOwnerOnCaseOwnerChange;
    }

    /**
     * Sets the value of the notifyOwnerOnCaseOwnerChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOwnerOnCaseOwnerChange(Boolean value) {
        this.notifyOwnerOnCaseOwnerChange = value;
    }

    /**
     * Gets the value of the showFewerCloseActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowFewerCloseActions() {
        return showFewerCloseActions;
    }

    /**
     * Sets the value of the showFewerCloseActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowFewerCloseActions(Boolean value) {
        this.showFewerCloseActions = value;
    }

    /**
     * Gets the value of the useSystemEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSystemEmailAddress() {
        return useSystemEmailAddress;
    }

    /**
     * Sets the value of the useSystemEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSystemEmailAddress(Boolean value) {
        this.useSystemEmailAddress = value;
    }

    /**
     * Gets the value of the webToCase property.
     * 
     * @return
     *     possible object is
     *     {@link WebToCaseSettings }
     *     
     */
    public WebToCaseSettings getWebToCase() {
        return webToCase;
    }

    /**
     * Sets the value of the webToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebToCaseSettings }
     *     
     */
    public void setWebToCase(WebToCaseSettings value) {
        this.webToCase = value;
    }

}
