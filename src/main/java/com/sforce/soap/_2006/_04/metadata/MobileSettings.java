
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="chatterMobile" type="{http://soap.sforce.com/2006/04/metadata}ChatterMobileSettings" minOccurs="0"/>
 *         &lt;element name="dashboardMobile" type="{http://soap.sforce.com/2006/04/metadata}DashboardMobileSettings" minOccurs="0"/>
 *         &lt;element name="salesforceMobile" type="{http://soap.sforce.com/2006/04/metadata}SFDCMobileSettings" minOccurs="0"/>
 *         &lt;element name="touchMobile" type="{http://soap.sforce.com/2006/04/metadata}TouchMobileSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "chatterMobile",
    "dashboardMobile",
    "salesforceMobile",
    "touchMobile"
})
public class MobileSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChatterMobileSettings chatterMobile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DashboardMobileSettings dashboardMobile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SFDCMobileSettings salesforceMobile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected TouchMobileSettings touchMobile;

    /**
     * Gets the value of the chatterMobile property.
     * 
     * @return
     *     possible object is
     *     {@link ChatterMobileSettings }
     *     
     */
    public ChatterMobileSettings getChatterMobile() {
        return chatterMobile;
    }

    /**
     * Sets the value of the chatterMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChatterMobileSettings }
     *     
     */
    public void setChatterMobile(ChatterMobileSettings value) {
        this.chatterMobile = value;
    }

    /**
     * Gets the value of the dashboardMobile property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardMobileSettings }
     *     
     */
    public DashboardMobileSettings getDashboardMobile() {
        return dashboardMobile;
    }

    /**
     * Sets the value of the dashboardMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardMobileSettings }
     *     
     */
    public void setDashboardMobile(DashboardMobileSettings value) {
        this.dashboardMobile = value;
    }

    /**
     * Gets the value of the salesforceMobile property.
     * 
     * @return
     *     possible object is
     *     {@link SFDCMobileSettings }
     *     
     */
    public SFDCMobileSettings getSalesforceMobile() {
        return salesforceMobile;
    }

    /**
     * Sets the value of the salesforceMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFDCMobileSettings }
     *     
     */
    public void setSalesforceMobile(SFDCMobileSettings value) {
        this.salesforceMobile = value;
    }

    /**
     * Gets the value of the touchMobile property.
     * 
     * @return
     *     possible object is
     *     {@link TouchMobileSettings }
     *     
     */
    public TouchMobileSettings getTouchMobile() {
        return touchMobile;
    }

    /**
     * Sets the value of the touchMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchMobileSettings }
     *     
     */
    public void setTouchMobile(TouchMobileSettings value) {
        this.touchMobile = value;
    }

}
