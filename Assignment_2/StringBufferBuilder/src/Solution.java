public class Solution {

    public void appendEx(String a){
        StringBuffer sb=new StringBuffer("My name is ");
        sb.append(a);                   //Rahul is string append to sb
        System.out.println(sb);         //print the updated string
    }

    public void insertEx(String a){
        StringBuffer sb=new StringBuffer("Neutrino ");
        sb.insert(0, a);//now original string is changed in insert function index and string
        System.out.println(sb);//prints new string
    }

    public void reverseEx(String a){
        StringBuffer sb=new StringBuffer(a);
        sb.reverse();
        System.out.println(sb);//prints reverse string
    }

    public void deleteEx(String a){
        StringBuffer sb=new StringBuffer(a);
        sb.delete(1,3);             //delete function give to start index and end index
        System.out.println(sb);
    }
    public void replaceEx(String a){
        StringBuffer sb=new StringBuffer(a);
        sb.replace(1,2,"Life");
    }

    public void capacityEx(){
        StringBuffer sb=new StringBuffer();
        System.out.println("Default capacity of stringbuffer is ="+sb.capacity());//default capacity of stringbuffer is 16
        sb.append("Hello");
        System.out.println("capacity of string is ="+sb.capacity());//now capacity is 16
        sb.append("java is my favourite language");
        System.out.println("updated capacity of string is ="+sb.capacity());//now change the capacity (16*2)+2=34 i.e (oldcapacity*2)+2
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        //Append Function
        String a="Rahul ";
        s.appendEx(a);

        //Insert Function
        String b="Welcome To ";
        s.insertEx(b);

        //Reverse Method
        String c="Rahul";
        s.reverseEx(c);

        //Delete Method
        String d="Love Life";
        s.deleteEx(d);

        //Replace Method
        String e="Love";
        s.replaceEx(e);

        //Capacity Method
        s.capacityEx();

    }
}
