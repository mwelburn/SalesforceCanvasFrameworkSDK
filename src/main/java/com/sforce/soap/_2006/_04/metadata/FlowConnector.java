
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowConnector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowConnector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowConnector", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "targetReference"
})
public class FlowConnector {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String targetReference;

    /**
     * Gets the value of the targetReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetReference() {
        return targetReference;
    }

    /**
     * Sets the value of the targetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetReference(String value) {
        this.targetReference = value;
    }

}
