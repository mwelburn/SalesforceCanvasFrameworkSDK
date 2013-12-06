
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZipFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="DeployOptions" type="{http://soap.sforce.com/2006/04/metadata}DeployOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zipFile",
    "deployOptions"
})
@XmlRootElement(name = "deploy", namespace = "http://soap.sforce.com/2006/04/metadata")
public class Deploy {

    @XmlElement(name = "ZipFile", namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected byte[] zipFile;
    @XmlElement(name = "DeployOptions", namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DeployOptions deployOptions;

    /**
     * Gets the value of the zipFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getZipFile() {
        return zipFile;
    }

    /**
     * Sets the value of the zipFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setZipFile(byte[] value) {
        this.zipFile = ((byte[]) value);
    }

    /**
     * Gets the value of the deployOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DeployOptions }
     *     
     */
    public DeployOptions getDeployOptions() {
        return deployOptions;
    }

    /**
     * Sets the value of the deployOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployOptions }
     *     
     */
    public void setDeployOptions(DeployOptions value) {
        this.deployOptions = value;
    }

}
