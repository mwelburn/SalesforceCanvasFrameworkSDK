
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoResponseRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoResponseRules">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="autoResponseRule" type="{http://soap.sforce.com/2006/04/metadata}AutoResponseRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoResponseRules", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "autoResponseRule"
})
public class AutoResponseRules
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<AutoResponseRule> autoResponseRule;

    /**
     * Gets the value of the autoResponseRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoResponseRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoResponseRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoResponseRule }
     * 
     * 
     */
    public List<AutoResponseRule> getAutoResponseRule() {
        if (autoResponseRule == null) {
            autoResponseRule = new ArrayList<AutoResponseRule>();
        }
        return this.autoResponseRule;
    }

}
