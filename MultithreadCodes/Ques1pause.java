package mypack1;

public class Ques1pause extends Thread {
    public static void main(String[] args) throws InterruptedException {

        //Thread.sleep() method can be used to pause the execution of current thread for specified time in milliseconds.
        System.out.println("I am pausing the thread for 10000 ms");
        Thread.sleep(10000);
        System.out.println("I am Back");

    }
}
