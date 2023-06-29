package org.example;

import java.util.ArrayList;
import java.util.List;

public class WriteToExcelFile {

    public static void write()
    {
            try
            {
                String [] rowHeading = {"firstName","lastName","mobileNumber"};
                List<User> users = createUser();




            }
    }

    private static List<User> createUser() {
        List<User>users =new ArrayList<>();
        users.add(new User("suraj", "Kokare", "9876567798"));
        users.add(new User("Bhushan", "bhusha", "8765434567"));
        users.add(new User("shubham", "chaudhari", "7252425608"));
        return users;
    }
}
