package com.example.practicesboot2.repositories;

import com.example.practicesboot2.entities.MyUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<MyUser,Integer> {
}
