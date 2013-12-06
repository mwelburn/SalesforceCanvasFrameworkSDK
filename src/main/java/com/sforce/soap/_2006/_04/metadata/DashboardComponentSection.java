
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardComponentSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardComponentSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnSize" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentSize"/>
 *         &lt;element name="components" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardComponentSection", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "columnSize",
    "components"
})
public class DashboardComponentSection {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DashboardComponentSize columnSize;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DashboardComponent> components;

    /**
     * Gets the value of the columnSize property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardComponentSize }
     *     
     */
    public DashboardComponentSize getColumnSize() {
        return columnSize;
    }

    /**
     * Sets the value of the columnSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardComponentSize }
     *     
     */
    public void setColumnSize(DashboardComponentSize value) {
        this.columnSize = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DashboardComponent }
     * 
     * 
     */
    public List<DashboardComponent> getComponents() {
        if (components == null) {
            components = new ArrayList<DashboardComponent>();
        }
        return this.components;
    }

}
