import java.sql.SQLOutput;
import java.util.Arrays;

public class stringMethod {
    public static void main(String[] args) {
        String s1="My name is Rutuja";
        String s2="Tathe";
        //1.charAt():-return particular character at given index
        System.out.println("Character at third position is :"+s1.charAt(3));

        //2.compareTO():o/p in form of 0,positive,negative
        System.out.println("Compare the two string: "+s1.compareTo(s2));

        //3.concat():combine two string
        System.out.println("concatenate function:"+s1.concat(s2));

        //4.contains():-true if character present ,else:not present
        System.out.println("contains method:"+s1.contains("Rutuja"));

        //5.endsWith()
        System.out.println("endsWith: "+s1.endsWith("a"));

        //6.equals():check content
        System.out.println("equals method:"+s1.equals(s2));

        //7.equalsIgnoreCase: doesn't check case sensitivity
        System.out.println("equalsIgnoreCase method:"+s1.equalsIgnoreCase(s2));

        //8.format
        System.out.println("Format method:  "+ String.format("my name is %s","Rutuja" ));

        //9.indexOf
        System.out.println("index of:"+s1.indexOf("Rutuja"));

        //10.intern():
        String s3=new String("welcome").intern();
        String s4=new String("welcome").intern();
        System.out.println("Using intern: "+(s3==s4)); //written True

        //11.isEmpty()
        System.out.println("is Empty method:"+s2.isEmpty());//false

        //12.join:
        String date="";
        System.out.println("Using join method:"+date.join("/","26","10","2023"));

        //13.lastIndexOf:
        System.out.println("last index of :"+s1.lastIndexOf("u"));

        //14.length(): length of string
        System.out.println("Length:"+s2.length());

        //15.replace(): replace old character with new
        System.out.println("replace:"+s2.replace("a","i"));

        //16.replaceAll():replace all old character with new
        System.out.println("Replace All: "+s1.replaceAll("a","e"));

        //17.split():split the string
        System.out.println(Arrays.toString(s1.split("\\s")));

        //18.startsWith():case sensitive
        System.out.println("startsWith: "+s2.startsWith("Ta"));

        //19.subString()
        System.out.println("SubString:"+s2.substring(1,4));

        //20.charArray()
        System.out.println("toCharArray:"+s2.toCharArray());

        //21.lowercase:convert to lowercase
        System.out.println("Lower Case: "+s2.toLowerCase());

        //22.uppercase:convert to uppercase
        System.out.println("Upper Case:"+s2.toUpperCase());

        //23.trim():remove whitespace
        String str="  Java Is  ";
        System.out.println("Trim: "+str.trim());

        //24.strip()
        String str2="Java       is programming language"  ;
        System.out.println("Strip:"+str.strip());

        //25.valueOf()
        int a=10;
        String b=String.valueOf(a);
        System.out.println("Value of: "+ (b+30));

    }
}
