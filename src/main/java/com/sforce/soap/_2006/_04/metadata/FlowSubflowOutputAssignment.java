
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowSubflowOutputAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowSubflowOutputAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignToReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowSubflowOutputAssignment", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assignToReference",
    "name"
})
public class FlowSubflowOutputAssignment {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String assignToReference;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;

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

}
