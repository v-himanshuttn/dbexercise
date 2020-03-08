package com.example.HateoasQues.dao;

import com.example.HateoasQues.entitiy.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmpDao {

    //We use ArrayList (Collection) to store the object of Empolyees

    //------------------------------------------------------------------------------------
    List<Employee> employeeslist = new ArrayList<>();

    //Create the employee
    public Employee createEmpRecord(Employee employee) {
        employeeslist.add(employee);
        return employee;
    }

    //------------------------------------------------------------------------------------
    //Return all record
    public List<Employee> getEmployeeslist() {
      return employeeslist;
        }


    //------------------------------------------------------------------------------------
    //Return record of particular id

    public Employee getEmployeeById(int id) {
        Iterator<Employee> listIterator = employeeslist.iterator();
        while (listIterator.hasNext()) {
            Employee employee = listIterator.next();
            if (employee.getId() == id) {
               return employee;
            }
         }

        return null;
    }

    //------------------------------------------------------------------------------------
    //Delete record of particular id
    public Employee deleteEmployeeById(int id) {
        Iterator<Employee> listIterator = employeeslist.iterator();
        while (listIterator.hasNext()) {
            Employee employee = listIterator.next();
            if (employee.getId() == id) {
                listIterator.remove();
                return employee;
            }
        }

        return null;
    }

    //------------------------------------------------------------------------------------
    //Put record

    public void putEmpRecord(Integer id,Employee employee)
    {
        Iterator<Employee> listIterator = employeeslist.iterator();
        while (listIterator.hasNext()) {
            Employee emp1 = listIterator.next();
            if (emp1.getId() == id) {
                emp1.setId(employee.getId());
                emp1.setAge(employee.getAge());
                emp1.setName(employee.getName());

            }
        }

    }
}
