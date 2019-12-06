package com.ratel.streaming.dao;

import com.ratel.streaming.entity.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @业务描述：
 * @package_name： com.ratel.mapper.dao
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 10:10
 * @copyright (c) ratelfu 版权所有
 */
@Mapper
public interface EmployeesDao {

        Employees selectById(@Param("id")Integer id);
        List<Employees> selectAll();
        List<Employees> selectFetchSize();
}
