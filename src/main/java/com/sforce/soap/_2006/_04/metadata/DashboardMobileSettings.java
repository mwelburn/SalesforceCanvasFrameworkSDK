
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardMobileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardMobileSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableDashboardIPadApp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardMobileSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableDashboardIPadApp"
})
public class DashboardMobileSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableDashboardIPadApp;

    /**
     * Gets the value of the enableDashboardIPadApp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDashboardIPadApp() {
        return enableDashboardIPadApp;
    }

    /**
     * Sets the value of the enableDashboardIPadApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDashboardIPadApp(Boolean value) {
        this.enableDashboardIPadApp = value;
    }

}
