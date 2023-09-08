import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceinputStream {
    /*
    Java SequenceInputStream class is used to read data from multiple streams.
    It reads data sequentially (one by one).
    */
    void sequenceStream(){
        try{
            FileInputStream file1 = new FileInputStream("C:\\Assignment\\file.txt");
            FileInputStream file2 = new FileInputStream("C:\\Assignment\\file2.txt");
            SequenceInputStream sequenceInput = new SequenceInputStream(file1,file2);
            int k;
            while ((k = sequenceInput.read()) != -1){
                System.out.print((char) k);
            }
            sequenceInput.close();
            file1.close();
            file2.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void sequenceStream1(){
        // in this method we read 2 files and write details and 3rd file
        try{
            FileInputStream file1 = new FileInputStream("C:\\Assignment\\file.txt");
            FileInputStream file2 = new FileInputStream("C:\\Assignment\\file2.txt");
            FileOutputStream file3 = new FileOutputStream("C:\\Assignment\\file3.txt");
            SequenceInputStream sequenceInput = new SequenceInputStream(file1,file2);
            int k;
            while ((k = sequenceInput.read()) != -1){
                file3.write(k);
            }
            sequenceInput.close();
            file3.close();
            file1.close();
            file2.close();
            System.out.println("success");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
