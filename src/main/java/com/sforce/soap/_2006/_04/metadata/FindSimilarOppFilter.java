
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindSimilarOppFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindSimilarOppFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="similarOpportunitiesDisplayColumns" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="similarOpportunitiesMatchFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindSimilarOppFilter", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "similarOpportunitiesDisplayColumns",
    "similarOpportunitiesMatchFields"
})
public class FindSimilarOppFilter {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> similarOpportunitiesDisplayColumns;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> similarOpportunitiesMatchFields;

    /**
     * Gets the value of the similarOpportunitiesDisplayColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the similarOpportunitiesDisplayColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimilarOpportunitiesDisplayColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSimilarOpportunitiesDisplayColumns() {
        if (similarOpportunitiesDisplayColumns == null) {
            similarOpportunitiesDisplayColumns = new ArrayList<String>();
        }
        return this.similarOpportunitiesDisplayColumns;
    }

    /**
     * Gets the value of the similarOpportunitiesMatchFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the similarOpportunitiesMatchFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimilarOpportunitiesMatchFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSimilarOpportunitiesMatchFields() {
        if (similarOpportunitiesMatchFields == null) {
            similarOpportunitiesMatchFields = new ArrayList<String>();
        }
        return this.similarOpportunitiesMatchFields;
    }

}
