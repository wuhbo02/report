package com.gdin.report.entity;

import java.math.BigDecimal;

public class Contact {
    private String contactId;

    private String name;

    private BigDecimal addressId;

    private String aeo;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId == null ? null : contactId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getAddressId() {
        return addressId;
    }

    public void setAddressId(BigDecimal addressId) {
        this.addressId = addressId;
    }

    public String getAeo() {
        return aeo;
    }

    public void setAeo(String aeo) {
        this.aeo = aeo == null ? null : aeo.trim();
    }
}