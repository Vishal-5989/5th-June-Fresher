package com.demo.dao;

import com.demo.beans.Employee;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class EmployeeDAOImplementation implements EmployeeDAO {
    static Set<Employee> hset;

    static {
        hset=new HashSet<>();
        hset.add(new Employee(01,"Tarak",10000,new Date()));
        hset.add(new Employee(02,"Jethalal",100000,new Date()));
        hset.add(new Employee(03,"Bhide",20000,new Date()));
        hset.add(new Employee(04,"Sundar",00000,new Date()));
        hset.add(new Employee(05,"Popatlal",5000,new Date()));
    }
    @Override
    public boolean save(Employee newemp) {

        return hset.add(newemp);
    }
    @Override
    public Set<Employee> findAll() {
        if(!hset.isEmpty())
            return hset;
        return null;
    }
    @Override
    public Employee searchById(int id) {
        for(Employee emp:hset) {
            if(emp.getEmployeeId()==id) {
                return emp;
            }
        }
        return null;
    }
    @Override
    public List<Employee> searchByName(String name) {
        List<Employee> empList=new ArrayList<>();
        for(Employee emp:hset) {
            if(emp.getEmployeeName().equalsIgnoreCase(name)) {
                empList.add(emp);
            }
        }
        if(!empList.isEmpty())
            return empList;
        return null;
    }
    @Override
    public List<Employee> searchBySalary(double salary) {

        List<Employee> emplist1=hset.stream().filter(x->x.getEmployeeSalary()>salary).collect(Collectors.toList());

        if(emplist1.size()>0)
            return emplist1;
        return null;
    }
    @Override
    public int deleteById(int id) {
        Scanner scan=new Scanner(System.in);

        if(!hset.isEmpty()) {
            for(Employee emp:hset) {
                if(emp.getEmployeeId()==id) {
                    System.out.println("Employee Found..."+emp);
                    System.out.print("Do you want to delete? (y/n)");
                    String ch=scan.next();
                    if(ch.equalsIgnoreCase("y")) {
                        hset.remove(new Employee(id));
                        return -1;
                    }
                    else if(ch.equalsIgnoreCase("n")) {
                        return -2;
                    }
                }
            }
        }

        return -3;
    }
    @Override
    public int deleteByName(String name) {
        Scanner scan = new Scanner(System.in);

        if(!hset.isEmpty()) {
            for(Employee emp:hset) {
                if(emp.getEmployeeName().equalsIgnoreCase(name)) {
                    System.out.println("Employee Found..."+emp);
                    System.out.println("Do You Want To Continue? (y/n)");
                    String ch=scan.next();
                    if(ch.equalsIgnoreCase("y")) {
                        hset.remove(emp);
                        return -1;
                    }
                    else if(ch.equalsIgnoreCase("n")) {
                        return -2;
                    }
                }
            }
        }
        return -3;
    }
    @Override
    public Set<Employee> arrangeBySalary() {
        Set<Employee> ts=new TreeSet<>();
        if(!hset.isEmpty()) {
            for(Employee e:hset) {
                ts.add(e);
            }
            return ts;
        }

        return null;
    }
    //	@Override
//	public int updateSalary(int id,double newsal) {
//		Scanner scan=new Scanner(System.in);
//		Employee e=searchById(id);
//		if(e!=null) {
//			System.out.println(e);
//			System.out.println("Do You want to modify salary? (y/n)");
//			String ans=scan.next();
//			if(ans.equalsIgnoreCase("y")) {
//				e.setEmployeeSalary(newsal);
//				return -1;
//			}
//			else {
//				return -2;
//			}
//		}
//		return -3;
//	}
    @Override
    public int updateSalary(int id) {
        Scanner scan=new Scanner(System.in);
        Employee e=searchById(id);
        if(e!=null) {
            System.out.println(e);
            System.out.print("Enter new Salary: ");
            double salary=scan.nextDouble();
            System.out.println("Do you want to modify salary? (y/n)");
            String ans=scan.next();
            if(ans.equalsIgnoreCase("y")) {
                e.setEmployeeSalary(salary);
                return -1;
            }
            else {
                return -2;
            }
        }
        return -3;
    }

}