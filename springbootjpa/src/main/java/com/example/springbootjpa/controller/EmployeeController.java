package com.example.springbootjpa.controller;


import com.example.springbootjpa.entity.Employee;
import com.example.springbootjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public void addEmpRecord(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
        System.out.println("->>>>>>>>Record is inserted......");
    }

    //(5) Perform Delete Operation on Entity using Spring Data JPA
    @DeleteMapping("/employees/{id}")
    public void deleteEmpRecord(@PathVariable  int id)
    {
        employeeRepository.deleteById(id);
        System.out.println("Succesfully deleted...........");
    }

    //-----------------------------------------------------------------------------------------

    //(6) Get the total count of the number of Employees
    @GetMapping("/employees/count")
    public Long countEmpRecord()
    {
        System.out.println("*************** Count ");
        System.out.println(employeeRepository.count());
        return employeeRepository.count();
    }

    //-----------------------------------------------------------------------------------------
//	(6) Perform Read Operation on Entity using Spring Data JPA
    @GetMapping("/employees/{id}")
    public Employee  fetchEmployeeRecord(@PathVariable int id)
    {
        Employee employee1=employeeRepository.findById(id).get();
        System.out.println("*****************************");
        System.out.println(employee1.getId()+"\n"+employee1.getAge()
                +"\n"+employee1.getName()+"\n"+employee1.getLocation());
        return employee1;

    }

    //-----------------------------------------------------------------------------------------
//	(4) Perform Update Operation on Entity using Spring Data JPA
    @PutMapping("/employees/{id}")
    public String updateEmpRecord(@PathVariable int id,@RequestBody Employee employee)
    {
        Employee employee2=employeeRepository.findById(id).get();
        employee2.setLocation(employee.getLocation());
        employee2.setAge(employee.getAge());
        employee2.setName(employee.getName());

        employeeRepository.save(employee2);
        System.out.println("Succesfully updated....");
        return "Successfully updated..";
    }

    //-----------------------------------------------------------------------------------------

//(7) Implement Pagination and Sorting on the bases of Employee Age

// I am sorting the age in descending order and pagination is 1 and no of record is 4

    @GetMapping("/employees/pagingandsort")
    public List<Employee> findEmpRecordWithPagingAndSorting() {
        System.out.println("****************************");
        Pageable pageable= PageRequest.of(0,1, Sort.by(Sort.Direction.DESC,"age"));

        List<Employee> list3=new ArrayList<>();
        employeeRepository.findAll(pageable).forEach(p->list3.add(p));
        return list3;

    }

//(8) Create and use finder to find Employee by Name
// ----------------------------------------------------------------------------------------

    @GetMapping("/employees/byname/{name}")
    public List<Employee> findEmployeeByName(@PathVariable String name)
    {
        System.out.println("*********************************** Their ID is:");
        List<Employee> list1=employeeRepository.findByName(name);
       // list.forEach(p-> System.out.println(p.getId()));
        return  list1;
    }


    // ----------------------------------------------------------------------------------------

    //(9) Create and use finder to find Employees starting with A character
    @GetMapping("/employees/likeA")
    public List<Employee> findEmployeeeUsingLike()
    {
        System.out.println("**************************");
        List<Employee> list=employeeRepository.findByNameLike("A%");
        return list;
    }

    // ----------------------------------------------------------------------------------------
//(10) Create and use finder to find Employees Between the age of 28 to 32

    @GetMapping("/employees/agebetween")
    public List<Employee> findEmployeeBetweenAge()
    {
        System.out.println("**************************");
        List<Employee> list2=employeeRepository.findByAgeBetween(28,32);
        return list2;
    }



}
