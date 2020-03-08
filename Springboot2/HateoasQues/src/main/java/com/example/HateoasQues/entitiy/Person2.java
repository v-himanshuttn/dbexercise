package com.example.HateoasQues.entitiy;

public class Person2 {

    private int id;
    private FullName fullName;

    public Person2(int id, FullName fullName) {

        this.id=id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
}
