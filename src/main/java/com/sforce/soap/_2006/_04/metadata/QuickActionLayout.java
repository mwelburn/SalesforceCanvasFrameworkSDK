
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickActionLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layoutSectionStyle" type="{http://soap.sforce.com/2006/04/metadata}LayoutSectionStyle"/>
 *         &lt;element name="quickActionLayoutColumns" type="{http://soap.sforce.com/2006/04/metadata}QuickActionLayoutColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickActionLayout", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "layoutSectionStyle",
    "quickActionLayoutColumns"
})
public class QuickActionLayout {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected LayoutSectionStyle layoutSectionStyle;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<QuickActionLayoutColumn> quickActionLayoutColumns;

    /**
     * Gets the value of the layoutSectionStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutSectionStyle }
     *     
     */
    public LayoutSectionStyle getLayoutSectionStyle() {
        return layoutSectionStyle;
    }

    /**
     * Sets the value of the layoutSectionStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutSectionStyle }
     *     
     */
    public void setLayoutSectionStyle(LayoutSectionStyle value) {
        this.layoutSectionStyle = value;
    }

    /**
     * Gets the value of the quickActionLayoutColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickActionLayoutColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickActionLayoutColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuickActionLayoutColumn }
     * 
     * 
     */
    public List<QuickActionLayoutColumn> getQuickActionLayoutColumns() {
        if (quickActionLayoutColumns == null) {
            quickActionLayoutColumns = new ArrayList<QuickActionLayoutColumn>();
        }
        return this.quickActionLayoutColumns;
    }

}
