package com.pilot.human_resource.service;

import com.pilot.human_resource.dao.EmployeeRepository;
import com.pilot.human_resource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository dao;

    @Autowired
    public EmployeeService(EmployeeRepository dao) {
        this.dao = dao;
    }

    /**
     * Get Method
     */
    public Employee getEmployeeById(int id){
        return dao.findById(id).orElse(null);
    }
    public List<Employee> getAllEmployees() {
        return dao.findAll();
    }

    /**
     * Post Method
     */
    public void addNewEmployee(Employee e){
        dao.save(e);
    }

    /**
     * Put Method
     */
    @Transactional
    public void updateEmployeeName(int id, String name) {
        Employee e = dao.findById(id).orElse(null);
        e.setName(name);
        dao.save(e);
    }
    @Transactional
    public void updateEmployeeDepId(int id, int depId) {
        Employee e = dao.findById(id).orElse(null);
        e.setDeptId(depId);
        dao.save(e);
    }

    /**
     * Delete Method
     */
    public void deleteEmployeeById(int id) {
        dao.deleteById(id);
    }

}
