package com.lw.springboot_web.mapper;

import com.lw.springboot_web.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    //查询所有部门
    public List<Department> findAllDepartment();
}
