package com.bootcamp.springAssignment.SpringAssignment.TightlyCoupled;

public class Ques1Manager {

    private Ques1Lazy ques1Lazy;
    private Ques1Excellent ques1Excellent;

    public Ques1Manager(Ques1Lazy ques1Lazy, Ques1Excellent ques1Excellent) {
        this.ques1Lazy = ques1Lazy;
        this.ques1Excellent = ques1Excellent;
    }

    public void mycall()
    {
        ques1Excellent.work();
        ques1Lazy.work();
    }
}
