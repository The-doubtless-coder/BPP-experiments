package com.nataraj.bos;

import java.time.LocalDateTime;
import java.util.Date;

public abstract class BaseBean {
    private int idNo;
    private String name;
    private LocalDateTime dateOfJoining;

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDateTime dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "idNo=" + idNo +
                ", name='" + name + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
