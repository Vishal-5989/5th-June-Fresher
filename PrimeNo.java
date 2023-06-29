public class PrimeNo {

    public static void main(String[] args) {
        System.out.println("Prime numbers are: ");
        for (int num = 2; num <= 1000; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    System.out.print(num+" ");
                }
            }
        }
    }
