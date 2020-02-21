package mycollection;

import java.util.*;

public class Ques1List {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //Define List
        List<Float> li=new ArrayList<>();

        int i=1;
        System.out.println("Enter the 5  floating numbers.");
        float fnum;
        while (i<=5)
        {
            fnum=sc.nextFloat();
            li.add(fnum);
            i++;
        }
        float sum=0.0f;
        ListIterator it =li.listIterator();
        while (it.hasNext())
        {
            sum+=(Float) it.next();
        }
        System.out.println("The sum of all floating element in the list is :"+sum);


    }
}
