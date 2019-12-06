package com.ratel.streaming.controller;

import com.ratel.streaming.dao.CustomerDao;
import com.ratel.streaming.entity.BpmsCustomerManageFormalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.streaming.controller
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 17:34
 * @copyright (c) ratelfu 版权所有
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/select")
    public String select(){
        List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectAll();
        int size = entityList.size();
        entityList=null;
        return "select: "+size;
    }
    @RequestMapping("/select2")
    public String select2(){
        List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectFetchSize();
        int size = entityList.size();
        entityList=null;
        return "select2: "+size;
    }
    @RequestMapping("/select3")
    public String select3(){
        List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectFetchSize2();
        int size = entityList.size();
        entityList=null;
        return "select2: "+size;
    }
}
