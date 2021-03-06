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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="BBoxContext" type="{http://www.opengis.net/gml}EnvelopeType"/>
 *         &lt;element name="CenterContext" type="{http://www.opengis.net/xls}CenterContextType"/>
 *       &lt;/choice>
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BGcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transparent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="content" type="{http://www.opengis.net/xls}presentationContentType" default="URL" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputType", propOrder = {
    "bBoxContext",
    "centerContext"
})
public class OutputType {

    @XmlElement(name = "BBoxContext")
    protected EnvelopeType bBoxContext;
    @XmlElement(name = "CenterContext")
    protected CenterContextType centerContext;
    @XmlAttribute(name = "width")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger width;
    @XmlAttribute(name = "height")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger height;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "BGcolor")
    protected String bGcolor;
    @XmlAttribute(name = "transparent")
    protected Boolean transparent;
    @XmlAttribute(name = "content")
    protected PresentationContentType content;

    /**
     * Gets the value of the bBoxContext property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeType }
     *     
     */
    public EnvelopeType getBBoxContext() {
        return bBoxContext;
    }

    /**
     * Sets the value of the bBoxContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeType }
     *     
     */
    public void setBBoxContext(EnvelopeType value) {
        this.bBoxContext = value;
    }

    /**
     * Gets the value of the centerContext property.
     * 
     * @return
     *     possible object is
     *     {@link CenterContextType }
     *     
     */
    public CenterContextType getCenterContext() {
        return centerContext;
    }

    /**
     * Sets the value of the centerContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenterContextType }
     *     
     */
    public void setCenterContext(CenterContextType value) {
        this.centerContext = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the bGcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBGcolor() {
        return bGcolor;
    }

    /**
     * Sets the value of the bGcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBGcolor(String value) {
        this.bGcolor = value;
    }

    /**
     * Gets the value of the transparent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransparent() {
        return transparent;
    }

    /**
     * Sets the value of the transparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransparent(Boolean value) {
        this.transparent = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationContentType }
     *     
     */
    public PresentationContentType getContent() {
        if (content == null) {
            return PresentationContentType.URL;
        } else {
            return content;
        }
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationContentType }
     *     
     */
    public void setContent(PresentationContentType value) {
        this.content = value;
    }

}
