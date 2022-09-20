package com.pilot.human_resource.service;

import com.pilot.human_resource.helper.EmployeeHelper;
import com.pilot.human_resource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServise {
    @Autowired
    private EmployeeHelper helper;

    public Employee getEmployeeById(int id){
        return helper.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return helper.getAllEmployees();
    }
}
