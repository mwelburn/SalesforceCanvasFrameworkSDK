
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="businessHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casesPerEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entitlementProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPerIncident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementTemplate", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "businessHours",
    "casesPerEntitlement",
    "entitlementProcess",
    "isPerIncident",
    "term",
    "type"
})
public class EntitlementTemplate
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String businessHours;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer casesPerEntitlement;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String entitlementProcess;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isPerIncident;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer term;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String type;

    /**
     * Gets the value of the businessHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessHours() {
        return businessHours;
    }

    /**
     * Sets the value of the businessHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessHours(String value) {
        this.businessHours = value;
    }

    /**
     * Gets the value of the casesPerEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCasesPerEntitlement() {
        return casesPerEntitlement;
    }

    /**
     * Sets the value of the casesPerEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCasesPerEntitlement(Integer value) {
        this.casesPerEntitlement = value;
    }

    /**
     * Gets the value of the entitlementProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementProcess() {
        return entitlementProcess;
    }

    /**
     * Sets the value of the entitlementProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementProcess(String value) {
        this.entitlementProcess = value;
    }

    /**
     * Gets the value of the isPerIncident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerIncident() {
        return isPerIncident;
    }

    /**
     * Sets the value of the isPerIncident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerIncident(Boolean value) {
        this.isPerIncident = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerm(Integer value) {
        this.term = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
