public class fibonnaci {
    public static void main(String[] args) {
        int a=0,b=1;
        while(a<=100)
        {
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;

        }
    }
}
