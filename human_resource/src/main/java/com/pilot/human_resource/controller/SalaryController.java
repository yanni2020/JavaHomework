package com.pilot.human_resource.controller;

import com.pilot.human_resource.model.Salary;
import com.pilot.human_resource.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    SalaryService service;

    @Autowired
    public SalaryController(SalaryService service) {
        this.service = service;
    }

    /**
     * GET Method
     */
    @GetMapping("/get/all")
    public List<Salary> getAllSalaryReport(){
        return service.getAllSalaryReport();
    }

}
