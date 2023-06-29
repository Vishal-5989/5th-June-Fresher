public class Fibonacci {
 //0 1 1 2 3 5 8

    public static void main(String[] args){

        int d1=0;
        int d2=1;
        int d3;

        System.out.println(d1);
        System.out.println(d2 );

        for(int i=2; i<10;i++){

            d3=d1+d2;
            System.out.println(  d3);
            d1=d2;
            d2=d3;




        }
    }

}
