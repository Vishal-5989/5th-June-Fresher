import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("name", "Pradip");
        m.put("surname", "Khandare");
        m.put("organization", "NTS");
        m.put("eid", 1234);
        System.out.println(m);
        m.put("eid", 4321);
        System.out.println(m);
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext())
        {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(m1.getKey().equals("Pradip"))
            {
                m1.setValue("Golu");
            }
        }
        System.out.println(m);
    }
}
