
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArticleTypeChannelDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArticleTypeChannelDisplay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleTypeTemplates" type="{http://soap.sforce.com/2006/04/metadata}ArticleTypeTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArticleTypeChannelDisplay", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "articleTypeTemplates"
})
public class ArticleTypeChannelDisplay {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ArticleTypeTemplate> articleTypeTemplates;

    /**
     * Gets the value of the articleTypeTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleTypeTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleTypeTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleTypeTemplate }
     * 
     * 
     */
    public List<ArticleTypeTemplate> getArticleTypeTemplates() {
        if (articleTypeTemplates == null) {
            articleTypeTemplates = new ArrayList<ArticleTypeTemplate>();
        }
        return this.articleTypeTemplates;
    }

}
