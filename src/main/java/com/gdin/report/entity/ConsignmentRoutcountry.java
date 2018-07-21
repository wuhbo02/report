package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentRoutcountry {
    private BigDecimal consignmentRoutcountryId;

    private BigDecimal consignmentId;

    private String routcountrycode;

    public BigDecimal getConsignmentRoutcountryId() {
        return consignmentRoutcountryId;
    }

    public void setConsignmentRoutcountryId(BigDecimal consignmentRoutcountryId) {
        this.consignmentRoutcountryId = consignmentRoutcountryId;
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getRoutcountrycode() {
        return routcountrycode;
    }

    public void setRoutcountrycode(String routcountrycode) {
        this.routcountrycode = routcountrycode == null ? null : routcountrycode.trim();
    }
}