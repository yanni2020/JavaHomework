package com.pilot.human_resource.service;

import com.pilot.human_resource.dao.SalaryRepository;
import com.pilot.human_resource.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    SalaryRepository dao;
    @Autowired
    public SalaryService(SalaryRepository dao) {
        this.dao = dao;
    }

    /**
     * GET Method
     */
    public List<Salary> getAllSalaryReport() {
        return dao.findAll();
    }

}
