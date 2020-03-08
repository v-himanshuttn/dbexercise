package com.example.demo.controller;

import com.example.demo.dao.BookDao;
import com.example.demo.entitiy.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
public class BookController {

    @Autowired
    BookDao bookDao;

    @Autowired
    private MessageSource messageSource;


    @GetMapping("/helloi")
    public String helloin(@RequestHeader(name="Accept-Language",required = false) Locale locale)
    {

        return messageSource.getMessage("good.morning.message",null, locale);
    }

    //Ques 2
    //Create a GET request which takes "username" as param and shows a localized message "Hello Username".
    // (Use parameters in message properties)

    @GetMapping("/international-msg/{username}")
    public  String userHelloMessage(@RequestHeader(name="Accept-Language",required = false) Locale locale
            ,@PathVariable String username)
    {
        return messageSource.getMessage("hello.username.message",new Object[]{username},locale);
    }


    @GetMapping("/welcomepage")
    public String bookname()
    {
        return "Welcome to spring boot";
    }




//    @GetMapping("/bookbean")
//    public Book myCall()
//    {
//        return new Book("hcverma");
//
//    }

    // /bookbean/path-variable/in 28 min
//    @GetMapping("/bookbean/path-variable/{name}")
//    public Book bookNameUsingPath(@PathVariable String name)
//    {
//        return new Book(String.format("Hello ,%s",name));
//
//    }

    @PostMapping("/postbooks")
    public void createBook(@RequestBody Book book)
    {
     bookDao.save(book);
     //return bookDao.li;
    }

    @GetMapping("/bookall")
    public List<Book> retrieve()
    {
        return bookDao.getAll();
    }

}
