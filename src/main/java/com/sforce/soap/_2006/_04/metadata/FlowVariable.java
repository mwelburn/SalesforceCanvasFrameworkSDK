
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowElement">
 *       &lt;sequence>
 *         &lt;element name="dataType" type="{http://soap.sforce.com/2006/04/metadata}FlowDataType"/>
 *         &lt;element name="isInput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "FlowVariable", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "dataType",
    "isInput",
    "isOutput",
    "objectType",
    "scale",
    "value"
})
public class FlowVariable
    extends FlowElement
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FlowDataType dataType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isInput;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isOutput;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String objectType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer scale;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowElementReferenceOrValue value;

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
     * Gets the value of the isInput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInput() {
        return isInput;
    }

    /**
     * Sets the value of the isInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInput(Boolean value) {
        this.isInput = value;
    }

    /**
     * Gets the value of the isOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutput() {
        return isOutput;
    }

    /**
     * Sets the value of the isOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutput(Boolean value) {
        this.isOutput = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
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
