//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A CircleByCenterPoint is an ArcByCenterPoint with identical start and end angle to form a full circle. Again, this represenation can be used only in 2D.
 * 
 * <p>Java class for CircleByCenterPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CircleByCenterPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}ArcByCenterPointType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleByCenterPointType", namespace = "http://www.opengis.net/gml")
public class CircleByCenterPointType
    extends ArcByCenterPointType
{


}
