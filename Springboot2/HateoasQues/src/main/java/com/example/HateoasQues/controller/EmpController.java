package com.example.HateoasQues.controller;

import com.example.HateoasQues.dao.EmpDao;
import com.example.HateoasQues.entitiy.Employee;
import com.example.HateoasQues.myexception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import  org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmpController {


    @Autowired
    EmpDao empDao;

    //    Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.
    //-------------------------------------------------------------------------------------------
    //    Implement POST http request for Employee to create a new employee.

    @GetMapping("/welcome")
    public String myHomePage()
    {
        return "Welcome to spring boot";
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> saveEmployeeRecord(@Valid @RequestBody Employee employee)
    {
       Employee emp1= empDao.createEmpRecord(employee);

        //After Created
        //Return Status of Create
       URI location= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(emp1.getId()).toUri();

       return ResponseEntity.created(location).build();
    }

    //-------------------------------------------------------------------------------------------
    //    Implement GET http request for Employee to get list of employees.

    @GetMapping("/employees")
    public List<Employee> retrieveEmpRecord()
    {
        return empDao.getEmployeeslist();

    }

    //-------------------------------------------------------------------------------------------

    //    Implement GET http request using path variable top get one employee
    @GetMapping("/employees/{id}")
    public EntityModel<Employee>  retrieveEmployee(@PathVariable int id)
    {
        Employee emp= empDao.getEmployeeById(id);
        if(emp==null)
        {
            throw new EmployeeNotFoundException("Sorry !! The record related to this ID : "+id +" is not Exist.." );
        }

        //HATEOAS
        EntityModel<Employee> model=new EntityModel<>(emp);
        WebMvcLinkBuilder link= WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveEmpRecord());
        model.add(link.withRel("All-Employees"));

        return model;
    }

    //---------------------------------------------------------------------------------------------
    @DeleteMapping("/employees/{id}")
    public void  removeEmployee(@PathVariable int id)
    {
        Employee emp2= empDao.deleteEmployeeById(id);
        if(emp2==null)
        {
            throw new EmployeeNotFoundException("Sorry !! The record related to this ID : "+id +" is not Exist.." );
        }
    }

    //---------------------------------------------------------------------------------------------

    @PutMapping("/putEmployee/{id}")
    public void putRecord(@PathVariable Integer id,@RequestBody Employee employee)
    {
        empDao.putEmpRecord(id,employee);
    }

    //---------------------------------------------------------------------------------------------

}
