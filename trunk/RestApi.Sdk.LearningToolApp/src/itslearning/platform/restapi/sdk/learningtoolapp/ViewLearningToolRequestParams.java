package itslearning.platform.restapi.sdk.learningtoolapp;

import itslearning.platform.restApi.sdk.common.IRequestParams;
import itslearning.platform.restApi.sdk.common.entities.Constants.*;
import itslearning.platform.restApi.sdk.common.entities.LearningObjectInstancePermissions;

/**
 * Represents request params that is passed from it's learning to the learning application when called from it's learning.
 * @author Amund Trovåg
 */
public class ViewLearningToolRequestParams implements IRequestParams
{
    private String _pageUrl;
    private String _apiSessionId;
    private Integer _learningObjectId;
    private Integer _learningObjectInstanceId;
    private String _version;
    private Integer _userId;
    private String _windowsTimeZoneId;
    private String _olsonTimeZoneId;
    private String _firstName;
    private String _lastName;
    private String _email;
    private String _syncKey;
    private String _mobile;
    private String _locale;
    private String _language;
    private Boolean _use12HTimeFormat;
    private Boolean _accessibility;
    // UTF-8-SSO Remove this when phasing out non-Utf8 signature
    private String _encoding;
    private String _custom1id;
    private String _custom2id;
    private String _custom3id;
    private String _custom4id;
    private String _custom5id;
    private String _custom1;
    private String _custom2;
    private String _custom3;
    private String _custom4;
    private String _custom5;
    private LearningObjectInstancePermissions _permissions = new LearningObjectInstancePermissions();
    private String _timestamp;
    private String _signature;
    private Integer _customerId;
    private String _schoolIds;
    private String _role;
    private String _externalLicenseIds;
    private String _licenseIds;

    /**
     *
     * @return Customer Id
     */
    public Integer getCustomerId() {
        return _customerId;
    }
    /**
     *
     * @param _customerId
     */
    public void setCustomerId(Integer _customerId) {
        this._customerId = _customerId;
    }

    /**
     *
     * @return
     */
    public String getSchoolId() {
        return _schoolIds;
    }

    /**
     *
     * @param _schoolIds
     */
    public void setSchoolId(String _schoolIds) {
        this._schoolIds = _schoolIds;
    }

    public String getPageUrl()
    {
        return _pageUrl;
    }

    /**
     * @param pageUrl the _pageUrl to set
     */
    public void setPageUrl(String pageUrl)
    {
        this._pageUrl = pageUrl;
    }

    /**
     * @return the _apiSessionId
     */
    public String getApiSessionId()
    {
        return _apiSessionId;
    }

    /**
     * @param apiSessionId the _apiSessionId to set
     */
    public void setApiSessionId(String apiSessionId)
    {
        this._apiSessionId = apiSessionId;
    }

    /**
     * @return the _learningObjectId
     */
    public Integer getLearningObjectId()
    {
        return _learningObjectId;
    }

    /**
     * @param learningObjectId the _learningObjectId to set
     */
    public void setLearningObjectId(Integer learningObjectId)
    {
        this._learningObjectId = learningObjectId;
    }

    /**
     * @return the _learningObjectInstanceId
     */
    public Integer getLearningObjectInstanceId()
    {
        return _learningObjectInstanceId;
    }

    /**
     * @param learningObjectInstanceId the _learningObjectInstanceId to set
     */
    public void setLearningObjectInstanceId(Integer learningObjectInstanceId)
    {
        this._learningObjectInstanceId = learningObjectInstanceId;
    }

    /**
     * @return the _version
     */
    public String getVersion()
    {
        return _version;
    }

    /**
     * @param version the _version to set
     */
    public void setVersion(String version)
    {
        this._version = version;
    }

    /**
     * @return the _userId
     */
    public Integer getUserId()
    {
        return _userId;
    }

