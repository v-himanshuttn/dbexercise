package mypack1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Odd implements Runnable
{

    @Override
    public void run() {
        for (int i=1;i<=20;i+=2)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Even implements Runnable
{

    @Override
    public void run() {
        for(int i=2;i<=20;i+=2)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Ques6Threadpool {
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(2);

            executor.submit(new Odd());
            executor.submit(new Even());

            executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("End");

    }
}
