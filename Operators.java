package org.example;

import java.sql.*;

public class Operators {
    static String url = "com.mysql.cj.jdbc.Driver";

    static String pathDB = "jdbc:mysql://localhost:3306/db";

    static String user = "root";

    static String password = "Sulakshana@1197";


    public static void orderBy(){

        try {
            Class.forName(url);
            Connection conn = DriverManager.getConnection(pathDB, user, password);
            Statement st = conn.createStatement();

            //order by descending
            //ResultSet rs= st.executeQuery("SELECT EmpName from EmployeeDetails order by EmpName desc;");
            //System.out.println("Ordered Successfully....But Why You Want It In Descending Order");


            //Order by ascending
            //ResultSet rs= st.executeQuery("SELECT EmpName from EmployeeDetails order by EmpName asc;");
            //System.out.println("Ordered Successfully......But What Will You Do With It  ???");

            //In Operator
            //ResultSet rs = st.executeQuery("Select EmpName from EmployeeDetails where EId IN (01,04)");
            //System.out.println("Here You Go.....");

            //Not In Operator
            //ResultSet rs = st.executeQuery("Select EmpName from EmployeeDetails where EId Not IN (01,04)");
            //System.out.println("Here You Go.....");

            //Between Operator
            //ResultSet rs = st.executeQuery("Select EmpName from EmployeeDetails where EId Between 01 AND 04");
            //System.out.println("Here You Go.....");

            //Not Between Operator
            //ResultSet rs = st.executeQuery("Select EmpName from EmployeeDetails where EId Not Between 01 AND 04");
            //System.out.println("Here You Go.....");

            //Like Operator
            //ResultSet rs = st.executeQuery("Select EmpName from EmployeeDetails where EmpName Like '%a%';");
            //System.out.println("Here You Go.....");

            //Not Like Operator
            //ResultSet rs = st.executeQuery("Select EmpName from EmployeeDetails where EmpName Not Like '%a%';");
            //System.out.println("Here You Go.....");


            //Cross Join
            ResultSet rs = st.executeQuery("Select EmployeeDetails.EmpName, Department.DeptName from EmployeeDetails Cross Join Department;");
            System.out.println("Here Is Your Cross Join Output....");


            while (rs.next()){
                System.out.println(rs.getString("EmpName"));
            }
            conn.close();

        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
