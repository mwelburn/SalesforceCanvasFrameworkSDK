
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Country">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integrationValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isoCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="standard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="states" type="{http://soap.sforce.com/2006/04/metadata}State" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "integrationValue",
    "isoCode",
    "label",
    "orgDefault",
    "standard",
    "states",
    "visible"
})
public class Country {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String integrationValue;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String isoCode;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean orgDefault;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean standard;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<State> states;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean visible;

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
     * Gets the value of the integrationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationValue() {
        return integrationValue;
    }

    /**
     * Sets the value of the integrationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationValue(String value) {
        this.integrationValue = value;
    }

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Sets the value of the isoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCode(String value) {
        this.isoCode = value;
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
     * Gets the value of the orgDefault property.
     * 
     */
    public boolean isOrgDefault() {
        return orgDefault;
    }

    /**
     * Sets the value of the orgDefault property.
     * 
     */
    public void setOrgDefault(boolean value) {
        this.orgDefault = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     */
    public boolean isStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     */
    public void setStandard(boolean value) {
        this.standard = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the states property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link State }
     * 
     * 
     */
    public List<State> getStates() {
        if (states == null) {
            states = new ArrayList<State>();
        }
        return this.states;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
