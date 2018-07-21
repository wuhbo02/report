package com.gdin.report.entity;

import java.math.BigDecimal;

public class TallyConsignment {
    private BigDecimal tallyConsignmentId;

    private String tallyReportId;

    private BigDecimal consignmentId;

    public BigDecimal getTallyConsignmentId() {
        return tallyConsignmentId;
    }

    public void setTallyConsignmentId(BigDecimal tallyConsignmentId) {
        this.tallyConsignmentId = tallyConsignmentId;
    }

    public String getTallyReportId() {
        return tallyReportId;
    }

    public void setTallyReportId(String tallyReportId) {
        this.tallyReportId = tallyReportId == null ? null : tallyReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}