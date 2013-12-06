
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivitiesSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitiesSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="allowUsersToRelateMultipleContactsToTasksAndEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableActivityReminders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableClickCreateEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableDragAndDropScheduling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableEmailTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableEventScheduler" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableGroupTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableListViewScheduling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableLogNote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableMultidayEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableRecurringEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableRecurringTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSidebarCalendarShortcut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="meetingRequestsLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showCustomLogoMeetingRequests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showEventDetailsMultiUserCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showHomePageHoverLinksForEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMyTasksHoverLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showRequestedMeetingsOnHomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitiesSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "allowUsersToRelateMultipleContactsToTasksAndEvents",
    "enableActivityReminders",
    "enableClickCreateEvents",
    "enableDragAndDropScheduling",
    "enableEmailTracking",
    "enableEventScheduler",
    "enableGroupTasks",
    "enableListViewScheduling",
    "enableLogNote",
    "enableMultidayEvents",
    "enableRecurringEvents",
    "enableRecurringTasks",
    "enableSidebarCalendarShortcut",
    "meetingRequestsLogo",
    "showCustomLogoMeetingRequests",
    "showEventDetailsMultiUserCalendar",
    "showHomePageHoverLinksForEvents",
    "showMyTasksHoverLinks",
    "showRequestedMeetingsOnHomePage"
})
public class ActivitiesSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean allowUsersToRelateMultipleContactsToTasksAndEvents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableActivityReminders;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableClickCreateEvents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableDragAndDropScheduling;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableEmailTracking;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableEventScheduler;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableGroupTasks;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableListViewScheduling;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableLogNote;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableMultidayEvents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableRecurringEvents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableRecurringTasks;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSidebarCalendarShortcut;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String meetingRequestsLogo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showCustomLogoMeetingRequests;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showEventDetailsMultiUserCalendar;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showHomePageHoverLinksForEvents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showMyTasksHoverLinks;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showRequestedMeetingsOnHomePage;

    /**
     * Gets the value of the allowUsersToRelateMultipleContactsToTasksAndEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUsersToRelateMultipleContactsToTasksAndEvents() {
        return allowUsersToRelateMultipleContactsToTasksAndEvents;
    }

    /**
     * Sets the value of the allowUsersToRelateMultipleContactsToTasksAndEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUsersToRelateMultipleContactsToTasksAndEvents(Boolean value) {
        this.allowUsersToRelateMultipleContactsToTasksAndEvents = value;
    }

    /**
     * Gets the value of the enableActivityReminders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableActivityReminders() {
        return enableActivityReminders;
    }

    /**
     * Sets the value of the enableActivityReminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableActivityReminders(Boolean value) {
        this.enableActivityReminders = value;
    }

    /**
     * Gets the value of the enableClickCreateEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableClickCreateEvents() {
        return enableClickCreateEvents;
    }

    /**
     * Sets the value of the enableClickCreateEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableClickCreateEvents(Boolean value) {
        this.enableClickCreateEvents = value;
    }

    /**
     * Gets the value of the enableDragAndDropScheduling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDragAndDropScheduling() {
        return enableDragAndDropScheduling;
    }

    /**
     * Sets the value of the enableDragAndDropScheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDragAndDropScheduling(Boolean value) {
        this.enableDragAndDropScheduling = value;
    }

    /**
     * Gets the value of the enableEmailTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEmailTracking() {
        return enableEmailTracking;
    }

    /**
     * Sets the value of the enableEmailTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEmailTracking(Boolean value) {
        this.enableEmailTracking = value;
    }

    /**
     * Gets the value of the enableEventScheduler property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEventScheduler() {
        return enableEventScheduler;
    }

    /**
     * Sets the value of the enableEventScheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEventScheduler(Boolean value) {
        this.enableEventScheduler = value;
    }

    /**
     * Gets the value of the enableGroupTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGroupTasks() {
        return enableGroupTasks;
    }

    /**
     * Sets the value of the enableGroupTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGroupTasks(Boolean value) {
        this.enableGroupTasks = value;
    }

    /**
     * Gets the value of the enableListViewScheduling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableListViewScheduling() {
        return enableListViewScheduling;
    }

    /**
     * Sets the value of the enableListViewScheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableListViewScheduling(Boolean value) {
        this.enableListViewScheduling = value;
    }

    /**
     * Gets the value of the enableLogNote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLogNote() {
        return enableLogNote;
    }

    /**
     * Sets the value of the enableLogNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLogNote(Boolean value) {
        this.enableLogNote = value;
    }

    /**
     * Gets the value of the enableMultidayEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMultidayEvents() {
        return enableMultidayEvents;
    }

    /**
     * Sets the value of the enableMultidayEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMultidayEvents(Boolean value) {
        this.enableMultidayEvents = value;
    }

    /**
     * Gets the value of the enableRecurringEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRecurringEvents() {
        return enableRecurringEvents;
    }

    /**
     * Sets the value of the enableRecurringEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRecurringEvents(Boolean value) {
        this.enableRecurringEvents = value;
    }

    /**
     * Gets the value of the enableRecurringTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRecurringTasks() {
        return enableRecurringTasks;
    }

    /**
     * Sets the value of the enableRecurringTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRecurringTasks(Boolean value) {
        this.enableRecurringTasks = value;
    }

    /**
     * Gets the value of the enableSidebarCalendarShortcut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSidebarCalendarShortcut() {
        return enableSidebarCalendarShortcut;
    }

    /**
     * Sets the value of the enableSidebarCalendarShortcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSidebarCalendarShortcut(Boolean value) {
        this.enableSidebarCalendarShortcut = value;
    }

    /**
     * Gets the value of the meetingRequestsLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingRequestsLogo() {
        return meetingRequestsLogo;
    }

    /**
     * Sets the value of the meetingRequestsLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingRequestsLogo(String value) {
        this.meetingRequestsLogo = value;
    }

    /**
     * Gets the value of the showCustomLogoMeetingRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCustomLogoMeetingRequests() {
        return showCustomLogoMeetingRequests;
    }

    /**
     * Sets the value of the showCustomLogoMeetingRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCustomLogoMeetingRequests(Boolean value) {
        this.showCustomLogoMeetingRequests = value;
    }

    /**
     * Gets the value of the showEventDetailsMultiUserCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEventDetailsMultiUserCalendar() {
        return showEventDetailsMultiUserCalendar;
    }

    /**
     * Sets the value of the showEventDetailsMultiUserCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEventDetailsMultiUserCalendar(Boolean value) {
        this.showEventDetailsMultiUserCalendar = value;
    }

    /**
     * Gets the value of the showHomePageHoverLinksForEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowHomePageHoverLinksForEvents() {
        return showHomePageHoverLinksForEvents;
    }

    /**
     * Sets the value of the showHomePageHoverLinksForEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHomePageHoverLinksForEvents(Boolean value) {
        this.showHomePageHoverLinksForEvents = value;
    }

    /**
     * Gets the value of the showMyTasksHoverLinks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMyTasksHoverLinks() {
        return showMyTasksHoverLinks;
    }

    /**
     * Sets the value of the showMyTasksHoverLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMyTasksHoverLinks(Boolean value) {
        this.showMyTasksHoverLinks = value;
    }

    /**
     * Gets the value of the showRequestedMeetingsOnHomePage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRequestedMeetingsOnHomePage() {
        return showRequestedMeetingsOnHomePage;
    }

    /**
     * Sets the value of the showRequestedMeetingsOnHomePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRequestedMeetingsOnHomePage(Boolean value) {
        this.showRequestedMeetingsOnHomePage = value;
    }

}
