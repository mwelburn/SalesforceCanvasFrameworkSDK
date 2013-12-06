
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStepApprover complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalStepApprover">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approver" type="{http://soap.sforce.com/2006/04/metadata}Approver" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="whenMultipleApprovers" type="{http://soap.sforce.com/2006/04/metadata}RoutingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalStepApprover", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "approver",
    "whenMultipleApprovers"
})
public class ApprovalStepApprover {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<Approver> approver;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected RoutingType whenMultipleApprovers;

    /**
     * Gets the value of the approver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Approver }
     * 
     * 
     */
    public List<Approver> getApprover() {
        if (approver == null) {
            approver = new ArrayList<Approver>();
        }
        return this.approver;
    }

    /**
     * Gets the value of the whenMultipleApprovers property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingType }
     *     
     */
    public RoutingType getWhenMultipleApprovers() {
        return whenMultipleApprovers;
    }

    /**
     * Sets the value of the whenMultipleApprovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingType }
     *     
     */
    public void setWhenMultipleApprovers(RoutingType value) {
        this.whenMultipleApprovers = value;
    }

}
