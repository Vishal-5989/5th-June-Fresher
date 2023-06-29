public class RangePrime {

        public static void main(String[] args){
            int flag = 0,n1,n2;
            System.out.println("Range of prime number from 1 to 1000 :");
            for(n1 = 1; n1<=1000; n1++)
            {
                for(n2 = 2; n2<n1; n2++)
                {
                    if(n1 % n2 == 0)
                    {
                        flag = 0;
                        break;
                    }
                    else
                    {
                        flag = 1;
                    }
                }
                if(flag==1)
                {
                    System.out.print(n1 +",");
                }
            }
        }
    }

