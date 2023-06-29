import java.util.Scanner;

public class methods_String {

    public void methods(){
        System.out.println("enter a string :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Length of String : " +word.length());
        System.out.println("character at index of 3 : "+ word.charAt(3));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("The string contains letter 'A' "+word.contains("A"));
        System.out.println(word.getBytes());
        System.out.println(word.indexOf('s'));
        System.out.println(word.trim());
        System.out.println(word.isEmpty());
        System.out.println(word.replace('a','s'));


    }

    public static void main(String[] args) {
        methods_String obj = new methods_String();
        obj.methods();


    }
}
