public class PalindromeNo {

    public int checkPalindrome(int a)
    {
        int rem,sum =0;
        while(a>0)
        {
            rem = a%10;
            sum = sum*10 +rem;
            a = a/10;
        }
        return sum;
    }

    public static void main(String[] args){
        PalindromeNo pn = new PalindromeNo();
        for(int i = 11; i <= 999;i++)
        {
            int temp = i;
            int res = pn.checkPalindrome(i);
            if(temp == res)
            {
                System.out.println(temp);
            }
        }

    }
}
