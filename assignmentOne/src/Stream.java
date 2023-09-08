import java.util.List;
public class Stream {
    void test() {
        List<Integer> list = List.of(1, 4, 5, 7, 12, 10, 22, 3);
        list.stream().filter(num -> num % 2 == 0).forEach(e -> System.out.println("The even number is = " + e));
        int sum = list.stream().reduce(0,
                (element1, element2) -> element1 + element2);
    }
}