
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeAnswerSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeAnswerSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultArticleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableArticleCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeAnswerSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assignTo",
    "defaultArticleType",
    "enableArticleCreation"
})
public class KnowledgeAnswerSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String assignTo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultArticleType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableArticleCreation;

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
     * Gets the value of the defaultArticleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultArticleType() {
        return defaultArticleType;
    }

    /**
     * Sets the value of the defaultArticleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultArticleType(String value) {
        this.defaultArticleType = value;
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

}
