package com.springbootacademy.employeeservice.service;

import com.springbootacademy.employeeservice.dto.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployee(long id);
}
