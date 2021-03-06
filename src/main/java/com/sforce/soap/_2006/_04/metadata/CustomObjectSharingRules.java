
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomObjectSharingRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObjectSharingRules">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}SharingRules">
 *       &lt;sequence>
 *         &lt;element name="criteriaBasedRules" type="{http://soap.sforce.com/2006/04/metadata}CustomObjectCriteriaBasedSharingRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ownerRules" type="{http://soap.sforce.com/2006/04/metadata}CustomObjectOwnerSharingRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObjectSharingRules", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "criteriaBasedRules",
    "ownerRules"
})
public class CustomObjectSharingRules
    extends SharingRules
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomObjectCriteriaBasedSharingRule> criteriaBasedRules;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomObjectOwnerSharingRule> ownerRules;

    /**
     * Gets the value of the criteriaBasedRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaBasedRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaBasedRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomObjectCriteriaBasedSharingRule }
     * 
     * 
     */
    public List<CustomObjectCriteriaBasedSharingRule> getCriteriaBasedRules() {
        if (criteriaBasedRules == null) {
            criteriaBasedRules = new ArrayList<CustomObjectCriteriaBasedSharingRule>();
        }
        return this.criteriaBasedRules;
    }

    /**
     * Gets the value of the ownerRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomObjectOwnerSharingRule }
     * 
     * 
     */
    public List<CustomObjectOwnerSharingRule> getOwnerRules() {
        if (ownerRules == null) {
            ownerRules = new ArrayList<CustomObjectOwnerSharingRule>();
        }
        return this.ownerRules;
    }

}
