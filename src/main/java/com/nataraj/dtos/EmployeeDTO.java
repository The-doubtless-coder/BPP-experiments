package com.nataraj.dtos;

import com.nataraj.bos.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;

@Component("employee_dto")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeDTO extends BaseBean implements Serializable {
    private String company;
    private double salary;

    @Override
    public int getIdNo() {
        return super.getIdNo();
    }

    @Override
    public void setIdNo(int idNo) {
        super.setIdNo(idNo);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public LocalDateTime getDateOfJoining() {
        return super.getDateOfJoining();
    }

    @Override
    public void setDateOfJoining(LocalDateTime dateOfJoining) {
        super.setDateOfJoining(dateOfJoining);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "company='" + company + '\'' +
                ", salary=" + salary + '\'' +
                ", fromSuper=" +super.toString() +
                '}';
    }
}
