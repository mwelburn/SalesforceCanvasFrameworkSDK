
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseSharingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseSharingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="sharedTo" type="{http://soap.sforce.com/2006/04/metadata}SharedTo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSharingRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "sharedTo"
})
@XmlSeeAlso({
    OwnerSharingRule.class,
    CriteriaBasedSharingRule.class
})
public class BaseSharingRule
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SharedTo sharedTo;

    /**
     * Gets the value of the sharedTo property.
     * 
     * @return
     *     possible object is
     *     {@link SharedTo }
     *     
     */
    public SharedTo getSharedTo() {
        return sharedTo;
    }

    /**
     * Sets the value of the sharedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedTo }
     *     
     */
    public void setSharedTo(SharedTo value) {
        this.sharedTo = value;
    }

}
