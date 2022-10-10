package com.pilot.human_resource.controller;

import com.pilot.human_resource.model.Employee;
import com.pilot.human_resource.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService service;
    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    /**
     * Get
     */
    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @RequestMapping("/get/all")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping("/")
    public void AddNewEmployee(@RequestBody Employee e){
        service.addNewEmployee(e);
    }

    @PutMapping("/update/name/{id}")
    public void updateName(@PathVariable int id,
                       @RequestParam(required = false) String name){
        service.updateEmployeeName(id, name);
    }
    @PutMapping("/update/deptid/{id}")
    public void updateDepId(@PathVariable int id,
                            @RequestParam int deptId){
        service.updateEmployeeDepId(id, deptId);
    }

    @DeleteMapping("/delete/{deptid}")
    public void deleteEmployeeById(@PathVariable int id){
        service.deleteEmployeeById(id);
    }


}
