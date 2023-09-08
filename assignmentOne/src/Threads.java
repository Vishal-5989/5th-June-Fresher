class Threading extends Thread{
    public void run(){
        // Task 1
        // It will print 101 to 200
        System.out.println("Task1");
        for(int i = 101; i <= 200; i++){
            System.out.print(i+" , ");
        }
    }
}

class Task2 implements Runnable{
    public void run(){
        // Task 1
        // It will print 101 to 200
        System.out.println("Task2");
        for(int i = 1; i <= 100; i++){
            System.out.print(i+" , ");
        }
    }

}
public class Threads{
    void thread() throws InterruptedException {

        Threading task1 = new Threading();
        task1.start();

        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.start();

        // Task 2
        //It will print 201 to 300
        System.out.println("Thread1");
        for(int i = 201; i <= 300; i++){
            System.out.print(i+" , ");
        }
        // Task 3
        //It will print 301 to 400
        System.out.println("Thread2");
        for(int i = 301; i <= 400; i++){
            System.out.print(i+" , ");
        }
    }
}
