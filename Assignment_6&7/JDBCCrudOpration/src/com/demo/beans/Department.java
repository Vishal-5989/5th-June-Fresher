package com.demo.beans;

public class Department {
    private int deptno;
    private String dname;
    private String loc;
    private String pwd;
    private String startedon;

    public Department(int deptno, String dname, String loc, String pwd, String startedon) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.pwd = pwd;
        this.startedon = startedon;
    }

    public Department() {
        super();
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getStartedon() {
        return startedon;
    }

    public void setStartedon(String startedon) {
        this.startedon = startedon;
    }


    @Override
    public String toString() {
        return "Department{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", pwd='" + pwd + '\'' +
                ", startedon='" + startedon + '\'' +
                '}';
    }
}
