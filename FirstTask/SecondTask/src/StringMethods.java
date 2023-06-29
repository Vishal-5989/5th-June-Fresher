import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args)
    {
        String name = "Thank You Neutrino Tech Systems";

        System.out.println("Uppercase Method : " +name.toUpperCase());
        System.out.println("Lowercase Method : "+name.toLowerCase());
        System.out.println("Trim Method : " + name.trim());
        System.out.println(name.strip());
        System.out.println("CharacterAt Method"+name.charAt(0));
        System.out.println("Index Method : "+name.indexOf('N'));
        System.out.println("IndexOf method : "+name.indexOf("You"));
        System.out.println(name.charAt(6));
        System.out.println("IndexOf method"+name.indexOf('Y',1));
        System.out.println("Length Method : " +name.length());
        //valueOf
        int a = 5;
        System.out.println(String.valueOf(a+name));

        //replace method
        System.out.println("Replace String : "+name.replace("Thank","Welcome"));

        //String Compare==>compareTO,==,equalsTo

        String s1 = "Welcome";
        String s2 = "WElcome";
        String s3 = "Thanks";
        System.out.println("String compare :" +s1.compareTo(s2));
        System.out.println("String Compare :"+s3.compareTo(s2));


        System.out.println("String Compare : " + s1.equals(s2));
        System.out.println("String Compare : " + s1.equalsIgnoreCase(s2));

        //concat
        System.out.println("String Compare : " +s1.concat(s2));

        //subString
        System.out.println("String Substring is :"+name.substring(0,9));

        //isEmpaty
        System.out.println("String is Empty : " +s1.isEmpty());

        //spilt
        System.out.println("String spilt : "+ Arrays.toString(name.split("\\s")));

        //Join
        System.out.println(String.join("/","14","06","2023"));

        //toCharArray
        char[] ch= name.toCharArray();
        System.out.println(ch);











    }
}
