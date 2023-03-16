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

@Component("student_dto")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentDTO extends BaseBean implements Serializable {
    private String address;
    private String course;
    private double m1, m2, m3;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getM3() {
        return m3;
    }

    public void setM3(double m3) {
        this.m3 = m3;
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
        return "StudentDTO{" +
                "address='" + address + '\'' +
                ", course='" + course + '\'' +
                ", m1=" + m1 +
                ", m2=" + m2 +
                ", m3=" + m3 + '\'' +
                ", fromSuper=" + super.toString() +
                '}';
    }
}
