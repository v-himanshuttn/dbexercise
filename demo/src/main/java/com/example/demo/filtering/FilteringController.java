package com.example.demo.filtering;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {


    //In this I am using the dynamic filter

    //f1,f2
    @GetMapping("/filtering")
    public SomeBean getAll()
    {
        SomeBean someBean= new SomeBean("yo","hi","lo");
        //SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("f1","f2");

        return someBean;
    }

    //f1,f3
    @GetMapping("/filtering-list")
    public List<SomeBean> getlistAll()
    {
        return Arrays.asList(new SomeBean("yo","io","yu"),new SomeBean("ty","er","gt"));
    }

}
