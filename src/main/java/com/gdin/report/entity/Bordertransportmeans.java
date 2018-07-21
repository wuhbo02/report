package com.gdin.report.entity;

import java.math.BigDecimal;

public class Bordertransportmeans {
    private BigDecimal bordertransportmeansId;

    private String id;

    private String journeyid;

    private String typecode;

    private String name;

    private String firstarrivallocationid;

    private String arrivaldatetime;

    private String departuredatetime;

    private String actualdatetime;

    private String completeddatetime;

    private String loadinglocationid;

    private String unloadinglocationid;

    private String master;

    private String cargofacilitylocation;

    private String despatchdatetime;

    private String unloadingdatetime;

    private String freetext;

    public BigDecimal getBordertransportmeansId() {
        return bordertransportmeansId;
    }

    public void setBordertransportmeansId(BigDecimal bordertransportmeansId) {
        this.bordertransportmeansId = bordertransportmeansId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJourneyid() {
        return journeyid;
    }

    public void setJourneyid(String journeyid) {
        this.journeyid = journeyid == null ? null : journeyid.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFirstarrivallocationid() {
        return firstarrivallocationid;
    }

    public void setFirstarrivallocationid(String firstarrivallocationid) {
        this.firstarrivallocationid = firstarrivallocationid == null ? null : firstarrivallocationid.trim();
    }

    public String getArrivaldatetime() {
        return arrivaldatetime;
    }

    public void setArrivaldatetime(String arrivaldatetime) {
        this.arrivaldatetime = arrivaldatetime == null ? null : arrivaldatetime.trim();
    }

    public String getDeparturedatetime() {
        return departuredatetime;
    }

    public void setDeparturedatetime(String departuredatetime) {
        this.departuredatetime = departuredatetime == null ? null : departuredatetime.trim();
    }

    public String getActualdatetime() {
        return actualdatetime;
    }

    public void setActualdatetime(String actualdatetime) {
        this.actualdatetime = actualdatetime == null ? null : actualdatetime.trim();
    }

    public String getCompleteddatetime() {
        return completeddatetime;
    }

    public void setCompleteddatetime(String completeddatetime) {
        this.completeddatetime = completeddatetime == null ? null : completeddatetime.trim();
    }

    public String getLoadinglocationid() {
        return loadinglocationid;
    }

    public void setLoadinglocationid(String loadinglocationid) {
        this.loadinglocationid = loadinglocationid == null ? null : loadinglocationid.trim();
    }

    public String getUnloadinglocationid() {
        return unloadinglocationid;
    }

    public void setUnloadinglocationid(String unloadinglocationid) {
        this.unloadinglocationid = unloadinglocationid == null ? null : unloadinglocationid.trim();
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master == null ? null : master.trim();
    }

    public String getCargofacilitylocation() {
        return cargofacilitylocation;
    }

    public void setCargofacilitylocation(String cargofacilitylocation) {
        this.cargofacilitylocation = cargofacilitylocation == null ? null : cargofacilitylocation.trim();
    }

    public String getDespatchdatetime() {
        return despatchdatetime;
    }

    public void setDespatchdatetime(String despatchdatetime) {
        this.despatchdatetime = despatchdatetime == null ? null : despatchdatetime.trim();
    }

    public String getUnloadingdatetime() {
        return unloadingdatetime;
    }

    public void setUnloadingdatetime(String unloadingdatetime) {
        this.unloadingdatetime = unloadingdatetime == null ? null : unloadingdatetime.trim();
    }

    public String getFreetext() {
        return freetext;
    }

    public void setFreetext(String freetext) {
        this.freetext = freetext == null ? null : freetext.trim();
    }
}