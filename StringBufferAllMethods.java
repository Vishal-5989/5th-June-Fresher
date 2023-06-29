public class StringBufferAllMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        // append method
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("After append: " + sb);

        // insert method
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        // delete method
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // deleteCharAt method
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // replace method
        sb.replace(5, 10, "GPT");
        System.out.println("After replace: " + sb);

        // reverse method
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // substring method
        String substring = sb.substring(6);
        System.out.println("Substring: " + substring);

        // charAt method
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // length method
        int length = sb.length();
        System.out.println("Length: " + length);

        // capacity method
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // setCharAt method
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sb);
    }
}
