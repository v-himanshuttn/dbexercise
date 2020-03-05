package com.example.demo.entitiy;

import javax.validation.constraints.Size;

public class Employee {
    private int id,age;

    @Size(min=3,message = "Oops!! Name length should atleast 3 ")
private String name;

    public Employee() {
    }

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
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
}
