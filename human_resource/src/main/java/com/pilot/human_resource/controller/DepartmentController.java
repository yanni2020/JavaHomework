package com.pilot.human_resource.controller;


import com.pilot.human_resource.model.Department;
import com.pilot.human_resource.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    DepartmentService service;
    @Autowired
    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    /**
     * GET Method
     */
    @GetMapping("/get/{deptid}")
    public Department getDepartmentById(@PathVariable int deptid){
        return service.getDepartmentById(deptid);
    }
    @GetMapping("/get/all")
    public List<Department> getAllDepartment(){
        return service.getAllDepartment();
    }

    /**
     * CREATE Method
     */
    @PostMapping
    public void addNewDepartment(@RequestBody Department dp){
        service.addNewDepartment(dp);
    }

    /**
     * UPDATE Method
     */
    @PutMapping("/update/name/{deptid}")
    public void updateName(@PathVariable int deptid,
                      @RequestParam(required = false) String name){
        service.updateName(deptid, name);
    }
    @PutMapping("/update/location/{deptid}")
    public void updateLocation(@PathVariable int deptid,
                           @RequestParam(required = false) String loc){
        service.updateLocation(deptid, loc);
    }

    /**
     * DELETE Method
     */
    @DeleteMapping("/delete/{deptid}")
    public void deleteDepartmentById(@PathVariable int deptid){
        service.deleteDepartmentById(deptid);
    }

}
