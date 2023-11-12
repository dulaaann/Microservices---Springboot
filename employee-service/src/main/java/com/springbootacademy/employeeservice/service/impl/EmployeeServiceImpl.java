package com.springbootacademy.employeeservice.service.impl;

import com.springbootacademy.employeeservice.dto.EmployeeDTO;
import com.springbootacademy.employeeservice.entity.Employee;
import com.springbootacademy.employeeservice.repo.EmployeeRepository;
import com.springbootacademy.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDTO employeeDTO1 = new EmployeeDTO(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
        );

        return employeeDTO1;
    }

    @Override
    public EmployeeDTO getEmployee(long id) {
        Employee employeeById = employeeRepository.getEmployeeById(id);
        EmployeeDTO employeeDTO = new EmployeeDTO(
                employeeById.getId(),
                employeeById.getFirstName(),
                employeeById.getLastName(),
                employeeById.getEmail()
        );
        return employeeDTO;
    }
}
