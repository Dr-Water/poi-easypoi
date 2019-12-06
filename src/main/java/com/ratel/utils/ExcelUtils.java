package com.ratel.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/**
 * @业务描述：
 * @package_name： com.ratel.utils
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-06 9:13
 * @copyright (c) ratelfu 版权所有
 */
public class ExcelUtils {


    /**
     * 导出Excel
     * @param sheetName sheet名称 示例：个人信息表
     * @param title 标题数组 示例：{"姓名", "年龄", "邮箱"}
     * @param values 内容 需要导出数据的二维数组 示例如下：
     *           姓名               年 龄                    邮箱
     *           zs [0][0]          18    [0][1]         zs@qq.com  [0][2]
     *           ls [1][0]          19    [1][1]         li@qq.com  [1[2]
     *
     * @param fileName
     * @param response
     * @param log
     */
    public static void getXSSFWorkbook(String sheetName, String []title, String [][]values,  String fileName, HttpServletResponse response , Logger log){

        //第一步：创建一个SXSSFWorkbook
        SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook(1000);
        sxssfWorkbook.setCompressTempFiles(true);

        // 第二步：在workbook中添加一个sheet,对应Excel文件中的sheet
        Sheet sheet = sxssfWorkbook.createSheet(sheetName);

        // 第三步：在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        Row row = sheet.createRow(0);

        // 第四步：创建单元格，并设置值表头 设置表头居中
        CellStyle style = sxssfWorkbook.createCellStyle();

        // 创建一个居中格式
        style.setVerticalAlignment(VerticalAlignment.CENTER);

        //创建标题
        for(int i=0;i<title.length;i++){
            Cell cell = row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
        }
        log.info("excel内容开始创建");
        //创建内容
        for(int i=0;i<values.length;i++){
           Row row1 = sheet.createRow(i + 1);
            for(int j=0;j<values[i].length;j++){
                //将内容按顺序赋给对应的列对象
                row1.createCell(j).setCellValue(values[i][j]);
            }
        }
        log.info("excel内容创建完成");

        try {
            OutputStream os = ExcelUtils.getout(response,fileName);
            sxssfWorkbook.write(os);
            os.flush();
            os.close();
            log.info("写出文件");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //发送响应流方法
    public static OutputStream getout(HttpServletResponse response, String filename) {
        OutputStream out = null;
        try {
            // 中文文件名必须使用此句话
            // 配置文件下载
            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename+".xlsx", "UTF-8"));
            out = response.getOutputStream();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }

    //获取response
    public static HttpServletResponse getResponse(){
        //实例化httpservletresponse
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = servletRequestAttributes.getResponse();
        return response;
    }
}
