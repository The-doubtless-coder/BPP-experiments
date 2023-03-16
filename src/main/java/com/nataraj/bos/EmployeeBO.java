package com.nataraj.bos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("emp_bean")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeBO extends BaseBean {
    private String company;
    private double salary;
    private double grossSalary;
    private double netSalary;

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

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

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

    @Override
    public String toString() {
        return "EmployeeBO{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                ", grossSalary=" + grossSalary +
                ", netSalary=" + netSalary +
                ", fromSuper=" + super.toString() +
                '}';
    }
}
