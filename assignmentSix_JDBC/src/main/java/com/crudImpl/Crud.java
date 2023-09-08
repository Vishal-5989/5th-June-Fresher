package com.crudImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Crud {
    public void create(Connection con) {
        try {
            String empId, fname, lname, mobile_number, department;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your employee id: ");
            empId = sc.next();

            if (empId.length() != 5) {
                throw new Exception("Please, Enter a valid employee id");
            }

            String sql1 = "SELECT EmpID FROM Crud WHERE EmpID = ?";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, empId);
            ResultSet result = statement1.executeQuery();

            if (result.next()) {
                String empID = result.getString("EmpID");

                if (empID != null) {
                    throw new Exception("Employee Id already exist.");
                }
            }

            System.out.println("Enter your first name: ");
            fname = sc.next();
            System.out.println("Enter your last name: ");
            lname = sc.next();
            System.out.println("Enter your mobile number");
            mobile_number = sc.next();

            if (mobile_number.length() != 10) {
                throw new Exception("Please, Enter a valid mobile number");
            }

            String sql2 = "SELECT Mobile_number FROM Crud WHERE Mobile_number = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);
            statement2.setString(1, mobile_number);
            ResultSet result1 = statement2.executeQuery();

            if (result1.next()) {
                String mobileNumber = result1.getString("Mobile_number");
                if (mobileNumber != null) {
                    throw new Exception("Mobile number is already exist.");
                }
            }

            System.out.println("Enter your department");
            department = sc.next();

            String sql = "INSERT INTO Crud (EmpID, FirstName, LastName, Mobile_number, Deparment) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, empId);
            statement.setString(2, fname);
            statement.setString(3, lname);
            statement.setString(4, mobile_number);
            statement.setString(5, department);

            statement.executeUpdate();
            System.out.println("Information saved successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void read(Connection con) {
        try {
            String empId;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your employee id: ");
            empId = sc.next();

            if (empId.length() != 5) {
                throw new Exception("Please, Enter a valid employee id");
            }

            String sql1 = "SELECT EmpID FROM Crud WHERE EmpID = ?";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, empId);
            ResultSet result1 = statement1.executeQuery();
            if (!result1.next()) {
                throw new Exception("This employee ID is not present in dataset.");
            }

            String sql = "SELECT EmpID, FirstName, LastName, Mobile_number, Deparment FROM Crud WHERE EmpID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, empId);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String empID = result.getString("EmpID");
                String firstName = result.getString("FirstName");
                String lastName = result.getString("LastName");
                String mobileNumber = result.getString("Mobile_number");
                String department = result.getString("Deparment");

                System.out.println("EmpID: " + empID);
                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
                System.out.println("Mobile_number: " + mobileNumber);
                System.out.println("Deparment: " + department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void update(Connection con) {
        try {
            String empId, fname, lname, mobile_number, department;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your employee id: ");
            empId = sc.next();

            if (empId.length() != 5) {
                throw new Exception("Please, Enter a valid employee id");
            }

            String sql1 = "SELECT EmpID FROM Crud WHERE EmpID = ?";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, empId);
            ResultSet result1 = statement1.executeQuery();
            if (!result1.next()) {
                throw new Exception("This employee ID is not present in dataset");
            }

            String sql = "UPDATE Crud SET FirstName = ?, LastName = ?, Mobile_number = ?, Deparment = ? WHERE EmpID = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            System.out.println("Enter your first name: ");
            fname = sc.next();
            System.out.println("Enter your last name: ");
            lname = sc.next();
            System.out.println("Enter your mobile number");
            mobile_number = sc.next();

            if (mobile_number.length() != 10) {
                throw new Exception("Please, Enter a valid mobile number");
            }

            String sql2 = "SELECT Mobile_number FROM Crud WHERE Mobile_number = ?";
            PreparedStatement statement2 = con.prepareStatement(sql2);
            statement2.setString(1, mobile_number);
            ResultSet result2 = statement2.executeQuery();

            if (result2.next()) {
                String mobileNumber = result2.getString("Mobile_number");
                if (mobileNumber == mobile_number) {
                    throw new Exception("Your previous mobile number and entered mobile number is same");
                } else if (mobileNumber != null) {
                    throw new Exception("Mobile number is already exist.");
                }
            }

            System.out.println("Enter your department");
            department = sc.next();

            statement.setString(1, fname);
            statement.setString(2, lname);
            statement.setString(3, mobile_number);
            statement.setString(4, department);
            statement.setString(5, empId);
            statement.executeUpdate();
            System.out.println("Information updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(Connection con) {
        try {
            String sql = "DELETE FROM Crud WHERE EmpID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your employee id: ");
            String empId = sc.next();

            if (empId.length() != 5) {
                throw new Exception("Please, Enter a valid employee id");
            }

            String sql1 = "SELECT EmpID FROM Crud WHERE EmpID = ?";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            statement1.setString(1, empId);
            ResultSet result1 = statement1.executeQuery();
            if (!result1.next()) {
                throw new Exception("This employee ID is not present in dataset.");
            }
            statement.setString(1, empId);
            statement.executeUpdate();
            System.out.println("Information deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void groupBy(Connection con) throws Exception {
        try {
            String sql1 = "SELECT COUNT(EmpID), Deparment FROM Crud GROUP BY Deparment";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            ResultSet result = statement1.executeQuery();
            while (result.next()) {
                String empId = result.getString("COUNT(EmpID)");
                String department = result.getString("Deparment");
                System.out.println("===========================");
                System.out.println("Total Employee : " + empId);
                System.out.println("Deparment: " + department);
                System.out.println("===========================\n");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public void orderBy(Connection con) throws Exception {
        try {
            String sql1 = "SELECT * FROM Crud ORDER BY FirstName ASC";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            ResultSet result = statement1.executeQuery();
            while (result.next()) {
                String empID = result.getString("EmpID");
                String firstName = result.getString("FirstName");
                String lastName = result.getString("LastName");
                String mobileNumber = result.getString("Mobile_number");
                String department = result.getString("Deparment");

                System.out.println("EmpID: " + empID);
                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
                System.out.println("Mobile_number: " + mobileNumber);
                System.out.println("Deparment: " + department);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public void like(Connection con) throws Exception {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your firstname id: ");
            String firstname = sc.next();
            String sql1 = "SELECT * FROM Crud WHERE FirstName LIKE '"+firstname+"%'";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            ResultSet result = statement1.executeQuery();

            while (result.next()) {
                String empID = result.getString("EmpID");
                String firstName = result.getString("FirstName");
                String lastName = result.getString("LastName");
                String mobileNumber = result.getString("Mobile_number");
                String department = result.getString("Deparment");

                System.out.println("EmpID: " + empID);
                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
                System.out.println("Mobile_number: " + mobileNumber);
                System.out.println("Deparment: " + department);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
