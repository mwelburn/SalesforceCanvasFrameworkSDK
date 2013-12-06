
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordTypePicklistValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordTypePicklistValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="picklist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="values" type="{http://soap.sforce.com/2006/04/metadata}PicklistValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTypePicklistValue", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "picklist",
    "values"
})
public class RecordTypePicklistValue {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String picklist;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PicklistValue> values;

    /**
     * Gets the value of the picklist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicklist() {
        return picklist;
    }

    /**
     * Sets the value of the picklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicklist(String value) {
        this.picklist = value;
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
     * {@link PicklistValue }
     * 
     * 
     */
    public List<PicklistValue> getValues() {
        if (values == null) {
            values = new ArrayList<PicklistValue>();
        }
        return this.values;
    }

}
