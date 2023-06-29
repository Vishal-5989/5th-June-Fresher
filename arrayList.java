import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(30);
        numbers.add(90);
        numbers.add(50);
        numbers.add(60);
        numbers.add(10);
        numbers.add(10);
        numbers.add(34);
        numbers.add(99);
        numbers.add(87);
        System.out.println("Number with duplicate: "+ numbers);

        List<Integer> unique;
        unique=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Arraylist without duplicate: " +unique);

    }
}






