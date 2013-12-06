
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="apexPluginCalls" type="{http://soap.sforce.com/2006/04/metadata}FlowApexPluginCall" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignments" type="{http://soap.sforce.com/2006/04/metadata}FlowAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="choices" type="{http://soap.sforce.com/2006/04/metadata}FlowChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constants" type="{http://soap.sforce.com/2006/04/metadata}FlowConstant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decisions" type="{http://soap.sforce.com/2006/04/metadata}FlowDecision" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamicChoiceSets" type="{http://soap.sforce.com/2006/04/metadata}FlowDynamicChoiceSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formulas" type="{http://soap.sforce.com/2006/04/metadata}FlowFormula" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordCreates" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordCreate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordDeletes" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordDelete" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordLookups" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordLookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordUpdates" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="screens" type="{http://soap.sforce.com/2006/04/metadata}FlowScreen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startElementReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="steps" type="{http://soap.sforce.com/2006/04/metadata}FlowStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subflows" type="{http://soap.sforce.com/2006/04/metadata}FlowSubflow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textTemplates" type="{http://soap.sforce.com/2006/04/metadata}FlowTextTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variables" type="{http://soap.sforce.com/2006/04/metadata}FlowVariable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apexPluginCalls",
    "assignments",
    "choices",
    "constants",
    "decisions",
    "description",
    "dynamicChoiceSets",
    "formulas",
    "label",
    "recordCreates",
    "recordDeletes",
    "recordLookups",
    "recordUpdates",
    "screens",
    "startElementReference",
    "steps",
    "subflows",
    "textTemplates",
    "variables"
})
public class Flow
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowApexPluginCall> apexPluginCalls;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowAssignment> assignments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowChoice> choices;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowConstant> constants;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowDecision> decisions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowDynamicChoiceSet> dynamicChoiceSets;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowFormula> formulas;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordCreate> recordCreates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordDelete> recordDeletes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordLookup> recordLookups;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordUpdate> recordUpdates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowScreen> screens;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String startElementReference;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowStep> steps;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowSubflow> subflows;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowTextTemplate> textTemplates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowVariable> variables;

    /**
     * Gets the value of the apexPluginCalls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apexPluginCalls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApexPluginCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowApexPluginCall }
     * 
     * 
     */
    public List<FlowApexPluginCall> getApexPluginCalls() {
        if (apexPluginCalls == null) {
            apexPluginCalls = new ArrayList<FlowApexPluginCall>();
        }
        return this.apexPluginCalls;
    }

    /**
     * Gets the value of the assignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowAssignment }
     * 
     * 
     */
    public List<FlowAssignment> getAssignments() {
        if (assignments == null) {
            assignments = new ArrayList<FlowAssignment>();
        }
        return this.assignments;
    }

    /**
     * Gets the value of the choices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowChoice }
     * 
     * 
     */
    public List<FlowChoice> getChoices() {
        if (choices == null) {
            choices = new ArrayList<FlowChoice>();
        }
        return this.choices;
    }

    /**
     * Gets the value of the constants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowConstant }
     * 
     * 
     */
    public List<FlowConstant> getConstants() {
        if (constants == null) {
            constants = new ArrayList<FlowConstant>();
        }
        return this.constants;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowDecision }
     * 
     * 
     */
    public List<FlowDecision> getDecisions() {
        if (decisions == null) {
            decisions = new ArrayList<FlowDecision>();
        }
        return this.decisions;
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
     * Gets the value of the dynamicChoiceSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicChoiceSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicChoiceSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowDynamicChoiceSet }
     * 
     * 
     */
    public List<FlowDynamicChoiceSet> getDynamicChoiceSets() {
        if (dynamicChoiceSets == null) {
            dynamicChoiceSets = new ArrayList<FlowDynamicChoiceSet>();
        }
        return this.dynamicChoiceSets;
    }

    /**
     * Gets the value of the formulas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formulas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowFormula }
     * 
     * 
     */
    public List<FlowFormula> getFormulas() {
        if (formulas == null) {
            formulas = new ArrayList<FlowFormula>();
        }
        return this.formulas;
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
     * Gets the value of the recordCreates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordCreates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordCreates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordCreate }
     * 
     * 
     */
    public List<FlowRecordCreate> getRecordCreates() {
        if (recordCreates == null) {
            recordCreates = new ArrayList<FlowRecordCreate>();
        }
        return this.recordCreates;
    }

    /**
     * Gets the value of the recordDeletes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordDeletes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordDeletes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordDelete }
     * 
     * 
     */
    public List<FlowRecordDelete> getRecordDeletes() {
        if (recordDeletes == null) {
            recordDeletes = new ArrayList<FlowRecordDelete>();
        }
        return this.recordDeletes;
    }

    /**
     * Gets the value of the recordLookups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordLookups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordLookups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordLookup }
     * 
     * 
     */
    public List<FlowRecordLookup> getRecordLookups() {
        if (recordLookups == null) {
            recordLookups = new ArrayList<FlowRecordLookup>();
        }
        return this.recordLookups;
    }

    /**
     * Gets the value of the recordUpdates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordUpdates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordUpdates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordUpdate }
     * 
     * 
     */
    public List<FlowRecordUpdate> getRecordUpdates() {
        if (recordUpdates == null) {
            recordUpdates = new ArrayList<FlowRecordUpdate>();
        }
        return this.recordUpdates;
    }

    /**
     * Gets the value of the screens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowScreen }
     * 
     * 
     */
    public List<FlowScreen> getScreens() {
        if (screens == null) {
            screens = new ArrayList<FlowScreen>();
        }
        return this.screens;
    }

    /**
     * Gets the value of the startElementReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartElementReference() {
        return startElementReference;
    }

    /**
     * Sets the value of the startElementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartElementReference(String value) {
        this.startElementReference = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowStep }
     * 
     * 
     */
    public List<FlowStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<FlowStep>();
        }
        return this.steps;
    }

    /**
     * Gets the value of the subflows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subflows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubflows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowSubflow }
     * 
     * 
     */
    public List<FlowSubflow> getSubflows() {
        if (subflows == null) {
            subflows = new ArrayList<FlowSubflow>();
        }
        return this.subflows;
    }

    /**
     * Gets the value of the textTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowTextTemplate }
     * 
     * 
     */
    public List<FlowTextTemplate> getTextTemplates() {
        if (textTemplates == null) {
            textTemplates = new ArrayList<FlowTextTemplate>();
        }
        return this.textTemplates;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowVariable }
     * 
     * 
     */
    public List<FlowVariable> getVariables() {
        if (variables == null) {
            variables = new ArrayList<FlowVariable>();
        }
        return this.variables;
    }

}
