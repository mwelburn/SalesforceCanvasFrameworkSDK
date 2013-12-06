
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowFieldUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowFieldUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}WorkflowAction">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="literalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lookupValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lookupValueType" type="{http://soap.sforce.com/2006/04/metadata}LookupValueType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notifyAssignee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="operation" type="{http://soap.sforce.com/2006/04/metadata}FieldUpdateOperation"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reevaluateOnChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targetObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowFieldUpdate", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "description",
    "field",
    "formula",
    "literalValue",
    "lookupValue",
    "lookupValueType",
    "name",
    "notifyAssignee",
    "operation",
    "_protected",
    "reevaluateOnChange",
    "targetObject"
})
public class WorkflowFieldUpdate
    extends WorkflowAction
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String field;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String formula;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String literalValue;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String lookupValue;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LookupValueType lookupValueType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean notifyAssignee;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FieldUpdateOperation operation;
    @XmlElement(name = "protected", namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean _protected;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean reevaluateOnChange;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String targetObject;

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
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
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
     * Gets the value of the literalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiteralValue() {
        return literalValue;
    }

    /**
     * Sets the value of the literalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiteralValue(String value) {
        this.literalValue = value;
    }

    /**
     * Gets the value of the lookupValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupValue() {
        return lookupValue;
    }

    /**
     * Sets the value of the lookupValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupValue(String value) {
        this.lookupValue = value;
    }

    /**
     * Gets the value of the lookupValueType property.
     * 
     * @return
     *     possible object is
     *     {@link LookupValueType }
     *     
     */
    public LookupValueType getLookupValueType() {
        return lookupValueType;
    }

    /**
     * Sets the value of the lookupValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupValueType }
     *     
     */
    public void setLookupValueType(LookupValueType value) {
        this.lookupValueType = value;
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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link FieldUpdateOperation }
     *     
     */
    public FieldUpdateOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldUpdateOperation }
     *     
     */
    public void setOperation(FieldUpdateOperation value) {
        this.operation = value;
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
     * Gets the value of the reevaluateOnChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReevaluateOnChange() {
        return reevaluateOnChange;
    }

    /**
     * Sets the value of the reevaluateOnChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReevaluateOnChange(Boolean value) {
        this.reevaluateOnChange = value;
    }

    /**
     * Gets the value of the targetObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObject() {
        return targetObject;
    }

    /**
     * Sets the value of the targetObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObject(String value) {
        this.targetObject = value;
    }

}
