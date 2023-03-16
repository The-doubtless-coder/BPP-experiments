package com.nataraj.bos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("std_bean")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentBO extends BaseBean{
    private String address;
    private String course;
    private double total;
    private double avg;

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
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
        return "StudentBO{" +
                "address='" + address + '\'' +
                ", course='" + course + '\'' +
                ", total=" + total +
                ", avg=" + avg +
                ", fromSuper=" + super.toString() +
                '}';
    }
}
