package com.pilot.human_resource.dao;

import com.pilot.human_resource.model.Department;
import com.pilot.human_resource.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    static List<Department> department;

    static {
        department = new ArrayList<>();
        department.add(new Department(1, "Tech"));
        department.add(new Department(2,"Sales"));
        department.add(new Department(3, "Accounting"));
    }


    public List<Department> getAllDepartments(){
        return department;
    }
    public Department getDepartmentById(int id){
        return department.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
    }

}
