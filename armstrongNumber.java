public class armstrongNumber {
    public static void main(String[] args) {
        for(int num=2;num<=1000;num++) {
            int sum = 0, i=num;
            while (i > 0) {

                int rev = i% 10;
                sum = sum +( rev * rev * rev);
                i = i/ 10;

            }
            if(num == sum)
            {
                System.out.println(num);
            }
        }

    }
}
