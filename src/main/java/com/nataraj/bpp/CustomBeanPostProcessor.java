package com.nataraj.bpp;

import com.nataraj.bos.BaseBean;
import com.nataraj.bos.EmployeeBO;
import com.nataraj.bos.StudentBO;
import com.nataraj.dtos.EmployeeDTO;
import com.nataraj.dtos.StudentDTO;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        StudentDTO studentDTO = null;
        EmployeeDTO employeeDTO = null;
        if (o instanceof StudentDTO && s.equalsIgnoreCase("student_dto")) {
            studentDTO = (StudentDTO) o;
            studentDTO.setDateOfJoining(LocalDateTime.now(ZoneId.of("Africa/Nairobi")));
            System.out.println(studentDTO);
            return studentDTO;
        }
        if (o instanceof EmployeeDTO && s.equalsIgnoreCase("employee_dto")) {
            employeeDTO = (EmployeeDTO) o;
            employeeDTO.setDateOfJoining(LocalDateTime.now(ZoneId.of("Africa/Nairobi")));
            System.out.println(employeeDTO);
            return employeeDTO;
        }
        return o;
    }
}
