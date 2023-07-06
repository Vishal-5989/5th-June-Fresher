package Programs;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        BusinessLogic b1=new BusinessLogic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select mode of operation");
        System.out.println("1:ADD\t2:DIVISION\t3:SUBTRACTION\t4:MULTIPLICATION");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter number 1");
            double no1=sc.nextDouble();
            System.out.println("Enter number 2");
            double no2=sc.nextDouble();
            double answer=b1.add(no1,no2);
        }else if(choice==2){
            System.out.println("Enter number 1");
            double no1=sc.nextDouble();
            System.out.println("Enter number 2");
            double no2=sc.nextDouble();
            b1.div(no1,no2);
        } else if (choice==3) {
            System.out.println("Enter number 1");
            double no1=sc.nextDouble();
            System.out.println("Enter number 2");
            double no2=sc.nextDouble();
            BusinessLogic.sub(no1,no2);
        } else if (choice==4) {
            System.out.println("Enter number 1");
            double no1=sc.nextDouble();
            System.out.println("Enter number 2");
            double no2=sc.nextDouble();
            b1.multipication(no1,no2);
        }else{
            System.out.println("Invalid Choice");
        }

    }
}
