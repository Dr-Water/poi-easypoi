package com.ratel.poi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ 业务描述： 测试集合(1对多)的情况
 * @ Package_name：com.ratel.poi.entity
 * @ Project_name：poi-easypoi
 * @ Author：ratelfu@qq.com
 * @ Create_time：2019-01-11 16:06
 * @ Copyright (c) ratelfu 版权所有
 */
@ExcelTarget("courseEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEntity implements java.io.Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 课程名称
     */
    @Excel(name = "课程名称", orderNum = "1", width = 25, needMerge = true)
    private String name;

    /**
     * name
     */
    @Excel(name = "主讲老师_major,代课老师_absent", orderNum = "1", needMerge = true, isImportField = "true_major,true_absent")
    private TeacherEntity mathTeacher;

    @ExcelCollection(name = "学生", orderNum = "4")
    private List<StudentEntity> students;
}
