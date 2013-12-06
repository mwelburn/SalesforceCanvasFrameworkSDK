
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableQuantity",
    "enableRevenue"
})
public class DataSourceSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enableQuantity;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enableRevenue;

    /**
     * Gets the value of the enableQuantity property.
     * 
     */
    public boolean isEnableQuantity() {
        return enableQuantity;
    }

    /**
     * Sets the value of the enableQuantity property.
     * 
     */
    public void setEnableQuantity(boolean value) {
        this.enableQuantity = value;
    }

    /**
     * Gets the value of the enableRevenue property.
     * 
     */
    public boolean isEnableRevenue() {
        return enableRevenue;
    }

    /**
     * Sets the value of the enableRevenue property.
     * 
     */
    public void setEnableRevenue(boolean value) {
        this.enableRevenue = value;
    }

}
