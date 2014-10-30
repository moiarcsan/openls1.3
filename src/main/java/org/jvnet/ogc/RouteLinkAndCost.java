//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteLinkAndCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteLinkAndCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Link" type="{http://www.opengis.net/ols/nav}AbstractIDType"/>
 *         &lt;element name="EstLinkTravelTime" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="NodeTravelTime" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLinkAndCost", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "link",
    "estLinkTravelTime",
    "nodeTravelTime"
})
public class RouteLinkAndCost {

    @XmlElement(name = "Link", required = true)
    protected AbstractIDType link;
    @XmlElement(name = "EstLinkTravelTime", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger estLinkTravelTime;
    @XmlElement(name = "NodeTravelTime")
    @XmlSchemaType(name = "unsignedShort")
    protected int nodeTravelTime;

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIDType }
     *     
     */
    public AbstractIDType getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIDType }
     *     
     */
    public void setLink(AbstractIDType value) {
        this.link = value;
    }

    /**
     * Gets the value of the estLinkTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEstLinkTravelTime() {
        return estLinkTravelTime;
    }

    /**
     * Sets the value of the estLinkTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEstLinkTravelTime(BigInteger value) {
        this.estLinkTravelTime = value;
    }

    /**
     * Gets the value of the nodeTravelTime property.
     * 
     */
    public int getNodeTravelTime() {
        return nodeTravelTime;
    }

    /**
     * Sets the value of the nodeTravelTime property.
     * 
     */
    public void setNodeTravelTime(int value) {
        this.nodeTravelTime = value;
    }

}
