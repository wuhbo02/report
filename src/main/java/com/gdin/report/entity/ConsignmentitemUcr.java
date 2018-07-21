package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentitemUcr {
    private BigDecimal consignmentitemUcrId;

    private BigDecimal consignmentitemId;

    private String urcId;

    public BigDecimal getConsignmentitemUcrId() {
        return consignmentitemUcrId;
    }

    public void setConsignmentitemUcrId(BigDecimal consignmentitemUcrId) {
        this.consignmentitemUcrId = consignmentitemUcrId;
    }

    public BigDecimal getConsignmentitemId() {
        return consignmentitemId;
    }

    public void setConsignmentitemId(BigDecimal consignmentitemId) {
        this.consignmentitemId = consignmentitemId;
    }

    public String getUrcId() {
        return urcId;
    }

    public void setUrcId(String urcId) {
        this.urcId = urcId == null ? null : urcId.trim();
    }
}