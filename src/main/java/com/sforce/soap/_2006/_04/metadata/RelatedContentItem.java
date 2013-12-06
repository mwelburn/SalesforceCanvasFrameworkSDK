
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedContentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedContentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layoutItem" type="{http://soap.sforce.com/2006/04/metadata}LayoutItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedContentItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "layoutItem"
})
public class RelatedContentItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected LayoutItem layoutItem;

    /**
     * Gets the value of the layoutItem property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutItem }
     *     
     */
    public LayoutItem getLayoutItem() {
        return layoutItem;
    }

    /**
     * Sets the value of the layoutItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutItem }
     *     
     */
    public void setLayoutItem(LayoutItem value) {
        this.layoutItem = value;
    }

}
