package com.gdin.report.entity;

import java.math.BigDecimal;

public class Deliverydestination {
    private BigDecimal deliverydestinationId;

    private String line;

    private String cityname;

    private String countrysubentityid;

    private String countrysubentityname;

    private String postcodeid;

    private String countrycode;

    public BigDecimal getDeliverydestinationId() {
        return deliverydestinationId;
    }

    public void setDeliverydestinationId(BigDecimal deliverydestinationId) {
        this.deliverydestinationId = deliverydestinationId;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCountrysubentityid() {
        return countrysubentityid;
    }

    public void setCountrysubentityid(String countrysubentityid) {
        this.countrysubentityid = countrysubentityid == null ? null : countrysubentityid.trim();
    }

    public String getCountrysubentityname() {
        return countrysubentityname;
    }

    public void setCountrysubentityname(String countrysubentityname) {
        this.countrysubentityname = countrysubentityname == null ? null : countrysubentityname.trim();
    }

    public String getPostcodeid() {
        return postcodeid;
    }

    public void setPostcodeid(String postcodeid) {
        this.postcodeid = postcodeid == null ? null : postcodeid.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
}