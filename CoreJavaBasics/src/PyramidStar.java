public class PyramidStar {

    public static void main(String[] args) {

        for(int i = 1 ; i < 5 ; i++)//loop for row
        {
            for(int k = 3; k>=i ; k--)// loop for the space
            {
                System.out.print(" ");
            }

            for(int j=1; j <= i; j++)//loop for column
            {
                System.out.print("* ");
            }
            System.out.println();

        }

        reversePyramidStar();

    }

    public static void reversePyramidStar()
    {
        for(int i =1; i< 5 ; i++)//loop for row
        {
            for(int k = 1; k<= i ; k++);//loop for spaces
            {
                System.out.print(" ");
            }

            for(int j = 1; j < 5 - i; j++)//loop for column.
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
