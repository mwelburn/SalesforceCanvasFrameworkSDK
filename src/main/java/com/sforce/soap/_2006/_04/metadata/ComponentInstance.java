
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componentInstanceProperties" type="{http://soap.sforce.com/2006/04/metadata}ComponentInstanceProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentInstance", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "componentInstanceProperties",
    "componentName"
})
public class ComponentInstance {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ComponentInstanceProperty> componentInstanceProperties;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String componentName;

    /**
     * Gets the value of the componentInstanceProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentInstanceProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentInstanceProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentInstanceProperty }
     * 
     * 
     */
    public List<ComponentInstanceProperty> getComponentInstanceProperties() {
        if (componentInstanceProperties == null) {
            componentInstanceProperties = new ArrayList<ComponentInstanceProperty>();
        }
        return this.componentInstanceProperties;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

}
