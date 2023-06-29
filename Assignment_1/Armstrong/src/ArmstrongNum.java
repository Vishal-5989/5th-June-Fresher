public class ArmstrongNum {
    public  boolean armsNum(int num){
        int x=num;
        int result=0;
        while(x!=0){
            int rem=x%10;
            result+=Math.pow(rem,3);
            x=x/10;
        }
        return result==num;
    }

    public static void main(String[] args) {
        ArmstrongNum armNum=new ArmstrongNum();
        for (int i=2;i<=1000;i++){
            if (armNum.armsNum(i)){
                System.out.println(i);
            }
        }
    }
}
