
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailToCaseRoutingAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailToCaseRoutingAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressType" type="{http://soap.sforce.com/2006/04/metadata}EmailToCaseRoutingAddressType" minOccurs="0"/>
 *         &lt;element name="authorizedSenders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseOwnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casePriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saveEmailHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailToCaseRoutingAddress", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "addressType",
    "authorizedSenders",
    "caseOrigin",
    "caseOwner",
    "caseOwnerType",
    "casePriority",
    "createTask",
    "emailAddress",
    "routingName",
    "saveEmailHeaders",
    "taskStatus"
})
public class EmailToCaseRoutingAddress {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected EmailToCaseRoutingAddressType addressType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String authorizedSenders;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseOrigin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseOwner;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseOwnerType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String casePriority;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean createTask;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String emailAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String routingName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean saveEmailHeaders;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String taskStatus;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link EmailToCaseRoutingAddressType }
     *     
     */
    public EmailToCaseRoutingAddressType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailToCaseRoutingAddressType }
     *     
     */
    public void setAddressType(EmailToCaseRoutingAddressType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the authorizedSenders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedSenders() {
        return authorizedSenders;
    }

    /**
     * Sets the value of the authorizedSenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedSenders(String value) {
        this.authorizedSenders = value;
    }

    /**
     * Gets the value of the caseOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOrigin() {
        return caseOrigin;
    }

    /**
     * Sets the value of the caseOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOrigin(String value) {
        this.caseOrigin = value;
    }

    /**
     * Gets the value of the caseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOwner() {
        return caseOwner;
    }

    /**
     * Sets the value of the caseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOwner(String value) {
        this.caseOwner = value;
    }

    /**
     * Gets the value of the caseOwnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOwnerType() {
        return caseOwnerType;
    }

    /**
     * Sets the value of the caseOwnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOwnerType(String value) {
        this.caseOwnerType = value;
    }

    /**
     * Gets the value of the casePriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasePriority() {
        return casePriority;
    }

    /**
     * Sets the value of the casePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasePriority(String value) {
        this.casePriority = value;
    }

    /**
     * Gets the value of the createTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateTask() {
        return createTask;
    }

    /**
     * Sets the value of the createTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateTask(Boolean value) {
        this.createTask = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the routingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingName() {
        return routingName;
    }

    /**
     * Sets the value of the routingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingName(String value) {
        this.routingName = value;
    }

    /**
     * Gets the value of the saveEmailHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveEmailHeaders() {
        return saveEmailHeaders;
    }

    /**
     * Sets the value of the saveEmailHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveEmailHeaders(Boolean value) {
        this.saveEmailHeaders = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

}
