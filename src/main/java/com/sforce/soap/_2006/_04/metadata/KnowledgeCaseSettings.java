
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeCaseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeCaseSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articlePDFCreationProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articlePublicSharingSites" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeSitesSettings" minOccurs="0"/>
 *         &lt;element name="articlePublicSharingSitesChatterAnswers" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeSitesSettings" minOccurs="0"/>
 *         &lt;element name="assignTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customizationClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultContributionArticleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editor" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeCaseEditor" minOccurs="0"/>
 *         &lt;element name="enableArticleCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableArticlePublicSharingSites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useProfileForPDFCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeCaseSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "articlePDFCreationProfile",
    "articlePublicSharingSites",
    "articlePublicSharingSitesChatterAnswers",
    "assignTo",
    "customizationClass",
    "defaultContributionArticleType",
    "editor",
    "enableArticleCreation",
    "enableArticlePublicSharingSites",
    "useProfileForPDFCreation"
})
public class KnowledgeCaseSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String articlePDFCreationProfile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeSitesSettings articlePublicSharingSites;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeSitesSettings articlePublicSharingSitesChatterAnswers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String assignTo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customizationClass;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultContributionArticleType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeCaseEditor editor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableArticleCreation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableArticlePublicSharingSites;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useProfileForPDFCreation;

    /**
     * Gets the value of the articlePDFCreationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticlePDFCreationProfile() {
        return articlePDFCreationProfile;
    }

    /**
     * Sets the value of the articlePDFCreationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticlePDFCreationProfile(String value) {
        this.articlePDFCreationProfile = value;
    }

    /**
     * Gets the value of the articlePublicSharingSites property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeSitesSettings }
     *     
     */
    public KnowledgeSitesSettings getArticlePublicSharingSites() {
        return articlePublicSharingSites;
    }

    /**
     * Sets the value of the articlePublicSharingSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeSitesSettings }
     *     
     */
    public void setArticlePublicSharingSites(KnowledgeSitesSettings value) {
        this.articlePublicSharingSites = value;
    }

    /**
     * Gets the value of the articlePublicSharingSitesChatterAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeSitesSettings }
     *     
     */
    public KnowledgeSitesSettings getArticlePublicSharingSitesChatterAnswers() {
        return articlePublicSharingSitesChatterAnswers;
    }

    /**
     * Sets the value of the articlePublicSharingSitesChatterAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeSitesSettings }
     *     
     */
    public void setArticlePublicSharingSitesChatterAnswers(KnowledgeSitesSettings value) {
        this.articlePublicSharingSitesChatterAnswers = value;
    }

    /**
     * Gets the value of the assignTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignTo() {
        return assignTo;
    }

    /**
     * Sets the value of the assignTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignTo(String value) {
        this.assignTo = value;
    }

    /**
     * Gets the value of the customizationClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizationClass() {
        return customizationClass;
    }

    /**
     * Sets the value of the customizationClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizationClass(String value) {
        this.customizationClass = value;
    }

    /**
     * Gets the value of the defaultContributionArticleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContributionArticleType() {
        return defaultContributionArticleType;
    }

    /**
     * Sets the value of the defaultContributionArticleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContributionArticleType(String value) {
        this.defaultContributionArticleType = value;
    }

    /**
     * Gets the value of the editor property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeCaseEditor }
     *     
     */
    public KnowledgeCaseEditor getEditor() {
        return editor;
    }

    /**
     * Sets the value of the editor property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeCaseEditor }
     *     
     */
    public void setEditor(KnowledgeCaseEditor value) {
        this.editor = value;
    }

    /**
     * Gets the value of the enableArticleCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableArticleCreation() {
        return enableArticleCreation;
    }

    /**
     * Sets the value of the enableArticleCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableArticleCreation(Boolean value) {
        this.enableArticleCreation = value;
    }

    /**
     * Gets the value of the enableArticlePublicSharingSites property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableArticlePublicSharingSites() {
        return enableArticlePublicSharingSites;
    }

    /**
     * Sets the value of the enableArticlePublicSharingSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableArticlePublicSharingSites(Boolean value) {
        this.enableArticlePublicSharingSites = value;
    }

    /**
     * Gets the value of the useProfileForPDFCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseProfileForPDFCreation() {
        return useProfileForPDFCreation;
    }

    /**
     * Sets the value of the useProfileForPDFCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseProfileForPDFCreation(Boolean value) {
        this.useProfileForPDFCreation = value;
    }

}
