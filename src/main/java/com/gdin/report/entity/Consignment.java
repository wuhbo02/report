package com.gdin.report.entity;

import java.math.BigDecimal;

public class Consignment {
    private BigDecimal consignmentId;

    private String transportcontractdocumentId;

    private String associatedtransportdocument;

    private String grossvolumemeasure;

    private String valueamount;

    private String currencytypecode;

    private String loadinglocationid;

    private String loadingdate;

    private String unloadinglocationid;

    private String arrivaldate;

    private String goodsreceiptplaceid;

    private String goodsreceiptplacename;

    private String transhipmentlocationid;

    private String transitdestinationid;

    private String goodsconsignedplaceid;

    private String transportsplitindicator;

    private String freightpayment;

    private String packagingtypecode;

    private String packagingquantity;

    private String totalgrossmassmeasure;

    private String precustdocumentid;

    private String precustdocumenttypecode;

    private String deliverydestinationId;

    private String handlinginstructionscode;

    private String intermediatecarrierId;

    private String consigneeId;

    private String contactId;

    private String consignorId;

    private String notifypartyId;

    private String undgcontactId;

    private BigDecimal changeconsignmentId;

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getTransportcontractdocumentId() {
        return transportcontractdocumentId;
    }

    public void setTransportcontractdocumentId(String transportcontractdocumentId) {
        this.transportcontractdocumentId = transportcontractdocumentId == null ? null : transportcontractdocumentId.trim();
    }

    public String getAssociatedtransportdocument() {
        return associatedtransportdocument;
    }

    public void setAssociatedtransportdocument(String associatedtransportdocument) {
        this.associatedtransportdocument = associatedtransportdocument == null ? null : associatedtransportdocument.trim();
    }

    public String getGrossvolumemeasure() {
        return grossvolumemeasure;
    }

    public void setGrossvolumemeasure(String grossvolumemeasure) {
        this.grossvolumemeasure = grossvolumemeasure == null ? null : grossvolumemeasure.trim();
    }

    public String getValueamount() {
        return valueamount;
    }

    public void setValueamount(String valueamount) {
        this.valueamount = valueamount == null ? null : valueamount.trim();
    }

    public String getCurrencytypecode() {
        return currencytypecode;
    }

    public void setCurrencytypecode(String currencytypecode) {
        this.currencytypecode = currencytypecode == null ? null : currencytypecode.trim();
    }

    public String getLoadinglocationid() {
        return loadinglocationid;
    }

    public void setLoadinglocationid(String loadinglocationid) {
        this.loadinglocationid = loadinglocationid == null ? null : loadinglocationid.trim();
    }

    public String getLoadingdate() {
        return loadingdate;
    }

    public void setLoadingdate(String loadingdate) {
        this.loadingdate = loadingdate == null ? null : loadingdate.trim();
    }

    public String getUnloadinglocationid() {
        return unloadinglocationid;
    }

    public void setUnloadinglocationid(String unloadinglocationid) {
        this.unloadinglocationid = unloadinglocationid == null ? null : unloadinglocationid.trim();
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate == null ? null : arrivaldate.trim();
    }

    public String getGoodsreceiptplaceid() {
        return goodsreceiptplaceid;
    }

    public void setGoodsreceiptplaceid(String goodsreceiptplaceid) {
        this.goodsreceiptplaceid = goodsreceiptplaceid == null ? null : goodsreceiptplaceid.trim();
    }

    public String getGoodsreceiptplacename() {
        return goodsreceiptplacename;
    }

    public void setGoodsreceiptplacename(String goodsreceiptplacename) {
        this.goodsreceiptplacename = goodsreceiptplacename == null ? null : goodsreceiptplacename.trim();
    }

    public String getTranshipmentlocationid() {
        return transhipmentlocationid;
    }

    public void setTranshipmentlocationid(String transhipmentlocationid) {
        this.transhipmentlocationid = transhipmentlocationid == null ? null : transhipmentlocationid.trim();
    }

    public String getTransitdestinationid() {
        return transitdestinationid;
    }

