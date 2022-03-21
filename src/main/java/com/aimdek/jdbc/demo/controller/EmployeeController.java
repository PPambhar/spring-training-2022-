package com.aimdek.jdbc.demo.controller;

import com.aimdek.jdbc.demo.model.Employee;
import com.aimdek.jdbc.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public int create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping("/employee")
    public int update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/employee/{empId}")
    public void delete(@PathVariable int empId) {
        employeeService.delete(empId);
    }

    @GetMapping("/employee")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/employee/get-one")
    public Employee getOne(@RequestParam int empId) {
        return employeeService.getOne(empId);
    }
}
