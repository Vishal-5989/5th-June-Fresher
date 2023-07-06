package String;

public class Count {
    public static void main(String[] args)
    {
        String name="aaa";
        char[] ch=name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count=1;
            for (int j =i+1; j<ch.length ; j++) {
                if(ch[i]==ch[j]){
                    count++;

                }
                System.out.println(ch[i]+""+count);

            }

        }
    }
}
