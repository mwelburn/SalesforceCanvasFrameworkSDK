
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalyticSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticSnapshot">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mappings" type="{http://soap.sforce.com/2006/04/metadata}AnalyticSnapshotMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runningUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetObject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticSnapshot", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "description",
    "groupColumn",
    "mappings",
    "name",
    "runningUser",
    "sourceReport",
    "targetObject"
})
public class AnalyticSnapshot
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String groupColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<AnalyticSnapshotMapping> mappings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String runningUser;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String sourceReport;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String targetObject;

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

    /**
     * Gets the value of the groupColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupColumn() {
        return groupColumn;
    }

    /**
     * Sets the value of the groupColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupColumn(String value) {
        this.groupColumn = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalyticSnapshotMapping }
     * 
     * 
     */
    public List<AnalyticSnapshotMapping> getMappings() {
        if (mappings == null) {
            mappings = new ArrayList<AnalyticSnapshotMapping>();
        }
        return this.mappings;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the runningUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningUser() {
        return runningUser;
    }

    /**
     * Sets the value of the runningUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningUser(String value) {
        this.runningUser = value;
    }

    /**
     * Gets the value of the sourceReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceReport() {
        return sourceReport;
    }

    /**
     * Sets the value of the sourceReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceReport(String value) {
        this.sourceReport = value;
    }

    /**
     * Gets the value of the targetObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObject() {
        return targetObject;
    }

    /**
     * Sets the value of the targetObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObject(String value) {
        this.targetObject = value;
    }

}
