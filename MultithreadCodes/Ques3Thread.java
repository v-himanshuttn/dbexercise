package mypack1;
class Myodd extends Thread
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
class Myeven extends Thread
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

public class Ques3Thread {
    public static void main(String[] args) throws InterruptedException {
        Myodd md=new Myodd();
        md.start();
        Thread.sleep(1000);
        Myeven me=new Myeven();
        me.start();
    }
}
