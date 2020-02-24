package myjava8pack;

class Employee
{
    String name,city;
    int age;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public Employee getObject()
    {
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}

@FunctionalInterface
interface Myinterface
{
 Employee getEmpInstance();

}
public class Ques4 {
    public static void main(String[] args) {


        Myinterface mi=new Employee("kamal","delhi",23)::getObject;
        System.out.println(mi.getEmpInstance());

    }
}
