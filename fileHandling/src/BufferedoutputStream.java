import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferedoutputStream {

     /*
         Java BufferedOutputStream class is used for buffering an output stream.
         It internally uses buffer to store data.
         It adds more efficiency than to write data directly into a stream.
     */

    void bufferOutput(){
        try {
            FileOutputStream fout=new FileOutputStream("C:\\Assignment\\file.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="Welcome to buffer output stream";
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
