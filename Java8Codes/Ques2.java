package myjava8pack;


@FunctionalInterface
interface Operate
{
    int myReturnOne(int a,int b);
}
public class Ques2 {
    public static void main(String[] args) {

        Operate op=(a,b)->a+b;
        System.out.println("The return output in 1 integer: "+op.myReturnOne(4,5));
    }
}
