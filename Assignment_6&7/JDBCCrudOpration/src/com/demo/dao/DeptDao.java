package com.demo.dao;

import com.demo.beans.Department;

import java.util.List;

public interface DeptDao {
    void insertNewDepartment(Department d);

    boolean removeByDeptno(int deptno);

    List<Department> findAll();


    Department searchByDeptno(int deptno);

    boolean updatedByDeptno(int deptno, String dname, String loc, String pwd, String startedon);

    void closeConnection();

    void groupByClause();

    void orderByClause();

    void havingClause();

    void crossJoin();



    void selfJoin();

    void innerjoin();
}
