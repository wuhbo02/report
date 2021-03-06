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
 * 集装箱（器）残损信息
 * 
 * <p>Java class for Damage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Damage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DamageType" type="{urn:Declaration:datamodel:standard:CN:MT5102:1}DamageType"/>
 *         &lt;element name="DamageArea" type="{urn:Declaration:datamodel:standard:CN:MT5102:1}DamageArea"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Damage", propOrder = {
    "damageType",
    "damageArea",
    "severity"
})
public class Damage {

    @XmlElement(name = "DamageType")
    protected DamageType damageType;
    @XmlElement(name = "DamageArea")
    protected DamageArea damageArea;
    @XmlElement(name = "Severity")
    protected String severity;

    /**
     * Gets the value of the damageType property.
     * 
     * @return
     *     possible object is
     *     {@link DamageType }
     *     
     */
    public DamageType getDamageType() {
        return damageType;
    }

    /**
     * Sets the value of the damageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageType }
     *     
     */
    public void setDamageType(DamageType value) {
        this.damageType = value;
    }

    /**
     * Gets the value of the damageArea property.
     * 
     * @return
     *     possible object is
     *     {@link DamageArea }
     *     
     */
    public DamageArea getDamageArea() {
        return damageArea;
    }

    /**
     * Sets the value of the damageArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageArea }
     *     
     */
    public void setDamageArea(DamageArea value) {
        this.damageArea = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

}
