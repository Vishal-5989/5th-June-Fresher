public class ArmstrongNumber {
    public static void main(String[] args){
        //AN is a number is equal to the sum of cubes of its digit

        int num, div, sum=0;
        System.out.println("Armstrong Numbers are:  ");

        for(int i=1; i<=1000; i++){

            num = i;
            while (num>0){

                div=num%10;
                sum=sum+div*div*div;
                num=num/10;
            }
            if(sum==i){
                System.out.println(i +" ");

            }
            sum=0;
        }
    }
}
