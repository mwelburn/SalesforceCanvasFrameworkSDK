
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdeasSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdeasSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="enableChatterProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableIdeaThemes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableIdeas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableIdeasReputation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="halfLife" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ideasProfilePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdeasSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableChatterProfile",
    "enableIdeaThemes",
    "enableIdeas",
    "enableIdeasReputation",
    "halfLife",
    "ideasProfilePage"
})
public class IdeasSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableChatterProfile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableIdeaThemes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableIdeas;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableIdeasReputation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double halfLife;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String ideasProfilePage;

    /**
     * Gets the value of the enableChatterProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableChatterProfile() {
        return enableChatterProfile;
    }

    /**
     * Sets the value of the enableChatterProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableChatterProfile(Boolean value) {
        this.enableChatterProfile = value;
    }

    /**
     * Gets the value of the enableIdeaThemes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIdeaThemes() {
        return enableIdeaThemes;
    }

    /**
     * Sets the value of the enableIdeaThemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIdeaThemes(Boolean value) {
        this.enableIdeaThemes = value;
    }

    /**
     * Gets the value of the enableIdeas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIdeas() {
        return enableIdeas;
    }

    /**
     * Sets the value of the enableIdeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIdeas(Boolean value) {
        this.enableIdeas = value;
    }

    /**
     * Gets the value of the enableIdeasReputation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIdeasReputation() {
        return enableIdeasReputation;
    }

    /**
     * Sets the value of the enableIdeasReputation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIdeasReputation(Boolean value) {
        this.enableIdeasReputation = value;
    }

    /**
     * Gets the value of the halfLife property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHalfLife() {
        return halfLife;
    }

    /**
     * Sets the value of the halfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHalfLife(Double value) {
        this.halfLife = value;
    }

    /**
     * Gets the value of the ideasProfilePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeasProfilePage() {
        return ideasProfilePage;
    }

    /**
     * Sets the value of the ideasProfilePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeasProfilePage(String value) {
        this.ideasProfilePage = value;
    }

}
