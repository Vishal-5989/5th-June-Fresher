public class Solution {

    public void returnChar(String str){
        char a=str.charAt(5);
        System.out.println("The given string is"+str);
        System.out.println("index at 5 ="+a);   //charAt in built function that return the index of char
    }
    public void compareMethod(){
        String s1="Love";
        String s2="Love";
        String s3="meklo";
        String s4="hemlo";    //compareTo method inbuilt that return the integer value
        String s5="flag";
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));// "L" is compare to "m"
        System.out.println(s1.compareTo(s4));// "l" is compare to "h"
        System.out.println(s1.compareTo(s5));// "l" is compare to "f"
    }

    public void concatEx(){
        String s1="My Name";
        // The string s1 does not get changed, even though it is invoking the method
        // concat(), as it is immutable. Therefore, the explicit assignment is required here.
        //s1.concat("is Rahul");
        System.out.println(s1);
        s1=s1.concat(" is Rahul ");
        System.out.println(s1);
    }
    public void containsEx(){
        String name="My Name Is Rahul Raut";
        System.out.println(name.contains("Name Is"));      //contains return true or false
        System.out.println(name.contains("Rahul"));         // if present it return true else it return false
        System.out.println(name.contains("Love"));
    }

    public void equlasEx(){
        String s1="Love";
        String s2="Love";
        String s3="love";
        String s4="Live";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same
        System.out.println(s1.equals(s4));//false because content is not same
    }

    public void trimEx(){
        String s1 ="  Love The Life   ";
        System.out.println(s1.length());
        System.out.println(s1); //Without trim()
        String tr = s1.trim();
        System.out.println(tr.length());
        System.out.println(tr); //With trim()
    }
    public void valueOfEx(){
        int value=50;
        String s1=String.valueOf(value); //valueOf() method converts different types of values into string
        System.out.println(s1+60);//concatenating string with 60
    }
    public void lengthEx(String a){
        System.out.println("Length of string "+a+" is="+a.length());
    }

    public void joinEx(){
        String date = String.join("/","14","06","2018");
        System.out.print(date);
        String time = String.join(":", "05","35","10");
        System.out.println(" "+time);
    }
    public void upperCaseEx(String a){
        String b=a.toUpperCase();
        System.out.println("The Uppercase String is ="+b);
    }

    public void lowerCaseEx(String a){
        String b=a.toLowerCase();
        System.out.println("The Uppercase String is ="+b);
    }
    public void splitEx(String a){
        String[] words=a.split("\\s");//splits the string based on whitespace
                                            //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
    }
    public void replaceAllEx(String a){
        String replaceString=a.replaceAll("a","i");//replaces all occurrences of "a" to "i"
        System.out.println(replaceString);
    }

    public void isEmptyEx(){
        String s1="";
        String s2="Love The Life";

        System.out.println(s1.isEmpty());  //isEmpty() method checks if the input string is empty or not.
        System.out.println(s2.isEmpty());  //return type is boolean
    }

    public void subStringEx(){
        String s1="Rahul";
        String substr = s1.substring(0); // Starts with 0 and goes to end
        System.out.println(substr);
        String substr2 = s1.substring(2,4); // Starts from 2 and goes to 4
        System.out.println(substr2);
        //String substr3 = s1.substring(5,15); // Returns Exception
    }

}
