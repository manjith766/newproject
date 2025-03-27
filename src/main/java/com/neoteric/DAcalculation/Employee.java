package com.neoteric.DAcalculation;
import java.util.Date;

public class Employee {
    private String name;
    private String mobileno;
    private String salary;
    private Date joindate;
    private String empid;
    private DAemp dAemp;

    public Date getJoindate() {
        return joindate;
    }

    public String getEmpid() {
        return empid;
    }

    public DAemp getdAemp() {
        return dAemp;
    }

    public Employee(String name, String mobileno, String salary, String joindate, String empid) {
        this.name = name;
        this.mobileno = mobileno;
        this.salary = salary;
        this.joindate =new Date(String.valueOf(joindate));
        this.empid = empid;
        this.dAemp = dAemp;
    }

    public String getName() {
        return name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public String getSalary() {
        return salary;
    }


    public Date getDate() {
        return joindate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setDate(Date date) {
        this.joindate = date;
    }

    public void setId(String empid) {
        this.empid = empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", salary='" + salary + '\'' +
                ", date=" + joindate +
                ", empid='" + empid + '\'' +
                ", dAemp=" + dAemp +
                '}';
    }

    public void setdAemp(DAemp dAemp) {
        this.dAemp = dAemp;
    }
}
