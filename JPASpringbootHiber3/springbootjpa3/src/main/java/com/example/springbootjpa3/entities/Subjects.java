package com.example.springbootjpa3.entities;

import javax.persistence.*;

@Entity
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subjectid")
    private int subjectid;

    @Column(name = "subjectname")
    private String subjectName;

    //Assuming that the many subject is written by 1 author
    @ManyToOne
    @JoinColumn(name ="authorid")
    private Author author;


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
