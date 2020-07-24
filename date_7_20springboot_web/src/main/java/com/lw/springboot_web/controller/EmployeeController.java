package com.lw.springboot_web.controller;

import com.lw.springboot_web.mapper.DepartmentMapper;
import com.lw.springboot_web.mapper.EmployeeMapper;
import com.lw.springboot_web.pojo.Department;
import com.lw.springboot_web.pojo.Employee;
import com.lw.springboot_web.service.DepartmentService;
import com.lw.springboot_web.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    //员工管理页面
    @RequestMapping("/emp/list")
    public String select(Model model){
        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    //跳转添加员工信息页面
    @GetMapping("/add")
    public String add1(Model model){
        List<Department> allDepartment = departmentService.findAllDepartment();
        model.addAttribute("departments",allDepartment);
        return "emp/add";
    }

    //提交添加的员工信息并返回到员工信息列表
    @PostMapping("/add")
    public String add2(Employee employee,Model model){

        employeeService.addEmployee(employee);

        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    //去员工的修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id")Integer id,Model model){

        Employee employee = employeeService.findEmployeeById(id);
        List<Department> departments = departmentService.findAllDepartment();
        model.addAttribute("emp",employee);
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    //修改员工信息并返回到员工信息列表
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee,Model model){
        employeeService.updateEmployee(employee);

        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    //删除员工信息并返回到列表
    @GetMapping("/delEmp/{id}")
    public String delEmp(@PathVariable("id")Integer id,Model model){

        employeeService.deleteEmployById(id);
        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("emps",employees);

        return "emp/list";
    }

}
