package com.ratel;

import com.ratel.streaming.dao.CustomerDao;
import com.ratel.streaming.dao.EmployeesDao;
import com.ratel.streaming.entity.BpmsCustomerManageFormalEntity;
import com.ratel.streaming.entity.Employees;
import com.ratel.streaming.service.EmployeesService;
import com.ratel.streaming.service.TestService;
import com.ratel.streaming.service.TestServiceImpl;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PoiApplicationTests {

    @Autowired
    private EmployeesDao employeesDao;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private TestService testService;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void contextLoads() {
        //Employees employees = employeesService.selectById(30036);
        //List<Employees> employees = employeesDao.selectAll();
        //List<Employees> employees = employeesDao.selectFetchSize();
        //employees.forEach(System.out::println);
        //System.out.println(employees.size());

        //BpmsCustomerManageFormalEntity bpmsCustomerManageFormalEntity = customerDao.selectById(1507);
        //System.out.println(bpmsCustomerManageFormalEntity);
        //List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectAll();
        //List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectFetchSize();
        //System.out.println(entityList.size());
        Configuration configuration = sqlSessionTemplate.getConfiguration();
        configuration.setSafeResultHandlerEnabled(false);
        final List<BpmsCustomerManageFormalEntity> data = new ArrayList<>();
        sqlSessionTemplate.select("com.ratel.streaming.dao.CustomerDao.selectFetchSize", null, new ResultHandler() {
            @Override
            public void handleResult(ResultContext resultContext) {
                Object resultObject = resultContext.getResultObject();
                data.add((BpmsCustomerManageFormalEntity) resultObject);
            }
        });
        System.out.println(data.size());
        // entityList.forEach(System.out::println);

    }

    @Test
    public void t2() {
        List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectAll();
        System.out.println(entityList.size());
       // entityList.forEach(System.out::println);

    }


    @Test
    public void t1() {
        //testService = (TestServiceImpl)testService;
        ((TestServiceImpl) testService).t1();
        // TestServiceImpl testService = (TestServiceImpl)applicationContext.getBean("testService");
        // testService.t1();

    }

}

