import java.util.*;

public class ComparePair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of String1");
        int size1 = sc.nextInt();
        String[] ar = new String[size1];
        System.out.println("Enter the first String array");
        for (int i = 0; i < size1 ; i++) {
            ar[i] = sc.next();
        }
        System.out.println("Enter the Size of String2");
        int size2 = sc.nextInt();
        String[] ar2 = new String[size2];

        System.out.println("Enter the second String array");
        for (int i = 0; i < size2; i++) {
            ar2[i] = sc.next();
        }
        System.out.println("arr 1 is ");
        for (int i = 0; i < size1; i++) {
            System.out.println(ar[i] + " ");
        }
        System.out.println("arr 2 is ");
        for (int i = 0; i < size2; i++) {
            System.out.println(ar2[i] + " ");
        }
        List<String> l1 = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            l1.add(ar[i]);
        }
        List<String> l2 = new ArrayList<>();
        for (int i = 0; i < size2; i++) {
            l2.add(ar2[i]);
        }
        l1.addAll(l2);
        System.out.println("l1 is :"+l1);
        Map<String,Integer> m = new HashMap<>();
        for(String s : l1)
        {
            if(m.containsKey(s))
            {
                m.put(s,m.get(s)+1);
            }
            else
            {
                m.put(s,1);
            }
        }
        System.out.println(m);
    }
    }
