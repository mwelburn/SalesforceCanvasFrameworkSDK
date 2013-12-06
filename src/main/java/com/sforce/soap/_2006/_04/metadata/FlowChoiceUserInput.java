
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowChoiceUserInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowChoiceUserInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="promptText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationRule" type="{http://soap.sforce.com/2006/04/metadata}FlowInputValidationRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowChoiceUserInput", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "isRequired",
    "promptText",
    "validationRule"
})
public class FlowChoiceUserInput {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isRequired;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String promptText;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowInputValidationRule validationRule;

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the promptText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptText() {
        return promptText;
    }

    /**
     * Sets the value of the promptText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptText(String value) {
        this.promptText = value;
    }

    /**
     * Gets the value of the validationRule property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInputValidationRule }
     *     
     */
    public FlowInputValidationRule getValidationRule() {
        return validationRule;
    }

    /**
     * Sets the value of the validationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInputValidationRule }
     *     
     */
    public void setValidationRule(FlowInputValidationRule value) {
        this.validationRule = value;
    }

}
