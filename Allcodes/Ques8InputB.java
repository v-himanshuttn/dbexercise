package javapart2;

import java.util.Scanner;

public class Ques8InputB {

    //With do-while loop

        public static void main(String[] args) {

            System.out.println("Reading word from user untill it typed 'done ..'");
            Scanner sc=new Scanner(System.in);
            String str;
            int c=0;
            do
            {
                str=sc.next();
                if(str.equals("done"))
                {
                    break;
                }
                else
                {
                    if(str.charAt(c)==str.charAt(str.length()-1))
                    {
                        System.out.println("Yes first and last character is same..");
                    }
                    else
                    {
                        System.out.println("Not same first and last character..");
                    }
                }
            }while (true);
        }
    }


