package mypack1;

import java.util.Scanner;

class Mytask extends Thread
{
    private volatile boolean rstatus=true;
        public void run()
        {
            while(rstatus)
            {
                System.out.println("I am running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void updateStatus()
        {
            rstatus=false;
        }
}
public class Ques2volatile {

    //volatile keyword allows to multiple thread to modify value from the main memory instead of dedicated cache memory.

    public static void main(String[] args) {
        //Here I am starting the thread
        Mytask mt=new Mytask();
        mt.start();

        //and the main thread is also in execution phase and now two threads concurrenty runnung
        Scanner sc=new Scanner(System.in);
        sc.nextLine();

        mt.updateStatus();
        System.out.println("Stop");
    }

}
