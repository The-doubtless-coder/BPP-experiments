package com.nataraj;

import com.nataraj.dtos.EmployeeDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("springbeanconfigs.xml");
        EmployeeDTO emp = ct.getBean("employee_dto", EmployeeDTO.class);
        emp.setName("ian");
        emp.setIdNo(1);
        emp.setCompany("the _revolt");
        emp.setSalary(45);
        System.out.println(emp);
    }
}