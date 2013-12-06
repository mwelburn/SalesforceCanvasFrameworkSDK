
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="autoCalculateEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autoExpirationDelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoExpirationRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoExpireContracts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableContractHistoryTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOwnersOnContractExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "autoCalculateEndDate",
    "autoExpirationDelay",
    "autoExpirationRecipient",
    "autoExpireContracts",
    "enableContractHistoryTracking",
    "notifyOwnersOnContractExpiration"
})
public class ContractSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean autoCalculateEndDate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String autoExpirationDelay;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String autoExpirationRecipient;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean autoExpireContracts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableContractHistoryTracking;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean notifyOwnersOnContractExpiration;

    /**
     * Gets the value of the autoCalculateEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCalculateEndDate() {
        return autoCalculateEndDate;
    }

    /**
     * Sets the value of the autoCalculateEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCalculateEndDate(Boolean value) {
        this.autoCalculateEndDate = value;
    }

    /**
     * Gets the value of the autoExpirationDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExpirationDelay() {
        return autoExpirationDelay;
    }

    /**
     * Sets the value of the autoExpirationDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExpirationDelay(String value) {
        this.autoExpirationDelay = value;
    }

    /**
     * Gets the value of the autoExpirationRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoExpirationRecipient() {
        return autoExpirationRecipient;
    }

    /**
     * Sets the value of the autoExpirationRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoExpirationRecipient(String value) {
        this.autoExpirationRecipient = value;
    }

    /**
     * Gets the value of the autoExpireContracts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExpireContracts() {
        return autoExpireContracts;
    }

    /**
     * Sets the value of the autoExpireContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExpireContracts(Boolean value) {
        this.autoExpireContracts = value;
    }

    /**
     * Gets the value of the enableContractHistoryTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableContractHistoryTracking() {
        return enableContractHistoryTracking;
    }

    /**
     * Sets the value of the enableContractHistoryTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableContractHistoryTracking(Boolean value) {
        this.enableContractHistoryTracking = value;
    }

    /**
     * Gets the value of the notifyOwnersOnContractExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOwnersOnContractExpiration() {
        return notifyOwnersOnContractExpiration;
    }

    /**
     * Sets the value of the notifyOwnersOnContractExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOwnersOnContractExpiration(Boolean value) {
        this.notifyOwnersOnContractExpiration = value;
    }

}
