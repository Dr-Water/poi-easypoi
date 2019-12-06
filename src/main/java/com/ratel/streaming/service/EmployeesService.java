package com.ratel.streaming.service;

import com.ratel.streaming.dao.EmployeesDao;
import com.ratel.streaming.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.mapper.service
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 10:11
 * @copyright (c) ratelfu 版权所有
 */
@Service
public class EmployeesService {
    @Autowired
    private EmployeesDao employeesDao;

    public Employees selectById(Integer id){
       return employeesDao.selectById(id);
    }
    public List<Employees> selectAll(){
        return employeesDao.selectAll();
    }

}
