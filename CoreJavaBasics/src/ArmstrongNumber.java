public class ArmstrongNumber {

        public static void main(String[] args){

            int n,d,sum=0;

            System.out.println("armstrong from 1 to 1000 are :");


            for (int i =1;i<=1000;i++){

                n=i;

                while (n>0){

                    d=n%10;

                    sum=sum + d*d*d;

                    n=n/10;

                }

                if (sum == i){

                    System.out.println(i + " ");

                }

                sum=0;

            }


        }

    }


