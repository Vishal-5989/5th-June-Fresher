package com.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDAO;
import com.demo.dao.EmployeeDAOImplementation;
public class EmployeeServiceImplementation implements EmployeeService{

    private EmployeeDAO edao;

    public EmployeeServiceImplementation(){
        edao=new EmployeeDAOImplementation();
    }
    @Override
    public boolean createEmployee() {
        boolean result = false;
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter Employee Details: ");
        System.out.print("Enter Employee ID: ");
        int id = scan.nextInt();
        System.out.print("\nEnter Employee Name: ");
        String name = scan.next();
        System.out.print("\nEnter Employee Salary: ");
        double salary = scan.nextDouble();
        System.out.print("\nEnter Date Of Joining (DD/MM/YYYY): ");
        String dt = scan.next();
        Date doj = null;

        try {
            doj = sdf.parse(dt);
            Employee newemp = new Employee(id, name, salary, doj);
            result = edao.save(newemp);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public Set<Employee> displayAll() {
        return edao.findAll();
    }
    @Override
    public Employee findById(int id) {
        return edao.searchById(id);
    }
    @Override
    public List<Employee> findByName(String name) {

        return edao.searchByName(name);
    }
    @Override
    public List<Employee> findBySalary(double salary) {
        return edao.searchBySalary(salary);
    }
    @Override
    public int removeById(int id) {

        return edao.deleteById(id);
    }
    @Override
    public int removeByName(String name) {

        return edao.deleteByName(name);
    }
    @Override
    public Set<Employee> sortBySalary() {

        return edao.arrangeBySalary();
    }
    //	@Override
//	public int modifySalary(int id,double newsal) {
//
//		return edao.updateSalary(id,newsal);
//	}
    @Override
    public int modifySalary(int id) {
        return edao.updateSalary(id);
    }

}