
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocaleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PhoneList" type="{https://services.alarmnet.com/TC2/}ArrayOfPhoneInfo" minOccurs="0"/>
 *         &lt;element name="EmailList" type="{https://services.alarmnet.com/TC2/}ArrayOfEmailInfo" minOccurs="0"/>
 *         &lt;element name="LocationList" type="{https://services.alarmnet.com/TC2/}ArrayOfLocationInfoBasic_UserEnabled" minOccurs="0"/>
 *         &lt;element name="FeatureInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfUserFeatureCacheInfo" minOccurs="0"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImageChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "userId",
    "userName",
    "passWord",
    "firstName",
    "lastName",
    "localeID",
    "enabled",
    "phoneList",
    "emailList",
    "locationList",
    "featureInfo",
    "resultCode",
    "imageChanged",
    "image",
    "imageId",
    "photoURL",
    "adminAccess"
})
public class UserInfo {

    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "PassWord")
    protected String passWord;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LocaleID")
    protected int localeID;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "PhoneList")
    protected ArrayOfPhoneInfo phoneList;
    @XmlElement(name = "EmailList")
    protected ArrayOfEmailInfo emailList;
    @XmlElement(name = "LocationList")
    protected ArrayOfLocationInfoBasicUserEnabled locationList;
    @XmlElement(name = "FeatureInfo")
    protected ArrayOfUserFeatureCacheInfo featureInfo;
    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElement(name = "ImageChanged")
    protected boolean imageChanged;
    @XmlElement(name = "Image")
    protected byte[] image;
    @XmlElement(name = "ImageId")
    protected long imageId;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "AdminAccess")
    protected int adminAccess;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the passWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Sets the value of the passWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassWord(String value) {
        this.passWord = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the localeID property.
     * 
     */
    public int getLocaleID() {
        return localeID;
    }

    /**
     * Sets the value of the localeID property.
     * 
     */
    public void setLocaleID(int value) {
        this.localeID = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the phoneList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneInfo }
     *     
     */
    public ArrayOfPhoneInfo getPhoneList() {
        return phoneList;
    }

    /**
     * Sets the value of the phoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneInfo }
     *     
     */
    public void setPhoneList(ArrayOfPhoneInfo value) {
        this.phoneList = value;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailInfo }
     *     
     */
    public ArrayOfEmailInfo getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailInfo }
     *     
     */
    public void setEmailList(ArrayOfEmailInfo value) {
        this.emailList = value;
    }

    /**
     * Gets the value of the locationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationInfoBasicUserEnabled }
     *     
     */
    public ArrayOfLocationInfoBasicUserEnabled getLocationList() {
        return locationList;
    }

    /**
     * Sets the value of the locationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationInfoBasicUserEnabled }
     *     
     */
    public void setLocationList(ArrayOfLocationInfoBasicUserEnabled value) {
        this.locationList = value;
    }

    /**
     * Gets the value of the featureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserFeatureCacheInfo }
     *     
     */
    public ArrayOfUserFeatureCacheInfo getFeatureInfo() {
        return featureInfo;
    }

    /**
     * Sets the value of the featureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserFeatureCacheInfo }
     *     
     */
    public void setFeatureInfo(ArrayOfUserFeatureCacheInfo value) {
        this.featureInfo = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the imageChanged property.
     * 
     */
    public boolean isImageChanged() {
        return imageChanged;
    }

    /**
     * Sets the value of the imageChanged property.
     * 
     */
    public void setImageChanged(boolean value) {
        this.imageChanged = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     */
    public long getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     */
    public void setImageId(long value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the adminAccess property.
     * 
     */
    public int getAdminAccess() {
        return adminAccess;
    }

    /**
     * Sets the value of the adminAccess property.
     * 
     */
    public void setAdminAccess(int value) {
        this.adminAccess = value;
    }

}
