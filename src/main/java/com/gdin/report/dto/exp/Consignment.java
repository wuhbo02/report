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
 * 提（运）单数据段
 * 
 * <p>Java class for Consignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportContractDocument" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}TransportContractDocument"/>
 *         &lt;element name="AssociatedTransportDocument" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}AssociatedTransportDocument" minOccurs="0"/>
 *         &lt;element name="GrossVolumeMeasure" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ValueAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CurrencyTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LoadingLocation" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}LoadingLocation"/>
 *         &lt;element name="UnloadingLocation" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}UnloadingLocation"/>
 *         &lt;element name="GoodsReceiptPlace" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}GoodsReceiptPlace" minOccurs="0"/>
 *         &lt;element name="TranshipmentLocation" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}TranshipmentLocation" minOccurs="0"/>
 *         &lt;element name="TransitDestination" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}TransitDestination" minOccurs="0"/>
 *         &lt;element name="RoutingCountryCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="GoodsConsignedPlace" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}GoodsConsignedPlace" minOccurs="0"/>
 *         &lt;element name="CustomsStatusCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="TransportSplitIndicator" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="FreightPayment" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}FreightPayment"/>
 *         &lt;element name="ConsignmentPackaging" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}ConsignmentPackaging"/>
 *         &lt;element name="TotalGrossMassMeasure" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PreviousCustomsDocument" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}PreviousCustomsDocument" minOccurs="0"/>
 *         &lt;element name="DeliveryDestination" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}DeliveryDestinationAddress" minOccurs="0"/>
 *         &lt;element name="Handling" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Handling" minOccurs="0"/>
 *         &lt;element name="IntermediateCarrier" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}IntermediateCarrier" minOccurs="0"/>
 *         &lt;element name="Consignee" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Consignee" minOccurs="0"/>
 *         &lt;element name="Consignor" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Consignor"/>
 *         &lt;element name="NotifyParty" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}NotifyParty" minOccurs="0"/>
 *         &lt;element name="UNDGContact" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}UNDGContact" minOccurs="0"/>
 *         &lt;element name="TransportEquipment" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}TransportEquipment" maxOccurs="9999" minOccurs="0"/>
 *         &lt;element name="ConsignmentItem" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}ConsignmentItem" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignment", propOrder = {
        "transportContractDocument",
        "associatedTransportDocument",
        "grossVolumeMeasure",
        "valueAmount",
        "loadingLocation",
        "unloadingLocation",
        "goodsReceiptPlace",
        "transhipmentLocation",
        "transitDestination",
        "routingCountryCode",
        "goodsConsignedPlace",
        "customsStatusCode",
        "freightPayment",
        "consignmentPackaging",
        "totalGrossMassMeasure",
        "previousCustomsDocument",
        "deliveryDestination",
        "handling",
        "intermediateCarrier",
        "consignee",
        "consignor",
        "notifyParty",
        "undgContact",
        "transportEquipment",
        "consignmentItem",
        "borderTransportMeans"
})
public class Consignment {

    @XmlElement(name = "TransportContractDocument")
    protected TransportContractDocument transportContractDocument;
    @XmlElement(name = "AssociatedTransportDocument")
    protected AssociatedTransportDocument associatedTransportDocument;
    @XmlElement(name = "GrossVolumeMeasure")
    protected String grossVolumeMeasure;
    @XmlElement(name = "ValueAmount")
    protected ValueAmount valueAmount;
    @XmlElement(name = "LoadingLocation")
    protected LoadingLocation loadingLocation;
    @XmlElement(name = "UnloadingLocation")
    protected UnloadingLocation unloadingLocation;
    @XmlElement(name = "GoodsReceiptPlace")
    protected GoodsReceiptPlace goodsReceiptPlace;
    @XmlElement(name = "TranshipmentLocation")
    protected TranshipmentLocation transhipmentLocation;
    @XmlElement(name = "TransitDestination")
    protected TransitDestination transitDestination;
    @XmlElement(name = "RoutingCountryCode")
    protected List<String> routingCountryCode;
    @XmlElement(name = "GoodsConsignedPlace")
    protected GoodsConsignedPlace goodsConsignedPlace;
    @XmlElement(name = "CustomsStatusCode")
    protected List<String> customsStatusCode;
    @XmlElement(name = "FreightPayment")
    protected FreightPayment freightPayment;
    @XmlElement(name = "ConsignmentPackaging")
    protected ConsignmentPackaging consignmentPackaging;
    @XmlElement(name = "TotalGrossMassMeasure")
    protected String totalGrossMassMeasure;
    @XmlElement(name = "PreviousCustomsDocument")
    protected PreviousCustomsDocument previousCustomsDocument;
    @XmlElement(name = "DeliveryDestination")
    protected DeliveryDestinationAddress deliveryDestination;
    @XmlElement(name = "Handling")
    protected Handling handling;
    @XmlElement(name = "IntermediateCarrier")
    protected IntermediateCarrier intermediateCarrier;
    @XmlElement(name = "Consignee")
    protected Consignee consignee;
    @XmlElement(name = "Consignor")
    protected Consignor consignor;
    @XmlElement(name = "NotifyParty")
    protected NotifyParty notifyParty;
    @XmlElement(name = "UNDGContact")
    protected UNDGContact undgContact;
    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipment> transportEquipment;
    @XmlElement(name = "ConsignmentItem")
    protected List<ConsignmentItem> consignmentItem;

