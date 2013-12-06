
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NextAutomatedApprover complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextAutomatedApprover">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="useApproverFieldOfRecordOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userHierarchyField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextAutomatedApprover", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "useApproverFieldOfRecordOwner",
    "userHierarchyField"
})
public class NextAutomatedApprover {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useApproverFieldOfRecordOwner;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String userHierarchyField;

    /**
     * Gets the value of the useApproverFieldOfRecordOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseApproverFieldOfRecordOwner() {
        return useApproverFieldOfRecordOwner;
    }

    /**
     * Sets the value of the useApproverFieldOfRecordOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseApproverFieldOfRecordOwner(Boolean value) {
        this.useApproverFieldOfRecordOwner = value;
    }

    /**
     * Gets the value of the userHierarchyField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHierarchyField() {
        return userHierarchyField;
    }

    /**
     * Sets the value of the userHierarchyField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHierarchyField(String value) {
        this.userHierarchyField = value;
    }

}
