public class PrimeNumbers {
    public static void main(String[] args) {
        int no,i;

        for (no = 2; no<=1000 ; no++) {
            int count=0;
            for (i=2;i<no/2;i++) {
                if(no%i==0){
                    count++;
                    break;
                }
            }
            if(count==0 && no!=1){
                System.out.println("Prime numbers are "+no);
            }

        }
    }
}
