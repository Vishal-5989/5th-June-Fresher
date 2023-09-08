import java.io.FileOutputStream;
public class FileoutputStream {

    // Java FileOutputStream is an output stream used for writing data to a file.
    void fileoutputstream(){
        try{
            System.out.println("\nWrite character in file");
            FileOutputStream fout = new FileOutputStream("C:\\Assignment\\file.txt");
            fout.write(65); // ascii code
            fout.close();
            System.out.println("Success");
        }catch(Exception e){System.out.println(e);}
    }

    void fileoutputstream1(){
        try{
            System.out.println("\nWrite whole string in file");
            FileOutputStream fout = new FileOutputStream("C:\\Assignment\\file.txt");
            String s = "Welcome to file output stream";
            byte b[] = s.getBytes(); // converting strings into byte array
            fout.write(b); // Write whole string in file
            fout.close();
            System.out.println("Success");
        }catch(Exception e){System.out.println(e);}
    }
}
