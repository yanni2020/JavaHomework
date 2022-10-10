package com.pilot.human_resource.service;

import com.pilot.human_resource.dao.DepartmentRepository;
import com.pilot.human_resource.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DepartmentService {

    DepartmentRepository dao;
    @Autowired
    public DepartmentService(DepartmentRepository dao) {
        this.dao = dao;
    }

    /**
     * GET Method
     */
    public Department getDepartmentById(int deptid) {
        return dao.findById(deptid).orElse(null);
    }
    public List<Department> getAllDepartment() {
        return dao.findAll();
    }

    /**
     * CREATE Method
     */
    public void addNewDepartment(Department dp) {
        dao.save(dp);
    }

    /**
     * UPDATE Method
     */
    @Transactional
    public void updateName(int deptid, String name) {
        Department dp = dao.findById(deptid).orElse(null);
        dp.setName(name);
        dao.save(dp);
    }
    @Transactional
    public void updateLocation(int deptid, String loc) {
        Department dp = dao.findById(deptid).orElse(null);
        dp.setLoc(loc);
        dao.save(dp);
    }

    /**
     * DELETE Method
     */
    public void deleteDepartmentById(int deptid) {
        dao.deleteById(deptid);
    }
}
