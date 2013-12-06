
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataCategoryGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataCategoryGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataCategory" type="{http://soap.sforce.com/2006/04/metadata}DataCategory"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectUsage" type="{http://soap.sforce.com/2006/04/metadata}ObjectUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataCategoryGroup", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "dataCategory",
    "description",
    "label",
    "objectUsage"
})
public class DataCategoryGroup
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DataCategory dataCategory;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ObjectUsage objectUsage;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the dataCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DataCategory }
     *     
     */
    public DataCategory getDataCategory() {
        return dataCategory;
    }

    /**
     * Sets the value of the dataCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCategory }
     *     
     */
    public void setDataCategory(DataCategory value) {
        this.dataCategory = value;
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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the objectUsage property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectUsage }
     *     
     */
    public ObjectUsage getObjectUsage() {
        return objectUsage;
    }

    /**
     * Sets the value of the objectUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectUsage }
     *     
     */
    public void setObjectUsage(ObjectUsage value) {
        this.objectUsage = value;
    }

}
