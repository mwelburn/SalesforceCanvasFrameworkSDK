
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}RoleOrTerritory">
 *       &lt;sequence>
 *         &lt;element name="parentRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "parentRole"
})
public class Role
    extends RoleOrTerritory
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String parentRole;

    /**
     * Gets the value of the parentRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRole() {
        return parentRole;
    }

    /**
     * Sets the value of the parentRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRole(String value) {
        this.parentRole = value;
    }

}
