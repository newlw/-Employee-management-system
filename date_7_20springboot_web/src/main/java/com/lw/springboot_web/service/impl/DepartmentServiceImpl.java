package com.lw.springboot_web.service.impl;

import com.lw.springboot_web.mapper.DepartmentMapper;
import com.lw.springboot_web.pojo.Department;
import com.lw.springboot_web.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> findAllDepartment() {
        return departmentMapper.findAllDepartment();
    }
}
