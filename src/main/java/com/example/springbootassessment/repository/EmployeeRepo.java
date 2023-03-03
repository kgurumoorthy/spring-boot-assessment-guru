package com.example.springbootassessment.repository;


import com.example.springbootassessment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
