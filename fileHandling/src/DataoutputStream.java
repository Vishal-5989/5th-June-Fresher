import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataoutputStream {
    void dataOutput(){
        try {
            FileOutputStream file = new FileOutputStream("C:\\Assignment\\file.txt");
            DataOutputStream data = new DataOutputStream(file);
            data.writeInt(65);
            data.flush();
            data.close();
            System.out.println("Succcess...");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
