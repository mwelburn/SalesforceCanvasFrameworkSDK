
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowRecall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowedSubmitters" type="{http://soap.sforce.com/2006/04/metadata}ApprovalSubmitter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="approvalPageFields" type="{http://soap.sforce.com/2006/04/metadata}ApprovalPageField" minOccurs="0"/>
 *         &lt;element name="approvalStep" type="{http://soap.sforce.com/2006/04/metadata}ApprovalStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableMobileDeviceAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entryCriteria" type="{http://soap.sforce.com/2006/04/metadata}ApprovalEntryCriteria" minOccurs="0"/>
 *         &lt;element name="finalApprovalActions" type="{http://soap.sforce.com/2006/04/metadata}ApprovalAction" minOccurs="0"/>
 *         &lt;element name="finalApprovalRecordLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="finalRejectionActions" type="{http://soap.sforce.com/2006/04/metadata}ApprovalAction" minOccurs="0"/>
 *         &lt;element name="finalRejectionRecordLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="initialSubmissionActions" type="{http://soap.sforce.com/2006/04/metadata}ApprovalAction" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextAutomatedApprover" type="{http://soap.sforce.com/2006/04/metadata}NextAutomatedApprover" minOccurs="0"/>
 *         &lt;element name="postTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recallActions" type="{http://soap.sforce.com/2006/04/metadata}ApprovalAction" minOccurs="0"/>
 *         &lt;element name="recordEditability" type="{http://soap.sforce.com/2006/04/metadata}RecordEditabilityType"/>
 *         &lt;element name="showApprovalHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalProcess", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "allowRecall",
    "allowedSubmitters",
    "approvalPageFields",
    "approvalStep",
    "description",
    "emailTemplate",
    "enableMobileDeviceAccess",
    "entryCriteria",
    "finalApprovalActions",
    "finalApprovalRecordLock",
    "finalRejectionActions",
    "finalRejectionRecordLock",
    "initialSubmissionActions",
    "label",
    "nextAutomatedApprover",
    "postTemplate",
    "recallActions",
    "recordEditability",
    "showApprovalHistory"
})
public class ApprovalProcess
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean allowRecall;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ApprovalSubmitter> allowedSubmitters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalPageField approvalPageFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ApprovalStep> approvalStep;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String emailTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableMobileDeviceAccess;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalEntryCriteria entryCriteria;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalAction finalApprovalActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean finalApprovalRecordLock;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalAction finalRejectionActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean finalRejectionRecordLock;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalAction initialSubmissionActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected NextAutomatedApprover nextAutomatedApprover;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String postTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ApprovalAction recallActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected RecordEditabilityType recordEditability;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showApprovalHistory;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the allowRecall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowRecall() {
        return allowRecall;
    }

    /**
     * Sets the value of the allowRecall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowRecall(Boolean value) {
        this.allowRecall = value;
    }

    /**
     * Gets the value of the allowedSubmitters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedSubmitters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSubmitters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalSubmitter }
     * 
     * 
     */
    public List<ApprovalSubmitter> getAllowedSubmitters() {
        if (allowedSubmitters == null) {
            allowedSubmitters = new ArrayList<ApprovalSubmitter>();
        }
        return this.allowedSubmitters;
    }

    /**
     * Gets the value of the approvalPageFields property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalPageField }
     *     
     */
    public ApprovalPageField getApprovalPageFields() {
        return approvalPageFields;
    }

    /**
     * Sets the value of the approvalPageFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalPageField }
     *     
     */
    public void setApprovalPageFields(ApprovalPageField value) {
        this.approvalPageFields = value;
    }

    /**
     * Gets the value of the approvalStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalStep }
     * 
     * 
     */
    public List<ApprovalStep> getApprovalStep() {
        if (approvalStep == null) {
            approvalStep = new ArrayList<ApprovalStep>();
        }
        return this.approvalStep;
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
     * Gets the value of the emailTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTemplate() {
        return emailTemplate;
    }

    /**
     * Sets the value of the emailTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTemplate(String value) {
        this.emailTemplate = value;
    }

    /**
     * Gets the value of the enableMobileDeviceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMobileDeviceAccess() {
        return enableMobileDeviceAccess;
    }

    /**
     * Sets the value of the enableMobileDeviceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMobileDeviceAccess(Boolean value) {
        this.enableMobileDeviceAccess = value;
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
     * Gets the value of the finalApprovalActions property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalAction }
     *     
     */
    public ApprovalAction getFinalApprovalActions() {
        return finalApprovalActions;
    }

    /**
     * Sets the value of the finalApprovalActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalAction }
     *     
     */
    public void setFinalApprovalActions(ApprovalAction value) {
        this.finalApprovalActions = value;
    }

    /**
     * Gets the value of the finalApprovalRecordLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalApprovalRecordLock() {
        return finalApprovalRecordLock;
    }

    /**
     * Sets the value of the finalApprovalRecordLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalApprovalRecordLock(Boolean value) {
        this.finalApprovalRecordLock = value;
    }

    /**
     * Gets the value of the finalRejectionActions property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalAction }
     *     
     */
    public ApprovalAction getFinalRejectionActions() {
        return finalRejectionActions;
    }

    /**
     * Sets the value of the finalRejectionActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalAction }
     *     
     */
    public void setFinalRejectionActions(ApprovalAction value) {
        this.finalRejectionActions = value;
    }

    /**
     * Gets the value of the finalRejectionRecordLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalRejectionRecordLock() {
        return finalRejectionRecordLock;
    }

    /**
     * Sets the value of the finalRejectionRecordLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalRejectionRecordLock(Boolean value) {
        this.finalRejectionRecordLock = value;
    }

    /**
     * Gets the value of the initialSubmissionActions property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalAction }
     *     
     */
    public ApprovalAction getInitialSubmissionActions() {
        return initialSubmissionActions;
    }

    /**
     * Sets the value of the initialSubmissionActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalAction }
     *     
     */
    public void setInitialSubmissionActions(ApprovalAction value) {
        this.initialSubmissionActions = value;
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
     * Gets the value of the nextAutomatedApprover property.
     * 
     * @return
     *     possible object is
     *     {@link NextAutomatedApprover }
     *     
     */
    public NextAutomatedApprover getNextAutomatedApprover() {
        return nextAutomatedApprover;
    }

    /**
     * Sets the value of the nextAutomatedApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextAutomatedApprover }
     *     
     */
    public void setNextAutomatedApprover(NextAutomatedApprover value) {
        this.nextAutomatedApprover = value;
    }

    /**
     * Gets the value of the postTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTemplate() {
        return postTemplate;
    }

    /**
     * Sets the value of the postTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTemplate(String value) {
        this.postTemplate = value;
    }

    /**
     * Gets the value of the recallActions property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalAction }
     *     
     */
    public ApprovalAction getRecallActions() {
        return recallActions;
    }

    /**
     * Sets the value of the recallActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalAction }
     *     
     */
    public void setRecallActions(ApprovalAction value) {
        this.recallActions = value;
    }

    /**
     * Gets the value of the recordEditability property.
     * 
     * @return
     *     possible object is
     *     {@link RecordEditabilityType }
     *     
     */
    public RecordEditabilityType getRecordEditability() {
        return recordEditability;
    }

    /**
     * Sets the value of the recordEditability property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordEditabilityType }
     *     
     */
    public void setRecordEditability(RecordEditabilityType value) {
        this.recordEditability = value;
    }

    /**
     * Gets the value of the showApprovalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowApprovalHistory() {
        return showApprovalHistory;
    }

    /**
     * Sets the value of the showApprovalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowApprovalHistory(Boolean value) {
        this.showApprovalHistory = value;
    }

}
