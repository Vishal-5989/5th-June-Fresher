public class Revstring {

    public void byinbuilt(){
        StringBuffer word = new StringBuffer("Neutrino");
        System.out.println(word.reverse());

    }
    public static void main(String[] args) {
        Revstring obj = new Revstring();
        String Name = "Asmita Raut";
        String Rev = " ";
        for(int i = Name.length()-1;i>=0;i--){
            char a = Name.charAt(i);
            Rev = Rev + a;
        }
        System.out.println(Rev);
        obj.byinbuilt();
    }
}
