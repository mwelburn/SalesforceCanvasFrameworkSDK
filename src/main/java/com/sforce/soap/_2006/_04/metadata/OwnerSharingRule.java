
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerSharingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnerSharingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}BaseSharingRule">
 *       &lt;sequence>
 *         &lt;element name="sharedFrom" type="{http://soap.sforce.com/2006/04/metadata}SharedTo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerSharingRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "sharedFrom"
})
@XmlSeeAlso({
    AccountOwnerSharingRule.class,
    OpportunityOwnerSharingRule.class,
    CaseOwnerSharingRule.class,
    CampaignOwnerSharingRule.class,
    AccountTerritorySharingRule.class,
    LeadOwnerSharingRule.class,
    ContactOwnerSharingRule.class,
    CustomObjectOwnerSharingRule.class,
    UserMembershipSharingRule.class
})
public class OwnerSharingRule
    extends BaseSharingRule
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SharedTo sharedFrom;

    /**
     * Gets the value of the sharedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SharedTo }
     *     
     */
    public SharedTo getSharedFrom() {
        return sharedFrom;
    }

    /**
     * Sets the value of the sharedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedTo }
     *     
     */
    public void setSharedFrom(SharedTo value) {
        this.sharedFrom = value;
    }

}
