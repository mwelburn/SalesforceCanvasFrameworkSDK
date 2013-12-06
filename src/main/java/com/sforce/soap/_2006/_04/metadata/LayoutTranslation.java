
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutTranslation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="layoutType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sections" type="{http://soap.sforce.com/2006/04/metadata}LayoutSectionTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutTranslation", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "layout",
    "layoutType",
    "sections"
})
public class LayoutTranslation {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String layout;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String layoutType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<LayoutSectionTranslation> sections;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the layoutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutType() {
        return layoutType;
    }

    /**
     * Sets the value of the layoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutType(String value) {
        this.layoutType = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutSectionTranslation }
     * 
     * 
     */
    public List<LayoutSectionTranslation> getSections() {
        if (sections == null) {
            sections = new ArrayList<LayoutSectionTranslation>();
        }
        return this.sections;
    }

}
