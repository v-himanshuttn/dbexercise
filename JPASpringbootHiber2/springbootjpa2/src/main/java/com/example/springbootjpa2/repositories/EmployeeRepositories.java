package com.example.springbootjpa2.repositories;

import com.example.springbootjpa2.entities.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepositories extends CrudRepository<Employee,Integer> {

    @Query("from Employee")
    List<Employee> fetchAllEmployeeRecord();




//    JPQL:
//    Display the first name, last name of all employees
//    having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Query("select firstName,lastName from Employee where salary > (select avg(salary) from Employee)")
    List<Object[]> fetchRecordAverage(Sort sort);




//    Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @Query("select avg(salary) from Employee")
    public Double fetchAverageSalaryOfAll();


    @Modifying
    @Transactional
    @Query("update Employee set salary =:salary where salary <:average")
    public void updateSalaryOfEmployee(@Param("salary") Double salary,@Param("average") Double average);


//    Delete all employees with minimum salary.
    @Query("select min(salary) from Employee")
    public Double fetchMinimumSalaryOfAll();

    @Modifying
    @Transactional
    @Query("delete from Employee where salary =:minsalary")
    public void deleteEmployeeOfMinimumSalary(@Param("minsalary") Double minSalary);





//    Native SQL Query:
//    Display the id, first name, age of all employees where last name ends with "singh"

    @Modifying
    @Transactional
    @Query(value = "delete from employeetable where empage > :age", nativeQuery = true)
    void deleteRecord(@Param("age") int age);

    //Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "select empid,empfirstname,empage from employeetable where emplastname like '%singh'", nativeQuery = true)
    List<Object[]> fetchLastNameEndsWith();


    //***************************************************************************************************************************
}









//    @Query("select firstName,lastName,salary from (select firstName,lastName,salary from Employee order by age, salary DESC) T where salary > (select avg(salary) from Employee)")

