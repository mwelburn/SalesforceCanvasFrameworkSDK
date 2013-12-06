
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedTo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allCustomerPortalUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allInternalUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allPartnerUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groups" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="managerSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="managers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portalRole" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portalRoleAndSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="queue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roleAndSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roleAndSubordinatesInternal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rolesAndSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="territories" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="territoriesAndSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="territory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="territoryAndSubordinates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedTo", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "allCustomerPortalUsers",
    "allInternalUsers",
    "allPartnerUsers",
    "group",
    "groups",
    "managerSubordinates",
    "managers",
    "portalRole",
    "portalRoleAndSubordinates",
    "queue",
    "role",
    "roleAndSubordinates",
    "roleAndSubordinatesInternal",
    "roles",
    "rolesAndSubordinates",
    "territories",
    "territoriesAndSubordinates",
    "territory",
    "territoryAndSubordinates"
})
public class SharedTo {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String allCustomerPortalUsers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String allInternalUsers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String allPartnerUsers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> group;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> groups;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> managerSubordinates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> managers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> portalRole;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> portalRoleAndSubordinates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> queue;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> role;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> roleAndSubordinates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> roleAndSubordinatesInternal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> roles;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> rolesAndSubordinates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> territories;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> territoriesAndSubordinates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> territory;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> territoryAndSubordinates;

    /**
     * Gets the value of the allCustomerPortalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllCustomerPortalUsers() {
        return allCustomerPortalUsers;
    }

    /**
     * Sets the value of the allCustomerPortalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllCustomerPortalUsers(String value) {
        this.allCustomerPortalUsers = value;
    }

    /**
     * Gets the value of the allInternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllInternalUsers() {
        return allInternalUsers;
    }

    /**
     * Sets the value of the allInternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllInternalUsers(String value) {
        this.allInternalUsers = value;
    }

    /**
     * Gets the value of the allPartnerUsers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPartnerUsers() {
        return allPartnerUsers;
    }

    /**
     * Sets the value of the allPartnerUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPartnerUsers(String value) {
        this.allPartnerUsers = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroup() {
        if (group == null) {
            group = new ArrayList<String>();
        }
        return this.group;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroups() {
        if (groups == null) {
            groups = new ArrayList<String>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the managerSubordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerSubordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerSubordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagerSubordinates() {
        if (managerSubordinates == null) {
            managerSubordinates = new ArrayList<String>();
        }
        return this.managerSubordinates;
    }

    /**
     * Gets the value of the managers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagers() {
        if (managers == null) {
            managers = new ArrayList<String>();
        }
        return this.managers;
    }

    /**
     * Gets the value of the portalRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portalRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPortalRole() {
        if (portalRole == null) {
            portalRole = new ArrayList<String>();
        }
        return this.portalRole;
    }

    /**
     * Gets the value of the portalRoleAndSubordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portalRoleAndSubordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalRoleAndSubordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPortalRoleAndSubordinates() {
        if (portalRoleAndSubordinates == null) {
            portalRoleAndSubordinates = new ArrayList<String>();
        }
        return this.portalRoleAndSubordinates;
    }

    /**
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueue() {
        if (queue == null) {
            queue = new ArrayList<String>();
        }
        return this.queue;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

    /**
     * Gets the value of the roleAndSubordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleAndSubordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleAndSubordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleAndSubordinates() {
        if (roleAndSubordinates == null) {
            roleAndSubordinates = new ArrayList<String>();
        }
        return this.roleAndSubordinates;
    }

    /**
     * Gets the value of the roleAndSubordinatesInternal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleAndSubordinatesInternal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleAndSubordinatesInternal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleAndSubordinatesInternal() {
        if (roleAndSubordinatesInternal == null) {
            roleAndSubordinatesInternal = new ArrayList<String>();
        }
        return this.roleAndSubordinatesInternal;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoles() {
        if (roles == null) {
            roles = new ArrayList<String>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the rolesAndSubordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolesAndSubordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolesAndSubordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRolesAndSubordinates() {
        if (rolesAndSubordinates == null) {
            rolesAndSubordinates = new ArrayList<String>();
        }
        return this.rolesAndSubordinates;
    }

    /**
     * Gets the value of the territories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerritories() {
        if (territories == null) {
            territories = new ArrayList<String>();
        }
        return this.territories;
    }

    /**
     * Gets the value of the territoriesAndSubordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territoriesAndSubordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritoriesAndSubordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerritoriesAndSubordinates() {
        if (territoriesAndSubordinates == null) {
            territoriesAndSubordinates = new ArrayList<String>();
        }
        return this.territoriesAndSubordinates;
    }

    /**
     * Gets the value of the territory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerritory() {
        if (territory == null) {
            territory = new ArrayList<String>();
        }
        return this.territory;
    }

    /**
     * Gets the value of the territoryAndSubordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territoryAndSubordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritoryAndSubordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTerritoryAndSubordinates() {
        if (territoryAndSubordinates == null) {
            territoryAndSubordinates = new ArrayList<String>();
        }
        return this.territoryAndSubordinates;
    }

}
