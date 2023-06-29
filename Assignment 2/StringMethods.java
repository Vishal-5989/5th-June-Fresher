

import java.lang.String;


public class StringMethods
{


    public static void main(String[] args){
        //1)Length
        String name="Jyoti Ranjan" ;
        System.out.println(" The length of string is  :"+name.length());

        //2)concatenation
        String name1=" Daundkar";
        System.out.println(name+name1);
        System.out.println(name.concat(name1));

        //3)char Array
        String str="Jyoti";
        char[] ch= str.toCharArray();
        System.out.println(ch);

        for (char value : ch) {
            System.out.println(value);
        }

       //4)charAt
        String x="Java is a Language";
        System.out.println(x.charAt(1));
        System.out.println(x.charAt(3));
        System.out.println(x.charAt(7));

        //5)compareTo
        String a="Sql";
        String b="Java";
        String c="CBascic";
        String d="Python";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(d));

        //6)contains
        String m="java is Language";
        String n="LANGUAGE";
        String o=n.toLowerCase();
        System.out.println(m.contains(o));

        //7)split
        String ab="javaisnotalanguage";
        String[] split=ab.split("not");
         for(String obj: split){
             System.out.print(obj);
         }
         //8)indexof
        String t="Jyoti Daundkar" + "Learning Java";
        System.out.println("The index of u is " +t.indexOf('u'));
        System.out.println("The index of d is " +t.indexOf('d'));
        System.out.println("The index of i is" +t.lastIndexOf('i'));

        //9)replace
        String y="John";
        String z=y.replace('h','i');
        System.out.println(y);
        System.out.println(z);

        //10)substring
        String j="Javaisalanguage";
        System.out.println(j.substring(0,4));

        //11)trim
        String h="     Jyoti      ";
        System.out.println(h.trim());
        System.out.println();

        //12)value of
        int v=20;
        String lmn=String.valueOf(v);
        System.out.println(lmn);

        //13)touppercase ,tolowercase

        String abc="languagE";
        System.out.println(abc.toUpperCase());
        System.out.println(abc.toLowerCase());

        //14)strip
        String def
                ="        java is a object oriented language  !!  ";
        System.out.println(def.strip());
        System.out.println(def.stripLeading());
        System.out.println(def.stripLeading());

        //15) toString
        double dbl=32.50;
        String pqr=Double.toString(dbl);
        System.out.println(pqr);



    }
}
