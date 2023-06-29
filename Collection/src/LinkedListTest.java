import  java.util.LinkedList;
public class LinkedListTest {

       public static void main(String[] args) {

           // create linkedlist
           LinkedList<String> animals = new LinkedList<>();

           // Add elements to LinkedList
           animals.add("Dog");
           animals.add("Cat");
           animals.add("Cow");
           System.out.println("LinkedList: \n" + animals);
           System.out.println(animals.remove(0));
           System.out.println(animals.set(1, "Tiger"));
           System.out.println(" the List after : " + animals);
           System.out.println("  \n\n");


       }

       }









