
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTerritorySharingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTerritorySharingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}OwnerSharingRule">
 *       &lt;sequence>
 *         &lt;element name="accountAccessLevel" type="{http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoNone"/>
 *         &lt;element name="caseAccessLevel" type="{http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoAll"/>
 *         &lt;element name="contactAccessLevel" type="{http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoAll"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opportunityAccessLevel" type="{http://soap.sforce.com/2006/04/metadata}ShareAccessLevelNoAll"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTerritorySharingRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "accountAccessLevel",
    "caseAccessLevel",
    "contactAccessLevel",
    "description",
    "name",
    "opportunityAccessLevel"
})
public class AccountTerritorySharingRule
    extends OwnerSharingRule
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ShareAccessLevelNoNone accountAccessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ShareAccessLevelNoAll caseAccessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ShareAccessLevelNoAll contactAccessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ShareAccessLevelNoAll opportunityAccessLevel;

    /**
     * Gets the value of the accountAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevelNoNone }
     *     
     */
    public ShareAccessLevelNoNone getAccountAccessLevel() {
        return accountAccessLevel;
    }

    /**
     * Sets the value of the accountAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevelNoNone }
     *     
     */
    public void setAccountAccessLevel(ShareAccessLevelNoNone value) {
        this.accountAccessLevel = value;
    }

    /**
     * Gets the value of the caseAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevelNoAll }
     *     
     */
    public ShareAccessLevelNoAll getCaseAccessLevel() {
        return caseAccessLevel;
    }

    /**
     * Sets the value of the caseAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevelNoAll }
     *     
     */
    public void setCaseAccessLevel(ShareAccessLevelNoAll value) {
        this.caseAccessLevel = value;
    }

    /**
     * Gets the value of the contactAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevelNoAll }
     *     
     */
    public ShareAccessLevelNoAll getContactAccessLevel() {
        return contactAccessLevel;
    }

    /**
     * Sets the value of the contactAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevelNoAll }
     *     
     */
    public void setContactAccessLevel(ShareAccessLevelNoAll value) {
        this.contactAccessLevel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the opportunityAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShareAccessLevelNoAll }
     *     
     */
    public ShareAccessLevelNoAll getOpportunityAccessLevel() {
        return opportunityAccessLevel;
    }

    /**
     * Sets the value of the opportunityAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareAccessLevelNoAll }
     *     
     */
    public void setOpportunityAccessLevel(ShareAccessLevelNoAll value) {
        this.opportunityAccessLevel = value;
    }

}
