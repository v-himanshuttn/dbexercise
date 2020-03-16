package com.example.springbootjpa2.entities;

import javax.persistence.*;

@Entity
@Table(name = "employeetable")
public class Employee {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "empid")
    private int id;
    @Column(name = "empage")
    private int age;
    @Column(name = "empfirstname")
    private String firstName;
    @Column(name = "emplastname")
    private String lastName;
    @Column(name = "empsalary")
    private Double salary;

    ///Component Mapping

    @Embedded
    private Salary expandsalary;

    public Employee() {
    }

    public Employee(int id, int age, String firstName, String lastName, Double salary) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Salary getExpandsalary() {
        return expandsalary;
    }

    public void setExpandsalary(Salary expandsalary) {
        this.expandsalary = expandsalary;
    }
}
