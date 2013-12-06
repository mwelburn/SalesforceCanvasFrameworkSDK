
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryStartDateField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exitCriteriaBooleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exitCriteriaFilterItems" type="{http://soap.sforce.com/2006/04/metadata}FilterItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exitCriteriaFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isVersionDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="milestones" type="{http://soap.sforce.com/2006/04/metadata}EntitlementProcessMilestoneItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionMaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementProcess", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "description",
    "entryStartDateField",
    "exitCriteriaBooleanFilter",
    "exitCriteriaFilterItems",
    "exitCriteriaFormula",
    "isVersionDefault",
    "milestones",
    "name",
    "versionMaster",
    "versionNotes",
    "versionNumber"
})
public class EntitlementProcess
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String entryStartDateField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String exitCriteriaBooleanFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FilterItem> exitCriteriaFilterItems;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String exitCriteriaFormula;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isVersionDefault;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<EntitlementProcessMilestoneItem> milestones;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String versionMaster;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String versionNotes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer versionNumber;

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
     * Gets the value of the entryStartDateField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryStartDateField() {
        return entryStartDateField;
    }

    /**
     * Sets the value of the entryStartDateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryStartDateField(String value) {
        this.entryStartDateField = value;
    }

    /**
     * Gets the value of the exitCriteriaBooleanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitCriteriaBooleanFilter() {
        return exitCriteriaBooleanFilter;
    }

    /**
     * Sets the value of the exitCriteriaBooleanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitCriteriaBooleanFilter(String value) {
        this.exitCriteriaBooleanFilter = value;
    }

    /**
     * Gets the value of the exitCriteriaFilterItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exitCriteriaFilterItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExitCriteriaFilterItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterItem }
     * 
     * 
     */
    public List<FilterItem> getExitCriteriaFilterItems() {
        if (exitCriteriaFilterItems == null) {
            exitCriteriaFilterItems = new ArrayList<FilterItem>();
        }
        return this.exitCriteriaFilterItems;
    }

    /**
     * Gets the value of the exitCriteriaFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitCriteriaFormula() {
        return exitCriteriaFormula;
    }

    /**
     * Sets the value of the exitCriteriaFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitCriteriaFormula(String value) {
        this.exitCriteriaFormula = value;
    }

    /**
     * Gets the value of the isVersionDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVersionDefault() {
        return isVersionDefault;
    }

    /**
     * Sets the value of the isVersionDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVersionDefault(Boolean value) {
        this.isVersionDefault = value;
    }

    /**
     * Gets the value of the milestones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitlementProcessMilestoneItem }
     * 
     * 
     */
    public List<EntitlementProcessMilestoneItem> getMilestones() {
        if (milestones == null) {
            milestones = new ArrayList<EntitlementProcessMilestoneItem>();
        }
        return this.milestones;
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
     * Gets the value of the versionMaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionMaster() {
        return versionMaster;
    }

    /**
     * Sets the value of the versionMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionMaster(String value) {
        this.versionMaster = value;
    }

    /**
     * Gets the value of the versionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNotes() {
        return versionNotes;
    }

    /**
     * Sets the value of the versionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNotes(String value) {
        this.versionNotes = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

}
