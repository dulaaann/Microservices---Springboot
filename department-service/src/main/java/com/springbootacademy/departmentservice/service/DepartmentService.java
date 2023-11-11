package com.springbootacademy.departmentservice.service;

import com.springbootacademy.departmentservice.dto.DepartmentDTO;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

    DepartmentDTO DEPARTMENT_DTO(DepartmentDTO departmentDTO);
}
