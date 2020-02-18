import java.util.Scanner;

public class Ques1replace {
    //Replace string with another

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String ori=sc.nextLine();
        System.out.println("Enter the old string");
        String old=sc.nextLine();
        System.out.println("Enter new string");
        String nstr=sc.nextLine();

        System.out.println("Now string is :"+ori.replace(old,nstr));

    }
}
