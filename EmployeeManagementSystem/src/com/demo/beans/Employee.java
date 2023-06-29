package com.demo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {

    //DATA MEMBERS
    private int eId;
    private String eName;
    private double eSalary;
    private Date date_of_joining;

    //PARAMETERLESS CONSTRUCTOR
    public Employee() {
        super();
    }

    //PARAMETERISED CONSTRUCTOR
    public Employee(int id,String name, double salary, Date doj) {
        super();
        this.eId=id;
        this.eName=name;
        this.eSalary=salary;
        this.date_of_joining=doj;
    }

    public Employee(int id) {
        super();
        this.eId=id;
    }

    //MUTATORS
    public void setEmployeeId(int id) {
        this.eId=id;
    }

    public void setEmployeeName(String name) {
        this.eName=name;
    }
    public void setEmployeeSalary(double salary) {
        this.eSalary=salary;
    }
    public void setEmployeeDateOfJoining(Date doj) {
        this.date_of_joining=doj;
    }

    //ACCESSORS
    public int getEmployeeId()
    {
        return this.eId;
    }
    public String getEmployeeName() {
        return this.eName;
    }
    public double getEmployeeSalary() {
        return this.eSalary;
    }
    public Date getEmloyeeDateOfJoining() {
        return this.date_of_joining;
    }

    //ToString
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String doj=sdf.format(this.date_of_joining);
        return "[ Id: "+this.eId+" Name: "+this.eName+" Salary: "+this.eSalary+" DOJ: "+doj+" ]";
    }

    //Override HashCode Method from HashSet
    @Override
    public int hashCode() {
        System.out.println("hashCode Called... "+this.eId);
        return this.eId;
    }

    //Override Equals Method from HashSet
    @Override
    public boolean equals(Object o) {
        System.out.println("Equals Called...  "+this.eId+"      "+((Employee)o).eId);
        return this.eId==((Employee)o).eId;

    }

    //Override compareTo Method from Comparable(I)
    @Override
    public int compareTo(Employee o) {
        System.out.println("In compareTo "+this.eId+" --- "+o.eId);
        return (int)(this.eSalary-o.eSalary);
    }
}