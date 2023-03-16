package com.nataraj.Services;

import com.nataraj.dtos.EmployeeDTO;
import com.nataraj.dtos.StudentDTO;

public interface iCollegeMngService{
    public String processStudent(StudentDTO studentDTO)throws Exception;
    public String processEmployee(EmployeeDTO employeeDTO) throws Exception;
}
