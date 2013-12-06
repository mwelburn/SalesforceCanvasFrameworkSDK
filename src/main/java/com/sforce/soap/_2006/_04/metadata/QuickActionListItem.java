
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickActionListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quickActionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickActionListItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "quickActionName"
})
public class QuickActionListItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String quickActionName;

    /**
     * Gets the value of the quickActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickActionName() {
        return quickActionName;
    }

    /**
     * Sets the value of the quickActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickActionName(String value) {
        this.quickActionName = value;
    }

}
