
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallCenter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallCenter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="adapterUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customSettings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayNameLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalNameLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sections" type="{http://soap.sforce.com/2006/04/metadata}CallCenterSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenter", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "adapterUrl",
    "customSettings",
    "displayName",
    "displayNameLabel",
    "internalNameLabel",
    "sections",
    "version"
})
public class CallCenter
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String adapterUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customSettings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String displayName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String displayNameLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String internalNameLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CallCenterSection> sections;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String version;

    /**
     * Gets the value of the adapterUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdapterUrl() {
        return adapterUrl;
    }

    /**
     * Sets the value of the adapterUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdapterUrl(String value) {
        this.adapterUrl = value;
    }

    /**
     * Gets the value of the customSettings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomSettings() {
        return customSettings;
    }

    /**
     * Sets the value of the customSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomSettings(String value) {
        this.customSettings = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the displayNameLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameLabel() {
        return displayNameLabel;
    }

    /**
     * Sets the value of the displayNameLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameLabel(String value) {
        this.displayNameLabel = value;
    }

    /**
     * Gets the value of the internalNameLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNameLabel() {
        return internalNameLabel;
    }

    /**
     * Sets the value of the internalNameLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNameLabel(String value) {
        this.internalNameLabel = value;
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
     * {@link CallCenterSection }
     * 
     * 
     */
    public List<CallCenterSection> getSections() {
        if (sections == null) {
            sections = new ArrayList<CallCenterSection>();
        }
        return this.sections;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
