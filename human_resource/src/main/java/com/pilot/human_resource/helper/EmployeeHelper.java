package com.pilot.human_resource.helper;

import com.pilot.human_resource.dao.EmployeeRepository;
import com.pilot.human_resource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper {

    private EmployeeRepository repo;

    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee getEmployeeById(int id){
        return repo.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return repo.getAllEmployees();
    }
}
