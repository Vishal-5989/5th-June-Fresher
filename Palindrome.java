public class Palindrome {
    public static void isPalindrome(int num){
        //The number that remains the same when its reverse
        int rem;
        int sum=0;
        int temp=num;
        while (num > 0){

            rem = num % 10;
            sum = sum*10 + rem;
            num = num / 10;
        }
        if (sum == temp){

            System.out.println(" Palindrome Number Is: "+temp);
        }

    }
    public static void main(String[] args){
        for(int num = 11; num<= 999; num++){

            isPalindrome(num);
        }
    }
}
