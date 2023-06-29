import java.util.Scanner;

class Solution{
    public boolean palindrome(int num){
        int x = num;
        int result = 0;

        while (x != 0) {
            int rem = x % 10;
            result = result * 10;
            result += rem;
            x = x / 10;
        }
        return result == num;
    }

    public  void fiboSeries(int x) {
        int ans = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < x; i++) {
            ans = a + b;
            System.out.print(" " + ans);
            a = b;
            b = ans;
        }
        System.out.println("\n");
    }
    public  boolean armsNum(int num){
        int x=num;
        int result=0;
        while(x!=0){
            int rem=x%10;
            result+=Math.pow(rem,3);    //inbuilt function
            x=x/10;
        }
        return result==num;
    }
}

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("*************MENU****************\n");
            System.out.println(" 1.Palindrome Number \n 2.Armstrong Number \n 3.Fibonacii Series \n 4.Daimond Pattern \n 5.Exit ");
            System.out.println("Enter Your Choice!!!");
            choice= sc.nextInt();
            Solution s = new Solution();
            switch (choice){
                case 1: {

                    System.out.println("Enter The Range Of Numbers!!");
                    System.out.println("Enter The First Number!!!");
                    int n1 = sc.nextInt();
                    System.out.println("Enter The Second Number!!!");
                    int n2 = sc.nextInt();
                    int count = 0;
                    for (int i = n1; i <= n2; i++) {

                        if (s.palindrome(i)) {      //Function call
                            count += 1;
                            System.out.println(i);
                        }

                    }
                    System.out.println("Total Number of Palindrome Number is " + count);

                }
                    break;
                case 2:{
                    System.out.println("Armstrong Number from 10 to 999");
                    for (int i=2;i<=1000;i++){
                        if (s.armsNum(i)){          //Function call
                            System.out.println(i);
                        }
                    }
                }
                    break;
                case 3:
                {
                    System.out.println("Fibonaciii Series !!! ");
                    System.out.print("Enter The Number !!");
                    int num=sc.nextInt();
                    s.fiboSeries(num);      // Call The Function
                }
                    break;
                case 4:
                {
                    int i,j,k;
                    System.out.print("Input number of rows !! ");
                    Scanner in = new Scanner(System.in);
                    k = in.nextInt();
                    for(i=0;i<=k;i++)
                    {
                        for(j=1;j<=k-i;j++)
                            System.out.print(" ");
                        for(j=1;j<=2*i-1;j++)
                            System.out.print("*");
                        System.out.print("\n");
                    }

                    for(i=k-1;i>=1;i--)
                    {
                        for(j=1;j<=k-i;j++)
                            System.out.print(" ");
                        for(j=1;j<=2*i-1;j++)
                            System.out.print("*");
                        System.out.print("\n");
                    }

                }
                case 5:
                    System.out.println("Thank You For Visiting !!!!");
                    break;

                default:
                    System.out.println("You Have Enter Wroung Choice!!");

            }
        }while (choice!=5);
    }
}

