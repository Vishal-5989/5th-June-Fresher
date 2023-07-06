package LeetCode;

import java.util.Scanner;

public class MainClass {
    static  Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Select option");
        String products[]={"SOAP","VEGETABLES","DETERGENT","SNACKS"};
        double price[]={24,45,35,66};
        double cart[]=new double[price.length];
        boolean operation=true;
       while(operation){
           System.out.println("1:ADD TO CART\t2:DISPLAY BILL\t3:EDIT CART\t4:DISPLAY CART\t5:Exit");
           int option=sc.nextInt();
           if(option==1){
               for (int i = 0; i < price.length; i++) {
                   System.out.println(price[i]);
               }
               addToCart(cart,price);
           } else if (option==2) {
               displayBill(cart,products);
           } else if (option==3) {
               System.out.println("Select product cancel product");
              cancelProduct(cart,price);
           } else if(option==4){
               System.out.println("YOUR CART IS");
               displayCart(products);
           }else if(option==5){
               operation=false;
           }else{
               System.out.println("Invalid Choice");
           }
       }
    }

    private static void displayCart(String[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    private static void cancelProduct(double[] cart,double[] price) {
        int product=sc.nextInt();
        if(product==1){
           cancelProductQty(cart,price);
        } else if (product==2) {
            cancelProductQty(cart,price);
        }else if(product==3){
            cancelProductQty(cart,price);
        } else if (product==4) {
            cancelProductQty(cart,price);
        }else{
            System.out.println("Invalid product");
        }
    }

    private static void displayBill(double cart[],String products[]) {
        double total=0;
        for (int i = 0; i < cart.length; i++) {
            System.out.println(products[i]+"=\t"+cart[i]);
            total=total+cart[i];
        }
        System.out.println("Total Bill is "+total);
        if(total>=1000){
            total=total+total*0.1;
            System.out.println("Total Bill after GST is "+total);
        }else{
            total=total+total*0.05;
            System.out.println("Total Bill after GST is "+total);
        }
    }

    private static void addToCart(double cart[],double price[]) {
        System.out.println("Select product to add to cart");
        boolean status=true;
        while(status){
            System.out.println("1:SOAP\t2:VEGETABLE\t3:DETERGENT\t4:SNACKS\t5:EXIT");
            int choice=sc.nextInt();
            if (choice==1){
                System.out.println("Enter quantity");
                int qty=sc.nextInt();
                for (int i = 0; i < 1; i++) {
                    cart[i]=price[i]*qty;
                }
            } else if (choice==2) {
                System.out.println("Enter quantity");
                int qty=sc.nextInt();
                for (int i = 1; i < 2; i++) {
                    cart[i]=price[i]*qty;
                }
            } else if (choice==3) {
                System.out.println("Enter quantity");
                int qty=sc.nextInt();
                for (int i = 2; i < 3; i++) {
                    cart[i]=price[i]*qty;
                }
            } else if (choice==4) {
                System.out.println("Enter quantity");
                int qty=sc.nextInt();
                for (int i = 3; i < 4; i++) {
                    cart[i]=price[i]*qty;
                }
            } else if (choice==5) {
                status=false;
            } else{
                System.out.println("Invalid Choice");
            }
        }
    }
    private static void cancelProductQty(double[] cart,double[] price){
        int cancelProduct=sc.nextInt();
        System.out.println("Enter quantity");
        int qty=sc.nextInt();
        for (int i =cancelProduct-1 ; i < cancelProduct; i++) {
            cart[i]=cart[i]-(qty*price[i]);
            System.out.println("Cancelled Product Successfully");
        }
    }
}
