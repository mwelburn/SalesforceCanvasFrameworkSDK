
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApexTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApexTrigger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}MetadataWithContent">
 *       &lt;sequence>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="packageVersions" type="{http://soap.sforce.com/2006/04/metadata}PackageVersion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://soap.sforce.com/2006/04/metadata}ApexCodeUnitStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApexTrigger", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiVersion",
    "packageVersions",
    "status"
})
public class ApexTrigger
    extends MetadataWithContent
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected double apiVersion;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PackageVersion> packageVersions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ApexCodeUnitStatus status;

    /**
     * Gets the value of the apiVersion property.
     * 
     */
    public double getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     */
    public void setApiVersion(double value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the packageVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageVersion }
     * 
     * 
     */
    public List<PackageVersion> getPackageVersions() {
        if (packageVersions == null) {
            packageVersions = new ArrayList<PackageVersion>();
        }
        return this.packageVersions;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ApexCodeUnitStatus }
     *     
     */
    public ApexCodeUnitStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApexCodeUnitStatus }
     *     
     */
    public void setStatus(ApexCodeUnitStatus value) {
        this.status = value;
    }

}
