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
 * <p>Java class for GetCursorPositionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCursorPositionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractResponseParametersType">
 *       &lt;sequence>
 *         &lt;element name="CursorPosition" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCursorPositionResponse", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "cursorPosition"
})
public class GetCursorPositionResponse
    extends AbstractResponseParametersType
{

    @XmlElement(name = "CursorPosition")
    protected long cursorPosition;

    /**
     * Gets the value of the cursorPosition property.
     * 
     */
    public long getCursorPosition() {
        return cursorPosition;
    }

    /**
     * Sets the value of the cursorPosition property.
     * 
     */
    public void setCursorPosition(long value) {
        this.cursorPosition = value;
    }

}
