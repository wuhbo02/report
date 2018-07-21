package com.gdin.report.entity;

import java.math.BigDecimal;

public class ImportReport {
    private String importReportId;

    private String representativepersonname;

    private String exitcustomsofficeid;

    private String agentid;

    private String carrierid;

    private BigDecimal bordertransportmeansId;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getImportReportId() {
        return importReportId;
    }

    public void setImportReportId(String importReportId) {
        this.importReportId = importReportId == null ? null : importReportId.trim();
    }

    public String getRepresentativepersonname() {
        return representativepersonname;
    }

    public void setRepresentativepersonname(String representativepersonname) {
        this.representativepersonname = representativepersonname == null ? null : representativepersonname.trim();
    }

    public String getExitcustomsofficeid() {
        return exitcustomsofficeid;
    }

    public void setExitcustomsofficeid(String exitcustomsofficeid) {
        this.exitcustomsofficeid = exitcustomsofficeid == null ? null : exitcustomsofficeid.trim();
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid == null ? null : agentid.trim();
    }

    public String getCarrierid() {
        return carrierid;
    }

    public void setCarrierid(String carrierid) {
        this.carrierid = carrierid == null ? null : carrierid.trim();
    }

    public BigDecimal getBordertransportmeansId() {
        return bordertransportmeansId;
    }

    public void setBordertransportmeansId(BigDecimal bordertransportmeansId) {
        this.bordertransportmeansId = bordertransportmeansId;
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