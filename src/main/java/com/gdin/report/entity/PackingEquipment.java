package com.gdin.report.entity;

import java.math.BigDecimal;

public class PackingEquipment {
    private BigDecimal packingEquipmentId;

    private String packingReportId;

    private String transportequipmentId;

    public BigDecimal getPackingEquipmentId() {
        return packingEquipmentId;
    }

    public void setPackingEquipmentId(BigDecimal packingEquipmentId) {
        this.packingEquipmentId = packingEquipmentId;
    }

    public String getPackingReportId() {
        return packingReportId;
    }

    public void setPackingReportId(String packingReportId) {
        this.packingReportId = packingReportId == null ? null : packingReportId.trim();
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }
}