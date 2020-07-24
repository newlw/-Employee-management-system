package com.lw.springboot_web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;


//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Department {
    private Integer id;
    private String departmentName;

    private List<Employee> employees;

    public Integer getId() {
        return id;
    }
    public String getDepartmentNameById(Integer id){
//        this.departmentName = departmentName;
        return departmentName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
