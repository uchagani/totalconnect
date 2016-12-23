
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationStatusResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="NotificationStatus" type="{https://services.alarmnet.com/TC2/}NotificationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationStatusResult", propOrder = {
    "notificationStatus"
})
public class NotificationStatusResult
    extends WebMethodResults
{

    @XmlElement(name = "NotificationStatus")
    protected NotificationStatus notificationStatus;

    /**
     * Gets the value of the notificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus }
     *     
     */
    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    /**
     * Sets the value of the notificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus }
     *     
     */
    public void setNotificationStatus(NotificationStatus value) {
        this.notificationStatus = value;
    }

}