    @XmlElement(name = "BorderTransportMeans")
    protected List<BorderTransportMeans> borderTransportMeans;

    /**
     * Gets the value of the transportContractDocument property.
     * 
     * @return
     *     possible object is
     *     {@link TransportContractDocument }
     *     
     */
    public TransportContractDocument getTransportContractDocument() {
        return transportContractDocument;
    }

    /**
     * Sets the value of the transportContractDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportContractDocument }
     *     
     */
    public void setTransportContractDocument(TransportContractDocument value) {
        this.transportContractDocument = value;
    }

    /**
     * Gets the value of the associatedTransportDocument property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedTransportDocument }
     *     
     */
    public AssociatedTransportDocument getAssociatedTransportDocument() {
        return associatedTransportDocument;
    }

    /**
     * Sets the value of the associatedTransportDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedTransportDocument }
     *     
     */
    public void setAssociatedTransportDocument(AssociatedTransportDocument value) {
        this.associatedTransportDocument = value;
    }

    /**
     * Gets the value of the grossVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Sets the value of the grossVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossVolumeMeasure(  String value) {
        this.grossVolumeMeasure = value;
    }

    /**
     * Gets the value of the valueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAmount }
     *     
     */
    public ValueAmount getValueAmount() {
        return valueAmount;
    }

    /**
     * Sets the value of the valueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAmount }
     *     
     */
    public void setValueAmount(ValueAmount value) {
        this.valueAmount = value;
    }

    /**
     * Gets the value of the loadingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingLocation }
     *     
     */
    public LoadingLocation getLoadingLocation() {
        return loadingLocation;
    }

    /**
     * Sets the value of the loadingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingLocation }
     *     
     */
    public void setLoadingLocation(LoadingLocation value) {
        this.loadingLocation = value;
    }

    /**
     * Gets the value of the unloadingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link UnloadingLocation }
     *     
     */
    public UnloadingLocation getUnloadingLocation() {
        return unloadingLocation;
    }

    /**
     * Sets the value of the unloadingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnloadingLocation }
     *     
     */
    public void setUnloadingLocation(UnloadingLocation value) {
        this.unloadingLocation = value;
    }

    /**
     * Gets the value of the goodsReceiptPlace property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsReceiptPlace }
     *     
     */
    public GoodsReceiptPlace getGoodsReceiptPlace() {
        return goodsReceiptPlace;
    }

    /**
     * Sets the value of the goodsReceiptPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsReceiptPlace }
     *     
     */
    public void setGoodsReceiptPlace(GoodsReceiptPlace value) {
        this.goodsReceiptPlace = value;
    }

    /**
     * Gets the value of the transhipmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TranshipmentLocation }
     *     
     */
    public TranshipmentLocation getTranshipmentLocation() {
        return transhipmentLocation;
    }

    /**
     * Sets the value of the transhipmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranshipmentLocation }
     *     
     */
    public void setTranshipmentLocation(TranshipmentLocation value) {
        this.transhipmentLocation = value;
    }

    /**
     * Gets the value of the transitDestination property.
     * 
     * @return
     *     possible object is
     *     {@link TransitDestination }
     *     
     */
    public TransitDestination getTransitDestination() {
        return transitDestination;
    }

    /**
     * Sets the value of the transitDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDestination }
     *     
     */
    public void setTransitDestination(TransitDestination value) {
        this.transitDestination = value;
    }

    /**
     * Gets the value of the routingCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<String> getRoutingCountryCode() {
        if (routingCountryCode == null) {
            routingCountryCode = new ArrayList<String>();
        }
        return this.routingCountryCode;
    }

    /**
     * Gets the value of the goodsConsignedPlace property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsConsignedPlace }
     *     
     */
    public GoodsConsignedPlace getGoodsConsignedPlace() {
        return goodsConsignedPlace;
    }

    /**
     * Sets the value of the goodsConsignedPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsConsignedPlace }
     *     
     */
    public void setGoodsConsignedPlace(GoodsConsignedPlace value) {
        this.goodsConsignedPlace = value;
    }

    /**
     * Gets the value of the customsStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<String> getCustomsStatusCode() {
        if (customsStatusCode == null) {
            customsStatusCode = new ArrayList<String>();
        }
        return this.customsStatusCode;
    }

    /**
     * Gets the value of the freightPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPayment }
     *     
     */
    public FreightPayment getFreightPayment() {
        return freightPayment;
    }

