
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharingRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharingRules">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharingRules", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlSeeAlso({
    CaseSharingRules.class,
    UserSharingRules.class,
    CustomObjectSharingRules.class,
    LeadSharingRules.class,
    ContactSharingRules.class,
    AccountTerritorySharingRules.class,
    OpportunitySharingRules.class,
    CampaignSharingRules.class,
    AccountSharingRules.class
})
public class SharingRules
    extends Metadata
{


}
