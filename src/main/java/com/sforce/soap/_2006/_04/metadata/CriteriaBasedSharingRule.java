
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaBasedSharingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaBasedSharingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}BaseSharingRule">
 *       &lt;sequence>
 *         &lt;element name="criteriaItems" type="{http://soap.sforce.com/2006/04/metadata}FilterItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaBasedSharingRule", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "criteriaItems"
})
@XmlSeeAlso({
    CustomObjectCriteriaBasedSharingRule.class,
    AccountCriteriaBasedSharingRule.class,
    OpportunityCriteriaBasedSharingRule.class,
    CampaignCriteriaBasedSharingRule.class,
    UserCriteriaBasedSharingRule.class,
    ContactCriteriaBasedSharingRule.class,
    CaseCriteriaBasedSharingRule.class,
    LeadCriteriaBasedSharingRule.class
})
public class CriteriaBasedSharingRule
    extends BaseSharingRule
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FilterItem> criteriaItems;

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
     * {@link FilterItem }
     * 
     * 
     */
    public List<FilterItem> getCriteriaItems() {
        if (criteriaItems == null) {
            criteriaItems = new ArrayList<FilterItem>();
        }
        return this.criteriaItems;
    }

}
