/**
 * Network.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Network  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private java.lang.Boolean allowMembersToFlag;

    private com.sforce.soap._2006._04.metadata.Branding branding;

    private java.lang.String caseCommentEmailTemplate;

    private java.lang.String changePasswordTemplate;

    private java.lang.String description;

    private java.lang.String emailSenderAddress;

    private java.lang.String emailSenderName;

    private java.lang.Boolean enableInvitation;

    private java.lang.String forgotPasswordTemplate;

    private com.sforce.soap._2006._04.metadata.NetworkMemberGroup networkMemberGroups;

    private java.lang.String newSenderAddress;

    private java.lang.String selfRegProfile;

    private java.lang.Boolean selfRegistration;

    private java.lang.Boolean sendWelcomeEmail;

    private java.lang.String site;

    private com.sforce.soap._2006._04.metadata.NetworkStatus status;

    private com.sforce.soap._2006._04.metadata.NetworkTabSet tabs;

    private java.lang.String urlPathPrefix;

    private java.lang.String welcomeTemplate;

    public Network() {
    }

    public Network(
           java.lang.String fullName,
           java.lang.Boolean allowMembersToFlag,
           com.sforce.soap._2006._04.metadata.Branding branding,
           java.lang.String caseCommentEmailTemplate,
           java.lang.String changePasswordTemplate,
           java.lang.String description,
           java.lang.String emailSenderAddress,
           java.lang.String emailSenderName,
           java.lang.Boolean enableInvitation,
           java.lang.String forgotPasswordTemplate,
           com.sforce.soap._2006._04.metadata.NetworkMemberGroup networkMemberGroups,
           java.lang.String newSenderAddress,
           java.lang.String selfRegProfile,
           java.lang.Boolean selfRegistration,
           java.lang.Boolean sendWelcomeEmail,
           java.lang.String site,
           com.sforce.soap._2006._04.metadata.NetworkStatus status,
           com.sforce.soap._2006._04.metadata.NetworkTabSet tabs,
           java.lang.String urlPathPrefix,
           java.lang.String welcomeTemplate) {
        super(
            fullName);
        this.allowMembersToFlag = allowMembersToFlag;
        this.branding = branding;
        this.caseCommentEmailTemplate = caseCommentEmailTemplate;
        this.changePasswordTemplate = changePasswordTemplate;
        this.description = description;
        this.emailSenderAddress = emailSenderAddress;
        this.emailSenderName = emailSenderName;
        this.enableInvitation = enableInvitation;
        this.forgotPasswordTemplate = forgotPasswordTemplate;
        this.networkMemberGroups = networkMemberGroups;
        this.newSenderAddress = newSenderAddress;
        this.selfRegProfile = selfRegProfile;
        this.selfRegistration = selfRegistration;
        this.sendWelcomeEmail = sendWelcomeEmail;
        this.site = site;
        this.status = status;
        this.tabs = tabs;
        this.urlPathPrefix = urlPathPrefix;
        this.welcomeTemplate = welcomeTemplate;
    }


    /**
     * Gets the allowMembersToFlag value for this Network.
     * 
     * @return allowMembersToFlag
     */
    public java.lang.Boolean getAllowMembersToFlag() {
        return allowMembersToFlag;
    }


    /**
     * Sets the allowMembersToFlag value for this Network.
     * 
     * @param allowMembersToFlag
     */
    public void setAllowMembersToFlag(java.lang.Boolean allowMembersToFlag) {
        this.allowMembersToFlag = allowMembersToFlag;
    }


    /**
     * Gets the branding value for this Network.
     * 
     * @return branding
     */
    public com.sforce.soap._2006._04.metadata.Branding getBranding() {
        return branding;
    }


    /**
     * Sets the branding value for this Network.
     * 
     * @param branding
     */
    public void setBranding(com.sforce.soap._2006._04.metadata.Branding branding) {
        this.branding = branding;
    }


    /**
     * Gets the caseCommentEmailTemplate value for this Network.
     * 
     * @return caseCommentEmailTemplate
     */
    public java.lang.String getCaseCommentEmailTemplate() {
        return caseCommentEmailTemplate;
    }


    /**
     * Sets the caseCommentEmailTemplate value for this Network.
     * 
     * @param caseCommentEmailTemplate
     */
    public void setCaseCommentEmailTemplate(java.lang.String caseCommentEmailTemplate) {
        this.caseCommentEmailTemplate = caseCommentEmailTemplate;
    }


    /**
     * Gets the changePasswordTemplate value for this Network.
     * 
     * @return changePasswordTemplate
     */
    public java.lang.String getChangePasswordTemplate() {
        return changePasswordTemplate;
    }


    /**
     * Sets the changePasswordTemplate value for this Network.
     * 
     * @param changePasswordTemplate
     */
    public void setChangePasswordTemplate(java.lang.String changePasswordTemplate) {
        this.changePasswordTemplate = changePasswordTemplate;
    }


    /**
     * Gets the description value for this Network.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Network.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailSenderAddress value for this Network.
     * 
     * @return emailSenderAddress
     */
    public java.lang.String getEmailSenderAddress() {
        return emailSenderAddress;
    }


    /**
     * Sets the emailSenderAddress value for this Network.
     * 
     * @param emailSenderAddress
     */
    public void setEmailSenderAddress(java.lang.String emailSenderAddress) {
        this.emailSenderAddress = emailSenderAddress;
    }


    /**
     * Gets the emailSenderName value for this Network.
     * 
     * @return emailSenderName
     */
    public java.lang.String getEmailSenderName() {
        return emailSenderName;
    }


    /**
     * Sets the emailSenderName value for this Network.
     * 
     * @param emailSenderName
     */
    public void setEmailSenderName(java.lang.String emailSenderName) {
        this.emailSenderName = emailSenderName;
    }


    /**
     * Gets the enableInvitation value for this Network.
     * 
     * @return enableInvitation
     */
    public java.lang.Boolean getEnableInvitation() {
        return enableInvitation;
    }


    /**
     * Sets the enableInvitation value for this Network.
     * 
     * @param enableInvitation
     */
    public void setEnableInvitation(java.lang.Boolean enableInvitation) {
        this.enableInvitation = enableInvitation;
    }


    /**
     * Gets the forgotPasswordTemplate value for this Network.
     * 
     * @return forgotPasswordTemplate
     */
    public java.lang.String getForgotPasswordTemplate() {
        return forgotPasswordTemplate;
    }


    /**
     * Sets the forgotPasswordTemplate value for this Network.
     * 
     * @param forgotPasswordTemplate
     */
    public void setForgotPasswordTemplate(java.lang.String forgotPasswordTemplate) {
        this.forgotPasswordTemplate = forgotPasswordTemplate;
    }


    /**
     * Gets the networkMemberGroups value for this Network.
     * 
     * @return networkMemberGroups
     */
    public com.sforce.soap._2006._04.metadata.NetworkMemberGroup getNetworkMemberGroups() {
        return networkMemberGroups;
    }


    /**
     * Sets the networkMemberGroups value for this Network.
     * 
     * @param networkMemberGroups
     */
    public void setNetworkMemberGroups(com.sforce.soap._2006._04.metadata.NetworkMemberGroup networkMemberGroups) {
        this.networkMemberGroups = networkMemberGroups;
    }


    /**
     * Gets the newSenderAddress value for this Network.
     * 
     * @return newSenderAddress
     */
    public java.lang.String getNewSenderAddress() {
        return newSenderAddress;
    }


    /**
     * Sets the newSenderAddress value for this Network.
     * 
     * @param newSenderAddress
     */
    public void setNewSenderAddress(java.lang.String newSenderAddress) {
        this.newSenderAddress = newSenderAddress;
    }


    /**
     * Gets the selfRegProfile value for this Network.
     * 
     * @return selfRegProfile
     */
    public java.lang.String getSelfRegProfile() {
        return selfRegProfile;
    }


    /**
     * Sets the selfRegProfile value for this Network.
     * 
     * @param selfRegProfile
     */
    public void setSelfRegProfile(java.lang.String selfRegProfile) {
        this.selfRegProfile = selfRegProfile;
    }


    /**
     * Gets the selfRegistration value for this Network.
     * 
     * @return selfRegistration
     */
    public java.lang.Boolean getSelfRegistration() {
        return selfRegistration;
    }


    /**
     * Sets the selfRegistration value for this Network.
     * 
     * @param selfRegistration
     */
    public void setSelfRegistration(java.lang.Boolean selfRegistration) {
        this.selfRegistration = selfRegistration;
    }


    /**
     * Gets the sendWelcomeEmail value for this Network.
     * 
     * @return sendWelcomeEmail
     */
    public java.lang.Boolean getSendWelcomeEmail() {
        return sendWelcomeEmail;
    }


    /**
     * Sets the sendWelcomeEmail value for this Network.
     * 
     * @param sendWelcomeEmail
     */
    public void setSendWelcomeEmail(java.lang.Boolean sendWelcomeEmail) {
        this.sendWelcomeEmail = sendWelcomeEmail;
    }


    /**
     * Gets the site value for this Network.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this Network.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the status value for this Network.
     * 
     * @return status
     */
    public com.sforce.soap._2006._04.metadata.NetworkStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Network.
     * 
     * @param status
     */
    public void setStatus(com.sforce.soap._2006._04.metadata.NetworkStatus status) {
        this.status = status;
    }


    /**
     * Gets the tabs value for this Network.
     * 
     * @return tabs
     */
    public com.sforce.soap._2006._04.metadata.NetworkTabSet getTabs() {
        return tabs;
    }


    /**
     * Sets the tabs value for this Network.
     * 
     * @param tabs
     */
    public void setTabs(com.sforce.soap._2006._04.metadata.NetworkTabSet tabs) {
        this.tabs = tabs;
    }


    /**
     * Gets the urlPathPrefix value for this Network.
     * 
     * @return urlPathPrefix
     */
    public java.lang.String getUrlPathPrefix() {
        return urlPathPrefix;
    }


    /**
     * Sets the urlPathPrefix value for this Network.
     * 
     * @param urlPathPrefix
     */
    public void setUrlPathPrefix(java.lang.String urlPathPrefix) {
        this.urlPathPrefix = urlPathPrefix;
    }


    /**
     * Gets the welcomeTemplate value for this Network.
     * 
     * @return welcomeTemplate
     */
    public java.lang.String getWelcomeTemplate() {
        return welcomeTemplate;
    }


    /**
     * Sets the welcomeTemplate value for this Network.
     * 
     * @param welcomeTemplate
     */
    public void setWelcomeTemplate(java.lang.String welcomeTemplate) {
        this.welcomeTemplate = welcomeTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Network)) return false;
        Network other = (Network) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowMembersToFlag==null && other.getAllowMembersToFlag()==null) || 
             (this.allowMembersToFlag!=null &&
              this.allowMembersToFlag.equals(other.getAllowMembersToFlag()))) &&
            ((this.branding==null && other.getBranding()==null) || 
             (this.branding!=null &&
              this.branding.equals(other.getBranding()))) &&
            ((this.caseCommentEmailTemplate==null && other.getCaseCommentEmailTemplate()==null) || 
             (this.caseCommentEmailTemplate!=null &&
              this.caseCommentEmailTemplate.equals(other.getCaseCommentEmailTemplate()))) &&
            ((this.changePasswordTemplate==null && other.getChangePasswordTemplate()==null) || 
             (this.changePasswordTemplate!=null &&
              this.changePasswordTemplate.equals(other.getChangePasswordTemplate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailSenderAddress==null && other.getEmailSenderAddress()==null) || 
             (this.emailSenderAddress!=null &&
              this.emailSenderAddress.equals(other.getEmailSenderAddress()))) &&
            ((this.emailSenderName==null && other.getEmailSenderName()==null) || 
             (this.emailSenderName!=null &&
              this.emailSenderName.equals(other.getEmailSenderName()))) &&
            ((this.enableInvitation==null && other.getEnableInvitation()==null) || 
             (this.enableInvitation!=null &&
              this.enableInvitation.equals(other.getEnableInvitation()))) &&
            ((this.forgotPasswordTemplate==null && other.getForgotPasswordTemplate()==null) || 
             (this.forgotPasswordTemplate!=null &&
              this.forgotPasswordTemplate.equals(other.getForgotPasswordTemplate()))) &&
            ((this.networkMemberGroups==null && other.getNetworkMemberGroups()==null) || 
             (this.networkMemberGroups!=null &&
              this.networkMemberGroups.equals(other.getNetworkMemberGroups()))) &&
            ((this.newSenderAddress==null && other.getNewSenderAddress()==null) || 
             (this.newSenderAddress!=null &&
              this.newSenderAddress.equals(other.getNewSenderAddress()))) &&
            ((this.selfRegProfile==null && other.getSelfRegProfile()==null) || 
             (this.selfRegProfile!=null &&
              this.selfRegProfile.equals(other.getSelfRegProfile()))) &&
            ((this.selfRegistration==null && other.getSelfRegistration()==null) || 
             (this.selfRegistration!=null &&
              this.selfRegistration.equals(other.getSelfRegistration()))) &&
            ((this.sendWelcomeEmail==null && other.getSendWelcomeEmail()==null) || 
             (this.sendWelcomeEmail!=null &&
              this.sendWelcomeEmail.equals(other.getSendWelcomeEmail()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tabs==null && other.getTabs()==null) || 
             (this.tabs!=null &&
              this.tabs.equals(other.getTabs()))) &&
            ((this.urlPathPrefix==null && other.getUrlPathPrefix()==null) || 
             (this.urlPathPrefix!=null &&
              this.urlPathPrefix.equals(other.getUrlPathPrefix()))) &&
            ((this.welcomeTemplate==null && other.getWelcomeTemplate()==null) || 
             (this.welcomeTemplate!=null &&
              this.welcomeTemplate.equals(other.getWelcomeTemplate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAllowMembersToFlag() != null) {
            _hashCode += getAllowMembersToFlag().hashCode();
        }
        if (getBranding() != null) {
            _hashCode += getBranding().hashCode();
        }
        if (getCaseCommentEmailTemplate() != null) {
            _hashCode += getCaseCommentEmailTemplate().hashCode();
        }
        if (getChangePasswordTemplate() != null) {
            _hashCode += getChangePasswordTemplate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailSenderAddress() != null) {
            _hashCode += getEmailSenderAddress().hashCode();
        }
        if (getEmailSenderName() != null) {
            _hashCode += getEmailSenderName().hashCode();
        }
        if (getEnableInvitation() != null) {
            _hashCode += getEnableInvitation().hashCode();
        }
        if (getForgotPasswordTemplate() != null) {
            _hashCode += getForgotPasswordTemplate().hashCode();
        }
        if (getNetworkMemberGroups() != null) {
            _hashCode += getNetworkMemberGroups().hashCode();
        }
        if (getNewSenderAddress() != null) {
            _hashCode += getNewSenderAddress().hashCode();
        }
        if (getSelfRegProfile() != null) {
            _hashCode += getSelfRegProfile().hashCode();
        }
        if (getSelfRegistration() != null) {
            _hashCode += getSelfRegistration().hashCode();
        }
        if (getSendWelcomeEmail() != null) {
            _hashCode += getSendWelcomeEmail().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTabs() != null) {
            _hashCode += getTabs().hashCode();
        }
        if (getUrlPathPrefix() != null) {
            _hashCode += getUrlPathPrefix().hashCode();
        }
        if (getWelcomeTemplate() != null) {
            _hashCode += getWelcomeTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Network.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Network"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMembersToFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allowMembersToFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "branding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Branding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCommentEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "caseCommentEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePasswordTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "changePasswordTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSenderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailSenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSenderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "emailSenderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableInvitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableInvitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPasswordTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forgotPasswordTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkMemberGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "networkMemberGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkMemberGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSenderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "newSenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegistration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "selfRegistration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendWelcomeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sendWelcomeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "NetworkTabSet"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlPathPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "urlPathPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("welcomeTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "welcomeTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
