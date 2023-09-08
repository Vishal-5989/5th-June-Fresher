import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

class CallableTask implements Callable<String>{
    //  Callable , represents an asynchronous task which can be executed by a separate thread.
    private String name;
    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(2000); // thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers.
        return "Hello " + name;
    }
}
public class CallableRunner{
    void callableRunner() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("This is threading rivison"));
        System.out.println("Callable executed");
        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);
        System.out.println("Main completed");
        executorService.shutdown();

        System.out.println("\nMultiple callable statement\n");

        ExecutorService executorService2 = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("My"), new CallableTask("name is"), new CallableTask("Vishal Kadiya"));
        List<Future<String>> results = executorService2.invokeAll(tasks);
        String singleResult = executorService2.invokeAny(tasks);
        for(Future<String> result:results){
            System.out.println(result.get());
        }
        System.out.println(singleResult);
        executorService2.shutdown();
    }
}
