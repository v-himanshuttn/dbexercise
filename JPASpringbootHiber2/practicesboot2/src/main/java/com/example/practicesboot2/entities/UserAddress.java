package com.example.practicesboot2.entities;

import javax.persistence.Embeddable;

@Embeddable
public class UserAddress {
    private String houseno;
    private String area;
    private String country;

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
