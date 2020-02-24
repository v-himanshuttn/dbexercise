package myjava8pack;

interface Mydefault
{
    //default
    default void inDeafult()
    {
        System.out.println("Yes i am in default method (non abstract)....");
    }

    //static
    static void inStatic()
    {
        System.out.println("Yes i am in static method..");
    }
}
public class Ques6 implements Mydefault {
    public static void main(String[] args) {
        Ques6 q=new Ques6();
        q.inDeafult();

        System.out.println("------------------------");
        Mydefault.inStatic();

    }
}
