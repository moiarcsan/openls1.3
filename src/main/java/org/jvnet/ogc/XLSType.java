//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Defines the top element of an XML document representing a message.
 * 
 * <p>Java class for XLSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/xls}_Header"/>
 *         &lt;element ref="{http://www.opengis.net/xls}_Body" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute ref="{http://www.opengis.net/xls}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLSType", propOrder = {
    "header",
    "body"
})
public class XLSType {

    @XmlElementRef(name = "_Header", namespace = "http://www.opengis.net/xls", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractHeaderType> header;
    @XmlElementRef(name = "_Body", namespace = "http://www.opengis.net/xls", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractBodyType>> body;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "lang", namespace = "http://www.opengis.net/xls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractHeaderType> getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractHeaderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     *     
     */
    public void setHeader(JAXBElement<? extends AbstractHeaderType> value) {
        this.header = ((JAXBElement<? extends AbstractHeaderType> ) value);
    }

    /**
     * Gets the value of the body property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the body property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractBodyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractBodyType>> getBody() {
        if (body == null) {
            body = new ArrayList<JAXBElement<? extends AbstractBodyType>>();
        }
        return this.body;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Defines the preferred language used for formatting responses. 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
