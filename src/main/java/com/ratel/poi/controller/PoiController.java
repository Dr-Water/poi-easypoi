package com.ratel.poi.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.ratel.poi.entity.Person;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
  *@ 业务描述： poidemo的实体类
  *@ package_name：com.ratel.poi.controller
  *@ author：ratelfu@qq.com
  *@ create_time： 2019/1/11 11:46
  *@ copyright (c) ratelfu 版权所有
  */
@RestController
@RequestMapping("/excel")
public class PoiController {
    @RequestMapping("/uploadExcel")
    public List<Person> readXls() throws IOException, InvalidFormatException {
        File file = new File("E:\\excel.xls");
        InputStream is = new FileInputStream(file);
        List<Person> people =new ArrayList<Person>();
        HSSFWorkbook book = new HSSFWorkbook(is);
        HSSFSheet sheet = book.getSheetAt(0);

        /**
         * 通常第一行都是标题，所以从第二行开始读取数据
         */
        for(int i=1; i<sheet.getLastRowNum()+1; i++) {
            HSSFRow row = sheet.getRow(i);
            row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
            row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
            //id
            String id = row.getCell(0).getStringCellValue();
            //name
            String name = row.getCell(1).getStringCellValue();
            Person person =new Person();
            person.setId(id);
            person.setName(name);
            people.add(person);
        }
        for (Person person : people) {
            System.err.println(person);
        }
        return people;
    }

    @RequestMapping("/downloadExcel")
    public void setUpExcel(HttpServletResponse response) throws IOException{
        String[] headers = { "数量", "时间"};
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        //设置列宽
        sheet.setDefaultColumnWidth((short) 18);
        //创建第一行的对象，第一行一般用于填充标题内容。从第二行开始一般是数据
        HSSFRow row = sheet.createRow(0);
        for (short i = 0; i < headers.length; i++) {
            //创建单元格，每行多少数据就创建多少个单元格
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            //给单元格设置内容
            cell.setCellValue(text);
        }

        //创建对象集合
        List<Person> datasList = new ArrayList<>();
        Person person1 = new Person();
        person1.setId("55");
        person1.setName("han");
        Person person2 = new Person();
        person2.setId("77");
        person2.setName("你好");
        datasList.add(person1);
        datasList.add(person2);

        //遍历集合，将每个集合元素对象的每个值填充到单元格中
        for(int i=0;i<datasList.size();i++){
            Person person =datasList.get(i);
            //从第二行开始填充数据
            row = sheet.createRow(i+1);
            //该集合只记录数量和时间，这两个值来自statisticsModel。如果对象比较复杂，需要额外转换，比如Date类型的日期，int，float类型的数值
            List<String> datas=new ArrayList<>();
            String id= person.getId();
            String name= person.getName();
            datas.add(id);
            datas.add(name);
            for (int j=0;j<datas.size();j++) {
                String string=datas.get(j);
                HSSFCell cell = row.createCell(j);
                HSSFRichTextString richString = new HSSFRichTextString(string);
                HSSFFont font3 = workbook.createFont();
                //定义Excel数据颜色，这里设置为蓝色
                font3.setColor(HSSFColor.BLUE.index);
                richString.applyFont(font3);
                cell.setCellValue(richString);
            }
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/octet-stream");
        //Excel文件名
        response.setHeader("Content-disposition", "attachment;filename="+new String("你好".getBytes(), "ISO8859-1") + " .xls");
        try {
            response.flushBuffer();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //将workbook中的内容写入输出流中
        workbook.write(response.getOutputStream());
    }
}
