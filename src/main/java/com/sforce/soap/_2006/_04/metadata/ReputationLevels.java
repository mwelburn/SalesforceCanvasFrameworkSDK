
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReputationLevels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReputationLevels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chatterAnswersReputationLevels" type="{http://soap.sforce.com/2006/04/metadata}ChatterAnswersReputationLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ideaReputationLevels" type="{http://soap.sforce.com/2006/04/metadata}IdeaReputationLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReputationLevels", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "chatterAnswersReputationLevels",
    "ideaReputationLevels"
})
public class ReputationLevels {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ChatterAnswersReputationLevel> chatterAnswersReputationLevels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<IdeaReputationLevel> ideaReputationLevels;

    /**
     * Gets the value of the chatterAnswersReputationLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chatterAnswersReputationLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChatterAnswersReputationLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChatterAnswersReputationLevel }
     * 
     * 
     */
    public List<ChatterAnswersReputationLevel> getChatterAnswersReputationLevels() {
        if (chatterAnswersReputationLevels == null) {
            chatterAnswersReputationLevels = new ArrayList<ChatterAnswersReputationLevel>();
        }
        return this.chatterAnswersReputationLevels;
    }

    /**
     * Gets the value of the ideaReputationLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideaReputationLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeaReputationLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdeaReputationLevel }
     * 
     * 
     */
    public List<IdeaReputationLevel> getIdeaReputationLevels() {
        if (ideaReputationLevels == null) {
            ideaReputationLevels = new ArrayList<IdeaReputationLevel>();
        }
        return this.ideaReputationLevels;
    }

}
