
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverrideSecurityPanelSessionResult" type="{https://services.alarmnet.com/TC2/}WebMethodResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "overrideSecurityPanelSessionResult"
})
@XmlRootElement(name = "OverrideSecurityPanelSessionResponse")
public class OverrideSecurityPanelSessionResponse {

    @XmlElement(name = "OverrideSecurityPanelSessionResult")
    protected WebMethodResults overrideSecurityPanelSessionResult;

    /**
     * Gets the value of the overrideSecurityPanelSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebMethodResults }
     *     
     */
    public WebMethodResults getOverrideSecurityPanelSessionResult() {
        return overrideSecurityPanelSessionResult;
    }

    /**
     * Sets the value of the overrideSecurityPanelSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMethodResults }
     *     
     */
    public void setOverrideSecurityPanelSessionResult(WebMethodResults value) {
        this.overrideSecurityPanelSessionResult = value;
    }

}
