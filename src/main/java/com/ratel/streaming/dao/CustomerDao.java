package com.ratel.streaming.dao;

import com.ratel.streaming.entity.BpmsCustomerManageFormalEntity;
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
public interface CustomerDao {

        BpmsCustomerManageFormalEntity selectById(@Param("id") Integer id);
        List<BpmsCustomerManageFormalEntity> selectAll();
        List<BpmsCustomerManageFormalEntity> selectFetchSize();
        List<BpmsCustomerManageFormalEntity> selectFetchSize2();
}
