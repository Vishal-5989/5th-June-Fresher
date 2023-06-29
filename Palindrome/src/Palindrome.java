import java.util.Scanner;
public class Palindrome {
    public static void findPalindrome(int inpute){

      int num = inpute;
     int rev=0;
     while(inpute!=0){

        int reminder = inpute%10;
        rev= rev*10+reminder;
        inpute= inpute/10;

    }
    if(rev==num) {
        System.out.println(rev);
    }
}
    public static void main(String[] args) {

        for(int i=10; i<=999;i++){
            Palindrome.findPalindrome(i);
        }

    }

}

