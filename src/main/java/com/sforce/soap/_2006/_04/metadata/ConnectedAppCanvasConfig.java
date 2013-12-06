
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedAppCanvasConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedAppCanvasConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessMethod" type="{http://soap.sforce.com/2006/04/metadata}AccessMethod"/>
 *         &lt;element name="canvasUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locations" type="{http://soap.sforce.com/2006/04/metadata}CanvasLocationOptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedAppCanvasConfig", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "accessMethod",
    "canvasUrl",
    "locations"
})
public class ConnectedAppCanvasConfig {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected AccessMethod accessMethod;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String canvasUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CanvasLocationOptions> locations;

    /**
     * Gets the value of the accessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AccessMethod }
     *     
     */
    public AccessMethod getAccessMethod() {
        return accessMethod;
    }

    /**
     * Sets the value of the accessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessMethod }
     *     
     */
    public void setAccessMethod(AccessMethod value) {
        this.accessMethod = value;
    }

    /**
     * Gets the value of the canvasUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasUrl() {
        return canvasUrl;
    }

    /**
     * Sets the value of the canvasUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasUrl(String value) {
        this.canvasUrl = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CanvasLocationOptions }
     * 
     * 
     */
    public List<CanvasLocationOptions> getLocations() {
        if (locations == null) {
            locations = new ArrayList<CanvasLocationOptions>();
        }
        return this.locations;
    }

}
