package com.learn.jpa.repository;

import com.learn.jpa.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository {
    Optional<Employee> save(Employee employee);
    Optional<Employee> getEmployeeById(Long id);
    void deleteEmployee(Employee employee);
}
