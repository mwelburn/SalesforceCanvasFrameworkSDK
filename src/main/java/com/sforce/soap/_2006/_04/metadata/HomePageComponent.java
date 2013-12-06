
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HomePageComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HomePageComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="links" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageComponentType" type="{http://soap.sforce.com/2006/04/metadata}PageComponentType"/>
 *         &lt;element name="width" type="{http://soap.sforce.com/2006/04/metadata}PageComponentWidth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomePageComponent", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "body",
    "links",
    "pageComponentType",
    "width"
})
public class HomePageComponent
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String body;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> links;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected PageComponentType pageComponentType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PageComponentWidth width;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLinks() {
        if (links == null) {
            links = new ArrayList<String>();
        }
        return this.links;
    }

    /**
     * Gets the value of the pageComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link PageComponentType }
     *     
     */
    public PageComponentType getPageComponentType() {
        return pageComponentType;
    }

    /**
     * Sets the value of the pageComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageComponentType }
     *     
     */
    public void setPageComponentType(PageComponentType value) {
        this.pageComponentType = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link PageComponentWidth }
     *     
     */
    public PageComponentWidth getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageComponentWidth }
     *     
     */
    public void setWidth(PageComponentWidth value) {
        this.width = value;
    }

}
