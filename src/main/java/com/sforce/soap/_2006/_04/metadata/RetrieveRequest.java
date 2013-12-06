
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="packageNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="singlePackage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specificFiles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unpackaged" type="{http://soap.sforce.com/2006/04/metadata}Package" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRequest", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiVersion",
    "packageNames",
    "singlePackage",
    "specificFiles",
    "unpackaged"
})
public class RetrieveRequest {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected double apiVersion;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> packageNames;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean singlePackage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> specificFiles;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Package unpackaged;

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
     * Gets the value of the packageNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageNames() {
        if (packageNames == null) {
            packageNames = new ArrayList<String>();
        }
        return this.packageNames;
    }

    /**
     * Gets the value of the singlePackage property.
     * 
     */
    public boolean isSinglePackage() {
        return singlePackage;
    }

    /**
     * Sets the value of the singlePackage property.
     * 
     */
    public void setSinglePackage(boolean value) {
        this.singlePackage = value;
    }

    /**
     * Gets the value of the specificFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecificFiles() {
        if (specificFiles == null) {
            specificFiles = new ArrayList<String>();
        }
        return this.specificFiles;
    }

    /**
     * Gets the value of the unpackaged property.
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getUnpackaged() {
        return unpackaged;
    }

    /**
     * Sets the value of the unpackaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setUnpackaged(Package value) {
        this.unpackaged = value;
    }

}
