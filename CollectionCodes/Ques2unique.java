package mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ques2unique {
    public static void main(String[] args) {
        //Creating Hashset
        Set<Character> s=new HashSet<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string..");
        String str=sc.nextLine();
        String str1=str.replace(" ","");
        char str2[]=str.toCharArray();
        System.out.println(str1);

        //Adding element in haashup
        for(int i=0;i<str2.length;i++)
        {
            s.add(str2[i]);
        }
        System.out.println(s);

    }


}
