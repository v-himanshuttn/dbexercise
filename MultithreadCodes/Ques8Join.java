package mypack1;


class MyThread extends Thread
{
    @Override
    public void run() {
        System.out.println("hey i am executing..."+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished");
    }
}
public class Ques8Join {
    public static void main(String[] args) {

        MyThread t1= new MyThread();
        MyThread t2=new MyThread();

        t1.start();

        //starts second thread when thread t1 has died
        try{
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
