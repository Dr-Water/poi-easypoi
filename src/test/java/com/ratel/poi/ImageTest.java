package com.ratel.poi;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.ratel.poi.entity.Company;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ 业务描述：
 * @ Package_name：com.ratel.poi
 * @ Project_name：poi-easypoi
 * @ Author：ratelfu@qq.com
 * @ Create_time：2019-01-11 18:48
 * @ Copyright (c) ratelfu 版权所有
 */
public class ImageTest {

    List<Company> list;

    @Before
    public void initData() {
        list = new ArrayList<Company>();
        list.add(new Company("百度", "image/百度.jpg", "北京市海淀区西北旺东路10号院百度科技园1号楼"));
        list.add(new Company("三六零", "image/360.jpg", "北京市海淀区西北旺东路10号院百度科技园1号楼"));
    }

    @Test
    public void exportCompanyImg() throws Exception {

        File savefile = new File("E:/excel/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), Company.class, list);
        FileOutputStream fos = new FileOutputStream("E:/excel/company.xls");
        workbook.write(fos);
        fos.close();
    }
}
