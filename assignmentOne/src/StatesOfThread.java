/*
    These are the states of the thread
    NEW
    RUNNABLE
    RUNNING
    BLOCKED/WAITING
    TERMINATED/DEAD
*/
class ThreadingTest extends Thread{
    public void run(){
        // Task 1
        // It will print 1 to 100
        System.out.println("Task1");
        for(int i = 1; i <= 100; i++){
            System.out.print(i+" , ");
        }
    }
}
class ThreadingTest2 implements Runnable{
    public void run(){
        // Task 2
        // It will print 101 to 200
        System.out.println("Task2");
        for(int i = 101; i <= 200; i++){
            System.out.print(i+" , ");
        }
    }
}
public class StatesOfThread {
    void statesOfThread() throws InterruptedException {

        ThreadingTest thread1 = new ThreadingTest();
        thread1.setPriority(1);  // Here we can set the priority of a thread
        thread1.start();

        ThreadingTest2 task2 = new ThreadingTest2();
        Thread thread2 = new Thread(task2);
        thread2.setPriority(10);
        thread2.start();

        // The wait() method causes the current thread to wait until another thread invokes
        thread1.wait();
        // wait for task 1 to complete
        thread2.join();

        // Task 3
        //It will print 201 to 300
        System.out.println("Task3");
        for(int i = 201; i <= 300; i++){
            System.out.print(i+" , ");
        }
    }
}
