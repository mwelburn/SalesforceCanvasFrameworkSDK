
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowInputValidationRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInputValidationRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formulaExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInputValidationRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "errorMessage",
    "formulaExpression"
})
public class FlowInputValidationRule {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String errorMessage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String formulaExpression;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the formulaExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaExpression() {
        return formulaExpression;
    }

    /**
     * Sets the value of the formulaExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaExpression(String value) {
        this.formulaExpression = value;
    }

}
