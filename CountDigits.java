public class CountDigits {
    public static void main(String[] args){

        int num = 65743;

        int count = 0;

        while (num>0)
        {
            num=num/10;  //to eliminate the last digit
             count++;    //count of remaining digits bcs last digit is eliminated
        }
        System.out.println("Number of digits are:" +count);
    }
}
