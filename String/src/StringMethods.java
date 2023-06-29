
import java.lang.String;
public class StringMethods {

    // Length function

    public static void main(String[] args){

        String s=" Disha Sanjay";
        System.out.println(" The length of String is :" +s.length());
        String s1="Gujarathi";

        //Concatenation
        System.out.println(s.concat(s1));
        System.out.println();

        //CharArray
        String str= "Disha";
        char[] ch= str.toCharArray();
        System.out.println(ch);
        for (char value : ch) {
            System.out.println(value);
        }
        System.out.println();

        // charAt
        String d="java is fun";
        System.out.println(d.charAt(0));
        System.out.println(d.charAt(3));
        System.out.println();

        //compareTo
        String a="Java";
        String b="Angular";
        System.out.println(a.compareTo(b));
        System.out.println();

        //split
        String sp="JavaXyzIsXyzFun";
        String[] split=sp.split("Xyz");

        for(String obj: split){
            System.out.println(obj);
        }
        System.out.println();

        //indexOf
        String t="Disha Gujarathi " + " working with String";
        System.out.println(" The index of 'j' is  " +t.indexOf('j'));
        System.out.println(" The last index of S is  " +t.lastIndexOf('S'));
        System.out.println();

        //replace
        String n="Tommy";
        String r= n.replace('o','u');
        System.out.println(n);
        System.out.println(r);
        System.out.println();

        //substring
        String k="JavaIsAProgrammingLanguage";
        System.out.println(k.substring(4,7));
        System.out.println(k.substring(10,12));
        System.out.println();

        //trim
        String j="    Disha   ";
        System.out.println(j.trim());
        System.out.println();

        //valueOf
        int w=10;
        String xyz=String.valueOf(w);
        System.out.println(xyz);
        System.out.println();

        //toUppercase , toLowercase
        String abc="DishA";
        System.out.println(abc.toUpperCase());
        System.out.println(abc.toLowerCase());
        System.out.println();

        //strip
        String def
                ="   Java Is A Programming Language   !!  ";
        System.out.println(def.strip());
        System.out.println(def.stripLeading());
        System.out.println(def.stripTrailing());
        System.out.println();

        //toString
        double dbl=21.90;
        String pqr=Double.toString(dbl);
        System.out.println(pqr);
        System.out.println();

        //contains
        String hj="Java Is fun";
        String op="FUN";
        String ds=op.toLowerCase();
        System.out.println(hj.contains(ds));
    }





}
