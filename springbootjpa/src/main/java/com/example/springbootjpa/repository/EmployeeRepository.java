package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>,PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String expr);
    List<Employee> findByAgeBetween(Integer a,Integer b);

}
