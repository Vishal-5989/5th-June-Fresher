import java.util.*;

public class UniquePair {
    public static void main(String[] args) {
        System.out.println("Enter the size of string1: ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        String arr1[] = new String[size1];
        System.out.println("Enter elements in arr1: ");
        for(int i = 0;i<size1;i++){
            arr1[i]=sc.next();
        }
        System.out.println("Enter the size of string2: ");
        int size2 = sc.nextInt();
        String arr2[] = new String[size2];
        System.out.println("Enter elements in arr2: ");
        for(int i = 0;i<size2;i++){
            arr2[i]=sc.next();
        }
        System.out.println("arr 1 is: ");
        for (int i =0;i<size1;i++){
            System.out.println(arr1[i]+"");
        }
        System.out.println("arr 2 is: ");
        for (int i= 0;i<size2;i++){
            System.out.println(arr2[i]+"");
        }
        //list1
        List<String> list1 = new ArrayList<>();
        for (int i =0;i<size1;i++){
            list1.add(arr1[i]);
        }
        //list2
        List<String> list2 = new ArrayList<>();
        for (int i =0;i<size2;i++){
            list2.add(arr2[i]);
        }
        list1.addAll(list2);
        System.out.println("list1 is : "+list1);

        Map<String,Integer> m = new HashMap<>();
        for(String s:list1){
            if(m.containsKey(s)){
                m.put(s,m.get(s)+1);
            }
            else{
                m.put(s,1);
            }
        }
        System.out.println(m);
    }
}
