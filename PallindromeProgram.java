public class PallindromeProgram {
    public static void main(String[] args) {
        for(int i=11;i<=9999;i++)
        {
            int n=i;
            int rev=0;
            while(n>0) {
                int digit = n % 10; //separte digits
                rev = rev * 10 + digit;
                n=n/10;
            }
            if(rev==i)
            {
                System.out.print(i+" ");
            }
        }
    }

}
