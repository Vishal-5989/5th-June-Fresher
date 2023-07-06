package Multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting");
        ThreadMethod t=new ThreadMethod();
        t.start();
        t.run();
        t.interrupt();
        
    }
}
