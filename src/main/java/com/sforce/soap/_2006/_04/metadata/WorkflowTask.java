
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}WorkflowAction">
 *       &lt;sequence>
 *         &lt;element name="assignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedToType" type="{http://soap.sforce.com/2006/04/metadata}ActionTaskAssignedToTypes"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDateOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notifyAssignee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="offsetFromField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowTask", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assignedTo",
    "assignedToType",
    "description",
    "dueDateOffset",
    "notifyAssignee",
    "offsetFromField",
    "priority",
    "_protected",
    "status",
    "subject"
})
public class WorkflowTask
    extends WorkflowAction
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String assignedTo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ActionTaskAssignedToTypes assignedToType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int dueDateOffset;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean notifyAssignee;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String offsetFromField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String priority;
    @XmlElement(name = "protected", namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean _protected;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String status;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String subject;

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
     *     {@link ActionTaskAssignedToTypes }
     *     
     */
    public ActionTaskAssignedToTypes getAssignedToType() {
        return assignedToType;
    }

    /**
     * Sets the value of the assignedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskAssignedToTypes }
     *     
     */
    public void setAssignedToType(ActionTaskAssignedToTypes value) {
        this.assignedToType = value;
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
     * Gets the value of the dueDateOffset property.
     * 
     */
    public int getDueDateOffset() {
        return dueDateOffset;
    }

    /**
     * Sets the value of the dueDateOffset property.
     * 
     */
    public void setDueDateOffset(int value) {
        this.dueDateOffset = value;
    }

    /**
     * Gets the value of the notifyAssignee property.
     * 
     */
    public boolean isNotifyAssignee() {
        return notifyAssignee;
    }

    /**
     * Sets the value of the notifyAssignee property.
     * 
     */
    public void setNotifyAssignee(boolean value) {
        this.notifyAssignee = value;
    }

    /**
     * Gets the value of the offsetFromField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetFromField() {
        return offsetFromField;
    }

    /**
     * Sets the value of the offsetFromField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetFromField(String value) {
        this.offsetFromField = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     */
    public boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     */
    public void setProtected(boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
