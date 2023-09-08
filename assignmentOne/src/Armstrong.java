public class Armstrong {
    void armstrong(){
        for (int i = 3; i<1000; i++) {
            int check, reminder, sum = 0;
            check = i;
            while (check != 0) {
                reminder = check % 10;
                sum = sum + (reminder * reminder * reminder);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}
