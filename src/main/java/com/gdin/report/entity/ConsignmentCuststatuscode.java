package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentCuststatuscode {
    private BigDecimal consignmentCuststatuscodeId;

    private BigDecimal consignmentId;

    private String customsstatuscode;

    public BigDecimal getConsignmentCuststatuscodeId() {
        return consignmentCuststatuscodeId;
    }

    public void setConsignmentCuststatuscodeId(BigDecimal consignmentCuststatuscodeId) {
        this.consignmentCuststatuscodeId = consignmentCuststatuscodeId;
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getCustomsstatuscode() {
        return customsstatuscode;
    }

    public void setCustomsstatuscode(String customsstatuscode) {
        this.customsstatuscode = customsstatuscode == null ? null : customsstatuscode.trim();
    }
}