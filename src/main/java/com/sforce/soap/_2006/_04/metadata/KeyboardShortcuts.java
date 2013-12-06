
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyboardShortcuts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyboardShortcuts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customShortcut" type="{http://soap.sforce.com/2006/04/metadata}CustomShortcut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultShortcut" type="{http://soap.sforce.com/2006/04/metadata}DefaultShortcut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyboardShortcuts", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customShortcut",
    "defaultShortcut"
})
public class KeyboardShortcuts {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomShortcut> customShortcut;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DefaultShortcut> defaultShortcut;

    /**
     * Gets the value of the customShortcut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customShortcut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomShortcut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomShortcut }
     * 
     * 
     */
    public List<CustomShortcut> getCustomShortcut() {
        if (customShortcut == null) {
            customShortcut = new ArrayList<CustomShortcut>();
        }
        return this.customShortcut;
    }

    /**
     * Gets the value of the defaultShortcut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultShortcut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultShortcut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultShortcut }
     * 
     * 
     */
    public List<DefaultShortcut> getDefaultShortcut() {
        if (defaultShortcut == null) {
            defaultShortcut = new ArrayList<DefaultShortcut>();
        }
        return this.defaultShortcut;
    }

}
