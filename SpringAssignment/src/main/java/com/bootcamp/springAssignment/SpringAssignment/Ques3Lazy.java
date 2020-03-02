package com.bootcamp.springAssignment.SpringAssignment;

import org.springframework.stereotype.Component;

@Component
public class Ques3Lazy implements Ques3Worker {

    @Override
    public void dowork() {
        System.out.println("\nLazy is working");

    }
}
