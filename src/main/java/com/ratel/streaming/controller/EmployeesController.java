package com.ratel.streaming.controller;

import com.ratel.streaming.entity.Employees;
import com.ratel.streaming.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.mapper.controller
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 10:19
 * @copyright (c) ratelfu 版权所有
 */
@RestController
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @RequestMapping("/getById/{id}")
    public Employees getById(@PathVariable("id") Integer id){
        return employeesService.selectById(id);
    }
    @RequestMapping("/getAll")
    public List<Employees> getAll(){
        return employeesService.selectAll();
    }




}
