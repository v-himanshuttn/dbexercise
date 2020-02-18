
public class Ques10Overload {
    //Add two integer
    public static void add(int num1,int num2)
    {
        System.out.println(num1+num2);
    }

    public static void add(double num1,double num2)
    {
        System.out.println(num1+num2);
    }

    public static void mul(float num1,float num2)
    {
        System.out.println(num1*num2);
    }

    public  static void mul(int num1,int num2)
    {
        System.out.println(num1*num2);
    }

    public static void myconcate(String a,String b)
    {
        System.out.println(a+b);

    }

    public static void myconcate(String a,String b,String c)
    {

        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
          add(2,3);
          add(3.5,3.4);

          mul(2,3);
          mul(1.2f,1.2f);

          myconcate("him","anshu");
          myconcate("him","an","shu");

    }
}
