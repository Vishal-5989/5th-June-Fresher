public class DiamondPattern {

    public static void main(String[] args) {

        int rw=5;
        for(int i=0;i<rw;i++){
            for(int j=0;j<rw-i-1;j++){     //for space characters rw-i-1

                System.out.print(" ");
            }
            for(int j=0; j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();


        }
        for(int i=0;i<rw-1;i++){

            for(int j=0;j<=i;j++){

                System.out.print(" ");
            }
            for(int j=0;j<rw-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
