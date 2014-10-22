//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPortrayMapCapabilitiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPortrayMapCapabilitiesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractResponseParametersType">
 *       &lt;sequence>
 *         &lt;element name="AvailableSRS" type="{http://www.opengis.net/xls}AvailableSRSType"/>
 *         &lt;element name="AvailableLayers" type="{http://www.opengis.net/xls}AvailableLayersType"/>
 *         &lt;element name="AvailableFormats" type="{http://www.opengis.net/xls}AvailableFormatsType"/>
 *         &lt;element name="AvailableStyles" type="{http://www.opengis.net/xls}AvailableStylesType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPortrayMapCapabilitiesResponseType", propOrder = {
    "availableSRS",
    "availableLayers",
    "availableFormats",
    "availableStyles"
})
public class GetPortrayMapCapabilitiesResponseType
    extends AbstractResponseParametersType
{

    @XmlElement(name = "AvailableSRS", required = true)
    protected AvailableSRSType availableSRS;
    @XmlElement(name = "AvailableLayers", required = true)
    protected AvailableLayersType availableLayers;
    @XmlElement(name = "AvailableFormats", required = true)
    protected AvailableFormatsType availableFormats;
    @XmlElement(name = "AvailableStyles", required = true)
    protected AvailableStylesType availableStyles;

    /**
     * Gets the value of the availableSRS property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSRSType }
     *     
     */
    public AvailableSRSType getAvailableSRS() {
        return availableSRS;
    }

    /**
     * Sets the value of the availableSRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSRSType }
     *     
     */
    public void setAvailableSRS(AvailableSRSType value) {
        this.availableSRS = value;
    }

    /**
     * Gets the value of the availableLayers property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableLayersType }
     *     
     */
    public AvailableLayersType getAvailableLayers() {
        return availableLayers;
    }

    /**
     * Sets the value of the availableLayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableLayersType }
     *     
     */
    public void setAvailableLayers(AvailableLayersType value) {
        this.availableLayers = value;
    }

    /**
     * Gets the value of the availableFormats property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableFormatsType }
     *     
     */
    public AvailableFormatsType getAvailableFormats() {
        return availableFormats;
    }

    /**
     * Sets the value of the availableFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableFormatsType }
     *     
     */
    public void setAvailableFormats(AvailableFormatsType value) {
        this.availableFormats = value;
    }

    /**
     * Gets the value of the availableStyles property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableStylesType }
     *     
     */
    public AvailableStylesType getAvailableStyles() {
        return availableStyles;
    }

    /**
     * Sets the value of the availableStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableStylesType }
     *     
     */
    public void setAvailableStyles(AvailableStylesType value) {
        this.availableStyles = value;
    }

}