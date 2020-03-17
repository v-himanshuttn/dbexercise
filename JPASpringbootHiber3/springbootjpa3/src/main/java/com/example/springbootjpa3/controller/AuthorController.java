package com.example.springbootjpa3.controller;

import com.example.springbootjpa3.dao.AuthorServiceDao;
import com.example.springbootjpa3.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    AuthorServiceDao authorServiceDao;

    @PostMapping("/authors")
    public String createAuthorsRecord(@RequestBody Author author)
    {
       return authorServiceDao.saveAuthorRecords(author);
    }

}
