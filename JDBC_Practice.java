import javax.swing.plaf.PanelUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Practice {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydatabase5";
        String user="root";
        String password="root";
        System.out.println("Enter query of your choice(GROUP_BY/ORDER_BY/LIKE)");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String choice=str.toLowerCase();
        switch (choice){
            case  "group by":
                try{
                    get_conn();

                    String groupby_query="Select count(name)as name1,standrand from student10 group by standrand";
//                    Class.forName("com.mysql.jdbc.Driver");
                  Connection con= DriverManager.getConnection(url,user,password);
//                    System.out.println("connection successfull");


                    Statement sat=con.createStatement();
                    sat.executeQuery(groupby_query);
                    ResultSet res=sat.getResultSet();
                    System.out.println("Group by excuted sucessfully");
                    System.out.println(res);
                    while (res.next()){

                        int name1=res.getInt("name1");
                        String standrand=res.getString("standrand");
                        System.out.println(name1+" "+standrand);
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;

            case "order by":
                try{
                    String orderby_query="select * from student10 order by(id) asc";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection(url,user,password);
                    System.out.println("connection successfull");


                    Statement sat=con.createStatement();
                    sat.executeQuery(orderby_query);
                    ResultSet res=sat.getResultSet();
                    System.out.println("Order by excuted sucessfully");
                    while (res.next()){
                        String name=res.getString("name");
                        int id=res.getInt("id");
                        String city=res.getNString("city");
                        String standrand=res.getString("standrand");
                        System.out.print(name+"\t");
                        System.out.print(id+"\t");
                        System.out.print(city+"\t");
                        System.out.print(standrand+"\t");
                        System.out.println();
//                        System.out.println(res.getString("name"+"\t"));
//                        System.out.println(res.getInt("id"+"\t"));
//                        System.out.println(res.getString("city"+"\t"));
//                        System.out.println(res.getString("standrand"+"\t"));

                    }

                }
                catch (Exception e2){}
                break;


            case "like":
                try {
                    System.out.println("like operator will fetch the record on specified pattern matching");
                    String like_query="select * from student10 where name like'____'";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection(url,user,password);
                    System.out.println("connection successfull");


                    Statement sat=con.createStatement();
                    sat.executeQuery(like_query);
                    ResultSet res=sat.getResultSet();
                    System.out.println("like operator excuted sucessfully");

                    while (res.next()){
                        String name=res.getString("name");
                        int id=res.getInt("id");
                        String city=res.getNString("city");
                        String standrand=res.getString("standrand");
                        System.out.println(name+" "+id+" "+city+" "+standrand);

                    }


                }
                catch (Exception e3){}
            break;



            case "not like":
                try {
                    System.out.println("like operator will fetch the record on specified pattern matching");
                    String notlike_query = "select * from student10 where name not like'%A'";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url, user, password);
                    System.out.println("connection successfull");


                    Statement sat = con.createStatement();
                    sat.executeQuery(notlike_query);
                    ResultSet res = sat.getResultSet();
                    System.out.println("notlike operator excuted sucessfully");



                    while (res.next()){
                        String name=res.getString("name");
                        int id=res.getInt("id");
                        String city=res.getNString("city");
                        String standrand=res.getString("standrand");
                        System.out.println(name+" "+id+" "+city+" "+standrand);

                    }
                    break;
                }
                catch (Exception e4){

                }

            default:
                System.out.println("Wrong choice");
                break;


        }
//        try{
//            String groupby_query="Select count(name)as name1,standrand from student10 group by standrand";
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection(url,user,password);
//            System.out.println("connection successfull");
//
//
//            Statement sat=con.createStatement();
//            sat.executeQuery(groupby_query);
//            ResultSet res=sat.getResultSet();
//            System.out.println("Group by excuted sucessfully");
//            System.out.println(res);
//            while (res.next()){
//
//                int name1=res.getInt("name1");
//                String standrand=res.getString("standrand");
//                System.out.println(name1+" "+standrand);
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

//        try{
//            String orderby_query="select * from student10 order by(id)";
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection(url,user,password);
//            System.out.println("connection successfull");
//
//
//            Statement sat=con.createStatement();
//            sat.executeQuery(orderby_query);
//            ResultSet res=sat.getResultSet();
//            System.out.println("Order by excuted sucessfully");
//            while (res.next()){
//                String name=res.getString("name");
//                int id=res.getInt("id");
//                String city=res.getNString("city");
//                String standrand=res.getString("standrand");
//                System.out.println(name+" "+id+" "+city+" "+standrand);
//
//            }
//
//        }







        }
    public static  void get_conn() throws Exception{
        String url="jdbc:mysql://localhost:3306/mydatabase5";
        String user="root";
        String password="root";
      //  System.out.println("like operator will fetch the record on specified pattern matching");
        //String notlike_query = "select * from student10 where name not like'%A'";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("connection successfull");


    }



    }

