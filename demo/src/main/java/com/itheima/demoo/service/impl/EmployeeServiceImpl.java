package com.itheima.demoo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.demoo.entity.Employee;
import com.itheima.demoo.mapper.EmployeeMapper;
import com.itheima.demoo.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}
