package com.example.demo.Repositories;

import com.example.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    // Method to find employee by ID
    Optional<Employee> findById(UUID id);

    // Method to find all employees
    List<Employee> findAll();
//    List<Employee> findByLastName(String lastname);

    // Method to save an employee
    Employee save(Employee employee);

    // Method to delete an employee by ID
    void deleteById(UUID id);

    // Method to find employees by company
//    List<Employee> findByCompany(Company company);

    // Method to find employees by salary greater than a certain value
    List<Employee> findBySalaryGreaterThan(double salary);

    // Method to find employees by salary less than a certain value
    List<Employee> findBySalaryLessThan(double salary);

    // Method to find employees by salary between a range of values
    List<Employee> findBySalaryBetween(double minSalary, double maxSalary);


}
