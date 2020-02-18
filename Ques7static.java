public class Ques7static {
    static String firstname="himanshu";
    static String lastname="verma";
    static int age=20;

    static
    {
        System.out.println("In static ");
        firstname="kamal";
        lastname="ver";
        age=23;
    }

    public static void display()
    {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        display();
    }
}
