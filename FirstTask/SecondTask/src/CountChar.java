public class CountChar {
    public static void main(String[] args)
    {
        String s = "Thank You Neutrino";
        int count;

        char str[]= s.toCharArray();
        System.out.println("Number of character present in string are :");

        for(int i = 0; i<str.length;i++)
        {
            count = 1;
            for(int j = i+1; j<str.length; j++)
            {
                if(str[i] == str[j] && str[i] != ' ')
                {
                 count++;
                 str[j] = '0';
                }
            }
            if(str[i] != '0'&& str[i] != ' ')
            {
                System.out.println(str[i]+"=" +count);
            }
        }
    }

}

