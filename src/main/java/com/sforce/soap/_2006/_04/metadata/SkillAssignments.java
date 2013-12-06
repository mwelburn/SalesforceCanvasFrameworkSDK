
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkillAssignments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkillAssignments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profiles" type="{http://soap.sforce.com/2006/04/metadata}SkillProfileAssignments" minOccurs="0"/>
 *         &lt;element name="users" type="{http://soap.sforce.com/2006/04/metadata}SkillUserAssignments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillAssignments", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "profiles",
    "users"
})
public class SkillAssignments {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SkillProfileAssignments profiles;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SkillUserAssignments users;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link SkillProfileAssignments }
     *     
     */
    public SkillProfileAssignments getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillProfileAssignments }
     *     
     */
    public void setProfiles(SkillProfileAssignments value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link SkillUserAssignments }
     *     
     */
    public SkillUserAssignments getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillUserAssignments }
     *     
     */
    public void setUsers(SkillUserAssignments value) {
        this.users = value;
    }

}
