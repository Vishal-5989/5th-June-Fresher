// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Strings {
    public static void main(String[] args) {


        String S1="Shubham";
        String S2="Torkad";
        String S3="Shubham Torkad";
     //  s= s.concat("Torkad");
    //System.out.println(s);
     //  s.concat(" Torkad");
        System.out.println(S1.equals(S2));
        System.out.println(S1==S2);
        System.out.println(S3.length());
        System.out.println(S1.concat(S2));
        System.out.println(S1 + S2);
        char [] Arr=S1.toCharArray();
        System.out.println(Arr);
         for (int i=0;i< Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
        System.out.println(S3.charAt(1));

    }
}