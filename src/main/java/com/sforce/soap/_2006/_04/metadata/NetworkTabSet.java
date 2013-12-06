
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkTabSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkTabSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customTab" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultTab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="standardTab" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTabSet", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customTab",
    "defaultTab",
    "standardTab"
})
public class NetworkTabSet {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> customTab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String defaultTab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> standardTab;

    /**
     * Gets the value of the customTab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomTab() {
        if (customTab == null) {
            customTab = new ArrayList<String>();
        }
        return this.customTab;
    }

    /**
     * Gets the value of the defaultTab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTab() {
        return defaultTab;
    }

    /**
     * Sets the value of the defaultTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTab(String value) {
        this.defaultTab = value;
    }

    /**
     * Gets the value of the standardTab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardTab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStandardTab() {
        if (standardTab == null) {
            standardTab = new ArrayList<String>();
        }
        return this.standardTab;
    }

}
