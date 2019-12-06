package com.ratel.streaming.controller;

import com.ratel.streaming.dao.CustomerDao;
import com.ratel.streaming.entity.BpmsCustomerManageFormalEntity;
import com.ratel.utils.ExcelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    Logger log = LoggerFactory.getLogger(getClass());
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

    @RequestMapping("/exportAll")
    public void exportAll(){
        //List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectFetchSize();
        List<BpmsCustomerManageFormalEntity> entityList = customerDao.selectAll();
        //设置导出excel标题
        String[] title = {"主键id", "客户编号", "客户名称", "客户归属", "客户类型", "主行业"};

        //设置excel文件名
        String fileName = "客户基本信息表" + System.currentTimeMillis();

        //设置excel   Sheet名
        String sheetName = "客户基本信息表";
        //二维数组的列宽为标题的长度
        String[][] values =new String[entityList.size()][title.length];
        for (int i = 0; i <entityList.size() ; i++) {
            BpmsCustomerManageFormalEntity entity = entityList.get(i);
            values[i][0] = entity.getId().toString();
            values[i][1] = entity.getCustomerCode();
            values[i][2] = entity.getCustomerName();
            values[i][3] = entity.getCustomerBelongs();
            values[i][4] = entity.getCustomerType();
            values[i][5] = entity.getMainIndustry();
        }
        entityList=null;
        log.info("循环完成");
        ExcelUtils.getXSSFWorkbook(sheetName,title,values,fileName,ExcelUtils.getResponse(),log);
        log.info("回到调用处");
        values=null;
        //通知jvm进行垃圾收集，减小内存占用（但是执不执行gc由jvm决定，也就是说不一定进行垃圾收集）
        System.gc();
    }
}
