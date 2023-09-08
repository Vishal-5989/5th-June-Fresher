import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("(1) Prime number");
        System.out.println("(2) Areaand and perimeter");
        System.out.println("(3) Count number");
        System.out.println("(4) Pair of string");
        System.out.println("**********************************");

        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            switch (choice){
                case 1:
                    PrimeNumber p = new PrimeNumber();
                    p.primeNumber();
                    break;
                case 2:
                    AreaandPerimeter a = new AreaandPerimeter();
                    a.value();
                    break;
                case 3:
                    CountNumber c = new CountNumber();
                    c.countNumber();
                    break;
                case 4:
                    PairOfString pair = new PairOfString();
                    pair.compare();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
        }
    }
}