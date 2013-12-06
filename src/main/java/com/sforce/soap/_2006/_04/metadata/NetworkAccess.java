
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipRanges" type="{http://soap.sforce.com/2006/04/metadata}IpRange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkAccess", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "ipRanges"
})
public class NetworkAccess {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<IpRange> ipRanges;

    /**
     * Gets the value of the ipRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IpRange }
     * 
     * 
     */
    public List<IpRange> getIpRanges() {
        if (ipRanges == null) {
            ipRanges = new ArrayList<IpRange>();
        }
        return this.ipRanges;
    }

}
