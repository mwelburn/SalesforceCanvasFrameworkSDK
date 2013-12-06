
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="answers" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeAnswerSettings" minOccurs="0"/>
 *         &lt;element name="cases" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeCaseSettings" minOccurs="0"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableCreateEditOnArticlesTab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableExternalMediaContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="languages" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeLanguageSettings" minOccurs="0"/>
 *         &lt;element name="showArticleSummariesCustomerPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showArticleSummariesInternalApp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showArticleSummariesPartnerPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showValidationStatusField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "answers",
    "cases",
    "defaultLanguage",
    "enableCreateEditOnArticlesTab",
    "enableExternalMediaContent",
    "enableKnowledge",
    "languages",
    "showArticleSummariesCustomerPortal",
    "showArticleSummariesInternalApp",
    "showArticleSummariesPartnerPortal",
    "showValidationStatusField"
})
public class KnowledgeSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeAnswerSettings answers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeCaseSettings cases;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultLanguage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableCreateEditOnArticlesTab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableExternalMediaContent;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableKnowledge;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeLanguageSettings languages;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showArticleSummariesCustomerPortal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showArticleSummariesInternalApp;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showArticleSummariesPartnerPortal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showValidationStatusField;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeAnswerSettings }
     *     
     */
    public KnowledgeAnswerSettings getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeAnswerSettings }
     *     
     */
    public void setAnswers(KnowledgeAnswerSettings value) {
        this.answers = value;
    }

    /**
     * Gets the value of the cases property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeCaseSettings }
     *     
     */
    public KnowledgeCaseSettings getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeCaseSettings }
     *     
     */
    public void setCases(KnowledgeCaseSettings value) {
        this.cases = value;
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
     * Gets the value of the enableCreateEditOnArticlesTab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCreateEditOnArticlesTab() {
        return enableCreateEditOnArticlesTab;
    }

    /**
     * Sets the value of the enableCreateEditOnArticlesTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCreateEditOnArticlesTab(Boolean value) {
        this.enableCreateEditOnArticlesTab = value;
    }

    /**
     * Gets the value of the enableExternalMediaContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExternalMediaContent() {
        return enableExternalMediaContent;
    }

    /**
     * Sets the value of the enableExternalMediaContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExternalMediaContent(Boolean value) {
        this.enableExternalMediaContent = value;
    }

    /**
     * Gets the value of the enableKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableKnowledge() {
        return enableKnowledge;
    }

    /**
     * Sets the value of the enableKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableKnowledge(Boolean value) {
        this.enableKnowledge = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeLanguageSettings }
     *     
     */
    public KnowledgeLanguageSettings getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeLanguageSettings }
     *     
     */
    public void setLanguages(KnowledgeLanguageSettings value) {
        this.languages = value;
    }

    /**
     * Gets the value of the showArticleSummariesCustomerPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowArticleSummariesCustomerPortal() {
        return showArticleSummariesCustomerPortal;
    }

    /**
     * Sets the value of the showArticleSummariesCustomerPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowArticleSummariesCustomerPortal(Boolean value) {
        this.showArticleSummariesCustomerPortal = value;
    }

    /**
     * Gets the value of the showArticleSummariesInternalApp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowArticleSummariesInternalApp() {
        return showArticleSummariesInternalApp;
    }

    /**
     * Sets the value of the showArticleSummariesInternalApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowArticleSummariesInternalApp(Boolean value) {
        this.showArticleSummariesInternalApp = value;
    }

    /**
     * Gets the value of the showArticleSummariesPartnerPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowArticleSummariesPartnerPortal() {
        return showArticleSummariesPartnerPortal;
    }

    /**
     * Sets the value of the showArticleSummariesPartnerPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowArticleSummariesPartnerPortal(Boolean value) {
        this.showArticleSummariesPartnerPortal = value;
    }

    /**
     * Gets the value of the showValidationStatusField property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowValidationStatusField() {
        return showValidationStatusField;
    }

    /**
     * Sets the value of the showValidationStatusField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowValidationStatusField(Boolean value) {
        this.showValidationStatusField = value;
    }

}
