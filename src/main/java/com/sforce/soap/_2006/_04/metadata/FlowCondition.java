
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leftValueReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://soap.sforce.com/2006/04/metadata}FlowComparisonOperator"/>
 *         &lt;element name="rightValue" type="{http://soap.sforce.com/2006/04/metadata}FlowElementReferenceOrValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowCondition", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "leftValueReference",
    "operator",
    "rightValue"
})
public class FlowCondition {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String leftValueReference;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FlowComparisonOperator operator;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowElementReferenceOrValue rightValue;

    /**
     * Gets the value of the leftValueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftValueReference() {
        return leftValueReference;
    }

    /**
     * Sets the value of the leftValueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftValueReference(String value) {
        this.leftValueReference = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link FlowComparisonOperator }
     *     
     */
    public FlowComparisonOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowComparisonOperator }
     *     
     */
    public void setOperator(FlowComparisonOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the rightValue property.
     * 
     * @return
     *     possible object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public FlowElementReferenceOrValue getRightValue() {
        return rightValue;
    }

    /**
     * Sets the value of the rightValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowElementReferenceOrValue }
     *     
     */
    public void setRightValue(FlowElementReferenceOrValue value) {
        this.rightValue = value;
    }

}
