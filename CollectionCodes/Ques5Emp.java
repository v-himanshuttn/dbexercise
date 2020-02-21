package mycollection;

import java.util.*;

class Employee
{
    String name;
    Double age,salary;

    public Employee() {
    }

    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}

class Sortbysalary implements Comparator
{
    @Override
    public int compare(Object o, Object o1) {


        Employee emp1=(Employee)o;
        Employee emp2=(Employee)o1;

        if(emp1.salary==emp2.salary)
        {
        return 0;
        }
        else if(emp1.salary<emp2.salary)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    //sort employee object based on highest salary

}
public class Ques5Emp {

    public static void main(String[] args) {

        //First store some Emp object in Array List

        Employee e1=new Employee("kamal",12.0,45000.50);
        Employee e2=new Employee("rahul",22.0,55000.50);
        Employee e3=new Employee("mike",42.0,450000.50);
        Employee e4=new Employee("murphy",40.0,65000.50);
        List<Employee> li=new ArrayList<>();
        li.add(e1);li.add(e2);li.add(e3);li.add(e4);

        System.out.println("All data is :");
        System.out.println("Age    name     salary");
        System.out.println("----------------------------------");

        Iterator it =li.iterator();
        while (it.hasNext())
        {
            Employee temp=(Employee) it.next();
            System.out.println(temp.getAge()+"  "+temp.getName()+"  "+temp.getSalary());
        }
        System.out.println("---------------------------------------------------------------");
        Collections.sort(li,new Sortbysalary());

        System.out.println("\nSo here the result of Employee objects based on highest salary......");
        Iterator it2 =li.iterator();

        while (it2.hasNext())
        {
            Employee temp=(Employee) it2.next();
            System.out.println(temp.getAge()+"  "+temp.getName()+"  "+temp.getSalary());
           }
    }

}
