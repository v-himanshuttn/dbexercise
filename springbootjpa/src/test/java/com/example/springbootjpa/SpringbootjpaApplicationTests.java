package com.example.springbootjpa;

import com.example.springbootjpa.entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.springbootjpa.repository.EmployeeRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringbootjpaApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}


//(3) Perform Create Operation on Entity using Spring Data JPA
//-----------------------------------------------------------------------------------------
//	@Test
//	public void addEmpRecord()
//	{
//		Employee employee=new Employee("rahuk",10,31,"noida");
//		employeeRepository.save(employee);
//		System.out.println("->>>>>>>>Record is inserted......");
//	}

//-----------------------------------------------------------------------------------------
//	(4) Perform Update Operation on Entity using Spring Data JPA
//	@Test
//	public void updateEmpRecord()
//	{
//		Employee employee2=employeeRepository.findById(2).get();
//		employee2.setLocation("Moti nagar");
//		employeeRepository.save(employee2);
//		System.out.println("Succesfully updated....");
//	}

//	-----------------------------------------------------------------------------------------
//(5) Perform Delete Operation on Entity using Spring Data JPA
//	@Test
//	public void deleteEmpRecord()
//	{
//		employeeRepository.deleteById(22);
//		System.out.println("Succesfully deleted...........");
//	}


//-----------------------------------------------------------------------------------------
//	(6) Perform Read Operation on Entity using Spring Data JPA
//	@Test
//	public void  readEmpRecord()
//	{
//		Employee employee1=employeeRepository.findById(22).get();
//		assertNotNull(employee1);
//		assertEquals("ka",employee1.getName());
//		System.out.println("*****************************");
//		System.out.println(employee1.getId()+"\n"+employee1.getAge()
//				+"\n"+employee1.getName()+"\n"+employee1.getLocation());
//
//	}
//-----------------------------------------------------------------------------------------

	//(6) Get the total count of the number of Employees
//	@Test
//	public void countEmpRecord()
//	{
//		System.out.println("*************** Count ");
//		System.out.println(employeeRepository.count());
//	}
//-----------------------------------------------------------------------------------------

//(7) Implement Pagination and Sorting on the bases of Employee Age

// I am sorting the age in descending order and pagination is 1 and no of record is 4
//
//	@Test
//	public void findEmpRecordWithPagingAndSorting() {
//		System.out.println("****************************");
//		Pageable pageable= PageRequest.of(0,4,Sort.by(Sort.Direction.DESC,"age"));
//		employeeRepository.findAll(pageable).forEach(p-> System.out.println(p.getAge()));
//
//
//	}

//(8) Create and use finder to find Employee by Name
// ----------------------------------------------------------------------------------------

//	@Test
//	public void findEmployeeByName()
//	{
//		System.out.println("*********************************** Their ID is:");
//		List<Employee> list=employeeRepository.findByName("himanshu");
//		list.forEach(p-> System.out.println(p.getId()));
//	}

// ----------------------------------------------------------------------------------------

//(9) Create and use finder to find Employees starting with A character
//	@Test
//	public void findEmployeeeUsingLike()
//	{
//		System.out.println("**************************");
//		List<Employee> list1=employeeRepository.findByNameLike("k%");
//		list1.forEach(p-> System.out.println(p.getName()));
//	}


// ----------------------------------------------------------------------------------------
//(10) Create and use finder to find Employees Between the age of 28 to 32

//	@Test
//	public void findEmployeeBetweenAge()
//	{
//		System.out.println("**************************");
//		List<Employee> list2=employeeRepository.findByAgeBetween(28,32);
//		list2.forEach(p-> System.out.println(p.getName()));
//
//	}
}
