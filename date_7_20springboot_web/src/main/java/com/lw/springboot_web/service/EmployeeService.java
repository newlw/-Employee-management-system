package com.lw.springboot_web.service;

import com.lw.springboot_web.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    //查询所有员工和所属部门
    public List<Employee> findAllEmployee();

    //增加一个员工
    public void addEmployee(Employee employee);

    //根据id查询员工信息
    public Employee findEmployeeById(Integer id);

    //修改员工信息
    public void updateEmployee(Employee employee);

    //根据id删除用户
    public void deleteEmployById(Integer id);
}
