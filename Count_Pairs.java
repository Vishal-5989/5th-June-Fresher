import java.util.Scanner;

public class Count_Pairs {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        String []str=new String[10];
//        System.out.println("Enter your pairs\n and enter only 10 pairs");
//        for(int i=0;i<10;i++){
//            str[i]=sc.nextLine();
//        }
        String str[]={"AA","BN","AA","LO","AA","DO","KO","BN","LO","FO"};
        for (int i=0;i<str.length;i++){
            int count=0;
            for (int j=i+1;j<str.length;j++){
                String r=str[j];
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            int res=count+1;
            if(count>0&&count<=2){
            System.out.println(str[i]+" has appered "+res+" times");

            if(count>2){
                continue;
            }
            }


        }



    }
}
