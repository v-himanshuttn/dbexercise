package com.example.springbootjpa3more.entities;

import javax.persistence.*;
import java.util.List;


@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "authorname")
    private String authorName;

    //Many to Many Mapping
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name="author_id",referencedColumnName = "id")
                            ,inverseJoinColumns =@JoinColumn(name = "book_id",referencedColumnName = "id"))
    List<Book> books;


//*********************************************************************************
    //One to One Mapping (Primary Key)
//    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
//    private Book book;

//*********************************************************************************

    @Embedded
    private Addresses addresses;

    public Author() {
    }


    public Author(String authorName, List<Book> books, Addresses addresses) {
        this.authorName = authorName;
        this.books = books;
        this.addresses = addresses;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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


}
