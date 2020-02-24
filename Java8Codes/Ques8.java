package myjava8pack;

interface X
{
    default void display(){
        System.out.println("X display() is called..");
    }
}
interface Y
{
    default void display()
    {
        System.out.println("Y display() is called..");
    }
}
public class Ques8 implements  X,Y{
    @Override
    public void display() {
        //If we want to call X interface method
        X.super.display();

        //If we want to call Y interface method
        Y.super.display();
    }
    public static void main(String[] args) {
        Ques8 ques8=new Ques8();
        ques8.display();
    }


}
