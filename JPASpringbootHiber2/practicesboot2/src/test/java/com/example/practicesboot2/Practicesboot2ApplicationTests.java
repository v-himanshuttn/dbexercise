package com.example.practicesboot2;

import com.example.practicesboot2.entities.*;
import com.example.practicesboot2.repositories.PaymentRepository;
import com.example.practicesboot2.repositories.StudentRepository;
import com.example.practicesboot2.repositories.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
class Practicesboot2ApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PaymentRepository paymentRepository;
    @Test
    public void addStudent()
    {
        Student student=new Student();
        student.setFirstName("chirag");
        student.setLastName("verma");
        student.setScore(65);
        studentRepository.save(student);
        System.out.println("Successfully inserted.........");
    }

    @Test
    public void findAllStudent()
    {
        Pageable pageable= PageRequest.of(0,2,Sort.by(Sort.Direction.DESC,"id"));
        System.out.println(studentRepository.getStudents(pageable));
    }

    @Test
    public void getFName()
    {
        System.out.println(studentRepository.getByFirstName("chirag"));
    }


    //USing Native query
    @Test
    public void getNQ()
    {
        System.out.println(studentRepository.getStudentNQ("chirag"));
    }




    //Inheritence

    @Test
    public void myInheritence()
    {
        Card card=new Card();
        card.setId(23);
        card.setAmount(3432d);
        card.setCardnumber("cnum1234");

        MyCheck check1=new MyCheck();
        check1.setId(45);
        check1.setAmount(12334d);
        check1.setChecknumber("chnum1234567");
        paymentRepository.save(card);
        paymentRepository.save(check1);

    }


    //Component mapping
    @Autowired
    UserRepo userRepo;

    @Test
    public void compMapping()
    {
        UserAddress userAddress=new UserAddress();
        userAddress.setHouseno("rz 375");
        userAddress.setArea("janakpuri");
        userAddress.setCountry("india");

        MyUser myUser=new MyUser();
        myUser.setId(2);
        myUser.setName("Himanshu Verma");
        myUser.setUseraddress(userAddress);
        userRepo.save(myUser);
    }
}
