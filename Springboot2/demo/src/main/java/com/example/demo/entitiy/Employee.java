package com.example.demo.entitiy;

import com.fasterxml.jackson.annotation.JsonFilter;
//import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Size;

//Dynamic Filter
@JsonFilter("EmployeeBeanFilter")
public class Employee {
    private int id,age;

    @Size(min=3,message = "Oops!! Name length should atleast 3 ")
    private String name;

    //Static Filtering apply on password
    //@JsonIgnore
    private String password;
    private String emailId;

    public Employee() {
    }

    public Employee(int id, int age, @Size(min = 3, message = "Oops!! Name length should atleast 3 ") String name, String password, String emailId) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.password = password;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
