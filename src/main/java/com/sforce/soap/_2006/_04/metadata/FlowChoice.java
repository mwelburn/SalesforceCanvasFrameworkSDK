
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowChoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowElement">
 *       &lt;sequence>
 *         &lt;element name="choiceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{http://soap.sforce.com/2006/04/metadata}FlowDataType"/>
 *         &lt;element name="userInput" type="{http://soap.sforce.com/2006/04/metadata}FlowChoiceUserInput" minOccurs="0"/>
 *         &lt;element name="value" type="{http://soap.sforce.com/2006/04/metadata}FlowElementReferenceOrValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowChoice", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "choiceText",
    "dataType",
    "userInput",
    "value"
})
public class FlowChoice
    extends FlowElement
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String choiceText;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FlowDataType dataType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowChoiceUserInput userInput;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowElementReferenceOrValue value;

    /**
     * Gets the value of the choiceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoiceText() {
        return choiceText;
    }

    /**
     * Sets the value of the choiceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoiceText(String value) {
        this.choiceText = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowDataType }
     *     
     */
    public FlowDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDataType }
     *     
     */
    public void setDataType(FlowDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the userInput property.
     * 
     * @return
     *     possible object is
     *     {@link FlowChoiceUserInput }
     *     
     */
    public FlowChoiceUserInput getUserInput() {
        return userInput;
    }

    /**
     * Sets the value of the userInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowChoiceUserInput }
     *     
     */
    public void setUserInput(FlowChoiceUserInput value) {
        this.userInput = value;
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
