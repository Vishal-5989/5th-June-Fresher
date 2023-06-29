package com.demo.service;

import com.demo.beans.Department;

import java.util.List;

public interface DeptService {
    void addNewDepartment();

    boolean deleteByDeptno(int deptno);

    List<Department> getAll();


    Department findByDeptno(int deptno);

    boolean modifyByDeptno(int deptno, String dname, String loc, String pwd, String startedon);

    void closeMyConnection();

    void groupByClause();

    void orderByClause();

    void havingClause();

    void crossJoin();



    void selfjoin();

    void innerJoin();
}
