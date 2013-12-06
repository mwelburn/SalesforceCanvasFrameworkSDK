
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveAgentConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveAgentConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableLiveChat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openNewAccountSubtab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openNewCaseSubtab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openNewContactSubtab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openNewLeadSubtab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openNewVFPageSubtab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pagesToOpen" type="{http://soap.sforce.com/2006/04/metadata}PagesToOpen" minOccurs="0"/>
 *         &lt;element name="showKnowledgeArticles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveAgentConfig", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableLiveChat",
    "openNewAccountSubtab",
    "openNewCaseSubtab",
    "openNewContactSubtab",
    "openNewLeadSubtab",
    "openNewVFPageSubtab",
    "pagesToOpen",
    "showKnowledgeArticles"
})
public class LiveAgentConfig {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableLiveChat;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean openNewAccountSubtab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean openNewCaseSubtab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean openNewContactSubtab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean openNewLeadSubtab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean openNewVFPageSubtab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PagesToOpen pagesToOpen;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showKnowledgeArticles;

    /**
     * Gets the value of the enableLiveChat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLiveChat() {
        return enableLiveChat;
    }

    /**
     * Sets the value of the enableLiveChat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLiveChat(Boolean value) {
        this.enableLiveChat = value;
    }

    /**
     * Gets the value of the openNewAccountSubtab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenNewAccountSubtab() {
        return openNewAccountSubtab;
    }

    /**
     * Sets the value of the openNewAccountSubtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenNewAccountSubtab(Boolean value) {
        this.openNewAccountSubtab = value;
    }

    /**
     * Gets the value of the openNewCaseSubtab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenNewCaseSubtab() {
        return openNewCaseSubtab;
    }

    /**
     * Sets the value of the openNewCaseSubtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenNewCaseSubtab(Boolean value) {
        this.openNewCaseSubtab = value;
    }

    /**
     * Gets the value of the openNewContactSubtab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenNewContactSubtab() {
        return openNewContactSubtab;
    }

    /**
     * Sets the value of the openNewContactSubtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenNewContactSubtab(Boolean value) {
        this.openNewContactSubtab = value;
    }

    /**
     * Gets the value of the openNewLeadSubtab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenNewLeadSubtab() {
        return openNewLeadSubtab;
    }

    /**
     * Sets the value of the openNewLeadSubtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenNewLeadSubtab(Boolean value) {
        this.openNewLeadSubtab = value;
    }

    /**
     * Gets the value of the openNewVFPageSubtab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenNewVFPageSubtab() {
        return openNewVFPageSubtab;
    }

    /**
     * Sets the value of the openNewVFPageSubtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenNewVFPageSubtab(Boolean value) {
        this.openNewVFPageSubtab = value;
    }

    /**
     * Gets the value of the pagesToOpen property.
     * 
     * @return
     *     possible object is
     *     {@link PagesToOpen }
     *     
     */
    public PagesToOpen getPagesToOpen() {
        return pagesToOpen;
    }

    /**
     * Sets the value of the pagesToOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagesToOpen }
     *     
     */
    public void setPagesToOpen(PagesToOpen value) {
        this.pagesToOpen = value;
    }

    /**
     * Gets the value of the showKnowledgeArticles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowKnowledgeArticles() {
        return showKnowledgeArticles;
    }

    /**
     * Sets the value of the showKnowledgeArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowKnowledgeArticles(Boolean value) {
        this.showKnowledgeArticles = value;
    }

}
