
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordPolicies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasswordPolicies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiOnlyUserHomePageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexity" type="{http://soap.sforce.com/2006/04/metadata}Complexity" minOccurs="0"/>
 *         &lt;element name="expiration" type="{http://soap.sforce.com/2006/04/metadata}Expiration" minOccurs="0"/>
 *         &lt;element name="historyRestriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockoutInterval" type="{http://soap.sforce.com/2006/04/metadata}LockoutInterval" minOccurs="0"/>
 *         &lt;element name="maxLoginAttempts" type="{http://soap.sforce.com/2006/04/metadata}MaxLoginAttempts" minOccurs="0"/>
 *         &lt;element name="minPasswordLength" type="{http://soap.sforce.com/2006/04/metadata}MinPasswordLength" minOccurs="0"/>
 *         &lt;element name="passwordAssistanceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordAssistanceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionRestriction" type="{http://soap.sforce.com/2006/04/metadata}QuestionRestriction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordPolicies", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiOnlyUserHomePageURL",
    "complexity",
    "expiration",
    "historyRestriction",
    "lockoutInterval",
    "maxLoginAttempts",
    "minPasswordLength",
    "passwordAssistanceMessage",
    "passwordAssistanceURL",
    "questionRestriction"
})
public class PasswordPolicies {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String apiOnlyUserHomePageURL;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Complexity complexity;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Expiration expiration;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String historyRestriction;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LockoutInterval lockoutInterval;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected MaxLoginAttempts maxLoginAttempts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected MinPasswordLength minPasswordLength;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String passwordAssistanceMessage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String passwordAssistanceURL;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected QuestionRestriction questionRestriction;

    /**
     * Gets the value of the apiOnlyUserHomePageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiOnlyUserHomePageURL() {
        return apiOnlyUserHomePageURL;
    }

    /**
     * Sets the value of the apiOnlyUserHomePageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiOnlyUserHomePageURL(String value) {
        this.apiOnlyUserHomePageURL = value;
    }

    /**
     * Gets the value of the complexity property.
     * 
     * @return
     *     possible object is
     *     {@link Complexity }
     *     
     */
    public Complexity getComplexity() {
        return complexity;
    }

    /**
     * Sets the value of the complexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Complexity }
     *     
     */
    public void setComplexity(Complexity value) {
        this.complexity = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link Expiration }
     *     
     */
    public Expiration getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expiration }
     *     
     */
    public void setExpiration(Expiration value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the historyRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryRestriction() {
        return historyRestriction;
    }

    /**
     * Sets the value of the historyRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryRestriction(String value) {
        this.historyRestriction = value;
    }

    /**
     * Gets the value of the lockoutInterval property.
     * 
     * @return
     *     possible object is
     *     {@link LockoutInterval }
     *     
     */
    public LockoutInterval getLockoutInterval() {
        return lockoutInterval;
    }

    /**
     * Sets the value of the lockoutInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockoutInterval }
     *     
     */
    public void setLockoutInterval(LockoutInterval value) {
        this.lockoutInterval = value;
    }

    /**
     * Gets the value of the maxLoginAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link MaxLoginAttempts }
     *     
     */
    public MaxLoginAttempts getMaxLoginAttempts() {
        return maxLoginAttempts;
    }

    /**
     * Sets the value of the maxLoginAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxLoginAttempts }
     *     
     */
    public void setMaxLoginAttempts(MaxLoginAttempts value) {
        this.maxLoginAttempts = value;
    }

    /**
     * Gets the value of the minPasswordLength property.
     * 
     * @return
     *     possible object is
     *     {@link MinPasswordLength }
     *     
     */
    public MinPasswordLength getMinPasswordLength() {
        return minPasswordLength;
    }

    /**
     * Sets the value of the minPasswordLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinPasswordLength }
     *     
     */
    public void setMinPasswordLength(MinPasswordLength value) {
        this.minPasswordLength = value;
    }

    /**
     * Gets the value of the passwordAssistanceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordAssistanceMessage() {
        return passwordAssistanceMessage;
    }

    /**
     * Sets the value of the passwordAssistanceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordAssistanceMessage(String value) {
        this.passwordAssistanceMessage = value;
    }

    /**
     * Gets the value of the passwordAssistanceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordAssistanceURL() {
        return passwordAssistanceURL;
    }

    /**
     * Sets the value of the passwordAssistanceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordAssistanceURL(String value) {
        this.passwordAssistanceURL = value;
    }

    /**
     * Gets the value of the questionRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionRestriction }
     *     
     */
    public QuestionRestriction getQuestionRestriction() {
        return questionRestriction;
    }

    /**
     * Sets the value of the questionRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionRestriction }
     *     
     */
    public void setQuestionRestriction(QuestionRestriction value) {
        this.questionRestriction = value;
    }

}
