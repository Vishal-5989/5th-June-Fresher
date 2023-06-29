package com.demo.service;

import com.demo.beans.Department;
import com.demo.dao.DeptDao;
import com.demo.dao.DeptDaoImpl;

import java.util.List;
import java.util.Scanner;

public class DeptServiceImpl implements DeptService{
    private DeptDao deptDao;

    public DeptServiceImpl() {
        super();
        this.deptDao = new DeptDaoImpl();
    }

    @Override
    public void addNewDepartment() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the department no. ");
        int deptno=sc.nextInt();
        System.out.println("Enter the department name: ");
        String dname=sc.next();
        System.out.println("Enter the location: ");
        String loc=sc.next();
        System.out.println("Enter the password: ");
        String pwd=sc.next();
        System.out.println("Enter the started date: ");
        String startedon=sc.next();
        Department d=new Department(deptno,dname,loc,pwd,startedon);
        deptDao.insertNewDepartment(d);
    }

    @Override
    public boolean deleteByDeptno(int deptno) {

        return deptDao.removeByDeptno(deptno);
    }

    @Override
    public List<Department> getAll() {

        return deptDao.findAll();
    }

    @Override
    public Department findByDeptno(int deptno) {
        return deptDao.searchByDeptno(deptno);
    }

    @Override
    public boolean modifyByDeptno(int deptno, String dname, String loc, String pwd, String startedon) {
        return deptDao.updatedByDeptno(deptno,dname,loc,pwd,startedon);
    }

    @Override
    public void closeMyConnection() {
        deptDao.closeConnection();
    }

    @Override
    public void groupByClause() {
        deptDao.groupByClause();
    }

    @Override
    public void orderByClause() {
        deptDao.orderByClause();
    }

    @Override
    public void havingClause() {
        deptDao.havingClause();
    }

    @Override
    public void crossJoin() {
        deptDao.crossJoin();
    }


    @Override
    public void selfjoin() {
        deptDao.selfJoin();
    }

    @Override
    public void innerJoin() {
        deptDao.innerjoin();
    }


}
