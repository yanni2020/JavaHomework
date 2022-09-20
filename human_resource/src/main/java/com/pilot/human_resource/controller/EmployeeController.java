package com.pilot.human_resource.controller;

import com.pilot.human_resource.model.Employee;
import com.pilot.human_resource.service.EmployeeServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeServise service;
    private EmployeeController dao;


    /**
     * Read
     * Get by Id
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    /**
     * Read
     * Get All
     * @return
     */
    @GetMapping("/get/all")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    /**
     * Update
     * @param id
     * @param temp
     */
    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp){
        dao.updateEmployee(id, temp);
    }

    /**
     * Create
     * @param temp
     */
    @PostMapping("/new")
    public void addEmployee(@RequestBody Employee temp){
        dao.addEmployee(temp);
    }

    /**
     * Delete
     * Delete By Id
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        dao.deleteEmployeeById(id);
    }

    /**
     * Delete
     * Delete All
     */
    @DeleteMapping("/delete/all")
    public void deleteAllEmployees() {
        dao.deleteAllEmployees();
    }

    public EmployeeServise getService() {
        return service;
    }
    @Autowired
    public void setService(EmployeeServise service){
        this.service = service;
    }
}
