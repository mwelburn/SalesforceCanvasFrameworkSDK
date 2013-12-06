
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sizeX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sizeY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sizeZ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="summaryLayoutItems" type="{http://soap.sforce.com/2006/04/metadata}SummaryLayoutItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summaryLayoutStyle" type="{http://soap.sforce.com/2006/04/metadata}SummaryLayoutStyle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryLayout", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "masterLabel",
    "sizeX",
    "sizeY",
    "sizeZ",
    "summaryLayoutItems",
    "summaryLayoutStyle"
})
public class SummaryLayout {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String masterLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int sizeX;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer sizeY;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer sizeZ;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<SummaryLayoutItem> summaryLayoutItems;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SummaryLayoutStyle summaryLayoutStyle;

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
     * Gets the value of the sizeX property.
     * 
     */
    public int getSizeX() {
        return sizeX;
    }

    /**
     * Sets the value of the sizeX property.
     * 
     */
    public void setSizeX(int value) {
        this.sizeX = value;
    }

    /**
     * Gets the value of the sizeY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSizeY() {
        return sizeY;
    }

    /**
     * Sets the value of the sizeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSizeY(Integer value) {
        this.sizeY = value;
    }

    /**
     * Gets the value of the sizeZ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSizeZ() {
        return sizeZ;
    }

    /**
     * Sets the value of the sizeZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSizeZ(Integer value) {
        this.sizeZ = value;
    }

    /**
     * Gets the value of the summaryLayoutItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryLayoutItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryLayoutItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryLayoutItem }
     * 
     * 
     */
    public List<SummaryLayoutItem> getSummaryLayoutItems() {
        if (summaryLayoutItems == null) {
            summaryLayoutItems = new ArrayList<SummaryLayoutItem>();
        }
        return this.summaryLayoutItems;
    }

    /**
     * Gets the value of the summaryLayoutStyle property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryLayoutStyle }
     *     
     */
    public SummaryLayoutStyle getSummaryLayoutStyle() {
        return summaryLayoutStyle;
    }

    /**
     * Sets the value of the summaryLayoutStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryLayoutStyle }
     *     
     */
    public void setSummaryLayoutStyle(SummaryLayoutStyle value) {
        this.summaryLayoutStyle = value;
    }

}
