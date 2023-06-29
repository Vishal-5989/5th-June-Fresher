public class ButterflyPattern {
    public static void main(String[] args){
        int patnum = 8;

        for(int i = 1;i <=patnum; i++){
            for(int j =1; j <= i; j++){
                System.out.print("* ");
            }
            int spaces = 2 * (patnum - i);

            for(int k = 1; k<=spaces;k++ ){
                System.out.print("  ");
            }
            for(int g=1;g<=i;g++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = patnum;i >=1; i--){
            for(int j =1; j <= i; j++){
                System.out.print("* ");
            }
            int spaces = 2 * (patnum - i);

            for(int k = 1; k<=spaces;k++ ){
                System.out.print("  ");
            }
            for(int g=1;g<=i;g++ ){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
