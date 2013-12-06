
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queries" type="{http://soap.sforce.com/2006/04/metadata}ListMetadataQuery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asOfVersion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queries",
    "asOfVersion"
})
@XmlRootElement(name = "listMetadata", namespace = "http://soap.sforce.com/2006/04/metadata")
public class ListMetadata {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ListMetadataQuery> queries;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected double asOfVersion;

    /**
     * Gets the value of the queries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListMetadataQuery }
     * 
     * 
     */
    public List<ListMetadataQuery> getQueries() {
        if (queries == null) {
            queries = new ArrayList<ListMetadataQuery>();
        }
        return this.queries;
    }

    /**
     * Gets the value of the asOfVersion property.
     * 
     */
    public double getAsOfVersion() {
        return asOfVersion;
    }

    /**
     * Sets the value of the asOfVersion property.
     * 
     */
    public void setAsOfVersion(double value) {
        this.asOfVersion = value;
    }

}
