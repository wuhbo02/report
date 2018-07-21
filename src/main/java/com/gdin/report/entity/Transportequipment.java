package com.gdin.report.entity;

public class Transportequipment {
    private String transportequipmentId;

    private String characteristiccode;

    private String supplierpartytypecode;

    private String fullnesscode;

    private String stowagelocationid;

    private String loadinglocationid;

    private String loadingdate;

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }

    public String getCharacteristiccode() {
        return characteristiccode;
    }

    public void setCharacteristiccode(String characteristiccode) {
        this.characteristiccode = characteristiccode == null ? null : characteristiccode.trim();
    }

    public String getSupplierpartytypecode() {
        return supplierpartytypecode;
    }

    public void setSupplierpartytypecode(String supplierpartytypecode) {
        this.supplierpartytypecode = supplierpartytypecode == null ? null : supplierpartytypecode.trim();
    }

    public String getFullnesscode() {
        return fullnesscode;
    }

    public void setFullnesscode(String fullnesscode) {
        this.fullnesscode = fullnesscode == null ? null : fullnesscode.trim();
    }

    public String getStowagelocationid() {
        return stowagelocationid;
    }

    public void setStowagelocationid(String stowagelocationid) {
        this.stowagelocationid = stowagelocationid == null ? null : stowagelocationid.trim();
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
}