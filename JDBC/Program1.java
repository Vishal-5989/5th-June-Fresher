package JDBC;

import java.sql.*;

public class Program1 {
    static String url="jdbc:mysql://localhost:3306/surahdb";
    static  String user="root";
    static  String pass="root";
    static  String conn="com.mysql.jdbc.Driver";

    static Connection con=null;
    public void addEmployee(){
        String query="insert into employee values(5,'Shubham','DataAnalyst')";
        try {
            Class.forName(conn);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con= DriverManager.getConnection(url,user,pass);
            Statement stmt=con.createStatement();
            stmt.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
    public void displayEmployee(){
        String query="select * from employee";
        try {
            Class.forName(conn);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con= DriverManager.getConnection(url,user,pass);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void likeEmloyee(){
        String query="select * from employee where name='suraj'";

        try {
            Class.forName(conn);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con= DriverManager.getConnection(url,user,pass);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void betweenAge(){

        String query="select * from employee where age between 21 and 25";

        try {
            Class.forName(conn);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con= DriverManager.getConnection(url,user,pass);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+
                        "\t"+rs.getString(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void groupBy(){

        String query="select * from employee where age='22' group by age";
        try {
            Class.forName(conn);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            con= DriverManager.getConnection(url,user,pass);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+
                        "\t"+rs.getString(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
