package com.pilot.human_resource.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "salary_report")
public class Salary {

    @Id
    private String job;
    @Id
    private String department;
    private Double salmin;
    private Double Salavg;
    private Double Saltotal;
    private Integer empcount;
    private Date updatetime;


    public Salary() {
    }
    public Salary(String job, String department, Double salmin, Double salavg, Double saltotal, Integer empcount,
                  Date updatetime) {
        this.job = job;
        this.department = department;
        this.salmin = salmin;
        Salavg = salavg;
        Saltotal = saltotal;
        this.empcount = empcount;
        this.updatetime = updatetime;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalmin() {
        return salmin;
    }

    public void setSalmin(Double salmin) {
        this.salmin = salmin;
    }

    public Double getSalavg() {
        return Salavg;
    }

    public void setSalavg(Double salavg) {
        Salavg = salavg;
    }

    public Double getSaltotal() {
        return Saltotal;
    }

    public void setSaltotal(Double saltotal) {
        Saltotal = saltotal;
    }

    public Integer getEmpcount() {
        return empcount;
    }

    public void setEmpcount(Integer empcount) {
        this.empcount = empcount;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
