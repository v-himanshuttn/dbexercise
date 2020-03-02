package com.bootcamp.springAssignment.SpringAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ques3Excellent implements Ques3Worker {
    @Override
    public void dowork() {
        System.out.println("\nExcellent is working");
    }
}
