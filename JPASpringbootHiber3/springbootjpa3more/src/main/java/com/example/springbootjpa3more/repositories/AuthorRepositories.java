package com.example.springbootjpa3more.repositories;

import com.example.springbootjpa3more.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author,Integer> {
}
