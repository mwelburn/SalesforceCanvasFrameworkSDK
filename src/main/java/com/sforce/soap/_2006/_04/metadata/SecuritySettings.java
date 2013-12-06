
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritySettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuritySettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="networkAccess" type="{http://soap.sforce.com/2006/04/metadata}NetworkAccess" minOccurs="0"/>
 *         &lt;element name="passwordPolicies" type="{http://soap.sforce.com/2006/04/metadata}PasswordPolicies" minOccurs="0"/>
 *         &lt;element name="sessionSettings" type="{http://soap.sforce.com/2006/04/metadata}SessionSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritySettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "networkAccess",
    "passwordPolicies",
    "sessionSettings"
})
public class SecuritySettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected NetworkAccess networkAccess;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PasswordPolicies passwordPolicies;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SessionSettings sessionSettings;

    /**
     * Gets the value of the networkAccess property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkAccess }
     *     
     */
    public NetworkAccess getNetworkAccess() {
        return networkAccess;
    }

    /**
     * Sets the value of the networkAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkAccess }
     *     
     */
    public void setNetworkAccess(NetworkAccess value) {
        this.networkAccess = value;
    }

    /**
     * Gets the value of the passwordPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordPolicies }
     *     
     */
    public PasswordPolicies getPasswordPolicies() {
        return passwordPolicies;
    }

    /**
     * Sets the value of the passwordPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordPolicies }
     *     
     */
    public void setPasswordPolicies(PasswordPolicies value) {
        this.passwordPolicies = value;
    }

    /**
     * Gets the value of the sessionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SessionSettings }
     *     
     */
    public SessionSettings getSessionSettings() {
        return sessionSettings;
    }

    /**
     * Sets the value of the sessionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionSettings }
     *     
     */
    public void setSessionSettings(SessionSettings value) {
        this.sessionSettings = value;
    }

}
