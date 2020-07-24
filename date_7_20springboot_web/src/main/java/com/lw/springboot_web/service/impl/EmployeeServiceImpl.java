package com.lw.springboot_web.service.impl;

import com.lw.springboot_web.mapper.EmployeeMapper;
import com.lw.springboot_web.pojo.Employee;
import com.lw.springboot_web.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    //查询所有员工信息和所属部门
    @Override
    public List<Employee> findAllEmployee() {
        return employeeMapper.findAllEmployee();
    }

    //添加员工信息
    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    //修改员工信息
    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    //根据id查询员工信息
    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeMapper.findEmployeeById(id);
    }

    //根据id删除用户
    @Override
    public void deleteEmployById(Integer id) {
        employeeMapper.deleteEmployById(id);
    }
}
