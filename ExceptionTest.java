import java.io.FileInputStream;  // use for Data Read

public class ExceptionTest {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("d:/abc.txt");
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
