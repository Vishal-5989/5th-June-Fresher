public class Palindromenumber {


     public static void isPalindome(int num) {
         int rem;
         int sum=0;
         int temp = num;
         while (num > 0) {


             rem = num % 10;
             sum = sum*10 + rem;
             num = num / 10;
         }
         if (sum == temp) {

             System.out.println(" Palindrome Number Is:" + temp);
         }

     }

     public static void main(String[] args){
         for(int num = 11; num<= 999; num++){

                  isPalindome(num);
         }








     }
}
