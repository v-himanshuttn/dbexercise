package javapart2;

public class Ques11Convertcode {
    public static void main(String[] args) {

        //Here i am converting the code and using while loop instead of for loop.
        int s = 0;
        int t = 1;
        int i=0,j;
        while (i < 10)
        {
            s = s + i;
            j=i;
            while(j>0)
            {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }
}
