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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractMeasureType">
 *       &lt;attribute name="uom" type="{http://www.opengis.net/xls}SpeedUnitType" default="KPH" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedType")
public class SpeedType
    extends AbstractMeasureType
{

    @XmlAttribute(name = "uom")
    protected SpeedUnitType uom;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedUnitType }
     *     
     */
    public SpeedUnitType getUom() {
        if (uom == null) {
            return SpeedUnitType.KPH;
        } else {
            return uom;
        }
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedUnitType }
     *     
     */
    public void setUom(SpeedUnitType value) {
        this.uom = value;
    }

}
