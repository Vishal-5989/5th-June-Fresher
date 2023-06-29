public class GFG {
    String name = "Shubham Ravindra Choudhary";

    public static void main(String[] args){
        try {
            Class cls = Class.forName("GFG");

            GFG obj = (GFG)cls.newInstance();

            System.out.println(obj.name);

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (InstantiationException e){
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }

    }
}
