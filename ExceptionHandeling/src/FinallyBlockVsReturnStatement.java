public class FinallyBlockVsReturnStatement {
    public static void main(String[] args)
    {
//        try
//        {
//            System.out.println("try");
//            return;
//        } catch (Exception e) {
//            System.out.println("Catch");
//        } finally {
//            System.out.println("Finally");//executed
//        }

        System.out.println(m1());

    }

    public static int m1()
    {
        try
        {
            return 777;
        } catch (Exception e) {
            return  888;
        } finally {
            return 999;
        }
    }
}
