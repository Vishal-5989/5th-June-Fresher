package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

    boolean createEmployee();

    Set<Employee> displayAll();

    Employee findById(int id);

    List<Employee> findByName(String name);

    List<Employee> findBySalary(double salary);

    int removeById(int id);

    int removeByName(String name);

    Set<Employee> sortBySalary();

//	int modifySalary(int id,double newsal);

    int modifySalary(int id);

}