//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapObjType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapObjType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cursor" type="{http://www.opengis.net/ols/nav}CursorType"/>
 *         &lt;element name="FirstBucket" type="{http://www.opengis.net/ols/nav}CursorFetchResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapObjType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "cursor",
    "firstBucket"
})
public class MapObjType {

    @XmlElement(name = "Cursor", required = true)
    protected CursorType cursor;
    @XmlElement(name = "FirstBucket")
    protected CursorFetchResponse firstBucket;

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link CursorType }
     *     
     */
    public CursorType getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorType }
     *     
     */
    public void setCursor(CursorType value) {
        this.cursor = value;
    }

    /**
     * Gets the value of the firstBucket property.
     * 
     * @return
     *     possible object is
     *     {@link CursorFetchResponse }
     *     
     */
    public CursorFetchResponse getFirstBucket() {
        return firstBucket;
    }

    /**
     * Sets the value of the firstBucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorFetchResponse }
     *     
     */
    public void setFirstBucket(CursorFetchResponse value) {
        this.firstBucket = value;
    }

}
