
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentsSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentsSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableAdjustments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentsSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableAdjustments"
})
public class AdjustmentsSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enableAdjustments;

    /**
     * Gets the value of the enableAdjustments property.
     * 
     */
    public boolean isEnableAdjustments() {
        return enableAdjustments;
    }

    /**
     * Sets the value of the enableAdjustments property.
     * 
     */
    public void setEnableAdjustments(boolean value) {
        this.enableAdjustments = value;
    }

}
