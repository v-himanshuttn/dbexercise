package javapart2;


abstract class Furniture
{
    abstract public void stress_Test();
    abstract public void fire_Test();
}

 abstract class Wooden extends Furniture
{
}

abstract class Metal extends Furniture
{
}
class Chair extends Wooden
{

    @Override
    public void stress_Test() {
        System.out.println("Wooden chair passed in stress");
    }

    @Override
    public void fire_Test() {
        System.out.println("Wooden chair passed in fire");

    }
}
class Table extends Wooden
{

    @Override
    public void stress_Test() {
        System.out.println("Wooden table passed in stress");

    }

    @Override
    public void fire_Test() {
        System.out.println("Wooden table passed in fire");

    }
}

class Chair1 extends Metal
{

    @Override
    public void stress_Test() {
        System.out.println("Metal chair1 passed in stress");

    }

    @Override
    public void fire_Test() {
        System.out.println("Metal chair1 passed in fire");

    }
}
class Table1 extends Metal
{

    @Override
    public void stress_Test() {
        System.out.println("Metal table1 passed in stress");

    }

    @Override
    public void fire_Test() {
        System.out.println("Metal table1 passed in fire");
    }
}
public class Ques9Furniture {
    public static void main(String[] args) {
        Furniture f=new Chair() ;
        f.stress_Test();
        f.fire_Test();

        f=new Table();
        f.stress_Test();
        f.fire_Test();

        //End of wooden
        System.out.println("------------------------------");
        //Start for metal
        f=new Chair1();
        f.stress_Test();
        f.fire_Test();
        f=new Table1();
        f.stress_Test();
        f.fire_Test();


    }
}
