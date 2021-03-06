//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityOfPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityOfPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HorizontalAcc" type="{http://www.opengis.net/xls}HorAccType"/>
 *         &lt;element name="VerticalAcc" type="{http://www.opengis.net/xls}VerAccType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="responseReq" default="Delay_Tol">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="No_Delay"/>
 *             &lt;enumeration value="Low_Delay"/>
 *             &lt;enumeration value="Delay_Tol"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="responseTimer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityOfPositionType", propOrder = {
    "horizontalAcc",
    "verticalAcc"
})
public class QualityOfPositionType {

    @XmlElement(name = "HorizontalAcc", required = true)
    protected HorAccType horizontalAcc;
    @XmlElement(name = "VerticalAcc", required = true)
    protected VerAccType verticalAcc;
    @XmlAttribute(name = "responseReq")
    protected String responseReq;
    @XmlAttribute(name = "responseTimer")
    protected String responseTimer;

    /**
     * Gets the value of the horizontalAcc property.
     * 
     * @return
     *     possible object is
     *     {@link HorAccType }
     *     
     */
    public HorAccType getHorizontalAcc() {
        return horizontalAcc;
    }

    /**
     * Sets the value of the horizontalAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HorAccType }
     *     
     */
    public void setHorizontalAcc(HorAccType value) {
        this.horizontalAcc = value;
    }

    /**
     * Gets the value of the verticalAcc property.
     * 
     * @return
     *     possible object is
     *     {@link VerAccType }
     *     
     */
    public VerAccType getVerticalAcc() {
        return verticalAcc;
    }

    /**
     * Sets the value of the verticalAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerAccType }
     *     
     */
    public void setVerticalAcc(VerAccType value) {
        this.verticalAcc = value;
    }

    /**
     * Gets the value of the responseReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReq() {
        if (responseReq == null) {
            return "Delay_Tol";
        } else {
            return responseReq;
        }
    }

    /**
     * Sets the value of the responseReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReq(String value) {
        this.responseReq = value;
    }

    /**
     * Gets the value of the responseTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTimer() {
        return responseTimer;
    }

    /**
     * Sets the value of the responseTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTimer(String value) {
        this.responseTimer = value;
    }

}
