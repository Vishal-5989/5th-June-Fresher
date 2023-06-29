package org.example;

import java.sql.*;

public class UpdateSt {
    static  String url = "com.mysql.cj.jdbc.Driver";
    static  String pathDB = "jdbc:mysql://localhost:3306/bdb";
    static  String user = "root";
    static String password = "dere@123";

    public static void trytest(){
        try{
            Class.forName(url);
            Connection conn = DriverManager.getConnection(pathDB,user,password);

            //PreparedStatement preparedStatement = conn.prepareStatement("select count(eid) from edetails");
           // PreparedStatement preparedStatement = conn.prepareStatement("select eid,ename,deptname from edetails where deptno=30");
            //PreparedStatement preparedStatement = conn.prepareStatement("select srn0,ename,city from edetails order by srn0 desc;");
            //PreparedStatement preparedStatement = conn.prepareStatement("select distinct eid from edetails a where 3>= (select count(distinct eid) from edetails b where a.eid <= b.eid) order by a.eid desc;");
           // PreparedStatement preparedStatement = conn.prepareStatement("select count(city),ename,eid from edetails group by city,ename,eid having city = \"pune\";");
            //PreparedStatement preparedStatement = conn.prepareStatement("select dname from edetails e left join ddetails d on e.eid = d.eid group by dname;");
            //PreparedStatement preparedStatement = conn.prepareStatement("select ename,city,dname from edetails e right join ddetails d on e.eid=d.eid;");
            //PreparedStatement preparedStatement = conn.prepareStatement("select ename,city,dname from edetails e left join ddetails d on e.eid=d.eid;");
            PreparedStatement preparedStatement = conn.prepareStatement("select * from edetails,ddetails");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                //System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7));
                System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+
                        rs.getInt(6)+" "+rs.getString(7)+" "+rs.getInt(8)+" "+rs.getInt(9)+" "+rs.getString(10));
            }
            conn.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
