package com.example.demo.Controlles;


import com.example.demo.ServiceImpl.EmployeeServiceImpl;
import com.example.demo.models.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "employees")
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    //this is  the controller to register the employee
    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.createEmployee(employee );
    }

    //this is the one to get all employees
    @GetMapping()
    public ResponseEntity<Object> getAllEmployees() {
        List<Employee> employees = employeeServiceImpl.getAllEmployees();
        if (employees != null) {
            return ResponseEntity.ok(employees);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //this is the one to get employee by id
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
    public ResponseEntity<String> deleteEmployee(@PathVariable long id) {
        String message = employeeServiceImpl.deleteEmployee(id);
        if (message.equals("Employee deleted successfully.")) {
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }


    // Update an employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeServiceImpl.updateEmployee(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }



}

