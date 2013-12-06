
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectNameCaseValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectNameCaseValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="article" type="{http://soap.sforce.com/2006/04/metadata}Article" minOccurs="0"/>
 *         &lt;element name="caseType" type="{http://soap.sforce.com/2006/04/metadata}CaseType" minOccurs="0"/>
 *         &lt;element name="plural" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="possessive" type="{http://soap.sforce.com/2006/04/metadata}Possessive" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectNameCaseValue", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "article",
    "caseType",
    "plural",
    "possessive",
    "value"
})
public class ObjectNameCaseValue {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Article article;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected CaseType caseType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean plural;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Possessive possessive;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String value;

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setArticle(Article value) {
        this.article = value;
    }

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link CaseType }
     *     
     */
    public CaseType getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseType }
     *     
     */
    public void setCaseType(CaseType value) {
        this.caseType = value;
    }

    /**
     * Gets the value of the plural property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlural() {
        return plural;
    }

    /**
     * Sets the value of the plural property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlural(Boolean value) {
        this.plural = value;
    }

    /**
     * Gets the value of the possessive property.
     * 
     * @return
     *     possible object is
     *     {@link Possessive }
     *     
     */
    public Possessive getPossessive() {
        return possessive;
    }

    /**
     * Sets the value of the possessive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Possessive }
     *     
     */
    public void setPossessive(Possessive value) {
        this.possessive = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
