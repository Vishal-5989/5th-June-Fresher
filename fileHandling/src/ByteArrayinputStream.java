import java.io.ByteArrayInputStream;

public class ByteArrayinputStream {

    /*
        it can be used to read byte array as input stream.
        Java ByteArrayInputStream class contains an internal buffer which is used to read
        byte array as stream. In this stream, the data is read from a byte array.
     */
    void byteArray(){
        byte[] buf = { 35, 36, 37, 38 };
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value:" + k + "; Special character: " + ch);
        }
    }
}
