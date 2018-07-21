package com.gdin.report.entity;

import java.math.BigDecimal;

public class EquipmentDamage {
    private BigDecimal equipmentDamageId;

    private String damagetypecode;

    private String damagetypetext;

    private String damageareacode;

    private String damageareatext;

    private String damageseverity;

    private String transportequipmentId;

    public BigDecimal getEquipmentDamageId() {
        return equipmentDamageId;
    }

    public void setEquipmentDamageId(BigDecimal equipmentDamageId) {
        this.equipmentDamageId = equipmentDamageId;
    }

    public String getDamagetypecode() {
        return damagetypecode;
    }

    public void setDamagetypecode(String damagetypecode) {
        this.damagetypecode = damagetypecode == null ? null : damagetypecode.trim();
    }

    public String getDamagetypetext() {
        return damagetypetext;
    }

    public void setDamagetypetext(String damagetypetext) {
        this.damagetypetext = damagetypetext == null ? null : damagetypetext.trim();
    }

    public String getDamageareacode() {
        return damageareacode;
    }

    public void setDamageareacode(String damageareacode) {
        this.damageareacode = damageareacode == null ? null : damageareacode.trim();
    }

    public String getDamageareatext() {
        return damageareatext;
    }

    public void setDamageareatext(String damageareatext) {
        this.damageareatext = damageareatext == null ? null : damageareatext.trim();
    }

    public String getDamageseverity() {
        return damageseverity;
    }

    public void setDamageseverity(String damageseverity) {
        this.damageseverity = damageseverity == null ? null : damageseverity.trim();
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }
}