import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);

        System.out.println("ArrayList with duplicate elements: " + numbers);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(numbers);
        numbers.clear();

        numbers.addAll(set);
        System.out.println("ArrayList without duplicate elements: " + numbers);

    }
}
