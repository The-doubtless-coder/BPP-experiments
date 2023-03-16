package com.nataraj.daos.interfaces;

import com.nataraj.bos.StudentBO;

public interface iStudentDAO {
    public int registerStudent(StudentBO studentBO) throws Exception;
}
