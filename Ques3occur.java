import java.util.Scanner;

public class Ques3occur
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str="my name is kamal";

        int ori=str.length();
        System.out.println("Enter the character for which  occurence is finding");
        String t=sc.nextLine();
        int newlen=str.replace(t,"").length();
        int occurence=ori-newlen;
        System.out.println("The "+t+" character is occurence is: "+occurence);
    }
}
