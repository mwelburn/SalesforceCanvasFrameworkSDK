
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessHoursSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessHoursSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="businessHours" type="{http://soap.sforce.com/2006/04/metadata}BusinessHoursEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="holidays" type="{http://soap.sforce.com/2006/04/metadata}Holiday" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessHoursSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "businessHours",
    "holidays"
})
public class BusinessHoursSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<BusinessHoursEntry> businessHours;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<Holiday> holidays;

    /**
     * Gets the value of the businessHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessHoursEntry }
     * 
     * 
     */
    public List<BusinessHoursEntry> getBusinessHours() {
        if (businessHours == null) {
            businessHours = new ArrayList<BusinessHoursEntry>();
        }
        return this.businessHours;
    }

    /**
     * Gets the value of the holidays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Holiday }
     * 
     * 
     */
    public List<Holiday> getHolidays() {
        if (holidays == null) {
            holidays = new ArrayList<Holiday>();
        }
        return this.holidays;
    }

}
