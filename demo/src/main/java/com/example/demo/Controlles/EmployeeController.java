package com.example.demo.Controlles;


import com.example.demo.ServiceImpl.EmployeeServiceImpl;
import com.example.demo.models.Employee;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "employees")
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/register")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.createEmployee(employee);
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllEmployees() {
        List<Employee> employees = employeeServiceImpl.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeServiceImpl.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete an employee
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable long id) {
        employeeServiceImpl.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    // Update an employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeServiceImpl.updateEmployee(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }



}

