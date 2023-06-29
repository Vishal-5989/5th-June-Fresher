import java.util.Scanner;

public class String_char_reverse {

public static void main(String[]args){

    System.out.println("Enter the string");

 String str="Yogesh Hadpad";

    String rev="";


    for (int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);


    }


String st[]=rev.split(" ");

    for (int i=st.length-1;i>=0;i--){
        System.out.print(st[i]+" ");
    }





//for (int i=st.length-1;i>=0;i--){
//        System.out.print(st[i]);
//    }






    /*
    for (int i=revstr.length-1;i>=0.;i--){

        System.out.print(revstr[i]);
    }

*/





    /*
    String strarr[]=str.split("\\s");
    String revstr="";
    for (int i=0;i<strarr.length;i++){
        String word=strarr[i];
        String revword="";
        for (int j=word.length()-1;j>=0;j--){
            revword=revword+word.charAt(j);

        }
        revstr=revstr+" "+revword;



    }

    System.out.println(revstr);


*/





}












}
