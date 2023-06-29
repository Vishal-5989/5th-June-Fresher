import java.lang.String;
public class StringMethods {

    //Length Function
    //Concatination

    public static void main(String[] args){
        String s ="Mona Vasant";
        System.out.println("The length of string is: "+s.length());
        String s1 ="Pawar";
        //System.out,println(s+s1);    //Two ways
        System.out.println(s.concat(s1));
        System.out.println();

        //charArray
        String str = "Mona";
        char[] ch = str.toCharArray();
        System.out.println(ch);


        for (char c : ch) {
            System.out.println(c);
        }
        System.out.println();
        //charAt
        String d= "java is fun";
        System.out.println(d.charAt(0));
        System.out.println(d.charAt(3));

        System.out.println();

        //compareTo
        String a="JAva";
        String b="Angular";
        System.out.println(a.compareTo(b));
        System.out.println();


        //split
        String sp ="Javaxyzisxyzfun";
        String[] split=sp.split("xyz");

        for (String obj: split){
            System.out.println(obj);
        }
        System.out.println();

        //indexOf
        String t="Mona Pawar " + "working with String";
        System.out.println(" The index of 'j' is" +t.indexOf('j'));
        System.out.println(" The index of 'i' is" +t.indexOf('i'));
        System.out.println(" The las index of 's' is" +t.lastIndexOf('s'));
        System.out.println();

        //replace
        String n ="Tommy";
        String r= n.replace('o','u');
        System.out.println(n);
        System.out.println(r);
        System.out.println();

        //substring
        String k = "JavaIsProgrammingLanguage";
        System.out.println(k.substring(4,7));
        System.out.println(k.substring(10,12));
        System.out.println();

        //trim
        String j="   Mona   ";
        System.out.println(j.trim());
        System.out.println();

        //valueOf
        int w=10;
        String xyz=String.valueOf(w);
        System.out.println(xyz);
        System.out.println();

        //toUppercase, toLowercase
        String abc= "MoAna";
        System.out.println(abc.toUpperCase());
        System.out.println(abc.toLowerCase());
        System.out.println();

        //strip
        String def = "        Java Is A Programming Language    !!   ";
        System.out.println(def.strip());
        System.out.println(def.stripLeading());   //strip leading white spaces
        System.out.println(def.stripTrailing());   //strip trailing white spaces
        System.out.println();

        //toString
        double dbl=45.78;
        String pqr=Double.toString(dbl);
        System.out.println(pqr);


        //contains
        String hj="Java Is Fun";
        String op="FUN";
        String ds=op.toLowerCase();
        System.out.println(hj.contains(ds));




    }
}
