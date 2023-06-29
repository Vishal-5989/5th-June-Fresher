public class FourTypesOfFunctionsNonStatic {
    public int addElement(int a, int b)
    {
        //With input with output

        int sum1 = a + b;
        return sum1;

    }
    public int subs()
    {
        //without input with output.
        int a = 12;
        int b = 8;
        int substract = a - b;
        return substract;

    }
    public void mult(int a, int b)
    {
        //with input without output
        int ans = a * b;
        System.out.println("The product is : "+ans);

    }
    public void div()
    {
        //without input without output
        int a = 100;
            int b = 10;
            int ans = a / b;
        System.out.println(ans);
    }

    public static void main(String[] args) {
      FourTypesOfFunctionsNonStatic obj1 = new FourTypesOfFunctionsNonStatic();
      int summ = obj1.addElement(12, 12);
        System.out.println("The addition is : "+summ);

        int subst = obj1.subs();
        System.out.println("the substaction is : "+subst);

        obj1.mult(12,12);

        obj1.subs();



    }
}
