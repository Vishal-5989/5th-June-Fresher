package Programs;

public class BusinessLogic {
    public double add(double no1, double no2) {
        double addition=no1+no2;
        System.out.println("Addiotion of two numbers is = "+addition);
        return addition;
    }

    public void div(double no1, double no2) {
        double total=no1/no2;
        System.out.println("Division is ="+total);
    }

    public  static void sub(double no1, double no2) {
        double total=no2-no1;
        System.out.println("Subtration is ="+total);
    }

    public void multipication(double no1, double no2) {
        double total=no1*no2;
        System.out.println("Multiplication is ="+total);
    }
}
