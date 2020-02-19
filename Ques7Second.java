package javapart2;

import java.util.Scanner;

public class Ques7Second {
    public static void main(String[] args) {
        //user input is in second
        // find hour, minute and days
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seconds");
        int sec=sc.nextInt();

        int hour=sec/(60*60);
        System.out.println("The total hour is :"+hour);

        float days=(float) hour/24;
        System.out.println("The days is:"+days);

        int min=sec/60;
        System.out.println("The total min is :"+min);

    }
}
