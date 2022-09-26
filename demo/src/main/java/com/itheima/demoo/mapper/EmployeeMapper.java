package com.itheima.demoo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.demoo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
