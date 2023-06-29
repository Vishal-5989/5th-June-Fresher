public class String_words_reverse {

public static void main(String[]args){

    StringBuffer s=new StringBuffer("Yogesh");



    String str="Tesla is my company";
    String arr[]=str.split(" ");
    System.out.println(arr.length);
    String op="";
    for (int i=arr.length;i>0;i--){

        op=op+" "+arr[i-1];

    }
    System.out.println(op);





}














}
