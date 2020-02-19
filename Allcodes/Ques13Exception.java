package javapart2;


import java.util.Scanner;

class CheckAge extends RuntimeException
{
    private boolean myflag=false;
    CheckAge(String msg,boolean myflag)
    {
        super(msg,null,myflag,!myflag);
    }
}

public class Ques13Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age for check..");
        int age=sc.nextInt();
            try {
                if (age < 18) {
                    throw new CheckAge("Sorry your age is less than 18",true);
                }
            }
            catch (CheckAge c)
            {
               // System.out.println(c);
            c.printStackTrace();
            }


    }
}
