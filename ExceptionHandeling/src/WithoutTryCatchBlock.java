public class WithoutTryCatchBlock {
    public static void main(String[] args) {
        System.out.println("ST-1");
        System.out.println(10/0);//Abnormal termination happened here
        System.out.println("ST-2");
    }
}
