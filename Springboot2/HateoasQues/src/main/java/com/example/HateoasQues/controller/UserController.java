package com.example.HateoasQues.controller;

import com.example.HateoasQues.entitiy.FullName;
import com.example.HateoasQues.entitiy.Person1;
import com.example.HateoasQues.entitiy.Person2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    //URI versioning----------------------------------------------------------------------------

    //For Person 1
    @GetMapping("/getdetails")
    public Person1 getRecordFromPerson1()
    {
        Person1 person1=new Person1(12,"Neel");

        return person1;
    }

    //For Person2
    @GetMapping("/get-enhanced-details")
    public Person2 getRecordFromPerson2()
    {
        FullName fullName =new FullName("Neel","niten","mukesh");
        Person2 person2=new Person2(23, fullName);
        return person2;
    }
    //-----------------------------------------------------------------------------------------------

    //Request Parameter
    @GetMapping(value = "/getdetails/param",params = "nameVersion1")
    public Person1 getRecordFromPerson1UsingParam()
    {
        Person1 person1=new Person1(12,"Neel");
        return person1;
    }

    //For Person2
    @GetMapping(value = "/getdetails/param",name = "nameVersion2")
    public Person2 getRecordFromPerson2UsingParam()
    {
        FullName fullName =new FullName("Neel","niten","mukesh");
        Person2 person2=new Person2(23, fullName);
        return person2;
    }

    //-----------------------------------------------------------------------------------------------

    //Custom Header Versioning

    //Request Parameter
    @GetMapping(value = "/getdetails/header",headers = "nameVersion=1")
    public Person1 getRecordFromPerson1UsingHeader()
    {
        Person1 person1=new Person1(12,"Neel");
        return person1;
    }

    //For Person2
    @GetMapping(value = "/getdetails/header",headers = "nameVersion=2")
    public Person2 getRecordFromPerson2UsingHeader()
    {
        FullName fullName =new FullName("Neel","niten","mukesh");
        Person2 person2=new Person2(23, fullName);
        return person2;
    }

    //-----------------------------------------------------------------------------------------------


    // MimeType Versioning
    //Request Parameter
    @GetMapping(value = "/getdetails/produces",produces = "application/vnd.company.app-v1+json")
    public Person1 getRecordFromPerson1UsingMime()
    {
        Person1 person1=new Person1(12,"Neel");
        return person1;
    }

    //For Person2
    @GetMapping(value = "/getdetails/produces",produces = "application/vnd.company.app-v2+json")
    public Person2 getRecordFromPerson2UsingMime()
    {
        FullName fullName =new FullName("Neel","niten","mukesh");
        Person2 person2=new Person2(23, fullName);
        return person2;
    }

    //-----------------------------------------------------------------------------------------------
}
