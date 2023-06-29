public class buffer_Builder {
    public StringBuffer buffer(){
        StringBuffer word = new StringBuffer("Neutrino");
        System.out.println("Length of word: "+word.length());
        System.out.println(word.append(" tech system"));
        System.out.println("reversed string: "+word.reverse());
        System.out.println(word.capacity());
        System.out.println(word.deleteCharAt(2));
        System.out.println(word.indexOf("t"));
       // System.out.println(word.);
        return word;

    }

    public StringBuilder builder(){
        StringBuilder word = new StringBuilder("Neutrino");
        System.out.println("Length of word: "+word.length());
        System.out.println(word.append(" tech system"));
        System.out.println("reversed string: "+word.reverse());
        System.out.println(word.capacity());
        System.out.println(word.deleteCharAt(2));
        System.out.println(word.indexOf("t"));
        //System.out.println(word.);
        return word;

    }

    public static void main(String[] args) {
        buffer_Builder obj = new buffer_Builder();
        obj.buffer();
        obj.builder();

    }
}
