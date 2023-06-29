import java.util.Scanner;
// with argu , without return type
public class Addistion {

    public void getAddistion(int input1,int input2){
            int result = input1+input2;
            System.out.println("Addistion -> " +result);
    }
    public static void main(String[] args) {
        Addistion add = new Addistion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int input1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int input2=sc.nextInt();
        add.getAddistion(input1,input2);

    }
}