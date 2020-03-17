package com.example.springbootjpa3.entities;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Author {


    @Id
    private int id;

    @OneToMany(mappedBy ="author" ,cascade = CascadeType.ALL)
    private List<Subjects> subjectlist;


    @Column(name = "authorname")
    private String authorName;

    @Embedded
    private Addresses addresses;

    public Author() {
    }

    public Author(List<Subjects> subjectlist, int id, String authorName, Addresses addresses) {
        this.subjectlist = subjectlist;
        this.id = id;
        this.authorName = authorName;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public List<Subjects> getSubjectlist() {
        return subjectlist;
    }

    public void setSubjectlist(List<Subjects> subjectlist) {
        this.subjectlist = subjectlist;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", address=" + addresses +
                '}';
    }
}
