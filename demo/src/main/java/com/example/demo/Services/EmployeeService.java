package com.example.demo.Services;

import com.example.demo.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id , Employee employee);
    void  deleteEmployee(Long id);
}
