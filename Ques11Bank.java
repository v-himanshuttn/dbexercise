import java.sql.SQLOutput;

class Bank
{
 public void getDetails()
 {
     System.out.println("Bank Information");
     System.out.println("Here the details of Bank displayed..");
     System.out.println("The standard Rate of interest is 5%");
 }
}
class SBI extends Bank
{

    public void getDetails()
    {

        System.out.println("\nSBI Information");
        System.out.println("Here the details of SBI displayed..");
        System.out.println("The SBI Rate of interest is 10%");
    }
}
class BOI extends Bank
{
    public void getDetails()
    {
        System.out.println("\nBOI Information");
        System.out.println("Here the details of BOI displayed..");
        System.out.println("The BOI Rate of interest is 11%");
    }
}
class ICICI extends Bank
{
    public void getDetails()
    {
        System.out.println("\nICICI Information");
        System.out.println("Here the details of ICICI displayed..");
        System.out.println("The ICICI Rate of interest is 12%");
    }

}
public class Ques11Bank {
    public static void main(String[] args) {
       Bank b1=new Bank();
       b1.getDetails();
       Bank b2=new SBI();
        b2.getDetails();
        Bank b3=new SBI();
        b3.getDetails();
        Bank b4=new SBI();
        b4.getDetails();
    }
}
