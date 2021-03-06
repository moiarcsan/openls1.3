//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIAttributeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POIAttributeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/xls}ReferenceSystem" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/xls}POIInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POIAttributeListType", propOrder = {
    "referenceSystem",
    "poiInfoList"
})
public class POIAttributeListType {

    @XmlElement(name = "ReferenceSystem")
    protected ReferenceSystemType referenceSystem;
    @XmlElement(name = "POIInfoList")
    protected POIInfoListType poiInfoList;

    /**
     * Gets the value of the referenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSystemType }
     *     
     */
    public ReferenceSystemType getReferenceSystem() {
        return referenceSystem;
    }

    /**
     * Sets the value of the referenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSystemType }
     *     
     */
    public void setReferenceSystem(ReferenceSystemType value) {
        this.referenceSystem = value;
    }

    /**
     * Gets the value of the poiInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link POIInfoListType }
     *     
     */
    public POIInfoListType getPOIInfoList() {
        return poiInfoList;
    }

    /**
     * Sets the value of the poiInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIInfoListType }
     *     
     */
    public void setPOIInfoList(POIInfoListType value) {
        this.poiInfoList = value;
    }

}
