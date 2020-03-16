package com.example.springbootjpa2.controller;

import com.example.springbootjpa2.dao.EmployeeService;
import com.example.springbootjpa2.entities.Employee;
import com.example.springbootjpa2.entities.EmployeeFirstLastName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    //mapping logic

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employees")
    public void createEmployeeRecord(@RequestBody Employee employee)
    {
        employeeService.saveEmployeeRecord(employee);
    }

    @GetMapping("/employees")
    public List<Employee> retrieveEmployeeRecord()
    {
        return employeeService.getEmployeeRecord();
    }



//*****************************************************************************************************
//JPQL

    @GetMapping("/employees/average")
    public List<EmployeeFirstLastName> retrieveAverageEmployeeRecord()
    {
        return employeeService.getAverageEmployeeRecord();
    }


    @PostMapping("/employees/update")
    public String updateEmployeeRecord(@RequestParam ("salary") Double salary)
    {
        return employeeService.updatingSalaryOfEmployee(salary);
    }


    @DeleteMapping("/employees/minimum-salary")
    public String deleteEmployeeRecordMinimum()
    {
        return employeeService.deletingEmployeeWithMinumumSalary();
    }





//*****************************************************************************************************

    //Native SQL

    @DeleteMapping("/employees/{age}")
    public String deleteEmployeeRecordByAge(@PathVariable int age)
    {
        System.out.println("---------------------- "+age);
        employeeService.deleteAgeEmployeeRecord(age);
        return "Succesfully Deleted......";
    }

    @GetMapping("/employees/lastname")
    public List<Object[]> retrieveLastName()
    {
        return employeeService.getLastNameEmployeeRecord();
    }

//********************************************************************************************************



}
