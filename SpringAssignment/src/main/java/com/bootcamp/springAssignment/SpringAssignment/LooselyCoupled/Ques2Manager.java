package com.bootcamp.springAssignment.SpringAssignment.LooselyCoupled;

public class Ques2Manager {

    private Ques2Worker ques2Worker;

    public Ques2Manager(Ques2Worker ques2Worker) {
        this.ques2Worker = ques2Worker;
    }

    public void myCall()
    {
        ques2Worker.dowork();
    }
}
