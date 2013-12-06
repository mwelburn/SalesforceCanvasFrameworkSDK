
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTerritorySharingRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTerritorySharingRules">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}SharingRules">
 *       &lt;sequence>
 *         &lt;element name="rules" type="{http://soap.sforce.com/2006/04/metadata}AccountTerritorySharingRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTerritorySharingRules", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "rules"
})
public class AccountTerritorySharingRules
    extends SharingRules
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<AccountTerritorySharingRule> rules;

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountTerritorySharingRule }
     * 
     * 
     */
    public List<AccountTerritorySharingRule> getRules() {
        if (rules == null) {
            rules = new ArrayList<AccountTerritorySharingRule>();
        }
        return this.rules;
    }

}
