public class Palindrome {
    void palindrome(){
        for (int i = 11; i<9999; i++) {
            int check, reminder, sum = 0;
            check = i;
            while (check != 0) {
                reminder = check % 10;
                sum = (sum*10) + reminder;
                check = check / 10;
            }
            if (sum == i) {
                System.out.println(i + " is a palindrome number.");
            }
        }
    }
}
