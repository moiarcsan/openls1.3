//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleType.N complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleType.N">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleValue" type="{http://www.opengis.net/ols/nav}VehicleTypeValue"/>
 *         &lt;element name="VehicleName" type="{http://www.opengis.net/ols/nav}VehicleTypeName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Exclusionary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType.N", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "vehicleValue",
    "vehicleName"
})
public class VehicleTypeN {

    @XmlElement(name = "VehicleValue", required = true)
    protected BigInteger vehicleValue;
    @XmlElement(name = "VehicleName")
    protected String vehicleName;
    @XmlAttribute(name = "Exclusionary")
    protected Boolean exclusionary;

    /**
     * Gets the value of the vehicleValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleValue() {
        return vehicleValue;
    }

    /**
     * Sets the value of the vehicleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleValue(BigInteger value) {
        this.vehicleValue = value;
    }

    /**
     * Gets the value of the vehicleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * Sets the value of the vehicleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleName(String value) {
        this.vehicleName = value;
    }

    /**
     * Gets the value of the exclusionary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExclusionary() {
        if (exclusionary == null) {
            return false;
        } else {
            return exclusionary;
        }
    }

    /**
     * Sets the value of the exclusionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusionary(Boolean value) {
        this.exclusionary = value;
    }

}
