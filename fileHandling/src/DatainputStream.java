import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DatainputStream {
    /*
        Java DataInputStream class allows an application to read primitive data from the
        input stream in a machine-independent way.
    */
    void dataInput(){
        try{
            InputStream input = new FileInputStream("C:\\Assignment\\file.txt");
            DataInputStream inst = new DataInputStream(input);
            int count = input.available();
            byte[] ary = new byte[count];
            inst.read(ary);
            for (byte bt : ary) {
                char k = (char) bt;
                System.out.print(k+"-");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
