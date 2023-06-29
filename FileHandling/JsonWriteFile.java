import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriteFile {

    public static void main(String[] args) throws IOException {
        FileWriter fe = new FileWriter("C:\\Users\\NTS-Sakshi Saha\\Desktop\\Assignment\\Task.json");
        JSONObject emp = new JSONObject();
        emp.put("userId","4567");
        emp.put("jobTitleName","IT");
        emp.put("firstName","abc");
        emp.put("lastName","nbh");

        fe.write(emp.toJSONString());
        fe.close();

        System.out.println("JSON file created: "+emp);



    }
}
