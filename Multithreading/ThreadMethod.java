package Multithreading;

public class ThreadMethod extends Thread{
    public void start()
    {
        System.out.println("start thread");
    }

    @Override
    public void run() {
        System.out.println("Run thread");
    }

    @Override
    public void interrupt() {
        System.out.println("Thread  Interrupted");
    }
}
