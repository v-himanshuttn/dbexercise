package com.bootcamp.springAssignment.SpringAssignment.LooselyCoupled;

public class Ques2Main {

    public static void main(String[] args) {

        //Lossely Coupled Example
        //We are using the interface concept


        Ques2Manager ques2Manager=new Ques2Manager(new Ques2Excellent());
        //If we want to call Lazy
       // Ques2Manager ques2Manager=new Ques2Manager(new Ques2Lazy());

        ques2Manager.myCall();
    }
}
