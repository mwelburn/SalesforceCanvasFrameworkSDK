
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Metadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Metadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metadata", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "fullName"
})
@XmlSeeAlso({
    WorkflowRule.class,
    Skill.class,
    ExternalDataSource.class,
    IdeasSettings.class,
    LiveAgentSettings.class,
    ActivitiesSettings.class,
    CustomSite.class,
    ReportType.class,
    CustomPageWebLink.class,
    InstalledPackage.class,
    Queue.class,
    CustomField.class,
    AssignmentRule.class,
    LiveChatAgentConfig.class,
    BusinessProcess.class,
    PermissionSet.class,
    ForecastingSettings.class,
    Package.class,
    CustomApplicationComponent.class,
    FieldSet.class,
    CustomLabel.class,
    BusinessHoursEntry.class,
    ChatterAnswersSettings.class,
    ProductSettings.class,
    OpportunitySettings.class,
    LiveChatDeployment.class,
    CompanySettings.class,
    HomePageLayout.class,
    AssignmentRules.class,
    EscalationRule.class,
    EntitlementTemplate.class,
    ContractSettings.class,
    CallCenter.class,
    PicklistValue.class,
    RemoteSiteSetting.class,
    QuoteSettings.class,
    LiveChatButton.class,
    Network.class,
    AccountSettings.class,
    KnowledgeSettings.class,
    AutoResponseRules.class,
    HomePageComponent.class,
    SamlSsoConfig.class,
    MobileSettings.class,
    EscalationRules.class,
    CustomDataType.class,
    EntitlementProcess.class,
    RecordType.class,
    Profile.class,
    ConnectedApp.class,
    Layout.class,
    WebLink.class,
    AnalyticSnapshot.class,
    QuickAction.class,
    MetadataWithContent.class,
    FlexiPage.class,
    Workflow.class,
    AddressSettings.class,
    SecuritySettings.class,
    PostTemplate.class,
    AuthProvider.class,
    NamedFilter.class,
    ApprovalProcess.class,
    MilestoneType.class,
    AutoResponseRule.class,
    Flow.class,
    BusinessHoursSettings.class,
    Report.class,
    ListView.class,
    CaseSettings.class,
    Portal.class,
    RoleOrTerritory.class,
    Group.class,
    DataCategoryGroup.class,
    ValidationRule.class,
    Dashboard.class,
    CustomObject.class,
    Translations.class,
    CustomLabels.class,
    WorkflowAction.class,
    BaseSharingRule.class,
    SynonymDictionary.class,
    CustomTab.class,
    Letterhead.class,
    EntitlementSettings.class,
    Folder.class,
    SharingReason.class,
    CompactLayout.class,
    CustomObjectTranslation.class,
    CustomApplication.class,
    Community.class,
    SharingRules.class
})
public class Metadata {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String fullName;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

}
