//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The cursor is considered to be positioned in a gap between records.  Gap number 0 is the gap before the first record.  Gap number J is the gap between the Jth and (J+1)st records.  If there are N records in total, gap number N is the gap after the last record. The value returned by this request is the current cursor position.
 * 
 * <p>Java class for GetCursorPositionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCursorPositionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractRequestParametersType">
 *       &lt;sequence>
 *         &lt;element name="CursorID" type="{http://www.opengis.net/ols/nav}CursorIDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="priority" use="required" type="{http://www.opengis.net/ols/nav}PriorityType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCursorPositionRequest", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "cursorID"
})
public class GetCursorPositionRequest
    extends AbstractRequestParametersType
{

    @XmlElement(name = "CursorID", required = true)
    protected CursorIDType cursorID;
    @XmlAttribute(name = "priority", required = true)
    protected int priority;

    /**
     * Gets the value of the cursorID property.
     * 
     * @return
     *     possible object is
     *     {@link CursorIDType }
     *     
     */
    public CursorIDType getCursorID() {
        return cursorID;
    }

    /**
     * Sets the value of the cursorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorIDType }
     *     
     */
    public void setCursorID(CursorIDType value) {
        this.cursorID = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

}