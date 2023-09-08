import java.io.FileInputStream;

public class FileinputStream {
    // Java FileInputStream class obtains input bytes from a file.
    void inputStream(){
        try{
            System.out.println("\nRead only first character from file");
            FileInputStream fin = new FileInputStream("C:\\Assignment\\file.txt");
            int i = fin.read();
            System.out.println((char) i);
            fin.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    void inputStream1(){
        try{
            System.out.println("\nRead whole string from file");
            FileInputStream fin = new FileInputStream("C:\\Assignment\\file.txt");
            int i=0;
            while((i=fin.read())!=-1){ // iterate till the value is equal to -1 if value is -1 then --> terminate
                System.out.print((char)i);
            }
            fin.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
