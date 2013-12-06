
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowAssignmentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowAssignmentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignToReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://soap.sforce.com/2006/04/metadata}FlowAssignmentOperator"/>
 *         &lt;element name="value" type="{http://soap.sforce.com/2006/04/metadata}FlowElementReferenceOrValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowAssignmentItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assignToReference",
    "operator",
    "value"
})
public class FlowAssignmentItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String assignToReference;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FlowAssignmentOperator operator;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowElementReferenceOrValue value;

    /**
     * Gets the value of the assignToReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignToReference() {
        return assignToReference;
    }

    /**
     * Sets the value of the assignToReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignToReference(String value) {
        this.assignToReference = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link FlowAssignmentOperator }
     *     
     */
    public FlowAssignmentOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowAssignmentOperator }
     *     
     */
    public void setOperator(FlowAssignmentOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public FlowElementReferenceOrValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public void setValue(FlowElementReferenceOrValue value) {
        this.value = value;
    }

}
