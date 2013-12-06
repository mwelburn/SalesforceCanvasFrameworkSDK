
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Community complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Community">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="communityFeedPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailFooterDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailHeaderDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailNotificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableChatterAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enablePrivateQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expertsGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reputationLevels" type="{http://soap.sforce.com/2006/04/metadata}ReputationLevels" minOccurs="0"/>
 *         &lt;element name="showInPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Community", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "communityFeedPage",
    "description",
    "emailFooterDocument",
    "emailHeaderDocument",
    "emailNotificationUrl",
    "enableChatterAnswers",
    "enablePrivateQuestions",
    "expertsGroup",
    "portal",
    "reputationLevels",
    "showInPortal",
    "site"
})
public class Community
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String communityFeedPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String emailFooterDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String emailHeaderDocument;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String emailNotificationUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableChatterAnswers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enablePrivateQuestions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String expertsGroup;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String portal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReputationLevels reputationLevels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showInPortal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String site;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the communityFeedPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityFeedPage() {
        return communityFeedPage;
    }

    /**
     * Sets the value of the communityFeedPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityFeedPage(String value) {
        this.communityFeedPage = value;
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
     * Gets the value of the emailFooterDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailFooterDocument() {
        return emailFooterDocument;
    }

    /**
     * Sets the value of the emailFooterDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailFooterDocument(String value) {
        this.emailFooterDocument = value;
    }

    /**
     * Gets the value of the emailHeaderDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailHeaderDocument() {
        return emailHeaderDocument;
    }

    /**
     * Sets the value of the emailHeaderDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailHeaderDocument(String value) {
        this.emailHeaderDocument = value;
    }

    /**
     * Gets the value of the emailNotificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailNotificationUrl() {
        return emailNotificationUrl;
    }

    /**
     * Sets the value of the emailNotificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailNotificationUrl(String value) {
        this.emailNotificationUrl = value;
    }

    /**
     * Gets the value of the enableChatterAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableChatterAnswers() {
        return enableChatterAnswers;
    }

    /**
     * Sets the value of the enableChatterAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableChatterAnswers(Boolean value) {
        this.enableChatterAnswers = value;
    }

    /**
     * Gets the value of the enablePrivateQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePrivateQuestions() {
        return enablePrivateQuestions;
    }

    /**
     * Sets the value of the enablePrivateQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePrivateQuestions(Boolean value) {
        this.enablePrivateQuestions = value;
    }

    /**
     * Gets the value of the expertsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertsGroup() {
        return expertsGroup;
    }

    /**
     * Sets the value of the expertsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertsGroup(String value) {
        this.expertsGroup = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortal(String value) {
        this.portal = value;
    }

    /**
     * Gets the value of the reputationLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ReputationLevels }
     *     
     */
    public ReputationLevels getReputationLevels() {
        return reputationLevels;
    }

    /**
     * Sets the value of the reputationLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReputationLevels }
     *     
     */
    public void setReputationLevels(ReputationLevels value) {
        this.reputationLevels = value;
    }

    /**
     * Gets the value of the showInPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInPortal() {
        return showInPortal;
    }

    /**
     * Sets the value of the showInPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInPortal(Boolean value) {
        this.showInPortal = value;
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

}
