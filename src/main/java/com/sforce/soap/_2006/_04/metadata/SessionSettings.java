/**
 * SessionSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SessionSettings  implements java.io.Serializable {
    private java.lang.Boolean disableTimeoutWarning;

    private java.lang.Boolean enableCSRFOnGet;

    private java.lang.Boolean enableCSRFOnPost;

    private java.lang.Boolean enableCacheAndAutocomplete;

    private java.lang.Boolean enableClickjackNonsetupSFDC;

    private java.lang.Boolean enableClickjackNonsetupUser;

    private java.lang.Boolean enableClickjackSetup;

    private java.lang.Boolean enableSMSIdentity;

    private java.lang.Boolean forceRelogin;

    private java.lang.Boolean lockSessionsToIp;

    private com.sforce.soap._2006._04.metadata.SessionTimeout sessionTimeout;

    public SessionSettings() {
    }

    public SessionSettings(
           java.lang.Boolean disableTimeoutWarning,
           java.lang.Boolean enableCSRFOnGet,
           java.lang.Boolean enableCSRFOnPost,
           java.lang.Boolean enableCacheAndAutocomplete,
           java.lang.Boolean enableClickjackNonsetupSFDC,
           java.lang.Boolean enableClickjackNonsetupUser,
           java.lang.Boolean enableClickjackSetup,
           java.lang.Boolean enableSMSIdentity,
           java.lang.Boolean forceRelogin,
           java.lang.Boolean lockSessionsToIp,
           com.sforce.soap._2006._04.metadata.SessionTimeout sessionTimeout) {
           this.disableTimeoutWarning = disableTimeoutWarning;
           this.enableCSRFOnGet = enableCSRFOnGet;
           this.enableCSRFOnPost = enableCSRFOnPost;
           this.enableCacheAndAutocomplete = enableCacheAndAutocomplete;
           this.enableClickjackNonsetupSFDC = enableClickjackNonsetupSFDC;
           this.enableClickjackNonsetupUser = enableClickjackNonsetupUser;
           this.enableClickjackSetup = enableClickjackSetup;
           this.enableSMSIdentity = enableSMSIdentity;
           this.forceRelogin = forceRelogin;
           this.lockSessionsToIp = lockSessionsToIp;
           this.sessionTimeout = sessionTimeout;
    }


    /**
     * Gets the disableTimeoutWarning value for this SessionSettings.
     * 
     * @return disableTimeoutWarning
     */
    public java.lang.Boolean getDisableTimeoutWarning() {
        return disableTimeoutWarning;
    }


    /**
     * Sets the disableTimeoutWarning value for this SessionSettings.
     * 
     * @param disableTimeoutWarning
     */
    public void setDisableTimeoutWarning(java.lang.Boolean disableTimeoutWarning) {
        this.disableTimeoutWarning = disableTimeoutWarning;
    }


    /**
     * Gets the enableCSRFOnGet value for this SessionSettings.
     * 
     * @return enableCSRFOnGet
     */
    public java.lang.Boolean getEnableCSRFOnGet() {
        return enableCSRFOnGet;
    }


    /**
     * Sets the enableCSRFOnGet value for this SessionSettings.
     * 
     * @param enableCSRFOnGet
     */
    public void setEnableCSRFOnGet(java.lang.Boolean enableCSRFOnGet) {
        this.enableCSRFOnGet = enableCSRFOnGet;
    }


    /**
     * Gets the enableCSRFOnPost value for this SessionSettings.
     * 
     * @return enableCSRFOnPost
     */
    public java.lang.Boolean getEnableCSRFOnPost() {
        return enableCSRFOnPost;
    }


    /**
     * Sets the enableCSRFOnPost value for this SessionSettings.
     * 
     * @param enableCSRFOnPost
     */
    public void setEnableCSRFOnPost(java.lang.Boolean enableCSRFOnPost) {
        this.enableCSRFOnPost = enableCSRFOnPost;
    }


    /**
     * Gets the enableCacheAndAutocomplete value for this SessionSettings.
     * 
     * @return enableCacheAndAutocomplete
     */
    public java.lang.Boolean getEnableCacheAndAutocomplete() {
        return enableCacheAndAutocomplete;
    }


    /**
     * Sets the enableCacheAndAutocomplete value for this SessionSettings.
     * 
     * @param enableCacheAndAutocomplete
     */
    public void setEnableCacheAndAutocomplete(java.lang.Boolean enableCacheAndAutocomplete) {
        this.enableCacheAndAutocomplete = enableCacheAndAutocomplete;
    }


    /**
     * Gets the enableClickjackNonsetupSFDC value for this SessionSettings.
     * 
     * @return enableClickjackNonsetupSFDC
     */
    public java.lang.Boolean getEnableClickjackNonsetupSFDC() {
        return enableClickjackNonsetupSFDC;
    }


    /**
     * Sets the enableClickjackNonsetupSFDC value for this SessionSettings.
     * 
     * @param enableClickjackNonsetupSFDC
     */
    public void setEnableClickjackNonsetupSFDC(java.lang.Boolean enableClickjackNonsetupSFDC) {
        this.enableClickjackNonsetupSFDC = enableClickjackNonsetupSFDC;
    }


    /**
     * Gets the enableClickjackNonsetupUser value for this SessionSettings.
     * 
     * @return enableClickjackNonsetupUser
     */
    public java.lang.Boolean getEnableClickjackNonsetupUser() {
        return enableClickjackNonsetupUser;
    }


    /**
     * Sets the enableClickjackNonsetupUser value for this SessionSettings.
     * 
     * @param enableClickjackNonsetupUser
     */
    public void setEnableClickjackNonsetupUser(java.lang.Boolean enableClickjackNonsetupUser) {
        this.enableClickjackNonsetupUser = enableClickjackNonsetupUser;
    }


    /**
     * Gets the enableClickjackSetup value for this SessionSettings.
     * 
     * @return enableClickjackSetup
     */
    public java.lang.Boolean getEnableClickjackSetup() {
        return enableClickjackSetup;
    }


    /**
     * Sets the enableClickjackSetup value for this SessionSettings.
     * 
     * @param enableClickjackSetup
     */
    public void setEnableClickjackSetup(java.lang.Boolean enableClickjackSetup) {
        this.enableClickjackSetup = enableClickjackSetup;
    }


    /**
     * Gets the enableSMSIdentity value for this SessionSettings.
     * 
     * @return enableSMSIdentity
     */
    public java.lang.Boolean getEnableSMSIdentity() {
        return enableSMSIdentity;
    }


    /**
     * Sets the enableSMSIdentity value for this SessionSettings.
     * 
     * @param enableSMSIdentity
     */
    public void setEnableSMSIdentity(java.lang.Boolean enableSMSIdentity) {
        this.enableSMSIdentity = enableSMSIdentity;
    }


    /**
     * Gets the forceRelogin value for this SessionSettings.
     * 
     * @return forceRelogin
     */
    public java.lang.Boolean getForceRelogin() {
        return forceRelogin;
    }


    /**
     * Sets the forceRelogin value for this SessionSettings.
     * 
     * @param forceRelogin
     */
    public void setForceRelogin(java.lang.Boolean forceRelogin) {
        this.forceRelogin = forceRelogin;
    }


    /**
     * Gets the lockSessionsToIp value for this SessionSettings.
     * 
     * @return lockSessionsToIp
     */
    public java.lang.Boolean getLockSessionsToIp() {
        return lockSessionsToIp;
    }


    /**
     * Sets the lockSessionsToIp value for this SessionSettings.
     * 
     * @param lockSessionsToIp
     */
    public void setLockSessionsToIp(java.lang.Boolean lockSessionsToIp) {
        this.lockSessionsToIp = lockSessionsToIp;
    }


    /**
     * Gets the sessionTimeout value for this SessionSettings.
     * 
     * @return sessionTimeout
     */
    public com.sforce.soap._2006._04.metadata.SessionTimeout getSessionTimeout() {
        return sessionTimeout;
    }


    /**
     * Sets the sessionTimeout value for this SessionSettings.
     * 
     * @param sessionTimeout
     */
    public void setSessionTimeout(com.sforce.soap._2006._04.metadata.SessionTimeout sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionSettings)) return false;
        SessionSettings other = (SessionSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.disableTimeoutWarning==null && other.getDisableTimeoutWarning()==null) || 
             (this.disableTimeoutWarning!=null &&
              this.disableTimeoutWarning.equals(other.getDisableTimeoutWarning()))) &&
            ((this.enableCSRFOnGet==null && other.getEnableCSRFOnGet()==null) || 
             (this.enableCSRFOnGet!=null &&
              this.enableCSRFOnGet.equals(other.getEnableCSRFOnGet()))) &&
            ((this.enableCSRFOnPost==null && other.getEnableCSRFOnPost()==null) || 
             (this.enableCSRFOnPost!=null &&
              this.enableCSRFOnPost.equals(other.getEnableCSRFOnPost()))) &&
            ((this.enableCacheAndAutocomplete==null && other.getEnableCacheAndAutocomplete()==null) || 
             (this.enableCacheAndAutocomplete!=null &&
              this.enableCacheAndAutocomplete.equals(other.getEnableCacheAndAutocomplete()))) &&
            ((this.enableClickjackNonsetupSFDC==null && other.getEnableClickjackNonsetupSFDC()==null) || 
             (this.enableClickjackNonsetupSFDC!=null &&
              this.enableClickjackNonsetupSFDC.equals(other.getEnableClickjackNonsetupSFDC()))) &&
            ((this.enableClickjackNonsetupUser==null && other.getEnableClickjackNonsetupUser()==null) || 
             (this.enableClickjackNonsetupUser!=null &&
              this.enableClickjackNonsetupUser.equals(other.getEnableClickjackNonsetupUser()))) &&
            ((this.enableClickjackSetup==null && other.getEnableClickjackSetup()==null) || 
             (this.enableClickjackSetup!=null &&
              this.enableClickjackSetup.equals(other.getEnableClickjackSetup()))) &&
            ((this.enableSMSIdentity==null && other.getEnableSMSIdentity()==null) || 
             (this.enableSMSIdentity!=null &&
              this.enableSMSIdentity.equals(other.getEnableSMSIdentity()))) &&
            ((this.forceRelogin==null && other.getForceRelogin()==null) || 
             (this.forceRelogin!=null &&
              this.forceRelogin.equals(other.getForceRelogin()))) &&
            ((this.lockSessionsToIp==null && other.getLockSessionsToIp()==null) || 
             (this.lockSessionsToIp!=null &&
              this.lockSessionsToIp.equals(other.getLockSessionsToIp()))) &&
            ((this.sessionTimeout==null && other.getSessionTimeout()==null) || 
             (this.sessionTimeout!=null &&
              this.sessionTimeout.equals(other.getSessionTimeout())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDisableTimeoutWarning() != null) {
            _hashCode += getDisableTimeoutWarning().hashCode();
        }
        if (getEnableCSRFOnGet() != null) {
            _hashCode += getEnableCSRFOnGet().hashCode();
        }
        if (getEnableCSRFOnPost() != null) {
            _hashCode += getEnableCSRFOnPost().hashCode();
        }
        if (getEnableCacheAndAutocomplete() != null) {
            _hashCode += getEnableCacheAndAutocomplete().hashCode();
        }
        if (getEnableClickjackNonsetupSFDC() != null) {
            _hashCode += getEnableClickjackNonsetupSFDC().hashCode();
        }
        if (getEnableClickjackNonsetupUser() != null) {
            _hashCode += getEnableClickjackNonsetupUser().hashCode();
        }
        if (getEnableClickjackSetup() != null) {
            _hashCode += getEnableClickjackSetup().hashCode();
        }
        if (getEnableSMSIdentity() != null) {
            _hashCode += getEnableSMSIdentity().hashCode();
        }
        if (getForceRelogin() != null) {
            _hashCode += getForceRelogin().hashCode();
        }
        if (getLockSessionsToIp() != null) {
            _hashCode += getLockSessionsToIp().hashCode();
        }
        if (getSessionTimeout() != null) {
            _hashCode += getSessionTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableTimeoutWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "disableTimeoutWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCSRFOnGet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCSRFOnGet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCSRFOnPost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCSRFOnPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCacheAndAutocomplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCacheAndAutocomplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackNonsetupSFDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackNonsetupSFDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackNonsetupUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackNonsetupUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableClickjackSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableClickjackSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSMSIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSMSIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceRelogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "forceRelogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockSessionsToIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "lockSessionsToIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sessionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SessionTimeout"));
        elemField.setMinOccurs(0);
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
