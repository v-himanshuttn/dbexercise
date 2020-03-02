package com.bootcamp.springAssignment.SpringAssignment.TightlyCoupled;

public class Ques1MainApp {
    public static void main(String[] args) {

        //Now in this we are demonstrating Tightly Coupled Exampmle

        Ques1Manager ques1Manager=new Ques1Manager(new Ques1Lazy(),new Ques1Excellent());
        System.out.println("-----------------");
        ques1Manager.mycall();
    }
}
