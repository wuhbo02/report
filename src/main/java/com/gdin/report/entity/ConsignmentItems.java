package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentItems {
    private BigDecimal consignmentItemsId;

    private BigDecimal consignmentId;

    private BigDecimal consignmentitemId;

    public BigDecimal getConsignmentItemsId() {
        return consignmentItemsId;
    }

    public void setConsignmentItemsId(BigDecimal consignmentItemsId) {
        this.consignmentItemsId = consignmentItemsId;
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }

    public BigDecimal getConsignmentitemId() {
        return consignmentitemId;
    }

    public void setConsignmentitemId(BigDecimal consignmentitemId) {
        this.consignmentitemId = consignmentitemId;
    }
}