    /**
     * Sets the value of the freightPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPayment }
     *     
     */
    public void setFreightPayment(FreightPayment value) {
        this.freightPayment = value;
    }

    /**
     * Gets the value of the consignmentPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentPackaging }
     *     
     */
    public ConsignmentPackaging getConsignmentPackaging() {
        return consignmentPackaging;
    }

    /**
     * Sets the value of the consignmentPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentPackaging }
     *     
     */
    public void setConsignmentPackaging(ConsignmentPackaging value) {
        this.consignmentPackaging = value;
    }

    /**
     * Gets the value of the totalGrossMassMeasure property.
     * 
     * @return
     *     possible   String is
     *     {@link   String }
     *     
     */
    public   String getTotalGrossMassMeasure() {
        return totalGrossMassMeasure;
    }

    /**
     * Sets the value of the totalGrossMassMeasure property.
     * 
     * @param value
     *     allowed   String is
     *     {@link   String }
     *     
     */
    public void setTotalGrossMassMeasure(  String value) {
        this.totalGrossMassMeasure = value;
    }

    /**
     * Gets the value of the previousCustomsDocument property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCustomsDocument }
     *     
     */
    public PreviousCustomsDocument getPreviousCustomsDocument() {
        return previousCustomsDocument;
    }

    /**
     * Sets the value of the previousCustomsDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCustomsDocument }
     *     
     */
    public void setPreviousCustomsDocument(PreviousCustomsDocument value) {
        this.previousCustomsDocument = value;
    }

    /**
     * Gets the value of the deliveryDestination property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDestinationAddress }
     *     
     */
    public DeliveryDestinationAddress getDeliveryDestination() {
        return deliveryDestination;
    }

    /**
     * Sets the value of the deliveryDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDestinationAddress }
     *     
     */
    public void setDeliveryDestination(DeliveryDestinationAddress value) {
        this.deliveryDestination = value;
    }

    /**
     * Gets the value of the handling property.
     * 
     * @return
     *     possible object is
     *     {@link Handling }
     *     
     */
    public Handling getHandling() {
        return handling;
    }

    /**
     * Sets the value of the handling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Handling }
     *     
     */
    public void setHandling(Handling value) {
        this.handling = value;
    }

    /**
     * Gets the value of the intermediateCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateCarrier }
     *     
     */
    public IntermediateCarrier getIntermediateCarrier() {
        return intermediateCarrier;
    }

    /**
     * Sets the value of the intermediateCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateCarrier }
     *     
     */
    public void setIntermediateCarrier(IntermediateCarrier value) {
        this.intermediateCarrier = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link Consignee }
     *     
     */
    public Consignee getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consignee }
     *     
     */
    public void setConsignee(Consignee value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the consignor property.
     * 
     * @return
     *     possible object is
     *     {@link Consignor }
     *     
     */
    public Consignor getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consignor }
     *     
     */
    public void setConsignor(Consignor value) {
        this.consignor = value;
    }

    /**
     * Gets the value of the notifyParty property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyParty }
     *     
     */
    public NotifyParty getNotifyParty() {
        return notifyParty;
    }

    /**
     * Sets the value of the notifyParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyParty }
     *     
     */
    public void setNotifyParty(NotifyParty value) {
        this.notifyParty = value;
    }

    /**
     * Gets the value of the undgContact property.
     * 
     * @return
     *     possible object is
     *     {@link UNDGContact }
     *     
     */
    public UNDGContact getUNDGContact() {
        return undgContact;
    }

    /**
     * Sets the value of the undgContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNDGContact }
     *     
     */
    public void setUNDGContact(UNDGContact value) {
        this.undgContact = value;
    }

    /**
     * Gets the value of the transportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipment }
     * 
     * 
     */
    public List<TransportEquipment> getTransportEquipment() {
        if (transportEquipment == null) {
            transportEquipment = new ArrayList<TransportEquipment>();
        }
        return this.transportEquipment;
    }

    /**
     * Gets the value of the consignmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentItem }
     * 
     * 
     */
    public List<ConsignmentItem> getConsignmentItem() {
        if (consignmentItem == null) {
            consignmentItem = new ArrayList<ConsignmentItem>();
        }
        return this.consignmentItem;
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
     *       &lt;attribute name="CurrencyTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValueAmount {

        @XmlAttribute(name = "CurrencyTypeCode")
        protected String currencyTypeCode;
        @XmlValue
        protected String valueamount;

        public String getValueamount() {
            return valueamount;
        }

        public void setValueamount(String valueamount) {
            this.valueamount = valueamount;
        }


        /**
         * Gets the value of the currencyTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyTypeCode() {
            return currencyTypeCode;
        }

        /**
         * Sets the value of the currencyTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyTypeCode(String value) {
            this.currencyTypeCode = value;
        }

    }

}