
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomObjectCriteriaBasedSharingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObjectCriteriaBasedSharingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}CriteriaBasedSharingRule">
 *       &lt;sequence>
 *         &lt;element name="accessLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="booleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObjectCriteriaBasedSharingRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "accessLevel",
    "booleanFilter",
    "description",
    "name"
})
public class CustomObjectCriteriaBasedSharingRule
    extends CriteriaBasedSharingRule
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String accessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String booleanFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the booleanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanFilter() {
        return booleanFilter;
    }

    /**
     * Sets the value of the booleanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanFilter(String value) {
        this.booleanFilter = value;
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

}
