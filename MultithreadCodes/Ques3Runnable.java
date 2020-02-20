package mypack1;

class Myodd1 implements Runnable
{

    @Override
    public void run() {
        for (int i=1;i<=10;i+=2)
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
class Myeven1 implements Runnable
{

    @Override
    public void run() {
        for(int i=2;i<=10;i+=2)
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

public class Ques3Runnable {
    public static void main(String[] args) throws InterruptedException {

        Myeven1 ev=new Myeven1();
        Myodd1 od=new Myodd1();
        Thread t1=new Thread(ev);
        t1.start();

        Thread t2=new Thread(od);
        Thread.sleep(1000);
        t2.start();

    }
}
