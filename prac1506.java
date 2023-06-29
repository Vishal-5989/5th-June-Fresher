import java.util.Scanner;
//Switch
/*public class prac1506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week day: ");
        int wk = sc.nextInt();
        System.out.println(wk);

        int war=  wk;

        switch (war){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

        }

    }
}
*/

public class prac1506 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= 0;

        do{
            System.out.println("Input a number:");
             number = sc.nextInt();
            System.out.print("Here is your number :");
            System.out.println(number);
        } while (number>=0);
        System.out.println("The end");
    }
}