
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTypeColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportTypeColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkedByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayNameOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportTypeColumn", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "checkedByDefault",
    "displayNameOverride",
    "field",
    "table"
})
public class ReportTypeColumn {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean checkedByDefault;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String displayNameOverride;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String field;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String table;

    /**
     * Gets the value of the checkedByDefault property.
     * 
     */
    public boolean isCheckedByDefault() {
        return checkedByDefault;
    }

    /**
     * Sets the value of the checkedByDefault property.
     * 
     */
    public void setCheckedByDefault(boolean value) {
        this.checkedByDefault = value;
    }

    /**
     * Gets the value of the displayNameOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameOverride() {
        return displayNameOverride;
    }

    /**
     * Sets the value of the displayNameOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameOverride(String value) {
        this.displayNameOverride = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

}
