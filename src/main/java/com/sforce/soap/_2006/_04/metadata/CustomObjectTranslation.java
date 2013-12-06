
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomObjectTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObjectTranslation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="caseValues" type="{http://soap.sforce.com/2006/04/metadata}ObjectNameCaseValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://soap.sforce.com/2006/04/metadata}CustomFieldTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://soap.sforce.com/2006/04/metadata}Gender" minOccurs="0"/>
 *         &lt;element name="layouts" type="{http://soap.sforce.com/2006/04/metadata}LayoutTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameFieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namedFilters" type="{http://soap.sforce.com/2006/04/metadata}NamedFilterTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quickActions" type="{http://soap.sforce.com/2006/04/metadata}QuickActionTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordTypes" type="{http://soap.sforce.com/2006/04/metadata}RecordTypeTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sharingReasons" type="{http://soap.sforce.com/2006/04/metadata}SharingReasonTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startsWith" type="{http://soap.sforce.com/2006/04/metadata}StartsWith" minOccurs="0"/>
 *         &lt;element name="validationRules" type="{http://soap.sforce.com/2006/04/metadata}ValidationRuleTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webLinks" type="{http://soap.sforce.com/2006/04/metadata}WebLinkTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="workflowTasks" type="{http://soap.sforce.com/2006/04/metadata}WorkflowTaskTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObjectTranslation", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "caseValues",
    "fields",
    "gender",
    "layouts",
    "nameFieldLabel",
    "namedFilters",
    "quickActions",
    "recordTypes",
    "sharingReasons",
    "startsWith",
    "validationRules",
    "webLinks",
    "workflowTasks"
})
public class CustomObjectTranslation
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ObjectNameCaseValue> caseValues;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomFieldTranslation> fields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Gender gender;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<LayoutTranslation> layouts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String nameFieldLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<NamedFilterTranslation> namedFilters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<QuickActionTranslation> quickActions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<RecordTypeTranslation> recordTypes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<SharingReasonTranslation> sharingReasons;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected StartsWith startsWith;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ValidationRuleTranslation> validationRules;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WebLinkTranslation> webLinks;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowTaskTranslation> workflowTasks;

    /**
     * Gets the value of the caseValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectNameCaseValue }
     * 
     * 
     */
    public List<ObjectNameCaseValue> getCaseValues() {
        if (caseValues == null) {
            caseValues = new ArrayList<ObjectNameCaseValue>();
        }
        return this.caseValues;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldTranslation }
     * 
     * 
     */
    public List<CustomFieldTranslation> getFields() {
        if (fields == null) {
            fields = new ArrayList<CustomFieldTranslation>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the layouts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layouts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayouts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutTranslation }
     * 
     * 
     */
    public List<LayoutTranslation> getLayouts() {
        if (layouts == null) {
            layouts = new ArrayList<LayoutTranslation>();
        }
        return this.layouts;
    }

    /**
     * Gets the value of the nameFieldLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFieldLabel() {
        return nameFieldLabel;
    }

    /**
     * Sets the value of the nameFieldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFieldLabel(String value) {
        this.nameFieldLabel = value;
    }

    /**
     * Gets the value of the namedFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedFilterTranslation }
     * 
     * 
     */
    public List<NamedFilterTranslation> getNamedFilters() {
        if (namedFilters == null) {
            namedFilters = new ArrayList<NamedFilterTranslation>();
        }
        return this.namedFilters;
    }

    /**
     * Gets the value of the quickActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuickActionTranslation }
     * 
     * 
     */
    public List<QuickActionTranslation> getQuickActions() {
        if (quickActions == null) {
            quickActions = new ArrayList<QuickActionTranslation>();
        }
        return this.quickActions;
    }

    /**
     * Gets the value of the recordTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordTypeTranslation }
     * 
     * 
     */
    public List<RecordTypeTranslation> getRecordTypes() {
        if (recordTypes == null) {
            recordTypes = new ArrayList<RecordTypeTranslation>();
        }
        return this.recordTypes;
    }

    /**
     * Gets the value of the sharingReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharingReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharingReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharingReasonTranslation }
     * 
     * 
     */
    public List<SharingReasonTranslation> getSharingReasons() {
        if (sharingReasons == null) {
            sharingReasons = new ArrayList<SharingReasonTranslation>();
        }
        return this.sharingReasons;
    }

    /**
     * Gets the value of the startsWith property.
     * 
     * @return
     *     possible object is
     *     {@link StartsWith }
     *     
     */
    public StartsWith getStartsWith() {
        return startsWith;
    }

    /**
     * Sets the value of the startsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartsWith }
     *     
     */
    public void setStartsWith(StartsWith value) {
        this.startsWith = value;
    }

    /**
     * Gets the value of the validationRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationRuleTranslation }
     * 
     * 
     */
    public List<ValidationRuleTranslation> getValidationRules() {
        if (validationRules == null) {
            validationRules = new ArrayList<ValidationRuleTranslation>();
        }
        return this.validationRules;
    }

    /**
     * Gets the value of the webLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLinkTranslation }
     * 
     * 
     */
    public List<WebLinkTranslation> getWebLinks() {
        if (webLinks == null) {
            webLinks = new ArrayList<WebLinkTranslation>();
        }
        return this.webLinks;
    }

    /**
     * Gets the value of the workflowTasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowTasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowTaskTranslation }
     * 
     * 
     */
    public List<WorkflowTaskTranslation> getWorkflowTasks() {
        if (workflowTasks == null) {
            workflowTasks = new ArrayList<WorkflowTaskTranslation>();
        }
        return this.workflowTasks;
    }

}
