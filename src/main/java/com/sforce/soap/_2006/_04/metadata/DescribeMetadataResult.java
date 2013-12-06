
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeMetadataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMetadataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadataObjects" type="{http://soap.sforce.com/2006/04/metadata}DescribeMetadataObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partialSaveAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="testRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMetadataResult", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "metadataObjects",
    "organizationNamespace",
    "partialSaveAllowed",
    "testRequired"
})
public class DescribeMetadataResult {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DescribeMetadataObject> metadataObjects;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String organizationNamespace;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean partialSaveAllowed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean testRequired;

    /**
     * Gets the value of the metadataObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeMetadataObject }
     * 
     * 
     */
    public List<DescribeMetadataObject> getMetadataObjects() {
        if (metadataObjects == null) {
            metadataObjects = new ArrayList<DescribeMetadataObject>();
        }
        return this.metadataObjects;
    }

    /**
     * Gets the value of the organizationNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationNamespace() {
        return organizationNamespace;
    }

    /**
     * Sets the value of the organizationNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationNamespace(String value) {
        this.organizationNamespace = value;
    }

    /**
     * Gets the value of the partialSaveAllowed property.
     * 
     */
    public boolean isPartialSaveAllowed() {
        return partialSaveAllowed;
    }

    /**
     * Sets the value of the partialSaveAllowed property.
     * 
     */
    public void setPartialSaveAllowed(boolean value) {
        this.partialSaveAllowed = value;
    }

    /**
     * Gets the value of the testRequired property.
     * 
     */
    public boolean isTestRequired() {
        return testRequired;
    }

    /**
     * Sets the value of the testRequired property.
     * 
     */
    public void setTestRequired(boolean value) {
        this.testRequired = value;
    }

}
