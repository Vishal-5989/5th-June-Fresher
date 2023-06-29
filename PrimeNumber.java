public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Print a prime number from 1 to 1000");

        for(int number = 2; number<=100; number++){
            boolean isprime = true;
            for(int i =2; i <= Math.sqrt(number); i++){
                if(number % i ==0){
                    isprime = false;
                    break;

                    
                }
            }
            if(isprime){
                System.out.println(number + " ");
        }

        }


    }
}
