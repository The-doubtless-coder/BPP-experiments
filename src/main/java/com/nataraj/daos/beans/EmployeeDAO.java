package com.nataraj.daos.beans;

import com.nataraj.bos.EmployeeBO;
import com.nataraj.daos.interfaces.iEmployeeDao;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Repository
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmployeeDAO implements iEmployeeDao {
    @Override
    public int registerEmployee(EmployeeBO employeeBO) throws Exception {
        System.out.println("inserting data into employee db " + employeeBO);
        return 1;
    }
}
