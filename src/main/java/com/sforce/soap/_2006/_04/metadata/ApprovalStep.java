
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowDelegate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvalActions" type="{http://soap.sforce.com/2006/04/metadata}ApprovalAction" minOccurs="0"/>
 *         &lt;element name="assignedApprover" type="{http://soap.sforce.com/2006/04/metadata}ApprovalStepApprover"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryCriteria" type="{http://soap.sforce.com/2006/04/metadata}ApprovalEntryCriteria" minOccurs="0"/>
 *         &lt;element name="ifCriteriaNotMet" type="{http://soap.sforce.com/2006/04/metadata}StepCriteriaNotMetType" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rejectBehavior" type="{http://soap.sforce.com/2006/04/metadata}ApprovalStepRejectBehavior" minOccurs="0"/>
 *         &lt;element name="rejectionActions" type="{http://soap.sforce.com/2006/04/metadata}ApprovalAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalStep", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "allowDelegate",
    "approvalActions",
    "assignedApprover",
    "description",
    "entryCriteria",
    "ifCriteriaNotMet",
    "label",
    "name",
    "rejectBehavior",
    "rejectionActions"
})
public class ApprovalStep {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean allowDelegate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalAction approvalActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ApprovalStepApprover assignedApprover;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalEntryCriteria entryCriteria;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected StepCriteriaNotMetType ifCriteriaNotMet;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalStepRejectBehavior rejectBehavior;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalAction rejectionActions;

    /**
     * Gets the value of the allowDelegate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDelegate() {
        return allowDelegate;
    }

    /**
     * Sets the value of the allowDelegate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDelegate(Boolean value) {
        this.allowDelegate = value;
    }

    /**
     * Gets the value of the approvalActions property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalAction }
     *     
     */
    public ApprovalAction getApprovalActions() {
        return approvalActions;
    }

    /**
     * Sets the value of the approvalActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalAction }
     *     
     */
    public void setApprovalActions(ApprovalAction value) {
        this.approvalActions = value;
    }

    /**
     * Gets the value of the assignedApprover property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalStepApprover }
     *     
     */
    public ApprovalStepApprover getAssignedApprover() {
        return assignedApprover;
    }

    /**
     * Sets the value of the assignedApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalStepApprover }
     *     
     */
    public void setAssignedApprover(ApprovalStepApprover value) {
        this.assignedApprover = value;
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
     * Gets the value of the entryCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalEntryCriteria }
     *     
     */
    public ApprovalEntryCriteria getEntryCriteria() {
        return entryCriteria;
    }

    /**
     * Sets the value of the entryCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalEntryCriteria }
     *     
     */
    public void setEntryCriteria(ApprovalEntryCriteria value) {
        this.entryCriteria = value;
    }

    /**
     * Gets the value of the ifCriteriaNotMet property.
     * 
     * @return
     *     possible object is
     *     {@link StepCriteriaNotMetType }
     *     
     */
    public StepCriteriaNotMetType getIfCriteriaNotMet() {
        return ifCriteriaNotMet;
    }

    /**
     * Sets the value of the ifCriteriaNotMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StepCriteriaNotMetType }
     *     
     */
    public void setIfCriteriaNotMet(StepCriteriaNotMetType value) {
        this.ifCriteriaNotMet = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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

    /**
     * Gets the value of the rejectBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalStepRejectBehavior }
     *     
     */
    public ApprovalStepRejectBehavior getRejectBehavior() {
        return rejectBehavior;
    }

    /**
     * Sets the value of the rejectBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalStepRejectBehavior }
     *     
     */
    public void setRejectBehavior(ApprovalStepRejectBehavior value) {
        this.rejectBehavior = value;
    }

    /**
     * Gets the value of the rejectionActions property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalAction }
     *     
     */
    public ApprovalAction getRejectionActions() {
        return rejectionActions;
    }

    /**
     * Sets the value of the rejectionActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalAction }
     *     
     */
    public void setRejectionActions(ApprovalAction value) {
        this.rejectionActions = value;
    }

}
