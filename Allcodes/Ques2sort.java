package javapart2;

import java.util.Scanner;

public class Ques2sort {
    static void sort(char mystr[])
    {
        int n = mystr.length;
        for (int i = 1; i < n; ++i) {
            char key = mystr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && mystr[j] > key) {
                mystr[j + 1] = mystr[j];
                j = j - 1;
            }
            mystr[j + 1] = key;
        }
        System.out.println("Sorted string..");
        for(int i=0;i<mystr.length;i++)
        {
            System.out.print(mystr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string..");
        String str=sc.next();
        char mystr[]=str.toCharArray();
        sort(mystr);
    }
}
