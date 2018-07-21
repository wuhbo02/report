package com.gdin.report.entity;

import java.math.BigDecimal;

public class ImportConsignment {
    private BigDecimal importConsignmentId;

    private String importReportId;

    private BigDecimal consignmentId;

    public BigDecimal getImportConsignmentId() {
        return importConsignmentId;
    }

    public void setImportConsignmentId(BigDecimal importConsignmentId) {
        this.importConsignmentId = importConsignmentId;
    }

    public String getImportReportId() {
        return importReportId;
    }

    public void setImportReportId(String importReportId) {
        this.importReportId = importReportId == null ? null : importReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}