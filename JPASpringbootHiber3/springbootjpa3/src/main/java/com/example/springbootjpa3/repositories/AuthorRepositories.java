package com.example.springbootjpa3.repositories;

import com.example.springbootjpa3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author,Integer> {
}
