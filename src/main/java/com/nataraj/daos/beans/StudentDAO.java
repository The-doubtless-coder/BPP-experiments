package com.nataraj.daos.beans;

import com.nataraj.bos.StudentBO;
import com.nataraj.daos.interfaces.iStudentDAO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StudentDAO implements iStudentDAO {
    @Override
    public int registerStudent(StudentBO studentBO) throws Exception {
        System.out.println("inserting data into student db " + studentBO);
        return 1;
    }
}
