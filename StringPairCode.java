import java.util.Scanner;

public class StringPairCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        int count=sc.nextInt();
        String[] pair=new String[count];
        for (int i = 0; i <pair.length ; i++) {
            pair[i]=sc.next();
        }
        for (int i = 0; i < pair.length; i++) {
            int sum=1;
            for (int j = i+1; j < pair.length ; j++) {
                if(pair[i]==pair[j]){
                    sum++;
                }

               if(sum>0){
                   System.out.println(pair[i]+"\t"+sum);
               }
            }

        }

    }
}
