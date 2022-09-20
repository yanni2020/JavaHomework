package com.pilot.human_resource.helper;

import com.pilot.human_resource.dao.DepartmentRepository;
import com.pilot.human_resource.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentHelper {

    private DepartmentRepository repo;

    @Autowired
    public DepartmentHelper(DepartmentRepository repo) {
        this.repo = repo;
    }

    public List<Department> getAllDepartments(){
        return repo.getAllDepartments();
    }

    public Department getDepartmentById(int id){
        return repo.getDepartmentById(id);
    }

}
