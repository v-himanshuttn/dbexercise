package javapart2;

public class Ques3b {
    public static void main(String[] args) {
        //NoclassDefFoundError example

        try
        {
                B b=new B();
        }
        catch (NoClassDefFoundError ex)
        {
            ex.printStackTrace();
        }
    }
}

class B
{
    int a=10;
}
