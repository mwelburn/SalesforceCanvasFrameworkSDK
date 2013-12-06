
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkspaceMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkspaceMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkspaceMapping", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "fieldName",
    "tab"
})
public class WorkspaceMapping {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String fieldName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String tab;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

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

}
