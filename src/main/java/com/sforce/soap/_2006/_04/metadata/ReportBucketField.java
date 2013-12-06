
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportBucketField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportBucketField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bucketType" type="{http://soap.sforce.com/2006/04/metadata}ReportBucketFieldType"/>
 *         &lt;element name="developerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nullTreatment" type="{http://soap.sforce.com/2006/04/metadata}ReportBucketFieldNullTreatment" minOccurs="0"/>
 *         &lt;element name="otherBucketLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="useOther" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="values" type="{http://soap.sforce.com/2006/04/metadata}ReportBucketFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportBucketField", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "bucketType",
    "developerName",
    "masterLabel",
    "nullTreatment",
    "otherBucketLabel",
    "sourceColumnName",
    "useOther",
    "values"
})
public class ReportBucketField {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ReportBucketFieldType bucketType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String developerName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String masterLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportBucketFieldNullTreatment nullTreatment;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String otherBucketLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String sourceColumnName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useOther;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportBucketFieldValue> values;

    /**
     * Gets the value of the bucketType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportBucketFieldType }
     *     
     */
    public ReportBucketFieldType getBucketType() {
        return bucketType;
    }

    /**
     * Sets the value of the bucketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportBucketFieldType }
     *     
     */
    public void setBucketType(ReportBucketFieldType value) {
        this.bucketType = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the nullTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link ReportBucketFieldNullTreatment }
     *     
     */
    public ReportBucketFieldNullTreatment getNullTreatment() {
        return nullTreatment;
    }

    /**
     * Sets the value of the nullTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportBucketFieldNullTreatment }
     *     
     */
    public void setNullTreatment(ReportBucketFieldNullTreatment value) {
        this.nullTreatment = value;
    }

    /**
     * Gets the value of the otherBucketLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherBucketLabel() {
        return otherBucketLabel;
    }

    /**
     * Sets the value of the otherBucketLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherBucketLabel(String value) {
        this.otherBucketLabel = value;
    }

    /**
     * Gets the value of the sourceColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceColumnName() {
        return sourceColumnName;
    }

    /**
     * Sets the value of the sourceColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceColumnName(String value) {
        this.sourceColumnName = value;
    }

    /**
     * Gets the value of the useOther property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseOther() {
        return useOther;
    }

    /**
     * Sets the value of the useOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOther(Boolean value) {
        this.useOther = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportBucketFieldValue }
     * 
     * 
     */
    public List<ReportBucketFieldValue> getValues() {
        if (values == null) {
            values = new ArrayList<ReportBucketFieldValue>();
        }
        return this.values;
    }

}
