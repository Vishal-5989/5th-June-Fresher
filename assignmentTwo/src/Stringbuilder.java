public class Stringbuilder {

    void stringBuilder(){

        StringBuilder string = new StringBuilder("Neutrino");
        string.append(" Tech System");
        System.out.println(string);
        System.out.println(string.reverse());
        StringBuilder string1 = new StringBuilder("Neutrino");
        System.out.println(string.compareTo(string1)); // if it is not same then it will return negative value
    }
}
