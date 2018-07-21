package com.gdin.report.entity;

import java.math.BigDecimal;

public class ConsignmentitemEquipment {
    private BigDecimal consignmentitemEquipmentId;

    private BigDecimal consignmentitemId;

    private String transportequipmentId;

    public BigDecimal getConsignmentitemEquipmentId() {
        return consignmentitemEquipmentId;
    }

    public void setConsignmentitemEquipmentId(BigDecimal consignmentitemEquipmentId) {
        this.consignmentitemEquipmentId = consignmentitemEquipmentId;
    }

    public BigDecimal getConsignmentitemId() {
        return consignmentitemId;
    }

    public void setConsignmentitemId(BigDecimal consignmentitemId) {
        this.consignmentitemId = consignmentitemId;
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }
}