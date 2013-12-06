
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpportunitySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunitySettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="autoActivateNewReminders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableFindSimilarOpportunities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableOpportunityTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableUpdateReminders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="findSimilarOppFilter" type="{http://soap.sforce.com/2006/04/metadata}FindSimilarOppFilter" minOccurs="0"/>
 *         &lt;element name="promptToAddProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunitySettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "autoActivateNewReminders",
    "enableFindSimilarOpportunities",
    "enableOpportunityTeam",
    "enableUpdateReminders",
    "findSimilarOppFilter",
    "promptToAddProducts"
})
public class OpportunitySettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean autoActivateNewReminders;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableFindSimilarOpportunities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableOpportunityTeam;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableUpdateReminders;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FindSimilarOppFilter findSimilarOppFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean promptToAddProducts;

    /**
     * Gets the value of the autoActivateNewReminders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoActivateNewReminders() {
        return autoActivateNewReminders;
    }

    /**
     * Sets the value of the autoActivateNewReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoActivateNewReminders(Boolean value) {
        this.autoActivateNewReminders = value;
    }

    /**
     * Gets the value of the enableFindSimilarOpportunities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFindSimilarOpportunities() {
        return enableFindSimilarOpportunities;
    }

    /**
     * Sets the value of the enableFindSimilarOpportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFindSimilarOpportunities(Boolean value) {
        this.enableFindSimilarOpportunities = value;
    }

    /**
     * Gets the value of the enableOpportunityTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOpportunityTeam() {
        return enableOpportunityTeam;
    }

    /**
     * Sets the value of the enableOpportunityTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOpportunityTeam(Boolean value) {
        this.enableOpportunityTeam = value;
    }

    /**
     * Gets the value of the enableUpdateReminders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableUpdateReminders() {
        return enableUpdateReminders;
    }

    /**
     * Sets the value of the enableUpdateReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableUpdateReminders(Boolean value) {
        this.enableUpdateReminders = value;
    }

    /**
     * Gets the value of the findSimilarOppFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FindSimilarOppFilter }
     *     
     */
    public FindSimilarOppFilter getFindSimilarOppFilter() {
        return findSimilarOppFilter;
    }

    /**
     * Sets the value of the findSimilarOppFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindSimilarOppFilter }
     *     
     */
    public void setFindSimilarOppFilter(FindSimilarOppFilter value) {
        this.findSimilarOppFilter = value;
    }

    /**
     * Gets the value of the promptToAddProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptToAddProducts() {
        return promptToAddProducts;
    }

    /**
     * Sets the value of the promptToAddProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptToAddProducts(Boolean value) {
        this.promptToAddProducts = value;
    }

}
