package com.ratel.poi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ 业务描述：
 * @ Package_name：com.ratel.poi.entity
 * @ Project_name：poi-easypoi
 * @ Author：ratelfu@qq.com
 * @ Create_time：2019-01-11 17:46
 * @ Copyright (c) ratelfu 版权所有
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Excel(name="公司名称")
    private String name;

    @Excel(name = "公司LOGO", type = 2 ,width = 40 , height = 20,imageType = 1)
    private String companyLogo;

    @Excel(name="公司地址")
    private String address;
}
