package com.pilot.human_resource.service;

import com.pilot.human_resource.helper.DepartmentHelper;
import com.pilot.human_resource.model.Department;
import com.pilot.human_resource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentHelper helper;

    public Department getDepartmentById(int id){
        return helper.getDepartmentById(id);
    }

    public List<Department> getAllDepartments(){
        return helper.getAllDepartments();
    }
}
