
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="countriesAndStates" type="{http://soap.sforce.com/2006/04/metadata}CountriesAndStates"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "countriesAndStates"
})
public class AddressSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected CountriesAndStates countriesAndStates;

    /**
     * Gets the value of the countriesAndStates property.
     * 
     * @return
     *     possible object is
     *     {@link CountriesAndStates }
     *     
     */
    public CountriesAndStates getCountriesAndStates() {
        return countriesAndStates;
    }

    /**
     * Sets the value of the countriesAndStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountriesAndStates }
     *     
     */
    public void setCountriesAndStates(CountriesAndStates value) {
        this.countriesAndStates = value;
    }

}
