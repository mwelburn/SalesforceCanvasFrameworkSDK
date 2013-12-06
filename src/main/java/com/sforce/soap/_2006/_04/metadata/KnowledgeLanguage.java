
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeLanguage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeLanguage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultAssignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultAssigneeType" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeLanguageLookupValueType" minOccurs="0"/>
 *         &lt;element name="defaultReviewer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultReviewerType" type="{http://soap.sforce.com/2006/04/metadata}KnowledgeLanguageLookupValueType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeLanguage", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "defaultAssignee",
    "defaultAssigneeType",
    "defaultReviewer",
    "defaultReviewerType",
    "name"
})
public class KnowledgeLanguage {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultAssignee;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeLanguageLookupValueType defaultAssigneeType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultReviewer;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KnowledgeLanguageLookupValueType defaultReviewerType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;

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
     * Gets the value of the defaultAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAssignee() {
        return defaultAssignee;
    }

    /**
     * Sets the value of the defaultAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAssignee(String value) {
        this.defaultAssignee = value;
    }

    /**
     * Gets the value of the defaultAssigneeType property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeLanguageLookupValueType }
     *     
     */
    public KnowledgeLanguageLookupValueType getDefaultAssigneeType() {
        return defaultAssigneeType;
    }

    /**
     * Sets the value of the defaultAssigneeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeLanguageLookupValueType }
     *     
     */
    public void setDefaultAssigneeType(KnowledgeLanguageLookupValueType value) {
        this.defaultAssigneeType = value;
    }

    /**
     * Gets the value of the defaultReviewer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultReviewer() {
        return defaultReviewer;
    }

    /**
     * Sets the value of the defaultReviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultReviewer(String value) {
        this.defaultReviewer = value;
    }

    /**
     * Gets the value of the defaultReviewerType property.
     * 
     * @return
     *     possible object is
     *     {@link KnowledgeLanguageLookupValueType }
     *     
     */
    public KnowledgeLanguageLookupValueType getDefaultReviewerType() {
        return defaultReviewerType;
    }

    /**
     * Sets the value of the defaultReviewerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnowledgeLanguageLookupValueType }
     *     
     */
    public void setDefaultReviewerType(KnowledgeLanguageLookupValueType value) {
        this.defaultReviewerType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
