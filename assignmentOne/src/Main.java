import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("1 For diamond pattern");
        System.out.println("2 For fibonacci series");
        System.out.println("3 For armstrong number");
        System.out.println("4 For all types of function program");
        System.out.println("5 For palindrome number");
        System.out.println("6 For stream API");
        System.out.println("7 For threading");
        System.out.println("8 For states of thread");
        System.out.println("9 For executor service");
        System.out.println("10 For callable runner ( This function is contain single callable and multiple callable statement )");

        int choice;
        System.out.println("Enter your choice :");
        Scanner n = new Scanner(System.in);
        choice = n.nextInt();

        switch (choice) {
            case 1:
                Diamondpattern d = new Diamondpattern();
                d.method();
                break;

            case 2:
                Fibonacci f = new Fibonacci();
                f.fibonacci();
                break;

            case 3:
                Armstrong a = new Armstrong();
                a.armstrong();
                break;

            case 4:
                Functions fun = new Functions();
                System.out.println("--------------------------Predefine function------------------------------------");
                fun.preDefined();
                System.out.println("\n\n----------------------User defined parameteriezed function------------------");
                fun.userDefined(12,2);
                System.out.println("\n\n----------------------Function returning a value----------------------------");
                int x = fun.returnValue(12,2);
                System.out.println(x);
                break;

            case 5:
                Palindrome p = new Palindrome();
                p.palindrome();
                break;

            case 6:
                Stream t = new Stream();
                t.test();
                break;

            case 7:
                Threads thread = new Threads();
                thread.thread();
                break;

            case 8:
                StatesOfThread threadingTest = new StatesOfThread();
                threadingTest.statesOfThread();
                break;

            case 9:
                ExecutorService execute = new ExecutorService();
                execute.executorService();
                break;

            case 10:
                CallableRunner callableRunner = new CallableRunner();
                callableRunner.callableRunner();
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
}