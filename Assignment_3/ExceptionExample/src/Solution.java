import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("*************MENU****************\n");
            System.out.println(" 1.Try catch block \n 2.ArrayIndexOutOfBounds Exception \n 3.FileNotFound Exception \n 4.Multiple catch block \n " +
                    "5.catch block again try and catch block \n 6.NestedTryBlock \n 7.finally block \n 8.Exit ");
            System.out.println("Enter Your Choice!!!");
            choice= sc.nextInt();
            Solution s = new Solution();
            ExceptionClass e=new ExceptionClass();
            switch (choice){
                case 1: {
                    e.exception_1();
                 }

                break;
                case 2:{
                    e.exeception_2();
                }
                break;
                case 3:
                {
                    e.exeception_3();
                }
                break;
                case 4:
                {
                    e.exception_4();

                }
                break;
                case 5:
                {
                    e.exception_5();

                }
                break;
                case 6:
                {
                    e.exception_6();

                }
                break;
                case 7:
                {
                    e.exception_7();

                }
                break;
                case 8:
                    System.out.println("Thank You For Visiting !!!!");
                    break;

                default:
                    System.out.println("You Have Enter Wroung Choice!!");
                    break;

            }
        }while (choice!=8);
    }
}