    /**
     * @param userId the _userId to set
     */
    public void setUserId(Integer userId)
    {
        this._userId = userId;
    }

    /**
     * @return the _windowsTimeZoneId
     */
    public String getWindowsTimeZoneId()
    {
        return _windowsTimeZoneId;
    }

    /**
     * @param windowsTimeZoneId the _windowsTimeZoneId to set
     */
    public void setWindowsTimeZoneId(String windowsTimeZoneId)
    {
        this._windowsTimeZoneId = windowsTimeZoneId;
    }

    /**
     * @return the _olsonTimeZoneId
     */
    public String getOlsonTimeZoneId()
    {
        return _olsonTimeZoneId;
    }

    /**
     * @param olsonTimeZoneId the _olsonTimeZoneId to set
     */
    public void setOlsonTimeZoneId(String olsonTimeZoneId)
    {
        this._olsonTimeZoneId = olsonTimeZoneId;
    }

    /**
     * @return the _firstName
     */
    public String getFirstName()
    {
        return _firstName;
    }

    /**
     * @param firstName the _firstName to set
     */
    public void setFirstName(String firstName)
    {
        this._firstName = firstName;
    }

    /**
     * @return the _lastName
     */
    public String getLastName()
    {
        return _lastName;
    }

    /**
     * @param lastName the _lastName to set
     */
    public void setLastName(String lastName)
    {
        this._lastName = lastName;
    }

     /**
     * @return the _email
     */
    public String getEmail()
    {
        return _email;
    }

    /**
     * @param email the _email to set
     */
    public void setEmail(String email)
    {
        this._email = email;
    }

     /**
     * @return the _syncKey
     */
    public String getSyncKey()
    {
        return _syncKey;
    }

    /**
     * @param syncKey the _syncKey to set
     */
    public void setSyncKey(String syncKey)
    {
        this._syncKey = syncKey;
    }
    
     /**
     * @return the _mobile
     */
    public String getMobile()
    {
        return _mobile;
    }

    /**
     * @param mobile the _mobile to set
     */
    public void setMobile(String mobile)
    {
        this._mobile = mobile;
    }

    /**
     * @return the _locale
     */
    public String getLocale()
    {
        return _locale;
    }

    /**
     * @param locale the _locale to set
     */
    public void setLocale(String locale)
    {
        this._locale = locale;
    }

    /**
     * @return the _language
     */
    public String getLanguage()
    {
        return _language;
    }

    /**
     * @param language the _language to set
     */
    public void setLanguage(String language)
    {
        this._language = language;
    }

    /**
     * @return the _use12HTimeFormat
     */
    public Boolean getUse12HTimeFormat()
    {
        return _use12HTimeFormat;
    }

    /**
     * @param use12HTimeFormat the _use12HTimeFormat to set
     */
    public void setUse12HTimeFormat(Boolean use12HTimeFormat)
    {
        this._use12HTimeFormat = use12HTimeFormat;
    }

    /**
     * @return the _accessibility
     */
    public Boolean getAccessibility()
    {
        return _accessibility;
    }

    /**
     * @param accessibility the _accessibility to set
     */
    public void setAccessibility(Boolean accessibility)
    {
        this._accessibility = accessibility;
    }
    
    /**
     * 
     * @return 
     */
    public String getEncoding()
    {
        return _encoding;
    }
    
    public void setEncoding(String encoding)
    {
        this._encoding = encoding;
    }

    /**
     * @return the _custom1id
     */
    public String getCustom1Id()
    {
        return _custom1id;
    }

    /**
     * @param custom1Id the _custom1id to set
     */
    public void setCustom1Id(String custom1Id)
    {
        this._custom1id = custom1Id;
    }
    
    /**
     * @return the _custom2id
     */
    public String getCustom2Id()
    {
        return _custom2id;
    }

    /**
     * @param custom2Id the _custom2id to set
     */
    public void setCustom2Id(String custom2Id)
    {
        this._custom2id = custom2Id;
    }
    
