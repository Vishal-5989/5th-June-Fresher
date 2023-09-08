public class PrimeNumber {
    void primeNumber(){
        for (int i = 2; i <= 1000; i++){
            isprime(i);
        }
    }
    void isprime(int n){
        int check = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = 0;
                break;
            }
        }
        if (check == 1) {
            System.out.println(n + " is a prime number");
        }
    }
}
