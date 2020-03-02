package com.bootcamp.springAssignment.SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ques3Manager {

    private Ques3Worker ques3Worker;

    @Autowired
    public Ques3Manager(Ques3Worker ques3Worker) {
        this.ques3Worker = ques3Worker;
    }

    public void myCall()
    {
        ques3Worker.dowork();
    }
}
