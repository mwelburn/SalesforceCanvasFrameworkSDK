
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotasSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotasSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="showQuotas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotasSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "showQuotas"
})
public class QuotasSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean showQuotas;

    /**
     * Gets the value of the showQuotas property.
     * 
     */
    public boolean isShowQuotas() {
        return showQuotas;
    }

    /**
     * Sets the value of the showQuotas property.
     * 
     */
    public void setShowQuotas(boolean value) {
        this.showQuotas = value;
    }

}
