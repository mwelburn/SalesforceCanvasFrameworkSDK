
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="apiAccessLevel" type="{http://soap.sforce.com/2006/04/metadata}APIAccessLevel" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectPermissions" type="{http://soap.sforce.com/2006/04/metadata}ProfileObjectPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postInstallClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setupWeblink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="types" type="{http://soap.sforce.com/2006/04/metadata}PackageTypeMembers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uninstallClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiAccessLevel",
    "description",
    "namespacePrefix",
    "objectPermissions",
    "postInstallClass",
    "setupWeblink",
    "types",
    "uninstallClass",
    "version"
})
public class Package
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected APIAccessLevel apiAccessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String namespacePrefix;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileObjectPermissions> objectPermissions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String postInstallClass;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String setupWeblink;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PackageTypeMembers> types;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String uninstallClass;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String version;

    /**
     * Gets the value of the apiAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link APIAccessLevel }
     *     
     */
    public APIAccessLevel getApiAccessLevel() {
        return apiAccessLevel;
    }

    /**
     * Sets the value of the apiAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIAccessLevel }
     *     
     */
    public void setApiAccessLevel(APIAccessLevel value) {
        this.apiAccessLevel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the objectPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileObjectPermissions }
     * 
     * 
     */
    public List<ProfileObjectPermissions> getObjectPermissions() {
        if (objectPermissions == null) {
            objectPermissions = new ArrayList<ProfileObjectPermissions>();
        }
        return this.objectPermissions;
    }

    /**
     * Gets the value of the postInstallClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostInstallClass() {
        return postInstallClass;
    }

    /**
     * Sets the value of the postInstallClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostInstallClass(String value) {
        this.postInstallClass = value;
    }

    /**
     * Gets the value of the setupWeblink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupWeblink() {
        return setupWeblink;
    }

    /**
     * Sets the value of the setupWeblink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupWeblink(String value) {
        this.setupWeblink = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageTypeMembers }
     * 
     * 
     */
    public List<PackageTypeMembers> getTypes() {
        if (types == null) {
            types = new ArrayList<PackageTypeMembers>();
        }
        return this.types;
    }

    /**
     * Gets the value of the uninstallClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUninstallClass() {
        return uninstallClass;
    }

    /**
     * Sets the value of the uninstallClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUninstallClass(String value) {
        this.uninstallClass = value;
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