    public void setTransitdestinationid(String transitdestinationid) {
        this.transitdestinationid = transitdestinationid == null ? null : transitdestinationid.trim();
    }

    public String getGoodsconsignedplaceid() {
        return goodsconsignedplaceid;
    }

    public void setGoodsconsignedplaceid(String goodsconsignedplaceid) {
        this.goodsconsignedplaceid = goodsconsignedplaceid == null ? null : goodsconsignedplaceid.trim();
    }

    public String getTransportsplitindicator() {
        return transportsplitindicator;
    }

    public void setTransportsplitindicator(String transportsplitindicator) {
        this.transportsplitindicator = transportsplitindicator == null ? null : transportsplitindicator.trim();
    }

    public String getFreightpayment() {
        return freightpayment;
    }

    public void setFreightpayment(String freightpayment) {
        this.freightpayment = freightpayment == null ? null : freightpayment.trim();
    }

    public String getPackagingtypecode() {
        return packagingtypecode;
    }

    public void setPackagingtypecode(String packagingtypecode) {
        this.packagingtypecode = packagingtypecode == null ? null : packagingtypecode.trim();
    }

    public String getPackagingquantity() {
        return packagingquantity;
    }

    public void setPackagingquantity(String packagingquantity) {
        this.packagingquantity = packagingquantity == null ? null : packagingquantity.trim();
    }

    public String getTotalgrossmassmeasure() {
        return totalgrossmassmeasure;
    }

    public void setTotalgrossmassmeasure(String totalgrossmassmeasure) {
        this.totalgrossmassmeasure = totalgrossmassmeasure == null ? null : totalgrossmassmeasure.trim();
    }

    public String getPrecustdocumentid() {
        return precustdocumentid;
    }

    public void setPrecustdocumentid(String precustdocumentid) {
        this.precustdocumentid = precustdocumentid == null ? null : precustdocumentid.trim();
    }

    public String getPrecustdocumenttypecode() {
        return precustdocumenttypecode;
    }

    public void setPrecustdocumenttypecode(String precustdocumenttypecode) {
        this.precustdocumenttypecode = precustdocumenttypecode == null ? null : precustdocumenttypecode.trim();
    }

    public String getDeliverydestinationId() {
        return deliverydestinationId;
    }

    public void setDeliverydestinationId(String deliverydestinationId) {
        this.deliverydestinationId = deliverydestinationId == null ? null : deliverydestinationId.trim();
    }

    public String getHandlinginstructionscode() {
        return handlinginstructionscode;
    }

    public void setHandlinginstructionscode(String handlinginstructionscode) {
        this.handlinginstructionscode = handlinginstructionscode == null ? null : handlinginstructionscode.trim();
    }

    public String getIntermediatecarrierId() {
        return intermediatecarrierId;
    }

    public void setIntermediatecarrierId(String intermediatecarrierId) {
        this.intermediatecarrierId = intermediatecarrierId == null ? null : intermediatecarrierId.trim();
    }

    public String getConsigneeId() {
        return consigneeId;
    }

    public void setConsigneeId(String consigneeId) {
        this.consigneeId = consigneeId == null ? null : consigneeId.trim();
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId == null ? null : contactId.trim();
    }

    public String getConsignorId() {
        return consignorId;
    }

    public void setConsignorId(String consignorId) {
        this.consignorId = consignorId == null ? null : consignorId.trim();
    }

    public String getNotifypartyId() {
        return notifypartyId;
    }

    public void setNotifypartyId(String notifypartyId) {
        this.notifypartyId = notifypartyId == null ? null : notifypartyId.trim();
    }

    public String getUndgcontactId() {
        return undgcontactId;
    }

    public void setUndgcontactId(String undgcontactId) {
        this.undgcontactId = undgcontactId == null ? null : undgcontactId.trim();
    }

    public BigDecimal getChangeconsignmentId() {
        return changeconsignmentId;
    }

    public void setChangeconsignmentId(BigDecimal changeconsignmentId) {
        this.changeconsignmentId = changeconsignmentId;
    }
}