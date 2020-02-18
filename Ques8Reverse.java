import java.util.Scanner;

public class Ques8Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String mystr=sc.nextLine();

        StringBuffer str=new StringBuffer(mystr);

        //Reverse
        System.out.println("Reverse of string is :" +str.reverse());

        System.out.println("Now string is:"+str);
        //remove 4 to 9
        //here delete element till (9-1) index
        System.out.println("Removed string is :"+str.delete(4,9));

    }
}
