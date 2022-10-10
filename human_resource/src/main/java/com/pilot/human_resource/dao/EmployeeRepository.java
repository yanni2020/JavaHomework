package com.pilot.human_resource.dao;
import com.pilot.human_resource.model.Employee;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}

