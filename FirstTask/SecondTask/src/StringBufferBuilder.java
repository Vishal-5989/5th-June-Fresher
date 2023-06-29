public class StringBufferBuilder {

    public void stringBuilder()
    {
        //1.StringBuffer
        //append
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
        System.out.println("Append Method : " +sb);

        //2.insert
        sb.insert(1,"welcome");
        System.out.println("insert Method : " +sb);

        //3.replace
        sb.replace(0,1,"kh");
        System.out.println("replace Method : " +sb);

        //4.delete
        sb.delete(1,4);
        System.out.println("delete Method : " +sb);

        //5.reverse
        sb.reverse();
        System.out.println("reverse Method : " +sb);

        //6.capacity
        sb.capacity();
        System.out.println("capacity Method : " +sb.capacity());
    }
    public void stringBuffer()
    {
        //1.StringBuffer
        //append
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Java");
        System.out.println("Append Method : " +sb);

        //2.insert
        sb.insert(1,"welcome");
        System.out.println("insert Method : " +sb);

        //3.replace
        sb.replace(0,1,"kh");
        System.out.println("replace Method : " +sb);

        //4.delete
        sb.delete(1,4);
        System.out.println("delete Method : " +sb);

        //5.reverse
        sb.reverse();
        System.out.println("reverse Method : " +sb);

        //6.capacity
        sb.capacity();
        System.out.println("capacity Method : " +sb.capacity());
    }

    public static void main(String[] args)
    {
        StringBufferBuilder ss = new StringBufferBuilder();
        ss.stringBuffer();
        ss.stringBuilder();
    }
}
