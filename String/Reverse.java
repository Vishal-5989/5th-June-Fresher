package String;

public class Reverse {
    public static void main(String[] args) {
        String name="Suraj";
        String str="";
      String [] ch=name.split("");
        for (int i = 0; i <ch.length; i++) {
            str=ch[i]+str;
            System.out.println(str);
        }

    }
}
