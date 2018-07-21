package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentEquipments {
    private BigDecimal consignmentEquipmentId;

    private BigDecimal consignmentId;

    private String transportequipmentId;

    public BigDecimal getConsignmentEquipmentId() {
        return consignmentEquipmentId;
    }

    public void setConsignmentEquipmentId(BigDecimal consignmentEquipmentId) {
        this.consignmentEquipmentId = consignmentEquipmentId;
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }
}