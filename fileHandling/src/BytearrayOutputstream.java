import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class BytearrayOutputstream {
    /*
        The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
        is used to write common data into multiple files
        buffer automatically grows according to data
     */
    void bytearrayOutputstream(){
        try {
            FileOutputStream fout1=new FileOutputStream("C:\\Assignment\\file.txt");
            FileOutputStream fout2=new FileOutputStream("C:\\Assignment\\file2.txt");

            ByteArrayOutputStream bout=new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            bout.close();//has no effect
            System.out.println("Success...");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}