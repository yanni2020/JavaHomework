package com.pilot.human_resource.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {
    @Id
//    @GeneratedValue
    @Column(name="empid")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "job")
    private String job;
    @Column(name = "manager")
    private Integer manager;
    @Column(name = "hiredate")
    private Date hireDate;
    @Column(name = "salary")
    private Double salary;

    @Column(name = "deptid")
    private Integer deptId;

    public Employee() {
    }

    public Employee(int id, String name, String job, int manager,
                    Date hireDate, double salary, int depId) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.hireDate = hireDate;
        this.salary = salary;
        this.deptId = depId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer depId) {
        this.deptId = depId;
    }
}