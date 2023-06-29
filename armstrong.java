public class armstrong {
    public static void main(String[] args) {
        for(int a = 2;a<=1000;a++){
            int b = a;
            int num=0;
            while(b>0){
                int rev = b%10;
                num = num + rev*rev*rev;
                b = b/10;
            }
            if(a==num){
                System.out.println(a);
            }
        }
    }
}
