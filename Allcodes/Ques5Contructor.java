package javapart2;

class Demo
{
    public String name;
    public int age;

    Demo(String n,int val)
    {
        name=n;
        age=val;
    }

    //Copy constructor
    Demo (Demo demo1)
    {
        name=demo1.name;
        age=demo1.age;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Ques5Contructor {

    //Copy Constructor
    public static void main(String[] args) {

        //First create object
        Demo demo1=new Demo("kamal",12);

        System.out.println("The value of demo1 object is:"+demo1);
        //Now copy-construtor
        Demo demo2=new Demo(demo1);
        System.out.println("The value of demo2 object is :"+demo2);


    }
}
