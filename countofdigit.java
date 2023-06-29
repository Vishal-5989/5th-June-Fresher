public class countofdigit {
    public static void main(String[] args) {
        int count=0;
        int num=12227345;
        while (num !=0) {
            num /=10;
            count++;
        }
        System.out.println("Count of number in given digit is :"+count);
    }
}
