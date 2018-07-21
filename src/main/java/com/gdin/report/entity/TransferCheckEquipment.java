package com.gdin.report.entity;

import java.math.BigDecimal;

public class TransferCheckEquipment {
    private BigDecimal transferCheckEquipmentId;

    private BigDecimal transferCheckRelationId;

    private String importtransportequipmentid;

    private String exporttransportequipmentid;

    public BigDecimal getTransferCheckEquipmentId() {
        return transferCheckEquipmentId;
    }

    public void setTransferCheckEquipmentId(BigDecimal transferCheckEquipmentId) {
        this.transferCheckEquipmentId = transferCheckEquipmentId;
    }

    public BigDecimal getTransferCheckRelationId() {
        return transferCheckRelationId;
    }

    public void setTransferCheckRelationId(BigDecimal transferCheckRelationId) {
        this.transferCheckRelationId = transferCheckRelationId;
    }

    public String getImporttransportequipmentid() {
        return importtransportequipmentid;
    }

    public void setImporttransportequipmentid(String importtransportequipmentid) {
        this.importtransportequipmentid = importtransportequipmentid == null ? null : importtransportequipmentid.trim();
    }

    public String getExporttransportequipmentid() {
        return exporttransportequipmentid;
    }

    public void setExporttransportequipmentid(String exporttransportequipmentid) {
        this.exporttransportequipmentid = exporttransportequipmentid == null ? null : exporttransportequipmentid.trim();
    }
}