package mycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques3occurence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Map<Character,Integer> m=new HashMap<>();
        System.out.println("Enter the string..");
        String str=sc.nextLine();
        String str1=str.replace(" ","");
        System.out.println(str1);

        char []ch=str1.toCharArray();
        int kval;

        for (int i=0;i<ch.length;i++)
        {
            if(m.containsKey(ch[i]))
            {
                kval=m.get(ch[i]);
                m.put(ch[i],kval+1);

            }
            else
            {
                m.put(ch[i],1);
            }
        }

        System.out.println("Key--Occurence");
        for(Map.Entry<Character,Integer> entry :m.entrySet())
        {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

    }
}
