package com.lw.springboot_web.service;

import com.lw.springboot_web.pojo.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    //查询所有部门
    public List<Department> findAllDepartment();
}
