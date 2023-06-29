import java.util.Scanner;

public class Division {
    public int divNum(){
        int num1=4;
        int num2=2;
        int ans=num1/num2;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("The given example return type i.e method is return something");
        Division div=new Division();
        int res=div.divNum();
        System.out.println(res);

    }
}
