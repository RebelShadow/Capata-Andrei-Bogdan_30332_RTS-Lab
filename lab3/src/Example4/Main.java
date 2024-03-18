package Example4;

import example3.JoinTestThread;

public class Main {
    public static void main(String[] args) {
        ThreadGroup t1=new ThreadGroup("Thread Group 1");
        ThreadEx w1 = new ThreadEx(t1,"t1");
        ThreadEx w2 = new ThreadEx(t1, "t2");

        ThreadGroup t2 = new ThreadGroup("Thread group 2");
        ThreadEx w3 = new ThreadEx(t2,"t3");

        w1.start();
        w2.start();
        w3.start();
    }

}

class ThreadEx extends Thread {

    boolean stop;

    ThreadEx(ThreadGroup tg, String name) {

        super(tg, name);

        stop = false;

    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " ON.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(this.getName()+" ");
                Thread.sleep(250);
                synchronized (this) {
                    if (stop) break;
                }
            }
        } catch (Exception exc) {
            System.out.println(Thread.currentThread().getName() + " intrerupt.");
        }
        System.out.println(Thread.currentThread().getName() + " The end.");
    }

    public void stopThread() {
        stop = true;
    }
}

