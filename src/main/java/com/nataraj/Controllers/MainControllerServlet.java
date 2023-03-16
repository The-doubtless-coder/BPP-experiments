package com.nataraj.Controllers;

import com.nataraj.Services.iCollegeMngService;
import com.nataraj.dtos.EmployeeDTO;
import com.nataraj.dtos.StudentDTO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "MainControllerServlet", value = "/registerurl", loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
    ApplicationContext applicationContext = null;
    iCollegeMngService service=null;
    @Override
    public void init() throws ServletException {
     applicationContext = new ClassPathXmlApplicationContext("springbeanconfigs.xml");
     service=applicationContext.getBean("college_serv", iCollegeMngService.class);
    }

    @Override
    public void destroy() {
//        applicationContext =(ConfigurableApplicationContext)applicationContext;
        ((ConfigurableApplicationContext) applicationContext).close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDTO studentDTO = null;
        EmployeeDTO employeeDTO=null;
        String target_page=null;
        RequestDispatcher rd = null;
        PrintWriter pw = null;
        if(request.getParameter("reg").equalsIgnoreCase("RegisterStudent")){
            studentDTO=applicationContext.getBean("student_dto", StudentDTO.class);
            studentDTO.setIdNo(Integer.parseInt(request.getParameter("id")));
            studentDTO.setName(request.getParameter("name"));
//            studentDTO.setDateOfJoining(LocalDateTime.parse(request.getParameter("doj"), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")));
            studentDTO.setAddress(request.getParameter("address"));
            studentDTO.setCourse(request.getParameter("course"));
            studentDTO.setM1(Double.parseDouble(request.getParameter("mark1")));
            studentDTO.setM2(Double.parseDouble(request.getParameter("mark2")));
            studentDTO.setM3(Double.parseDouble(request.getParameter("mark3")));
            System.out.println("dto in controller " + studentDTO);
            try {
                String result = service.processStudent(studentDTO);
                request.setAttribute("rza", result);
                target_page="show_result.jsp";
            } catch (Exception e) {
                request.setAttribute("rza", "failed");
                target_page="show_result.jsp";
                e.printStackTrace();
            }
        }else {
            employeeDTO=applicationContext.getBean("employee_dto", EmployeeDTO.class);
            employeeDTO.setIdNo(Integer.parseInt(request.getParameter("id")));
            employeeDTO.setName(request.getParameter("name"));
//            employeeDTO.setDateOfJoining(LocalDateTime.parse(request.getParameter("doj"), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")));
            employeeDTO.setCompany(request.getParameter("company"));
            employeeDTO.setSalary(Double.parseDouble(request.getParameter("salary")));
            try {
                String result=service.processEmployee(employeeDTO);
                request.setAttribute("rza", result);
            } catch (Exception e) {
                request.setAttribute("rza", "failed");
                e.printStackTrace();
            }
        }
        target_page="show_result.jsp";
        rd= request.getRequestDispatcher(target_page);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
