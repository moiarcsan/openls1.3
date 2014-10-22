//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractWayPointType">
 *       &lt;sequence>
 *         &lt;element name="Link" type="{http://www.opengis.net/ols/nav}AbstractIDType"/>
 *         &lt;element name="PositionAlongLink" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.opengis.net/ols/nav}FractionType">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Side" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocusType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "link",
    "positionAlongLink",
    "side"
})
public class LocusType
    extends AbstractWayPointType
{

    @XmlElement(name = "Link", required = true)
    protected AbstractIDType link;
    @XmlElement(name = "PositionAlongLink")
    protected BigDecimal positionAlongLink;
    @XmlElement(name = "Side")
    protected Object side;

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
     * Gets the value of the positionAlongLink property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPositionAlongLink() {
        return positionAlongLink;
    }

    /**
     * Sets the value of the positionAlongLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPositionAlongLink(BigDecimal value) {
        this.positionAlongLink = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSide(Object value) {
        this.side = value;
    }

}