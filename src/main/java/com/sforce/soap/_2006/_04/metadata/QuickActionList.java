
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickActionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quickActionListItems" type="{http://soap.sforce.com/2006/04/metadata}QuickActionListItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickActionList", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "quickActionListItems"
})
public class QuickActionList {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<QuickActionListItem> quickActionListItems;

    /**
     * Gets the value of the quickActionListItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickActionListItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickActionListItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuickActionListItem }
     * 
     * 
     */
    public List<QuickActionListItem> getQuickActionListItems() {
        if (quickActionListItems == null) {
            quickActionListItems = new ArrayList<QuickActionListItem>();
        }
        return this.quickActionListItems;
    }

}
