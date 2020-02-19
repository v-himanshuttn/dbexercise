package javapart2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques6Block {
    public static void main(String[] args) {

        //example of try, multiple catch and finally block
        //Here I am considering a example of array
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int []myarray=new int[size];

        try
        {
            for(int i=0;i<size;i++)
            {
                myarray[i]=sc.nextInt();
            }

            //myarray[0]=21;
            int temp=myarray[0]/0;

           System.out.println(myarray[5]);

        }
        catch (InputMismatchException e3)
        {
            e3.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e1)
        {
            System.out.println(e1);
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }


    }
}
