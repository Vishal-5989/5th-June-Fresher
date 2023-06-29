package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDAO {

    boolean save(Employee newemp);

    Set<Employee> findAll();

    Employee searchById(int id);

    List<Employee> searchByName(String name);

    List<Employee> searchBySalary(double salary);

    int deleteById(int id);

    default int deleteByName() {
        return deleteByName(null);
    }

    default int deleteByName(String name) {
        return 0;
    }

    Set<Employee> arrangeBySalary();

//	int updateSalary(int id,double newsal);

    int updateSalary(int id);

}