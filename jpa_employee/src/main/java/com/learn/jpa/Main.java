package com.learn.jpa;


import com.learn.jpa.entity.Company;
import com.learn.jpa.entity.Employee;
import com.learn.jpa.entity.Salary;
import com.learn.jpa.repository.EmployeeRepositoryImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl(entityManager);

        //create a new Employee
        Employee employee = new Employee();
        employee.setfName("Mary");
        employee.setlName("Doe");
        employee.setYearsExperience(20);

        //set salary
        employee.setSalary(new Salary(54000.00, true));

        //set company
        employee.setCompany(new Company("MyCompany"));

        Employee employee2 = new Employee();
        employee2.setfName("James");
        employee2.setlName("Doe");
        employee2.setYearsExperience(5);

        //save Employees
        employeeRepository.save(employee);
        employeeRepository.save(employee2);

        //update Employee
        Optional<Employee> retrievedEmployee = employeeRepository.
                getEmployeeById(Long.valueOf(1));
        retrievedEmployee.get().setlName("Johnson");
        employeeRepository.save(retrievedEmployee.get());

        //delete Employee
        employeeRepository.deleteEmployee(employee2);

        entityManager.close();
        entityManagerFactory.close();
    }
}