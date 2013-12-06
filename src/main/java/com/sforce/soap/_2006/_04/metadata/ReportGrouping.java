
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportGrouping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportGrouping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateGranularity" type="{http://soap.sforce.com/2006/04/metadata}UserDateGranularity" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sortOrder" type="{http://soap.sforce.com/2006/04/metadata}SortOrder"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGrouping", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "dateGranularity",
    "field",
    "sortOrder"
})
public class ReportGrouping {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected UserDateGranularity dateGranularity;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String field;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SortOrder sortOrder;

    /**
     * Gets the value of the dateGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link UserDateGranularity }
     *     
     */
    public UserDateGranularity getDateGranularity() {
        return dateGranularity;
    }

    /**
     * Sets the value of the dateGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDateGranularity }
     *     
     */
    public void setDateGranularity(UserDateGranularity value) {
        this.dateGranularity = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

}
