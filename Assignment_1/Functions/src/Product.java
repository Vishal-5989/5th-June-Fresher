public class Product {
     void divNum(){
        int num1=4;
        int num2=2;
        int ans=num1*num2;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        System.out.println("The given example no return type!!");
        Product mul=new Product();
        mul.divNum();
    }
}
