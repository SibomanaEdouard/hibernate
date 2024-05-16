package com.example.demo.Controlles;

import com.example.demo.Services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:8080")
public class EmployeeControllers {
    @Autowired
    private CompanyService employeeService;




}
