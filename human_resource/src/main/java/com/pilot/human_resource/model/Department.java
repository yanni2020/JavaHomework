package com.pilot.human_resource.model;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    private Integer deptid;
    private String name;
    private String loc;

    /**
     * Constructor
     */
    public Department() {
    }
    public Department(int deptid, String name, String loc) {
        this.deptid = deptid;
        this.name = name;
        this.loc = loc;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
