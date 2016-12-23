
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraConfigurationResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraConfigurationResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SYSTEM_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIDEO_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOTION_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IO_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENT_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTZ_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraConfigurationResults", propOrder = {
    "cameraName",
    "featureFlags",
    "systemData",
    "videoData",
    "motionData",
    "ioData",
    "eventData",
    "ptzData"
})
@XmlSeeAlso({
    CameraConfigurationResults2 .class
})
public class CameraConfigurationResults
    extends WebMethodResults
{

    @XmlElement(name = "CameraName")
    protected String cameraName;
    @XmlElement(name = "FeatureFlags")
    protected String featureFlags;
    @XmlElement(name = "SYSTEM_Data")
    protected String systemData;
    @XmlElement(name = "VIDEO_Data")
    protected String videoData;
    @XmlElement(name = "MOTION_Data")
    protected String motionData;
    @XmlElement(name = "IO_Data")
    protected String ioData;
    @XmlElement(name = "EVENT_Data")
    protected String eventData;
    @XmlElement(name = "PTZ_Data")
    protected String ptzData;

    /**
     * Gets the value of the cameraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraName() {
        return cameraName;
    }

    /**
     * Sets the value of the cameraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraName(String value) {
        this.cameraName = value;
    }

    /**
     * Gets the value of the featureFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureFlags() {
        return featureFlags;
    }

    /**
     * Sets the value of the featureFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureFlags(String value) {
        this.featureFlags = value;
    }

    /**
     * Gets the value of the systemData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMData() {
        return systemData;
    }

    /**
     * Sets the value of the systemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMData(String value) {
        this.systemData = value;
    }

    /**
     * Gets the value of the videoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIDEOData() {
        return videoData;
    }

    /**
     * Sets the value of the videoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIDEOData(String value) {
        this.videoData = value;
    }

    /**
     * Gets the value of the motionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIONData() {
        return motionData;
    }

    /**
     * Sets the value of the motionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIONData(String value) {
        this.motionData = value;
    }

    /**
     * Gets the value of the ioData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOData() {
        return ioData;
    }

    /**
     * Sets the value of the ioData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIOData(String value) {
        this.ioData = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTData(String value) {
        this.eventData = value;
    }

    /**
     * Gets the value of the ptzData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTZData() {
        return ptzData;
    }

    /**
     * Sets the value of the ptzData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTZData(String value) {
        this.ptzData = value;
    }

}
