
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStepRejectBehavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalStepRejectBehavior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://soap.sforce.com/2006/04/metadata}StepRejectBehaviorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalStepRejectBehavior", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "type"
})
public class ApprovalStepRejectBehavior {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected StepRejectBehaviorType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StepRejectBehaviorType }
     *     
     */
    public StepRejectBehaviorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StepRejectBehaviorType }
     *     
     */
    public void setType(StepRejectBehaviorType value) {
        this.type = value;
    }

}
