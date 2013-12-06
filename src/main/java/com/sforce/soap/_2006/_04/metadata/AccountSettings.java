
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="enableAccountOwnerReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableAccountTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showViewHierarchyLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableAccountOwnerReport",
    "enableAccountTeams",
    "showViewHierarchyLink"
})
public class AccountSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableAccountOwnerReport;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableAccountTeams;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showViewHierarchyLink;

    /**
     * Gets the value of the enableAccountOwnerReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAccountOwnerReport() {
        return enableAccountOwnerReport;
    }

    /**
     * Sets the value of the enableAccountOwnerReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAccountOwnerReport(Boolean value) {
        this.enableAccountOwnerReport = value;
    }

    /**
     * Gets the value of the enableAccountTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAccountTeams() {
        return enableAccountTeams;
    }

    /**
     * Sets the value of the enableAccountTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAccountTeams(Boolean value) {
        this.enableAccountTeams = value;
    }

    /**
     * Gets the value of the showViewHierarchyLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowViewHierarchyLink() {
        return showViewHierarchyLink;
    }

    /**
     * Sets the value of the showViewHierarchyLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowViewHierarchyLink(Boolean value) {
        this.showViewHierarchyLink = value;
    }

}
