package com.ratel.poi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ 业务描述：
 * @ Package_name：com.ratel.poi.entity
 * @ Project_name：poi-easypoi
 * @ Author：ratelfu@qq.com
 * @ Create_time：2019-01-11 16:07
 * @ Copyright (c) ratelfu 版权所有
 */

@Data
@AllArgsConstructor
@ExcelTarget("teacherEntity")
public class TeacherEntity implements java.io.Serializable {
    private String id;
    /**
     * name
     */
    @Excel(name = "主讲老师_major,代课老师_absent", orderNum = "1", isImportField = "true_major,true_absent")
    private String name;
}