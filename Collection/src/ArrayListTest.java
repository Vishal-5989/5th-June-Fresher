
import java.util.ArrayList;
import java.util.*;
public class ArrayListTest {
    public static void main(String[] args) {


        //creating ArrayList of string type
        ArrayList<String> arrList = new ArrayList<>();

        //adding few elements
        arrList.add("Cricket"); //list: ["Cricket"]
        arrList.add("Hockey"); //list: ["Cricket", "Hockey"]

        arrList.remove(0);
        System.out.println("\n");


        //inserting element at first position, index 0
        //represents first element because ArrayList is based
        //on zero based indexing system
        arrList.add(0, "BasketBall"); //list: ["BasketBall", "Cricket", "Hockey"]


        System.out.println("ArrayList Elements: \n");
        //Traversing ArrayList using enhanced for loop
        for (String str : arrList)
            System.out.println(str);
        System.out.println("\n");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(6);

        for(int i=0;i<numbers.size();i++){
            System.out.print("\n" +numbers.get(i));

        }
        System.out.println("\n");
        System.out.println(" The numbers in the arraylist are: "+numbers);
        System.out.println(" Number of elements in ArrayList: " +numbers.size());
        System.out.println(" Removed elements from the list are :" +numbers.remove(2));
        System.out.println(" elements after modifying : "+numbers.set(0,4));
        System.out.println(" after modifications : "+numbers);






    }

    }

