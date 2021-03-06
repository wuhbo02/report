//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 09:20:48 上午 CST 
//


package com.gdin.report.dto.exp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * 集装箱（器）信息
 * 
 * <p>Java class for TransportEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentIdentification" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}EquipmentIdentification"/>
 *         &lt;element name="CharacteristicCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="SupplierPartyTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FullnessCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="SealID" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipment", propOrder = {
        "equipmentIdentification",
        "loadingLocation",
        "characteristicCode",
        "supplierPartyTypeCode",
        "fullnessCode",
        "sealIDList",
        "consignment",
        "damage",
        "transportMeans"
})
public class TransportEquipment {

    @XmlElement(name = "EquipmentIdentification")
    protected EquipmentIdentification equipmentIdentification;

    @XmlElement(name = "LoadingLocation")
    protected LoadingLocation loadingLocation;
    @XmlElement(name = "CharacteristicCode")
    protected String characteristicCode;
    @XmlElement(name = "SupplierPartyTypeCode")
    protected String supplierPartyTypeCode;
    @XmlElement(name = "FullnessCode")
    protected String fullnessCode;
    @XmlElement(name = "SealID")
    protected List<SealID> sealIDList;

    public List<Consignment> getConsignment() {
        return consignment;
    }

    public void setConsignment(List<Consignment> consignment) {
        this.consignment = consignment;
    }

    @XmlElement(name = "Consignment")
    protected List<Consignment> consignment;

    @XmlElement(name = "Damage")
    protected List<Damage> damage;
    @XmlElement(name = "TransportMeans")
    protected TransportMeans transportMeans;



    public List<Damage> getDamage() {
        return damage;
    }

    public void setDamage(List<Damage> damage) {
        this.damage = damage;
    }



    public TransportMeans getTransportMeans() {
        return transportMeans;
    }

    public void setTransportMeans(TransportMeans transportMeans) {
        this.transportMeans = transportMeans;
    }


    public LoadingLocation getLoadingLocation() {
        return loadingLocation;
    }

    public void setLoadingLocation(LoadingLocation loadingLocation) {
        this.loadingLocation = loadingLocation;
    }


    /**
     * Gets the value of the equipmentIdentification property.
     * 
     * @return
     *     possible String is
     *     {@link EquipmentIdentification }
     *     
     */
    public EquipmentIdentification getEquipmentIdentification() {
        return equipmentIdentification;
    }

    /**
     * Sets the value of the equipmentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentIdentification }
     *     
     */
    public void setEquipmentIdentification(EquipmentIdentification value) {
        this.equipmentIdentification = value;
    }

    /**
     * Gets the value of the characteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Sets the value of the characteristicCode property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setCharacteristicCode(String value) {
        this.characteristicCode = value;
    }

    /**
     * Gets the value of the supplierPartyTypeCode property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getSupplierPartyTypeCode() {
        return supplierPartyTypeCode;
    }

    /**
     * Sets the value of the supplierPartyTypeCode property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setSupplierPartyTypeCode(String value) {
        this.supplierPartyTypeCode = value;
    }

    /**
     * Gets the value of the fullnessCode property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getFullnessCode() {
        return fullnessCode;
    }

    /**
     * Sets the value of the fullnessCode property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setFullnessCode(String value) {
        this.fullnessCode = value;
    }


    public void setSealIDList(List<SealID> sealIDList) {
        this.sealIDList = sealIDList;
    }

    /**
     * Gets the value of the sealID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sealID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSealID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SealID }
     * 
     * 
     */
    public List<SealID> getSealIDList() {
        if (sealIDList == null) {
            sealIDList = new ArrayList<SealID>();
        }
        return this.sealIDList;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AgencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SealID {

        @XmlAttribute(name = "AgencyCode")
        protected String agencyCode;
        @XmlValue
        protected String sealid;

        public String getSealid() {
            return sealid;
        }

        public void setSealid(String sealid) {
            this.sealid = sealid;
        }



        /**
         * Gets the value of the agencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyCode() {
            return agencyCode;
        }

        /**
         * Sets the value of the agencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyCode(String value) {
            this.agencyCode = value;
        }

    }

}
