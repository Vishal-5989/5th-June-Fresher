import java.io.FileInputStream;

public class BufferedInputStream {
    /*
        Java BufferedInputStream class is used to read information from stream.
        It internally uses buffer mechanism to make the performance fast.
    */
    void bufferInputStream() {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Assignment\\file.txt");
            java.io.BufferedInputStream bufferInput = new java.io.BufferedInputStream(inputStream);
            int i;
            while((i=bufferInput.read())!=-1){
                System.out.print((char)i);
            }
            bufferInput.close();
            inputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
