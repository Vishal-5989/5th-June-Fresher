//import java.lang.String;
public class Stringfunc {

    public static void main(String[] args) {
        //Length
        String name="My name is Bhushan ";
        System.out.println("Length of string is :"+name.length());

        //Concatenation
        String name1="Dere";
        System.out.println(name+name1);
        System.out.println(name.concat(name1));

        //char array
        String str="JAVA";
        char[] ch = str.toCharArray();
        System.out.println(ch);
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        //charAt
        String x="Java is language";
        System.out.println(x.charAt(1));
        System.out.println(x.charAt(3));
        System.out.println(x.charAt(7));

        //compareTo
        String a="Sql";
        String b="Java";
        String c="C programming";
        String d="Python";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(d));

        //contains
        String m="Thereisawillthereisaway";
        String n="way";
        String o="was";
        System.out.println(m.contains(n));
        System.out.println(m.contains(o));

        //split
        String ab="javaisnotalanguage";
        String split[]=ab.split("not");
        for(String obj: split){
            System.out.println(obj);
        }

       //indexof
        String t="Students are" + "Learning Java";
        System.out.println("The index of u is " + t.indexOf('u'));
        System.out.println("The index of d is " + t.indexOf('d'));
        System.out.println("The index of i is " + t.lastIndexOf('i'));

        //replace
        String y="john";
        String z=y.replace('h','i');
        System.out.println(y);
        System.out.println(z);

        //substring
        String j="Java is a language";
        System.out.println(j.substring(0,4));


        //trim
        String h="    Bhushan    ";
        System.out.println(h.trim());
        System.out.println();

        //value of
        int v=20;
        String lmn = String.valueOf(v);
        System.out.println(lmn);

        //touppercase, tolowercase

        String abc="languagE";
        System.out.println(abc.toUpperCase());
        System.out.println(abc.toLowerCase());

        //strip
        String def ="        java is object oriented language   !!   ";
        System.out.println(def.strip());
        System.out.println(def.stripLeading());


        //tostring
        String tuv= "World is Beautiful";
        System.out.println("The output is : ");
        System.out.println(tuv.toString());

    }
}
