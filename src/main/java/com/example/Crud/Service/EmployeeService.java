package com.example.Crud.Service;

import com.example.Crud.model.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<EmployeeDTO> getAllEmployee();
    Optional<EmployeeDTO> getEmployeeById(Long id);
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(Long id,EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}
