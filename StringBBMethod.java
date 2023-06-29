public class StringBBMethod {

    public void stringBufferMethod(){
        //methods of String Buffer class

                //1.append:concatenate
        StringBuffer sb=new java.lang.StringBuffer("Hello");
        System.out.println("Using append: "+sb.append("Friends."));

        //2.insert
        System.out.println("Using Insert:"+sb.insert(5,"Java"));

        //3.replace
        System.out.println("using replace:"+sb.replace(1,3,"python"));

        //4.delete:delete element at specific index
        System.out.println("using delete: "+sb.delete(1,7));

        //5.reverse:reverse string
        System.out.println("using reverse"+sb.reverse());


        //6.capacity:(capacity*2)+2 //default:16
        System.out.println("using capacity:"+sb.capacity());

    }
    public void stringBuilderMethod() {
        StringBuilder s=new StringBuilder("Java");

        //methods of string builder class

        //1.append:combine string with given string
        System.out.println("Using Append:"+s.append("Programming"));

        //2.insert
        System.out.println("using insert:"+s.insert(1,"python"));

        //3.replace
        System.out.println("using replace:"+s.replace(1,3,"hii"));

        //4.delete
        System.out.println("using delete:"+s.delete(1,3));

        //5.reverse
        System.out.println("using reverse:"+s.reverse());

        //6.capacity:if capacity is greater than current capacity then capacity=(capacity*2)+2
        System.out.println("using capacity: "+s.capacity());

    }
    public static void main(String[] args) {
        StringBBMethod sm=new StringBBMethod();
        sm.stringBufferMethod();
        sm.stringBuilderMethod();

    }
}
