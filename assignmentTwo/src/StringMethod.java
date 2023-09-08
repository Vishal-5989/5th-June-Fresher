import java.util.Locale;

public class StringMethod {

    String name="NEUTRINO TECH SYSTEMS";
    void createString(){

        char ch[]={'T','E','C','H'};
        String s1=new String(ch);
        String s2=new String("SYSTEMS");
        System.out.println(name);
        System.out.println(s1);
        System.out.println(s2);
    }
    void charAt(){
        System.out.println(name.charAt(4));
    }
    void  length(){
        System.out.println(name.length());
    }
    void stringFormat(){
        String s1 = String.format("Company name is %s",name);
        String s2 = String.format("\nCompany name is %s",123);
        System.out.println(s1+ " " +s2);
    }
    void subString(){
        System.out.println(name.substring(3));
    }
    void subString2(){
        System.out.println(name.substring(2,4));
    }
    void contain(){
        System.out.println(name.contains("TECH"));
        System.out.println(name.contains("tech"));
    }
    void join(){
        System.out.print(name.join("/","10","06","2002"));
    }
    void equals(){
        String name2 = "hello";
        if(name.equals(name2)){
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
    void isEmpty(){
        String name2 = "";
        System.out.println(name.isEmpty());
        System.out.println(name2.isEmpty());
    }
    void concat(){
        String data = "I am working at ";
        System.out.println(data.concat(name));
    }
    void replace(){
        System.out.println(name.replace("NEUTRINO TECH SYSTEMS","NTS"));
    }
    void replace2(){
        System.out.println(name.replace("E","a"));
    }
    void equalsIgnore(){
        String name1 = "neutrino tech systems";
        String name2 = "NTS";
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.equalsIgnoreCase(name2));
    }
    void split(){
        String[] words = name.split("E");
        for(String w:words){
            System.out.println(w);
        }
    }
    void split2(){
        String[] words = name.split("E",2);
        for(String w:words){
            System.out.println(w);
        }
    }
    void intern(){
        String name1 = new String("NEUTRINO TECH SYSTEMS").intern();
        String name2 = new String("NEUTRINO TECH SYSTEMS");
        System.out.println(name == name1);
        System.out.println(name == name2);
    }
    void indexOf(){
        System.out.println(name.indexOf("T")); // index of particular char
        System.out.println(name.indexOf("TECH")); // index of substring
        System.out.println(name.indexOf("T",4)); // index of particular char after the 4th index
        System.out.println(name.indexOf("SYS",4)); // index of particular substring after the 4th index
    }
    void toLowerCase(){
        System.out.println(name.toLowerCase());
        // Locale
        String ger = name.toLowerCase(Locale.GERMANY);
        System.out.println(ger);
        String turkish = name.toLowerCase(Locale.forLanguageTag("DE")); // It shows i without dot
        System.out.println(turkish);
    }
    void toUpperCase(){
        String name = "VISHAL";
        System.out.println(name.toLowerCase());
        // Locale
        String ger = name.toUpperCase(Locale.GERMANY);
        System.out.println(ger);
        String turkish = name.toUpperCase(Locale.forLanguageTag("DE")); // It shows i without dot
        System.out.println(turkish);
    }
    void trim(){
        String name = "        Hi,this is vishal kadiya";
        System.out.println(name.trim()); // It can remove white space ( with only space )
    }
    void strip(){
        String name = "     Hi, I am a software engineer"; // It can remove white space ( with space bar and tab )
        System.out.println(name.strip());
    }
    void value(){
        char name = 'V';
        System.out.println(String.valueOf(name));
    }
    void toStringmethod(){
        Tostring t = new Tostring(396, "vishal", "ahmedabad");
        System.out.println(t);
    }
}
class Tostring {
    int empId;
    String name, city;
    Tostring(int empId, String name, String city){
        this.empId = empId;
        this.name = name;
        this.city = city;
    }

    public String toString(){
        return empId+" "+name+" "+city;
    } // with this toString method we can get values instead of address or garbage value
}