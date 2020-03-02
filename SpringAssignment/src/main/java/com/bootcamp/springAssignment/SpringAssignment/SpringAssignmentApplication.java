package com.bootcamp.springAssignment.SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {

		// Ques3  : Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
		//@Component for make the Bean

		// Ques4  : Get a Spring Bean from application context and display its properties.
		ApplicationContext applicationContext=SpringApplication.run(SpringAssignmentApplication.class, args);
		Ques3Manager ques3Manager=applicationContext.getBean(Ques3Manager.class);

		//Ques 5 :  Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
		// Solution : We use the @Primary annotation on bean

		//Ques6 : Perform Constructor Injection in a Spring Bean
		//Solution : We @AutoWired on constructor
		ques3Manager.myCall();

	}

}
