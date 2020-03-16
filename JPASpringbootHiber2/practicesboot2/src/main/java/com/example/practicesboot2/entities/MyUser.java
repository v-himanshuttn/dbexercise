package com.example.practicesboot2.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyUser {
    @Id
    private int id;
    private String name;
    @Embedded
    private UserAddress useraddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserAddress getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(UserAddress useraddress) {
        this.useraddress = useraddress;
    }
}
