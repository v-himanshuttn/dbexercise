package com.example.springbootjpa3more.dao;

import com.example.springbootjpa3more.entities.Author;
import com.example.springbootjpa3more.repositories.AuthorRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorServiceDao {

    @Autowired
    AuthorRepositories authorRepositories;



    public String saveAuthorRecords(Author author)
    {

        authorRepositories.save(author);
        return "SuccessFully Created.....";
    }

}
