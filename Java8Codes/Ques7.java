package myjava8pack;


interface Mydefault1
{
    //default
    default void inDefault1()
    {
        System.out.println("Yes i am in default method (non abstract)....");
    }

}

public class Ques7 implements Mydefault1 {

@Override
    public void inDefault1()
    {
        System.out.println("Yes i am overridding this default method");
    }
    public static void main(String[] args) {

         Ques7 q1=new Ques7();
        q1.inDefault1();
    }
}
