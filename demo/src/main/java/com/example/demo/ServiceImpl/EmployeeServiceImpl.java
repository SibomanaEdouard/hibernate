package com.example.demo.ServiceImpl;
import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Services.EmployeeService;
import com.example.demo.models.Employee;
import  lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Builder
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
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

            if (employee.getFirstname() != null) {
                existingEmployee.setFirstname(employee.getFirstname());
            }
            if (employee.getLastname() != null) {
                existingEmployee.setLastname(employee.getLastname());
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



    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        return optionalEmployee.orElse(null);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
}
