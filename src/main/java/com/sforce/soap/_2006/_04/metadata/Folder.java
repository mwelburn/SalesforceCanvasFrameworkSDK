
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Folder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="accessType" type="{http://soap.sforce.com/2006/04/metadata}FolderAccessTypes" minOccurs="0"/>
 *         &lt;element name="folderShares" type="{http://soap.sforce.com/2006/04/metadata}FolderShare" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publicFolderAccess" type="{http://soap.sforce.com/2006/04/metadata}PublicFolderAccess" minOccurs="0"/>
 *         &lt;element name="sharedTo" type="{http://soap.sforce.com/2006/04/metadata}SharedTo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Folder", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "accessType",
    "folderShares",
    "name",
    "publicFolderAccess",
    "sharedTo"
})
@XmlSeeAlso({
    EmailFolder.class,
    ReportFolder.class,
    DashboardFolder.class,
    DocumentFolder.class
})
public class Folder
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FolderAccessTypes accessType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FolderShare> folderShares;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PublicFolderAccess publicFolderAccess;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SharedTo sharedTo;

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link FolderAccessTypes }
     *     
     */
    public FolderAccessTypes getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderAccessTypes }
     *     
     */
    public void setAccessType(FolderAccessTypes value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the folderShares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderShares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderShare }
     * 
     * 
     */
    public List<FolderShare> getFolderShares() {
        if (folderShares == null) {
            folderShares = new ArrayList<FolderShare>();
        }
        return this.folderShares;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publicFolderAccess property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFolderAccess }
     *     
     */
    public PublicFolderAccess getPublicFolderAccess() {
        return publicFolderAccess;
    }

    /**
     * Sets the value of the publicFolderAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFolderAccess }
     *     
     */
    public void setPublicFolderAccess(PublicFolderAccess value) {
        this.publicFolderAccess = value;
    }

    /**
     * Gets the value of the sharedTo property.
     * 
     * @return
     *     possible object is
     *     {@link SharedTo }
     *     
     */
    public SharedTo getSharedTo() {
        return sharedTo;
    }

    /**
     * Sets the value of the sharedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedTo }
     *     
     */
    public void setSharedTo(SharedTo value) {
        this.sharedTo = value;
    }

}
