package com.example.springbootassessment.service;

import com.example.springbootassessment.dto.RequestEmployeeDTO;
import com.example.springbootassessment.dto.ResponseEmployeeDTO;

import java.util.List;

public interface EmployeeService {

    List<ResponseEmployeeDTO> getAllEmployees();

    ResponseEmployeeDTO getEmployeeById(int empId);

    ResponseEmployeeDTO updateEmployee(int empId, RequestEmployeeDTO requestEmployeeDTO);

    ResponseEmployeeDTO deleteEmployee(int empId);

    ResponseEmployeeDTO createEmployee(RequestEmployeeDTO requestEmployeeDTO);
}


