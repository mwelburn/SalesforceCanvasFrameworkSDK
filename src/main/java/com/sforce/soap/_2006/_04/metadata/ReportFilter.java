
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criteriaItems" type="{http://soap.sforce.com/2006/04/metadata}ReportFilterItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://soap.sforce.com/2006/04/metadata}Language" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportFilter", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "booleanFilter",
    "criteriaItems",
    "language"
})
public class ReportFilter {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String booleanFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportFilterItem> criteriaItems;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Language language;

    /**
     * Gets the value of the booleanFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanFilter() {
        return booleanFilter;
    }

    /**
     * Sets the value of the booleanFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanFilter(String value) {
        this.booleanFilter = value;
    }

    /**
     * Gets the value of the criteriaItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportFilterItem }
     * 
     * 
     */
    public List<ReportFilterItem> getCriteriaItems() {
        if (criteriaItems == null) {
            criteriaItems = new ArrayList<ReportFilterItem>();
        }
        return this.criteriaItems;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

}
