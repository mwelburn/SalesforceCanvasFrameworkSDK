
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaticResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaticResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}MetadataWithContent">
 *       &lt;sequence>
 *         &lt;element name="cacheControl" type="{http://soap.sforce.com/2006/04/metadata}StaticResourceCacheControl"/>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticResource", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "cacheControl",
    "contentType",
    "description"
})
public class StaticResource
    extends MetadataWithContent
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected StaticResourceCacheControl cacheControl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String contentType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;

    /**
     * Gets the value of the cacheControl property.
     * 
     * @return
     *     possible object is
     *     {@link StaticResourceCacheControl }
     *     
     */
    public StaticResourceCacheControl getCacheControl() {
        return cacheControl;
    }

    /**
     * Sets the value of the cacheControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticResourceCacheControl }
     *     
     */
    public void setCacheControl(StaticResourceCacheControl value) {
        this.cacheControl = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
