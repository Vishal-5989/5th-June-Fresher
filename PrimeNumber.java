public class PrimeNumber {
    public static void main(String args[]){
        System.out.println("\nPrime Number from 1 to 1000 are: ");
        for(int i=2;i<=1000;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }

            }
            if(count==2){
                System.out.print(i+ " ");
            }
        }


    }


}
