package com.gdin.report.entity;

import java.math.BigDecimal;

public class OffLoadConsignment {
    private BigDecimal offLoadConsignmentId;

    private String offLoadId;

    private BigDecimal consignmentId;

    public BigDecimal getOffLoadConsignmentId() {
        return offLoadConsignmentId;
    }

    public void setOffLoadConsignmentId(BigDecimal offLoadConsignmentId) {
        this.offLoadConsignmentId = offLoadConsignmentId;
    }

    public String getOffLoadId() {
        return offLoadId;
    }

    public void setOffLoadId(String offLoadId) {
        this.offLoadId = offLoadId == null ? null : offLoadId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}