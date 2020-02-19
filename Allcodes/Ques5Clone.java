package javapart2;


class MyClone implements Cloneable
{
    public String name;
    public int age;

    MyClone(String n,int val)
    {
        name=n;
        age=val;
    }


    @Override
    public String toString() {
        return "MyClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Ques5Clone {
    public static void main(String[] args) throws CloneNotSupportedException{

        MyClone ob1=new MyClone("kamal",12);
        System.out.println("The ob1 value is :"+ob1);
        //calling clone method
        MyClone ob2=(MyClone) ob1.clone();
        System.out.println("The ob2 value is :"+ob2);


    }
}
