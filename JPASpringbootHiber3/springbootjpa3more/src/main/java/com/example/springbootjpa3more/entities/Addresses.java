package com.example.springbootjpa3more.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Addresses {

    @Column(name = "streetnumber")
    private String streetNumber;
    @Column(name = "location")
    private String location;
    @Column(name = "state")
    private String state;

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
