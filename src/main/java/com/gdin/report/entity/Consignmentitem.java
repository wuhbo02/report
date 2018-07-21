package com.gdin.report.entity;

import java.math.BigDecimal;

public class Consignmentitem {
    private BigDecimal consignmentitemId;

    private String sequencenumeric;

    private String packageQuantity;

    private String packageTypecode;

    private String packageMarksnumbers;

    private String cargodescription;

    private String undgcode;

    private String tariffclassificationcode;

    private String additionalinformation;

    private String goodsmeasure;

    private String customsprocedure;

    private String origincountrycode;

    public BigDecimal getConsignmentitemId() {
        return consignmentitemId;
    }

    public void setConsignmentitemId(BigDecimal consignmentitemId) {
        this.consignmentitemId = consignmentitemId;
    }

    public String getSequencenumeric() {
        return sequencenumeric;
    }

    public void setSequencenumeric(String sequencenumeric) {
        this.sequencenumeric = sequencenumeric == null ? null : sequencenumeric.trim();
    }

    public String getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(String packageQuantity) {
        this.packageQuantity = packageQuantity == null ? null : packageQuantity.trim();
    }

    public String getPackageTypecode() {
        return packageTypecode;
    }

    public void setPackageTypecode(String packageTypecode) {
        this.packageTypecode = packageTypecode == null ? null : packageTypecode.trim();
    }

    public String getPackageMarksnumbers() {
        return packageMarksnumbers;
    }

    public void setPackageMarksnumbers(String packageMarksnumbers) {
        this.packageMarksnumbers = packageMarksnumbers == null ? null : packageMarksnumbers.trim();
    }

    public String getCargodescription() {
        return cargodescription;
    }

    public void setCargodescription(String cargodescription) {
        this.cargodescription = cargodescription == null ? null : cargodescription.trim();
    }

    public String getUndgcode() {
        return undgcode;
    }

    public void setUndgcode(String undgcode) {
        this.undgcode = undgcode == null ? null : undgcode.trim();
    }

    public String getTariffclassificationcode() {
        return tariffclassificationcode;
    }

    public void setTariffclassificationcode(String tariffclassificationcode) {
        this.tariffclassificationcode = tariffclassificationcode == null ? null : tariffclassificationcode.trim();
    }

    public String getAdditionalinformation() {
        return additionalinformation;
    }

    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation == null ? null : additionalinformation.trim();
    }

    public String getGoodsmeasure() {
        return goodsmeasure;
    }

    public void setGoodsmeasure(String goodsmeasure) {
        this.goodsmeasure = goodsmeasure == null ? null : goodsmeasure.trim();
    }

    public String getCustomsprocedure() {
        return customsprocedure;
    }

    public void setCustomsprocedure(String customsprocedure) {
        this.customsprocedure = customsprocedure == null ? null : customsprocedure.trim();
    }

    public String getOrigincountrycode() {
        return origincountrycode;
    }

    public void setOrigincountrycode(String origincountrycode) {
        this.origincountrycode = origincountrycode == null ? null : origincountrycode.trim();
    }
}