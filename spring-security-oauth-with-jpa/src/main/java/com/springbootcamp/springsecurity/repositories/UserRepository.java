package com.springbootcamp.springsecurity.repositories;

import com.springbootcamp.springsecurity.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
