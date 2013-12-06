
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionSetTabSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetTabSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visibility" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetTabVisibility"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetTabSetting", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "tab",
    "visibility"
})
public class PermissionSetTabSetting {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String tab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected PermissionSetTabVisibility visibility;

    /**
     * Gets the value of the tab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTab() {
        return tab;
    }

    /**
     * Sets the value of the tab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTab(String value) {
        this.tab = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionSetTabVisibility }
     *     
     */
    public PermissionSetTabVisibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionSetTabVisibility }
     *     
     */
    public void setVisibility(PermissionSetTabVisibility value) {
        this.visibility = value;
    }

}
