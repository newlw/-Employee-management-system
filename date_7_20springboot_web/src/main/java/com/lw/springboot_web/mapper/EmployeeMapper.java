package com.lw.springboot_web.mapper;

import com.lw.springboot_web.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    //查询所有员工和所属部门
    public List<Employee> findAllEmployee();

    //增加一个员工
    public void addEmployee(Employee employee);

    //根据id查询员工信息
    public Employee findEmployeeById(Integer id);

    //修改员工信息
    public void updateEmployee(Employee employee);

    //根据id删除员工信息
    public void deleteEmployById(Integer id);
}
