package com.nataraj.Services;

import com.nataraj.bos.EmployeeBO;
import com.nataraj.bos.StudentBO;
import com.nataraj.dtos.EmployeeDTO;
import com.nataraj.dtos.StudentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.PropertyAccessorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.nataraj.daos.interfaces.iStudentDAO;
import com.nataraj.daos.interfaces.iEmployeeDao;

@Service("college_serv")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public abstract class CollegeMngServiceImlp implements iCollegeMngService {
    @Autowired
    private iStudentDAO istudentDAO;
    @Autowired
    private iEmployeeDao iEmployeeDAO;

    @Lookup
    public abstract EmployeeBO fetchEmployeeBO() throws Exception;

    @Lookup
    public abstract StudentBO fetchStudentBO() throws Exception;

    @Override
    public String processStudent(StudentDTO studentDTO) throws Exception {
        System.out.println(studentDTO + "in serv");
        double total=0;
        double avg=0;
        StudentBO studentBO=null;
        total = studentDTO.getM1()+ studentDTO.getM2()+studentDTO.getM3();
        avg=total/3;
        studentBO = fetchStudentBO();
        BeanUtils.copyProperties(studentDTO,studentBO);
        studentBO.setTotal(total);
        studentBO.setAvg(avg);
        int status = 0;
        try {
            status = istudentDAO.registerStudent(studentBO);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
//        return (status==1)?"data persisted successfully":"persistence did not happen";
    }

    @Override
    public String processEmployee(EmployeeDTO employeeDTO) throws Exception {
        System.out.println(employeeDTO + "in serv");
        EmployeeBO employeeBO = null;
        double houseAllowance=0;
        double healthAllowance=0;
        double grossSalary=0;
        double netSalary=0;
        double taxDeductions=0;
        if(employeeDTO.getSalary()>80000){
            houseAllowance=25000;
            healthAllowance=32000;
            taxDeductions=0.022;
        }else {
            houseAllowance=12000;
            healthAllowance=22000;
            taxDeductions=0.012;
        }
        grossSalary= employeeDTO.getSalary()+healthAllowance+houseAllowance;
        netSalary=grossSalary-(taxDeductions*grossSalary);
        employeeBO=fetchEmployeeBO();
        BeanUtils.copyProperties(employeeDTO,employeeBO);
//        employeeBO.setIdNo(employeeDTO.getIdNo());
//        employeeBO.setName(employeeDTO.getName());
//        employeeBO.setDateOfJoining(employeeDTO.getDateOfJoining());
        employeeBO.setGrossSalary(grossSalary);
        employeeBO.setNetSalary(netSalary);
        int status = 0;
        try {
            status = iEmployeeDAO.registerEmployee(employeeBO);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
//        return (status==1)?"value saved..":"value not saved";
    }
}
