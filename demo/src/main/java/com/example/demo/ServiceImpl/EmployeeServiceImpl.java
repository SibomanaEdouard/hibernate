package com.example.demo.ServiceImpl;
import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Services.EmployeeService;
import com.example.demo.models.Employee;
import  lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Builder
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    //this is to register employee
    @Override
    public Employee createEmployee(Employee employee) {
        //this is to check if the input from user is null
        if(employee!=null) {

            return employeeRepository.save(employee);
        }
        throw new RuntimeException("Please provide all details "  );

    }

    //this is to update the employee
    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();

            if (employee.getFirstName() != null) {
                existingEmployee.setFirstName(employee.getFirstName());
            }
            if (employee.getLastName() != null) {
                existingEmployee.setLastName(employee.getLastName());
            }
            if (employee.getInstitution() != null) {
                existingEmployee.setInstitution(employee.getInstitution());
            }
            if (employee.getPosition() != null) {
                existingEmployee.setPosition(employee.getPosition());
            }

            return employeeRepository.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }


    //this is to get all employees from the database

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //this is to get employee by id
    @Override
    public Employee getEmployeeById(Long id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        return optionalEmployee.orElse(null);
    }

    //this is to delete employee
    @Override
    public String deleteEmployee(Long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully.";
        } else {
            return "Employee not found with id: " + id;
        }
    }

}
