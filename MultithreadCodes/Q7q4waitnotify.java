package mypack1;

//With wait() and notify() i want that thread completes its task first and then other will completes its task.
//Here there are two threads First(thread) will print the odd numbers.


class First
{
    public void myProducer() throws InterruptedException {
        synchronized (this)
        {
            System.out.println("By Producer->>>>Produced");
            wait();
            System.out.println("The item is consumed and resumed");
        }
    }
    public  void myConsumer() throws InterruptedException {
        synchronized (this)
        {
            Thread.sleep(3000);
            System.out.println("By Consumer ->>> Consumed");
            notify();
        }
    }

}


public class Q7q4waitnotify {
    public static void main(String[] args) {

        First f1=new First();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    f1.myProducer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    f1.myConsumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }

}
