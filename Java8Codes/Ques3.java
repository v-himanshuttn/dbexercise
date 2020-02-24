package myjava8pack;

@FunctionalInterface
interface Myoperate
{
   int myGenericOperate(int a,int b);
}
public class Ques3 {

    //Instance method
    int myAdd(int a,int b)
    {
        return a+b;
    }
    int mySub(int a,int b)
    {
        return a-b;
    }

    //static method


    static int myMultiply(int a,int b)
    {
        return a*b;
    }

    public static void main(String[] args) {

        //using instance method
        //Adding
        System.out.println("Instance method");
        Myoperate myoperate=new Ques3()::myAdd;

        System.out.println("Sum is: "+myoperate.myGenericOperate(2,3));
        //Subtract
        myoperate=new Ques3()::mySub;
        System.out.println("Subtract is: "+myoperate.myGenericOperate(3,1));
        System.out.println("---------------------------------------");

        System.out.println("Static method");
        myoperate=Ques3::myMultiply;
        System.out.println("Multiplication: "+myoperate.myGenericOperate(3,4));

    }
}
