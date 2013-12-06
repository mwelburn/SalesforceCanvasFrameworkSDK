
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionSetExternalDataSourceAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetExternalDataSourceAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="externalDataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetExternalDataSourceAccess", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enabled",
    "externalDataSource"
})
public class PermissionSetExternalDataSourceAccess {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enabled;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String externalDataSource;

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the externalDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDataSource() {
        return externalDataSource;
    }

    /**
     * Sets the value of the externalDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDataSource(String value) {
        this.externalDataSource = value;
    }

}
