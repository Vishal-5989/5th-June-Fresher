import java.util.concurrent.Executors;
class Task1 extends Thread{

    private int number;
    public Task1(int number){
        this.number = number;
    }
    public void run(){  // signature
       System.out.println("Task1 "+number+" started");
       for (int i = number * 100; i <= number * 100 + 99; i++){
           System.out.print(i + " ");
       }
        System.out.println("Task1 done");
    }
}
public class ExecutorService {
    void executorService(){
        java.util.concurrent.ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1(1));
        executorService.execute(new Task1(2));
        executorService.execute(new Task1(3));
        executorService.execute(new Task1(4));
        executorService.execute(new Task1(5));
        executorService.execute(new Task1(6));
        executorService.execute(new Task1(7));

        /*
        An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchronous tasks.
        An ExecutorService can be shut down, which will cause it to reject new tasks. Two different methods are provided for shutting down an ExecutorService.
        The shutdown method will allow previously submitted tasks to execute before terminating, while the shutdownNow method prevents waiting tasks from starting
        and attempts to stop currently executing tasks. Upon termination, an executor has no tasks actively executing, no tasks awaiting execution,
        and no new tasks can be submitted. An unused ExecutorService should be shut down to allow reclamation of its resources.
         */

        executorService.shutdown();
    }
}
