import java.util.Scanner;

public class Ques4percent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        String str1=str.replace(" ","");
        int tn=str1.length();
        int up=0,lc=0,dg=0,sp=0;
       for(int i=0;i<str1.length();i++)
       {
           if(Character.isUpperCase(str1.charAt(i)))
           {
               up++;
           }
           else if(Character.isLowerCase(str1.charAt(i)))
           {
               lc++;
           }
           else if(Character.isDigit(str1.charAt(i))){
               dg++;
           }
           else
           {
               sp++;
           }
       }

        float pup,plc,pdg,psp;
        pup=(float) up/tn*100;
        plc=(float)lc/tn*100;
        pdg=(float) dg/tn*100;
        psp=(float) sp/tn*100;

        System.out.println("-------------------------------------------------------");
        System.out.println("Frequency of uppercase character "+up +" and percentage is " +pup);
        System.out.println("Frequency of lowercase character "+lc +" and percentage is " +plc);
        System.out.println("Frequency of digit character "+dg +" and percentage is " +pdg);
        System.out.println("Frequency of special character "+sp +" and percentage is " +psp);



    }
}
