// This code is for establishing connection with MySQL
// database and retrieving data
// from db Java Database connectivity

/*
 *1. import --->java.sql
 *2. load and register the driver ---> com.jdbc.
 *3. create connection
 *4. create a statement
 *5. execute the query
 *6. process the results
 *7. close
 */

import java.io.*;
import java.sql.*;

class JDBC {
    public static void main(String[] args) throws Exception
    {
        String url
                = "jdbc:mysql://localhost:3306/DB1"; // table details
        String username = "root"; // MySQL credentials
        String password = "Shubham@22 ";
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(
                url, username, password);
        System.out.println(
                "Connection Established successfully");
        //String query= "select * from Employeeinfo"; // query to be run

//        Statement st = con.createStatement();
//        ResultSet rs
//                = st.executeQuery(query); // Execute query
//        rs.next();
//        String name
//                = rs.getString("name"); // Retrieve name from db
//
//        System.out.println(name); // Print result on console
//        st.close(); // close statement
//        con.close(); // close connection
//        System.out.println("Connection Closed....");
        String query1 = "SELECT * FROM customers WHERE age > 30";
// Query with JOIN clause
        String joinQuery = "SELECT orders.order_id, customers.name FROM orders JOIN customers ON orders.customer_id = customers.customer_id";
        ResultSet joinResult = stmt.executeQuery(joinQuery);

        while (joinResult.next()) {
            System.out.println(joinResult.getString("order_id") + " - " + joinResult.getString("name"));
        }

        // Query with IN clause
        String inQuery = "SELECT * FROM products WHERE category_id IN (1, 2, 3)";
        ResultSet inResult = stmt.executeQuery(inQuery);

        while (inResult.next()) {
            System.out.println(inResult.getString("name"));
        }

        // Query with EXISTS clause
        String existsQuery = "SELECT * FROM customers WHERE EXISTS (SELECT * FROM orders WHERE customers.customer_id = orders.customer_id)";
        ResultSet existsResult = stmt.executeQuery(existsQuery);

        while (existsResult.next()) {
            System.out.println(existsResult.getString("name"));
        }

        // Query with ORDER BY clause
        String orderByQuery = "SELECT * FROM products ORDER BY price DESC";
        ResultSet orderByResult = stmt.executeQuery(orderByQuery);

        while (orderByResult.next()) {
            System.out.println(orderByResult.getString("name") + " - " + orderByResult.getDouble("price"));
        }

        // Query with LIKE clause
        String likeQuery = "SELECT * FROM products WHERE name LIKE '%apple%'";
        ResultSet likeResult = stmt.executeQuery(likeQuery);

        while (likeResult.next()) {
            System.out.println(likeResult.getString("name"));
        }

    }
}
