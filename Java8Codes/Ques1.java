package myjava8pack;


@FunctionalInterface
interface MyGreater
{
    boolean checkGreater(int a,int b);
}
@FunctionalInterface
interface MyIncrement
{
    int increNum(int a);
}
@FunctionalInterface
interface MyConcat
{
        String concatString(String a,String b);
}
@FunctionalInterface
interface MyConvert
{
        String convertUpper(String a);
}

public class Ques1 {
    public static void main(String[] args) {

        //(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
        System.out.println("Greater");
        MyGreater mg=(a,b)-> a>b;
        System.out.println(mg.checkGreater(2,4));
        System.out.println("------------------------------");
        //(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
        System.out.println("Increment by 1");
        MyIncrement mi=(a)->++a;
        System.out.println(mi.increNum(3));

        System.out.println("------------------------------");
        //(3) Concatination of 2 string                               Parameter (String , String ) Return (String)
        System.out.println("Concatenation");
        MyConcat mc=(a,b)->a+b;
        System.out.println(mc.concatString("him","anshu"));

        System.out.println("------------------------------");
        //(4) Convert a string to uppercase and return .
        System.out.println("Convert to Uppercase");
        MyConvert mct=(a)->a.toUpperCase();
        System.out.println(mct.convertUpper("himanshU"));

        System.out.println("------------------------------");
    }
}