    /**
     * @return the _custom3id
     */
    public String getCustom3Id()
    {
        return _custom3id;
    }

    /**
     * @param custom3Id the _custom3id to set
     */
    public void setCustom3Id(String custom3Id)
    {
        this._custom3id = custom3Id;
    }
    
    /**
     * @return the _custom4id
     */
    public String getCustom4Id()
    {
        return _custom4id;
    }

    /**
     * @param custom4Id the _custom4id to set
     */
    public void setCustom4Id(String custom4Id)
    {
        this._custom4id = custom4Id;
    }
    
    /**
     * @return the _custom5id
     */
    public String getCustom5Id()
    {
        return _custom5id;
    }

    /**
     * @param custom5Id the _custom5id to set
     */
    public void setCustom5Id(String custom5Id)
    {
        this._custom5id = custom5Id;
    }
    
    
    /**
     * @return the _custom1
     */
    public String getCustom1()
    {
        return _custom1;
    }
 
   /**
     * @param custom1 the _custom1 to set
     */
    public void setCustom1(String custom1)
    {
        this._custom1 = custom1;
    }
    
    /**
     * @return the _custom2
     */
    public String getCustom2()
    {
        return _custom2;
    }

    /**
     * @param custom2 the _custom2 to set
     */
    public void setCustom2(String custom2)
    {
        this._custom2 = custom2;
    }
    
    /**
     * @return the _custom3
     */
    public String getCustom3()
    {
        return _custom3;
    }

    /**
     * @param custom3 the _custom3 to set
     */
    public void setCustom3(String custom3)
    {
        this._custom3 = custom3;
    }
    
    /**
     * @return the _custom4
     */
    public String getCustom4()
    {
        return _custom4;
    }

    /**
     * @param custom4 the _custom4 to set
     */
    public void setCustom4(String custom4)
    {
        this._custom4 = custom4;
    }
    
    /**
     * @return the _custom5
     */
    public String getCustom5()
    {
        return _custom5;
    }

    /**
     * @param custom5 the _custom5 to set
     */
    public void setCustom5(String custom5)
    {
        this._custom5 = custom5;
    }
    
    /**
     * @return the _permissions
     */
    public LearningObjectInstancePermissions getPermissions()
    {
        return _permissions;
    }

    /**
     * @param permissions the _permissions to set
     */
    public void setPermissions(String permissions)
    {
        permissions = permissions.toUpperCase();
        String[] permissionsSplit = permissions.split(",");
        _permissions.addPermission(permissionsSplit);
    }

    /**
     * @return the _timestamp
     */
    public String getTimestamp()
    {
        return _timestamp;
    }

    /**
     * @param timestamp the _timestamp to set
     */
    public void setTimestamp(String timestamp)
    {
        this._timestamp = timestamp;
    }

    /**
     * @return the _signature
     */
    public String getSignature()
    {
        return _signature;
    }

    /**
     * @param signature the _signature to set
     */
    public void setSignature(String signature)
    {
        this._signature = signature;
    }

    /**
     * Gets the userRole
     * @return
     */
    public String getRole()
    {
        return _role;
    }

    /**
     * Sets the userRole
     * @param userRole
     */
    public void setRole(String userRole)
    {
        this._role = userRole;
    }

    /**
     * Get externalLicenseIds
     * @return
     */
    public String getExternalLicenseIds()
    {
        return _externalLicenseIds;
    }

    /**
     *
     * @param externalLicenseIds
     */
    public void setExternalLicenseIds(String externalLicenseIds)
    {
        this._externalLicenseIds = externalLicenseIds;
    }

    /**
     * Gets licenseIds
     * @return
     */
    public String getLicenseIds()
    {
        return _licenseIds;
    }

    /**
     * 
     * @param licenseIds
     */
    public void setLicenseIds(String licenseIds)
    {
        this._licenseIds = licenseIds;
    }
}
