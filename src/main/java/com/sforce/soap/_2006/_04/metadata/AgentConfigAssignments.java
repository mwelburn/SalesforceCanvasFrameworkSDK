
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentConfigAssignments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentConfigAssignments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profiles" type="{http://soap.sforce.com/2006/04/metadata}AgentConfigProfileAssignments" minOccurs="0"/>
 *         &lt;element name="users" type="{http://soap.sforce.com/2006/04/metadata}AgentConfigUserAssignments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentConfigAssignments", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "profiles",
    "users"
})
public class AgentConfigAssignments {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected AgentConfigProfileAssignments profiles;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected AgentConfigUserAssignments users;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link AgentConfigProfileAssignments }
     *     
     */
    public AgentConfigProfileAssignments getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentConfigProfileAssignments }
     *     
     */
    public void setProfiles(AgentConfigProfileAssignments value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link AgentConfigUserAssignments }
     *     
     */
    public AgentConfigUserAssignments getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentConfigUserAssignments }
     *     
     */
    public void setUsers(AgentConfigUserAssignments value) {
        this.users = value;
    }

}
