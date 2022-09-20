package com.pilot.human_resource.controller;

import com.pilot.human_resource.model.Department;
import com.pilot.human_resource.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentService service;



    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return service.getDepartmentById(id);
    }

    @GetMapping("/get/all")
    public List<Department> getAllDepartment() {
        return service.getAllDepartments();
    }


    public DepartmentService getService() {
        return service;
    }
    @Autowired
    public void setService(DepartmentService service){
        this.service = service;
    }



}
