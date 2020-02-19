package javapart2;


class Hello
{
    private static Hello h;
    private Hello()
    {
    }
    public static Hello getobject()
    {
        //Here I am using Lazy Intantiation
        //At demand the object will created.

        if(h==null) {
            new Hello();
        }
        return h;
    }
}
public class Ques4Singleton {

    public static void main(String[] args) {
        Hello h=Hello.getobject();
    }
}
