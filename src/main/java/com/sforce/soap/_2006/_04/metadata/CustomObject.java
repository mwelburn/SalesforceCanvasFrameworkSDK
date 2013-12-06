
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="actionOverrides" type="{http://soap.sforce.com/2006/04/metadata}ActionOverride" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="articleTypeChannelDisplay" type="{http://soap.sforce.com/2006/04/metadata}ArticleTypeChannelDisplay" minOccurs="0"/>
 *         &lt;element name="businessProcesses" type="{http://soap.sforce.com/2006/04/metadata}BusinessProcess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compactLayoutAssignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compactLayouts" type="{http://soap.sforce.com/2006/04/metadata}CompactLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customHelp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customHelpPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customSettingsType" type="{http://soap.sforce.com/2006/04/metadata}CustomSettingsType" minOccurs="0"/>
 *         &lt;element name="customSettingsVisibility" type="{http://soap.sforce.com/2006/04/metadata}CustomSettingsVisibility" minOccurs="0"/>
 *         &lt;element name="deploymentStatus" type="{http://soap.sforce.com/2006/04/metadata}DeploymentStatus" minOccurs="0"/>
 *         &lt;element name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableActivities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableDivisions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableEnhancedLookup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fieldSets" type="{http://soap.sforce.com/2006/04/metadata}FieldSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://soap.sforce.com/2006/04/metadata}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://soap.sforce.com/2006/04/metadata}Gender" minOccurs="0"/>
 *         &lt;element name="household" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listViews" type="{http://soap.sforce.com/2006/04/metadata}ListView" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameField" type="{http://soap.sforce.com/2006/04/metadata}CustomField" minOccurs="0"/>
 *         &lt;element name="namedFilters" type="{http://soap.sforce.com/2006/04/metadata}NamedFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pluralLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordTypeTrackFeedHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordTypeTrackHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordTypes" type="{http://soap.sforce.com/2006/04/metadata}RecordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchLayouts" type="{http://soap.sforce.com/2006/04/metadata}SearchLayouts" minOccurs="0"/>
 *         &lt;element name="sharingModel" type="{http://soap.sforce.com/2006/04/metadata}SharingModel" minOccurs="0"/>
 *         &lt;element name="sharingReasons" type="{http://soap.sforce.com/2006/04/metadata}SharingReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sharingRecalculations" type="{http://soap.sforce.com/2006/04/metadata}SharingRecalculation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startsWith" type="{http://soap.sforce.com/2006/04/metadata}StartsWith" minOccurs="0"/>
 *         &lt;element name="validationRules" type="{http://soap.sforce.com/2006/04/metadata}ValidationRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webLinks" type="{http://soap.sforce.com/2006/04/metadata}WebLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObject", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "actionOverrides",
    "articleTypeChannelDisplay",
    "businessProcesses",
    "compactLayoutAssignment",
    "compactLayouts",
    "customHelp",
    "customHelpPage",
    "customSettingsType",
    "customSettingsVisibility",
    "deploymentStatus",
    "deprecated",
    "description",
    "enableActivities",
    "enableDivisions",
    "enableEnhancedLookup",
    "enableFeeds",
    "enableHistory",
    "enableReports",
    "fieldSets",
    "fields",
    "gender",
    "household",
    "label",
    "listViews",
    "nameField",
    "namedFilters",
    "pluralLabel",
    "recordTypeTrackFeedHistory",
    "recordTypeTrackHistory",
    "recordTypes",
    "searchLayouts",
    "sharingModel",
    "sharingReasons",
    "sharingRecalculations",
    "startsWith",
    "validationRules",
    "webLinks"
})
public class CustomObject
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ActionOverride> actionOverrides;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ArticleTypeChannelDisplay articleTypeChannelDisplay;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<BusinessProcess> businessProcesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String compactLayoutAssignment;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CompactLayout> compactLayouts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customHelp;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customHelpPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected CustomSettingsType customSettingsType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected CustomSettingsVisibility customSettingsVisibility;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DeploymentStatus deploymentStatus;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean deprecated;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableActivities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableDivisions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableEnhancedLookup;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableFeeds;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableHistory;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableReports;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FieldSet> fieldSets;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomField> fields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Gender gender;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean household;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ListView> listViews;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected CustomField nameField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<NamedFilter> namedFilters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String pluralLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean recordTypeTrackFeedHistory;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean recordTypeTrackHistory;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<RecordType> recordTypes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SearchLayouts searchLayouts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SharingModel sharingModel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<SharingReason> sharingReasons;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<SharingRecalculation> sharingRecalculations;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected StartsWith startsWith;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ValidationRule> validationRules;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WebLink> webLinks;

    /**
     * Gets the value of the actionOverrides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionOverrides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionOverrides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionOverride }
     * 
     * 
     */
    public List<ActionOverride> getActionOverrides() {
        if (actionOverrides == null) {
            actionOverrides = new ArrayList<ActionOverride>();
        }
        return this.actionOverrides;
    }

    /**
     * Gets the value of the articleTypeChannelDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleTypeChannelDisplay }
     *     
     */
    public ArticleTypeChannelDisplay getArticleTypeChannelDisplay() {
        return articleTypeChannelDisplay;
    }

    /**
     * Sets the value of the articleTypeChannelDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleTypeChannelDisplay }
     *     
     */
    public void setArticleTypeChannelDisplay(ArticleTypeChannelDisplay value) {
        this.articleTypeChannelDisplay = value;
    }

    /**
     * Gets the value of the businessProcesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessProcesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessProcesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessProcess }
     * 
     * 
     */
    public List<BusinessProcess> getBusinessProcesses() {
        if (businessProcesses == null) {
            businessProcesses = new ArrayList<BusinessProcess>();
        }
        return this.businessProcesses;
    }

    /**
     * Gets the value of the compactLayoutAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompactLayoutAssignment() {
        return compactLayoutAssignment;
    }

    /**
     * Sets the value of the compactLayoutAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompactLayoutAssignment(String value) {
        this.compactLayoutAssignment = value;
    }

    /**
     * Gets the value of the compactLayouts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compactLayouts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompactLayouts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompactLayout }
     * 
     * 
     */
    public List<CompactLayout> getCompactLayouts() {
        if (compactLayouts == null) {
            compactLayouts = new ArrayList<CompactLayout>();
        }
        return this.compactLayouts;
    }

    /**
     * Gets the value of the customHelp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHelp() {
        return customHelp;
    }

    /**
     * Sets the value of the customHelp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHelp(String value) {
        this.customHelp = value;
    }

    /**
     * Gets the value of the customHelpPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHelpPage() {
        return customHelpPage;
    }

    /**
     * Sets the value of the customHelpPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHelpPage(String value) {
        this.customHelpPage = value;
    }

    /**
     * Gets the value of the customSettingsType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSettingsType }
     *     
     */
    public CustomSettingsType getCustomSettingsType() {
        return customSettingsType;
    }

    /**
     * Sets the value of the customSettingsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSettingsType }
     *     
     */
    public void setCustomSettingsType(CustomSettingsType value) {
        this.customSettingsType = value;
    }

    /**
     * Gets the value of the customSettingsVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSettingsVisibility }
     *     
     */
    public CustomSettingsVisibility getCustomSettingsVisibility() {
        return customSettingsVisibility;
    }

    /**
     * Sets the value of the customSettingsVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSettingsVisibility }
     *     
     */
    public void setCustomSettingsVisibility(CustomSettingsVisibility value) {
        this.customSettingsVisibility = value;
    }

    /**
     * Gets the value of the deploymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentStatus }
     *     
     */
    public DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    /**
     * Sets the value of the deploymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentStatus }
     *     
     */
    public void setDeploymentStatus(DeploymentStatus value) {
        this.deploymentStatus = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
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
     * Gets the value of the enableActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableActivities() {
        return enableActivities;
    }

    /**
     * Sets the value of the enableActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableActivities(Boolean value) {
        this.enableActivities = value;
    }

    /**
     * Gets the value of the enableDivisions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDivisions() {
        return enableDivisions;
    }

    /**
     * Sets the value of the enableDivisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDivisions(Boolean value) {
        this.enableDivisions = value;
    }

    /**
     * Gets the value of the enableEnhancedLookup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEnhancedLookup() {
        return enableEnhancedLookup;
    }

    /**
     * Sets the value of the enableEnhancedLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEnhancedLookup(Boolean value) {
        this.enableEnhancedLookup = value;
    }

    /**
     * Gets the value of the enableFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFeeds() {
        return enableFeeds;
    }

    /**
     * Sets the value of the enableFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFeeds(Boolean value) {
        this.enableFeeds = value;
    }

    /**
     * Gets the value of the enableHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHistory() {
        return enableHistory;
    }

    /**
     * Sets the value of the enableHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHistory(Boolean value) {
        this.enableHistory = value;
    }

    /**
     * Gets the value of the enableReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableReports() {
        return enableReports;
    }

    /**
     * Sets the value of the enableReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableReports(Boolean value) {
        this.enableReports = value;
    }

    /**
     * Gets the value of the fieldSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldSet }
     * 
     * 
     */
    public List<FieldSet> getFieldSets() {
        if (fieldSets == null) {
            fieldSets = new ArrayList<FieldSet>();
        }
        return this.fieldSets;
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
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getFields() {
        if (fields == null) {
            fields = new ArrayList<CustomField>();
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
     * Gets the value of the household property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHousehold() {
        return household;
    }

    /**
     * Sets the value of the household property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHousehold(Boolean value) {
        this.household = value;
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
     * Gets the value of the listViews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListView }
     * 
     * 
     */
    public List<ListView> getListViews() {
        if (listViews == null) {
            listViews = new ArrayList<ListView>();
        }
        return this.listViews;
    }

    /**
     * Gets the value of the nameField property.
     * 
     * @return
     *     possible object is
     *     {@link CustomField }
     *     
     */
    public CustomField getNameField() {
        return nameField;
    }

    /**
     * Sets the value of the nameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setNameField(CustomField value) {
        this.nameField = value;
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
     * {@link NamedFilter }
     * 
     * 
     */
    public List<NamedFilter> getNamedFilters() {
        if (namedFilters == null) {
            namedFilters = new ArrayList<NamedFilter>();
        }
        return this.namedFilters;
    }

    /**
     * Gets the value of the pluralLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralLabel() {
        return pluralLabel;
    }

    /**
     * Sets the value of the pluralLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralLabel(String value) {
        this.pluralLabel = value;
    }

    /**
     * Gets the value of the recordTypeTrackFeedHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordTypeTrackFeedHistory() {
        return recordTypeTrackFeedHistory;
    }

    /**
     * Sets the value of the recordTypeTrackFeedHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordTypeTrackFeedHistory(Boolean value) {
        this.recordTypeTrackFeedHistory = value;
    }

    /**
     * Gets the value of the recordTypeTrackHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordTypeTrackHistory() {
        return recordTypeTrackHistory;
    }

    /**
     * Sets the value of the recordTypeTrackHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordTypeTrackHistory(Boolean value) {
        this.recordTypeTrackHistory = value;
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
     * {@link RecordType }
     * 
     * 
     */
    public List<RecordType> getRecordTypes() {
        if (recordTypes == null) {
            recordTypes = new ArrayList<RecordType>();
        }
        return this.recordTypes;
    }

    /**
     * Gets the value of the searchLayouts property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLayouts }
     *     
     */
    public SearchLayouts getSearchLayouts() {
        return searchLayouts;
    }

    /**
     * Sets the value of the searchLayouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLayouts }
     *     
     */
    public void setSearchLayouts(SearchLayouts value) {
        this.searchLayouts = value;
    }

    /**
     * Gets the value of the sharingModel property.
     * 
     * @return
     *     possible object is
     *     {@link SharingModel }
     *     
     */
    public SharingModel getSharingModel() {
        return sharingModel;
    }

    /**
     * Sets the value of the sharingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingModel }
     *     
     */
    public void setSharingModel(SharingModel value) {
        this.sharingModel = value;
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
     * {@link SharingReason }
     * 
     * 
     */
    public List<SharingReason> getSharingReasons() {
        if (sharingReasons == null) {
            sharingReasons = new ArrayList<SharingReason>();
        }
        return this.sharingReasons;
    }

    /**
     * Gets the value of the sharingRecalculations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharingRecalculations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharingRecalculations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharingRecalculation }
     * 
     * 
     */
    public List<SharingRecalculation> getSharingRecalculations() {
        if (sharingRecalculations == null) {
            sharingRecalculations = new ArrayList<SharingRecalculation>();
        }
        return this.sharingRecalculations;
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
     * {@link ValidationRule }
     * 
     * 
     */
    public List<ValidationRule> getValidationRules() {
        if (validationRules == null) {
            validationRules = new ArrayList<ValidationRule>();
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
     * {@link WebLink }
     * 
     * 
     */
    public List<WebLink> getWebLinks() {
        if (webLinks == null) {
            webLinks = new ArrayList<WebLink>();
        }
        return this.webLinks;
    }

}
