package com.ratel.poi.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.ratel.poi.entity.StudentEntity;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @ 业务描述：
 * @ Package_name：com.ratel.poi.controller
 * @ Project_name：poi_easypoi
 * @ Author：ratelfu@qq.com
 * @ Create_time：2019-01-11 14:32
 * @ Copyright (c) ratelfu 版权所有
 */
@RestController
public class EasyPoiController {


    @GetMapping("exportExcel")
    public  void  exportExcel(HttpServletResponse response){
        ArrayList<StudentEntity> studentEntities = new ArrayList<>();

        for (int i = 1; i <5 ; i++) {
            StudentEntity studentEntity  =new StudentEntity("code"+i,"小明"+i,i,new Date(),new Date());
            studentEntities.add(studentEntity);
        }

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("计算机一班学生","学生"), StudentEntity.class, studentEntities);

        try {
            this.export(response, workbook, "商品信息");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    /**
     * export导出请求头设置
     *
     * @param response
     * @param workbook
     * @param fileName
     * @throws Exception
     */
    private  void export(HttpServletResponse response, Workbook workbook, String fileName) throws Exception {
        response.reset();
        response.setContentType("application/x-msdownload");
        fileName = fileName + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("gb2312"), "ISO-8859-1") + ".xls");
        ServletOutputStream outStream = null;
        try {
            outStream = response.getOutputStream();
            workbook.write(outStream);
        } finally {
            outStream.close();
        }
    }



}
