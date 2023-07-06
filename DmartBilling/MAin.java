package DmartBilling;

import java.util.Scanner;



public class MAin {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean status=true;
        System.out.println("ADD TO CART 2:DISPLAY CART 3:EDIT CART 4:DISPLAY BILL 5:EXIT");
        int choice =sc.nextInt();
        while(status){
            if(choice==1){
                addToCart();
            }else if(choice==2){
                displayCart();
            }else if(choice==3){

            }else if(choice==4){

            } else if (choice==5) {
                status=false;
            }else{
                System.out.println("INVALID CHOICE");
            }

        }
    }

    private static void addToCart() {

    }
    private static void displayCart() {

    }
}
