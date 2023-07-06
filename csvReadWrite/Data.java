package csvReadWrite;

import com.sun.security.jgss.GSSUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Data {
    public static void main(String[] args) {
        String path="C:\\Java\\csv\\user.csv";

        writeUser(path);
    }

    public static void writeUser(String path) {
        List<User> user = new ArrayList<>();

        User u=new User();
        u.setAge(22);
        u.setName("Suraj");
        u.setPhoneNumber(93564);

        FileWriter fw=null;
        try {
             fw=new FileWriter(path);
            System.out.println("Successfully writen ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fw.close();
                System.out.println("Successfully Closed ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
