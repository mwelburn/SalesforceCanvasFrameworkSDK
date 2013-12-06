
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowRecordDelete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowRecordDelete">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="connector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="faultConnector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sObjectInputReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowRecordDelete", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "connector",
    "faultConnector",
    "filters",
    "object",
    "sObjectInputReference"
})
public class FlowRecordDelete
    extends FlowNode
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector connector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector faultConnector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordFilter> filters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String object;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String sObjectInputReference;

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setConnector(FlowConnector value) {
        this.connector = value;
    }

    /**
     * Gets the value of the faultConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getFaultConnector() {
        return faultConnector;
    }

    /**
     * Sets the value of the faultConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setFaultConnector(FlowConnector value) {
        this.faultConnector = value;
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
     * {@link FlowRecordFilter }
     * 
     * 
     */
    public List<FlowRecordFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<FlowRecordFilter>();
        }
        return this.filters;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the sObjectInputReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObjectInputReference() {
        return sObjectInputReference;
    }

    /**
     * Sets the value of the sObjectInputReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObjectInputReference(String value) {
        this.sObjectInputReference = value;
    }

}
