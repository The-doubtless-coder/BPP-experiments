package com.nataraj.daos.interfaces;

import com.nataraj.bos.EmployeeBO;

public interface iEmployeeDao {
    public int registerEmployee(EmployeeBO employeeBO) throws Exception;
}
