package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentTransport {
    private BigDecimal consignmentTransportId;

    private BigDecimal consignmentId;

    private BigDecimal bordertransportmeansId;

    public BigDecimal getConsignmentTransportId() {
        return consignmentTransportId;
    }

    public void setConsignmentTransportId(BigDecimal consignmentTransportId) {
        this.consignmentTransportId = consignmentTransportId;
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }

    public BigDecimal getBordertransportmeansId() {
        return bordertransportmeansId;
    }

    public void setBordertransportmeansId(BigDecimal bordertransportmeansId) {
        this.bordertransportmeansId = bordertransportmeansId;
    }
}