package com.example.springbootjpa2.dao;

import com.example.springbootjpa2.entities.Employee;
import com.example.springbootjpa2.entities.EmployeeFirstLastName;
import com.example.springbootjpa2.repositories.EmployeeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepositories employeeRepositories;

    //Business logic

    public void saveEmployeeRecord(Employee employee) {
        employeeRepositories.save(employee);
    }

    public List<Employee> getEmployeeRecord() {
        return employeeRepositories.fetchAllEmployeeRecord();

    }


    //Native SQL
    public void deleteAgeEmployeeRecord(int age) {
        employeeRepositories
                .deleteRecord(age);
    }

    public List<Object[]> getLastNameEmployeeRecord() {
        return employeeRepositories.fetchLastNameEndsWith();
    }


    //JPQL **********************************************************************************************
    //Average
    public List<EmployeeFirstLastName> getAverageEmployeeRecord() {
        List<EmployeeFirstLastName> listofFirstLastName = new ArrayList<>();

        Sort sort = Sort.by(Sort.Order.asc("age"), Sort.Order.desc("salary"));
        List<Object[]> employees = employeeRepositories.fetchRecordAverage(sort);
        for (Object[] objects : employees) {
            listofFirstLastName.add(new EmployeeFirstLastName(objects[0].toString(), objects[1].toString()));
        }

        return listofFirstLastName;
    }


    //Update
    public String updatingSalaryOfEmployee(Double salary)
    {
        //Take the average salary
        Double avergeSalary=employeeRepositories.fetchAverageSalaryOfAll();

        //Now updating the salary of all employee
        employeeRepositories.updateSalaryOfEmployee(salary,avergeSalary);
        return "Updated Succesfully.....";
    }

    //Delete
    public String deletingEmployeeWithMinumumSalary()
    {
        //Take minimum salary
        Double minSalary=employeeRepositories.
                fetchMinimumSalaryOfAll();

        employeeRepositories.deleteEmployeeOfMinimumSalary(minSalary);

        return "Deleted Successfully....";
    }

    //JPQL END **********************************************************************************************


}



































//        Employee employee=new Employee();
//        List<Employee> list=new ArrayList<>();
//
//        List<Object[]> listData=employeeRepositories.fetchLastNameEndsWith();
//        for (Object[] objects:listData)
//        {
//            employee.setId(Integer.parseInt((String) objects[0]));
//            employee.setFirstName(String.valueOf(objects[1]));
//            employee.setAge(Integer.parseInt((String)objects[2]));
//            list.add(employee);
//
//        }

