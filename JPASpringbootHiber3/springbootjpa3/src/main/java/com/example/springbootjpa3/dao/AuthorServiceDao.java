package com.example.springbootjpa3.dao;

import com.example.springbootjpa3.entities.Author;
import com.example.springbootjpa3.entities.Subjects;
import com.example.springbootjpa3.repositories.AuthorRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorServiceDao {

    @Autowired
    AuthorRepositories authorRepositories;



    public String saveAuthorRecords(Author author)
    {
        List<Subjects> list=author.getSubjectlist();
        list.forEach(p->p.setAuthor(author));

        authorRepositories.save(author);
        return "SuccessFully Created.....";
    }

}
