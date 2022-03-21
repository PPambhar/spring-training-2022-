package com.aimdek.jdbc.demo.service;

import com.aimdek.jdbc.demo.dao.EmployeeDAO;
import com.aimdek.jdbc.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public int create(Employee employee) {
        return employeeDAO.insert(employee);
    }

    public int update(Employee employee) {
        return employeeDAO.update(employee);
    }

    public void delete(int empId) {
        Employee employee = getOne(empId);
        employeeDAO.delete(employee);
    }

    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

    public Employee getOne(int empId) {
        return employeeDAO.getOne(empId);
    }
}
