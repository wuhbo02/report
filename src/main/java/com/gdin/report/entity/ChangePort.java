package com.gdin.report.entity;

import java.math.BigDecimal;

public class ChangePort {
    private String changePortId;

    private BigDecimal bordertransportmeansId;

    private BigDecimal changebordertransportmeansId;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getChangePortId() {
        return changePortId;
    }

    public void setChangePortId(String changePortId) {
        this.changePortId = changePortId == null ? null : changePortId.trim();
    }

    public BigDecimal getBordertransportmeansId() {
        return bordertransportmeansId;
    }

    public void setBordertransportmeansId(BigDecimal bordertransportmeansId) {
        this.bordertransportmeansId = bordertransportmeansId;
    }

    public BigDecimal getChangebordertransportmeansId() {
        return changebordertransportmeansId;
    }

    public void setChangebordertransportmeansId(BigDecimal changebordertransportmeansId) {
        this.changebordertransportmeansId = changebordertransportmeansId;
    }

    public String getAdditionalinformation() {
        return additionalinformation;
    }

    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation == null ? null : additionalinformation.trim();
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }
}