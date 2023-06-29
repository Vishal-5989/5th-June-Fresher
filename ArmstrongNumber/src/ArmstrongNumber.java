public class ArmstrongNumber {
    public void listArmstrongNumber() {
        for (int i = 3; i <= 1000; i++) {
            int check;
            int reminder;
            int sum = 0;
            check = i;
            while (check != 0) {
                reminder = check % 10;
                sum = sum + (reminder * reminder * reminder);
                check = check / 10;

            }
            if (sum == i) {
                System.out.println(i + " Is an ArmstrongNumber");
            }
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber ArmstrongNumber = new ArmstrongNumber();
        ArmstrongNumber.listArmstrongNumber();

    }
}
