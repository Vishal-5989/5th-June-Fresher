package com.demo.dao;

import com.demo.beans.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDaoImpl implements DeptDao{

    static Connection con;
    static PreparedStatement pin,pdel,psel,pseldeptno,pupdeptno,pgroupemp,porderjob,phaving,pcrossjoin,pselfjoin,pinjoin;         //use of prepared statement
    static {
        con=DBUtil.getMyConnection();               //get the connection
        try {
            pin=con.prepareStatement("insert into dept values(?,?,?,?,?)");
            pdel=con.prepareStatement("delete from dept where deptno=?");
            psel=con.prepareStatement("select * from dept");
            pseldeptno=con.prepareStatement("select * from dept where deptno=?");
            pupdeptno=con.prepareStatement("update dept set dname=?,loc=?,pwd=?,startedon=? where deptno=?");
            pgroupemp=con.prepareStatement(" select count(deptno) \"Total Employee in perticular job\",job from emp group by job");
            porderjob=con.prepareStatement("select count(deptno) \"Total Employee in perticular job\",job from emp group by job order by job desc");
            phaving=con.prepareStatement("select count(deptno) \"Total Employee in perticular job\",job from emp group by job having count(deptno)>1 order by job");
            pcrossjoin=con.prepareStatement("select mnu.name,sftdrink.name,mnu.rate,mnu.rate + sftdrink.rate as \"Total\" from menucard mnu,softdrink sftdrink");
            pselfjoin=con.prepareStatement("select ename,sal,job from emp having sal=(select max(sal) from emp)");
            pinjoin=con.prepareStatement("select e.ename \"Manager\" from emp e inner join emp m on e.empno=m.mgr where e.deptno not in (30) group by e.ename");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //insert new department
    @Override
    public void insertNewDepartment(Department d) {
        try {
            pin.setInt(1,d.getDeptno());
            pin.setString(2,d.getDname());
            pin.setString(3,d.getLoc());
            pin.setString(4,d.getPwd());
            pin.setString(5,d.getStartedon());
            int n=pin.executeUpdate();
            if(n>0){
                System.out.println("Data added in database successfully..");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //delete the department
    @Override
    public boolean removeByDeptno(int deptno) {
        try {
            pdel.setInt(1,deptno);
            int n=pdel.executeUpdate();
            if (n>0){
                return true;
            }else {
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Display data of department
    @Override
    public List<Department> findAll() {

        try {
            ResultSet rs=psel.executeQuery();
            List<Department>dlist=new ArrayList<>();        //Take one list and add the data into that list
            while(rs.next()){
                dlist.add(new Department(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));

            }
            if (dlist.size()>0){
                return dlist;                           //If data is present in the list then its return to test an in test daa
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    //Find the department no and show the data if present
    @Override
    public Department searchByDeptno(int deptno) {
        try {
            pseldeptno.setInt(1,deptno);
            ResultSet rs=pseldeptno.executeQuery();
            while (rs.next()){
                return new Department(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    //update the data for given department no
    @Override
    public boolean updatedByDeptno(int deptno, String dname, String loc, String pwd, String startedon) {
        try {

            pupdeptno.setString(1,dname);
            pupdeptno.setString(2,loc);
            pupdeptno.setString(3,pwd);
            pupdeptno.setString(4,startedon);
            pupdeptno.setInt(5,deptno);
            int n=pupdeptno.executeUpdate();
            if (n>0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    //close the connection
    @Override
    public void closeConnection() {
        DBUtil.closeMyConnection();
    }

    //Group By employee print the total number of employee in perticular job
    @Override
    public void groupByClause() {
        try {
            ResultSet rs=pgroupemp.executeQuery();
            while (rs.next()){
                System.out.println("Total employee in perticular job ="+rs.getInt(1));
                System.out.println("Job of Employee :"+rs.getString(2));
                System.out.println("------------------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
//Order by job descending order
    @Override
    public void orderByClause() {
        try {
            ResultSet rs=porderjob.executeQuery();
            while (rs.next()){
                System.out.print("Total employee in perticular job   ="+rs.getInt(1));
                System.out.println(" ");
                System.out.println("Job of Employee         :"+rs.getString(2));
                System.out.println("------------------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //havingClause
    @Override
    public void havingClause() {

        try {
            ResultSet rs=phaving.executeQuery();
            while(rs.next()){
                System.out.print("Total employee in perticular job   ="+rs.getInt(1));
                System.out.println(" ");
                System.out.println("Job of Employee         :"+rs.getString(2));
                System.out.println("------------------------------------------------");
            }


        } catch (SQLException e) {
            System.out.println("Count does not match please provide valid count");
            throw new RuntimeException(e);
        }
    }

    //Cross join or product join
    @Override
    public void crossJoin() {
        try {
            ResultSet rs=pcrossjoin.executeQuery();
            while(rs.next()){
                System.out.print("Name of ="+rs.getString(1));
                System.out.println(" ");
                System.out.println("Name of ="+rs.getString(2));
                System.out.println("Rate ="+rs.getInt(3));
                System.out.println("Total Rate ="+rs.getInt(4));
                System.out.println("------------------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Inner self join
    @Override
    public void selfJoin() {
        try {
            ResultSet rs=pselfjoin.executeQuery();
            while(rs.next()){
                System.out.print("Name ="+rs.getString(1));
                System.out.println(" ");
                System.out.println("Salary of Employee ="+rs.getInt(2));
                System.out.println("Job ="+rs.getString(3));
                System.out.println("------------------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //inner join
    @Override
    public void innerjoin() {
        try {
            ResultSet rs=pinjoin.executeQuery();
            System.out.println("Shows the employee whoes report to the manager the department number not in 30");
            while(rs.next()){
                System.out.println("Employee report to a manager : "+rs.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
