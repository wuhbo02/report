//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:14:17 下午 CST 
//


package com.gdin.report.dto.exp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 船舶贝位信息
 * 
 * <p>Java class for TransportMeans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StowageLocationID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeans", propOrder = {
    "stowageLocationID"
})
public class TransportMeans {

    @XmlElement(name = "StowageLocationID", required = true)
    protected String stowageLocationID;

    /**
     * Gets the value of the stowageLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStowageLocationID() {
        return stowageLocationID;
    }

    /**
     * Sets the value of the stowageLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStowageLocationID(String value) {
        this.stowageLocationID = value;
    }

}
