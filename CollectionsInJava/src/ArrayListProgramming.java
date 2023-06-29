import java.util.ArrayList;

public class ArrayListProgramming {


    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Pradip");
        ar.add(null);
        ar.add(10);
        ar.add(10.18);
        ar.add('a');
        ar.add(10);
        ar.add(null);
        System.out.println(ar);

        ArrayList arr1 = new ArrayList();
        arr1.addAll(ar);
        System.out.println(arr1);


        System.out.println(arr1.get(3));

        ar.set(0, "Rahul");
        System.out.println(ar);

        System.out.println(ar.indexOf(10.18));

        System.out.println(ar.lastIndexOf(10));

        System.out.println(ar.remove(2));
        arr1.removeAll(arr1);
        System.out.println(arr1);

        System.out.println(arr1.isEmpty());

    }


}
