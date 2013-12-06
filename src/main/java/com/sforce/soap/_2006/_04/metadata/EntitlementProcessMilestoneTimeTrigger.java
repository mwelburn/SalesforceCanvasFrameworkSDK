
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementProcessMilestoneTimeTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementProcessMilestoneTimeTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actions" type="{http://soap.sforce.com/2006/04/metadata}WorkflowActionReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workflowTimeTriggerUnit" type="{http://soap.sforce.com/2006/04/metadata}MilestoneTimeUnits"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementProcessMilestoneTimeTrigger", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "actions",
    "timeLength",
    "workflowTimeTriggerUnit"
})
public class EntitlementProcessMilestoneTimeTrigger {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowActionReference> actions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer timeLength;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected MilestoneTimeUnits workflowTimeTriggerUnit;

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowActionReference }
     * 
     * 
     */
    public List<WorkflowActionReference> getActions() {
        if (actions == null) {
            actions = new ArrayList<WorkflowActionReference>();
        }
        return this.actions;
    }

    /**
     * Gets the value of the timeLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeLength() {
        return timeLength;
    }

    /**
     * Sets the value of the timeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeLength(Integer value) {
        this.timeLength = value;
    }

    /**
     * Gets the value of the workflowTimeTriggerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MilestoneTimeUnits }
     *     
     */
    public MilestoneTimeUnits getWorkflowTimeTriggerUnit() {
        return workflowTimeTriggerUnit;
    }

    /**
     * Sets the value of the workflowTimeTriggerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilestoneTimeUnits }
     *     
     */
    public void setWorkflowTimeTriggerUnit(MilestoneTimeUnits value) {
        this.workflowTimeTriggerUnit = value;
    }

}
