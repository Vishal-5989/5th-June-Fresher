import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonFile {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("C:\\Users\\NTS-Sakshi Saha\\Desktop\\Assignment\\Task.json");
        Object obj = jsonParser.parse((fileReader));
        JSONObject empobj = (JSONObject)obj;
        JSONArray arr = (JSONArray)empobj.get("Employees");
        for(int i = 0; i<=arr.size()-1;i++)
        {
            JSONObject emp = (JSONObject)arr.get(i);
            String userId =(String)emp.get("userId");
            String jobTitleName =(String)emp.get("jobTitleName");
            String firstName =(String)emp.get("firstName");
            String lastName =(String)emp.get("lastName");
            System.out.println("Details of " + i + " employee is ....");
            System.out.println("userId :"+ userId);
            System.out.println("firstName :"+ firstName);
            System.out.println("lastName :"+ lastName);
            System.out.println("jobTitleName :"+ jobTitleName);
        }

    }
}