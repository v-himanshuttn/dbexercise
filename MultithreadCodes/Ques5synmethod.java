package mypack1;

class MyThread1 {
    int x,y;
    synchronized void add(int a,int b){
        System.out.println("Hi");
        System.out.println("Bye");
        int s=a+b;
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Addition="+s);
    }
}
class Thread1 extends Thread{
    MyThread1 q;
    Thread1(MyThread1 o){
        q=o;
    }
    public void run(){
        q.add(4,5);
    }
}

class Thread2 extends Thread {
    MyThread1 q;

    Thread2(MyThread1 o) {
        q = o;
    }

    public void run() {
        q.add(8, 6);
    }
}

    public class Ques5synmethod {

        public static void main(String[] args) {
            MyThread1 ob=new MyThread1();
            Thread1 t1=new Thread1(ob);
            Thread2 t2=new Thread2(ob);
            t1.start();
            t2.start();

        }

    }
