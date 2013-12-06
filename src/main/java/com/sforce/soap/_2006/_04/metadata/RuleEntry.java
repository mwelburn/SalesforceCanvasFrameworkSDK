
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedToType" type="{http://soap.sforce.com/2006/04/metadata}AssignToLookupValueType" minOccurs="0"/>
 *         &lt;element name="booleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessHoursSource" type="{http://soap.sforce.com/2006/04/metadata}BusinessHoursSourceType" minOccurs="0"/>
 *         &lt;element name="criteriaItems" type="{http://soap.sforce.com/2006/04/metadata}FilterItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disableEscalationWhenModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="escalationAction" type="{http://soap.sforce.com/2006/04/metadata}EscalationAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="escalationStartTime" type="{http://soap.sforce.com/2006/04/metadata}EscalationStartTimeType" minOccurs="0"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideExistingTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="replyToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="team" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleEntry", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assignedTo",
    "assignedToType",
    "booleanFilter",
    "businessHours",
    "businessHoursSource",
    "criteriaItems",
    "disableEscalationWhenModified",
    "escalationAction",
    "escalationStartTime",
    "formula",
    "overrideExistingTeams",
    "replyToEmail",
    "senderEmail",
    "senderName",
    "team",
    "template"
})
public class RuleEntry {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String assignedTo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected AssignToLookupValueType assignedToType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String booleanFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String businessHours;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected BusinessHoursSourceType businessHoursSource;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FilterItem> criteriaItems;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean disableEscalationWhenModified;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<EscalationAction> escalationAction;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected EscalationStartTimeType escalationStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String formula;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean overrideExistingTeams;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String replyToEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String senderEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String senderName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> team;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String template;

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedTo(String value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the assignedToType property.
     * 
     * @return
     *     possible object is
     *     {@link AssignToLookupValueType }
     *     
     */
    public AssignToLookupValueType getAssignedToType() {
        return assignedToType;
    }

    /**
     * Sets the value of the assignedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignToLookupValueType }
     *     
     */
    public void setAssignedToType(AssignToLookupValueType value) {
        this.assignedToType = value;
    }

    /**
     * Gets the value of the booleanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanFilter() {
        return booleanFilter;
    }

    /**
     * Sets the value of the booleanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanFilter(String value) {
        this.booleanFilter = value;
    }

    /**
     * Gets the value of the businessHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessHours() {
        return businessHours;
    }

    /**
     * Sets the value of the businessHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessHours(String value) {
        this.businessHours = value;
    }

    /**
     * Gets the value of the businessHoursSource property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessHoursSourceType }
     *     
     */
    public BusinessHoursSourceType getBusinessHoursSource() {
        return businessHoursSource;
    }

    /**
     * Sets the value of the businessHoursSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessHoursSourceType }
     *     
     */
    public void setBusinessHoursSource(BusinessHoursSourceType value) {
        this.businessHoursSource = value;
    }

    /**
     * Gets the value of the criteriaItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterItem }
     * 
     * 
     */
    public List<FilterItem> getCriteriaItems() {
        if (criteriaItems == null) {
            criteriaItems = new ArrayList<FilterItem>();
        }
        return this.criteriaItems;
    }

    /**
     * Gets the value of the disableEscalationWhenModified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableEscalationWhenModified() {
        return disableEscalationWhenModified;
    }

    /**
     * Sets the value of the disableEscalationWhenModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableEscalationWhenModified(Boolean value) {
        this.disableEscalationWhenModified = value;
    }

    /**
     * Gets the value of the escalationAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escalationAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscalationAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EscalationAction }
     * 
     * 
     */
    public List<EscalationAction> getEscalationAction() {
        if (escalationAction == null) {
            escalationAction = new ArrayList<EscalationAction>();
        }
        return this.escalationAction;
    }

    /**
     * Gets the value of the escalationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link EscalationStartTimeType }
     *     
     */
    public EscalationStartTimeType getEscalationStartTime() {
        return escalationStartTime;
    }

    /**
     * Sets the value of the escalationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscalationStartTimeType }
     *     
     */
    public void setEscalationStartTime(EscalationStartTimeType value) {
        this.escalationStartTime = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the overrideExistingTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideExistingTeams() {
        return overrideExistingTeams;
    }

    /**
     * Sets the value of the overrideExistingTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideExistingTeams(Boolean value) {
        this.overrideExistingTeams = value;
    }

    /**
     * Gets the value of the replyToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToEmail() {
        return replyToEmail;
    }

    /**
     * Sets the value of the replyToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToEmail(String value) {
        this.replyToEmail = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the team property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the team property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTeam() {
        if (team == null) {
            team = new ArrayList<String>();
        }
        return this.team;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

}
