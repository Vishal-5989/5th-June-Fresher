import java.util.Scanner;

public class Char_Count {
    public static void main(String[] args) {
        System.out.println("enter a string :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word=word.replace(" ","");
        char a[]=word.toCharArray();
        int count;

        for(int i=0;i<a.length;i++)
        {
            count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && a[i]!=' '){
                    count++;
                    a[j]='0';
                }
            }
            if(a[i]!='0')
            {
                System.out.println(a[i]+"= "+count);
            }

        }
    }
}
