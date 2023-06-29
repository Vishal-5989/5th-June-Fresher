public class CountThePairOfString {
    public static void main(String[] args) {
 //        String st1 = "ab";
 //        String st2 = "bc";
 //        String st3 = "ab";
 //        String st4 = "cd";


        String [] st = {"ab","bc", "ab", "ab", "cd"};
        for(int i = 0; i <= st.length - 1; i++ )
        {
            int count = 0;
            for(int j = i+1; j < st.length ; j++)
            {

                if(st[i].equals(st[j]))//
                {
                    count++;//1

                }
            }
            if(count > 0)
            {
                System.out.println(st[i]+" "+count);
            }



        }
    }
}
