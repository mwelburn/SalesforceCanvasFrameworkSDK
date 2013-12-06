
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementProcessMilestoneItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementProcessMilestoneItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaBooleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milestoneCriteriaFilterItems" type="{http://soap.sforce.com/2006/04/metadata}FilterItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="milestoneCriteriaFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milestoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minutesToComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="successActions" type="{http://soap.sforce.com/2006/04/metadata}WorkflowActionReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeTriggers" type="{http://soap.sforce.com/2006/04/metadata}EntitlementProcessMilestoneTimeTrigger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useCriteriaStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementProcessMilestoneItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "criteriaBooleanFilter",
    "milestoneCriteriaFilterItems",
    "milestoneCriteriaFormula",
    "milestoneName",
    "minutesToComplete",
    "successActions",
    "timeTriggers",
    "useCriteriaStartTime"
})
public class EntitlementProcessMilestoneItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String criteriaBooleanFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FilterItem> milestoneCriteriaFilterItems;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String milestoneCriteriaFormula;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String milestoneName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer minutesToComplete;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowActionReference> successActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<EntitlementProcessMilestoneTimeTrigger> timeTriggers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useCriteriaStartTime;

    /**
     * Gets the value of the criteriaBooleanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaBooleanFilter() {
        return criteriaBooleanFilter;
    }

    /**
     * Sets the value of the criteriaBooleanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaBooleanFilter(String value) {
        this.criteriaBooleanFilter = value;
    }

    /**
     * Gets the value of the milestoneCriteriaFilterItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestoneCriteriaFilterItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestoneCriteriaFilterItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterItem }
     * 
     * 
     */
    public List<FilterItem> getMilestoneCriteriaFilterItems() {
        if (milestoneCriteriaFilterItems == null) {
            milestoneCriteriaFilterItems = new ArrayList<FilterItem>();
        }
        return this.milestoneCriteriaFilterItems;
    }

    /**
     * Gets the value of the milestoneCriteriaFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneCriteriaFormula() {
        return milestoneCriteriaFormula;
    }

    /**
     * Sets the value of the milestoneCriteriaFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneCriteriaFormula(String value) {
        this.milestoneCriteriaFormula = value;
    }

    /**
     * Gets the value of the milestoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneName() {
        return milestoneName;
    }

    /**
     * Sets the value of the milestoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneName(String value) {
        this.milestoneName = value;
    }

    /**
     * Gets the value of the minutesToComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutesToComplete() {
        return minutesToComplete;
    }

    /**
     * Sets the value of the minutesToComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutesToComplete(Integer value) {
        this.minutesToComplete = value;
    }

    /**
     * Gets the value of the successActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowActionReference }
     * 
     * 
     */
    public List<WorkflowActionReference> getSuccessActions() {
        if (successActions == null) {
            successActions = new ArrayList<WorkflowActionReference>();
        }
        return this.successActions;
    }

    /**
     * Gets the value of the timeTriggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeTriggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementProcessMilestoneTimeTrigger }
     * 
     * 
     */
    public List<EntitlementProcessMilestoneTimeTrigger> getTimeTriggers() {
        if (timeTriggers == null) {
            timeTriggers = new ArrayList<EntitlementProcessMilestoneTimeTrigger>();
        }
        return this.timeTriggers;
    }

    /**
     * Gets the value of the useCriteriaStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCriteriaStartTime() {
        return useCriteriaStartTime;
    }

    /**
     * Sets the value of the useCriteriaStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCriteriaStartTime(Boolean value) {
        this.useCriteriaStartTime = value;
    }

}
