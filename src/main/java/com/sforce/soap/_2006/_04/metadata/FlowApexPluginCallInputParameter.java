
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowApexPluginCallInputParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowApexPluginCallInputParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "FlowApexPluginCallInputParameter", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "name",
    "value"
})
public class FlowApexPluginCallInputParameter {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowElementReferenceOrValue value;

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
