//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodeResponseListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeResponseListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeocodedAddress" type="{http://www.opengis.net/xls}GeocodedAddressType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numberOfGeocodedAddresses" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeResponseListType", propOrder = {
    "geocodedAddress"
})
public class GeocodeResponseListType {

    @XmlElement(name = "GeocodedAddress", required = true)
    protected List<GeocodedAddressType> geocodedAddress;
    @XmlAttribute(name = "numberOfGeocodedAddresses", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfGeocodedAddresses;

    /**
     * Gets the value of the geocodedAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geocodedAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeocodedAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeocodedAddressType }
     * 
     * 
     */
    public List<GeocodedAddressType> getGeocodedAddress() {
        if (geocodedAddress == null) {
            geocodedAddress = new ArrayList<GeocodedAddressType>();
        }
        return this.geocodedAddress;
    }

    /**
     * Gets the value of the numberOfGeocodedAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGeocodedAddresses() {
        return numberOfGeocodedAddresses;
    }

    /**
     * Sets the value of the numberOfGeocodedAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGeocodedAddresses(BigInteger value) {
        this.numberOfGeocodedAddresses = value;
    }

}
