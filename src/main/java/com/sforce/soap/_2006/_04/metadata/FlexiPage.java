
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexiPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexiPage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="flexiPageRegions" type="{http://soap.sforce.com/2006/04/metadata}FlexiPageRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quickActionList" type="{http://soap.sforce.com/2006/04/metadata}QuickActionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexiPage", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "flexiPageRegions",
    "masterLabel",
    "quickActionList"
})
public class FlexiPage
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlexiPageRegion> flexiPageRegions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String masterLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected QuickActionList quickActionList;

    /**
     * Gets the value of the flexiPageRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexiPageRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexiPageRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexiPageRegion }
     * 
     * 
     */
    public List<FlexiPageRegion> getFlexiPageRegions() {
        if (flexiPageRegions == null) {
            flexiPageRegions = new ArrayList<FlexiPageRegion>();
        }
        return this.flexiPageRegions;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the quickActionList property.
     * 
     * @return
     *     possible object is
     *     {@link QuickActionList }
     *     
     */
    public QuickActionList getQuickActionList() {
        return quickActionList;
    }

    /**
     * Sets the value of the quickActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickActionList }
     *     
     */
    public void setQuickActionList(QuickActionList value) {
        this.quickActionList = value;
    }

}
