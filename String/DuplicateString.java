package String;

public class DuplicateString
{
    public void getduplicate()
    {
        String str ="WelcometoNeutrino";
        char [] ch = str.toCharArray();
        for(int i =0; i<=str.length();i++)
        {
            for(int j = i+1;j<str.length();j++)
            {
                if(ch[i] == ch[j])
                {
                    System.out.println("The Duplicate String is "+ch[j]);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        DuplicateString dup = new DuplicateString();
        dup.getduplicate();
    }
}
