
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="booleanFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterScope" type="{http://soap.sforce.com/2006/04/metadata}FilterScope"/>
 *         &lt;element name="filters" type="{http://soap.sforce.com/2006/04/metadata}ListViewFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://soap.sforce.com/2006/04/metadata}Language" minOccurs="0"/>
 *         &lt;element name="queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ListView", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "booleanFilter",
    "columns",
    "division",
    "filterScope",
    "filters",
    "label",
    "language",
    "queue",
    "sharedTo"
})
public class ListView
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String booleanFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> columns;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String division;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FilterScope filterScope;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ListViewFilter> filters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Language language;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String queue;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SharedTo sharedTo;

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
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumns() {
        if (columns == null) {
            columns = new ArrayList<String>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the filterScope property.
     * 
     * @return
     *     possible object is
     *     {@link FilterScope }
     *     
     */
    public FilterScope getFilterScope() {
        return filterScope;
    }

    /**
     * Sets the value of the filterScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterScope }
     *     
     */
    public void setFilterScope(FilterScope value) {
        this.filterScope = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListViewFilter }
     * 
     * 
     */
    public List<ListViewFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<ListViewFilter>();
        }
        return this.filters;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
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
