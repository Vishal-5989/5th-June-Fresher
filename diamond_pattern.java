public class diamond_pattern {

    public static void main(String[] args) {

            for(int i = 1;i<=5;i++){ // for rows
                for(int j = 5;j>i;j--){
                    System.out.print(" "); // for columns space
                }
                for(int k = 1;k<=(2*i-1);k++)
                {
                    System.out.print("*"); // for printing *
                }
                System.out.print("\n"); // for printing *
            }

        for(int i = 4;i>=1;i--){ // for rows
            for(int j = 5;j>i;j--){
                System.out.print(" "); // for columns space
            }
            for(int k = 1;k<=(2*i-1);k++)
            {
                System.out.print("*"); // for printing *
            }
            System.out.print("\n"); // for printing *
        }


        }

}
