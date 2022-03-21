package com.aimdek.jdbc.demo.dao;

import com.aimdek.jdbc.demo.mapper.EmployeeMapper;
import com.aimdek.jdbc.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Employee employee) {
        String query = "INSERT INTO EMPLOYEE VALUES ("+employee.getId()+",'"+employee.getName()+"',"+employee.getSalary()+")";
        return jdbcTemplate.update(query);
    }

    public int update(Employee employee) {
        String query = "UPDATE EMPLOYEE SET name='"+employee.getName()+"',salary = "+employee.getSalary()+" WHERE id = "+employee.getId();
        return jdbcTemplate.update(query);
    }

    public int delete(Employee employee) {
        String query = "DELETE FROM EMPLOYEE WHERE id = "+employee.getId();
        return jdbcTemplate.update(query);
    }

    public List<Employee> getAll() {
        String query = "SELECT * FROM employee";
        return jdbcTemplate.query(query, new EmployeeMapper());
    }

    public Employee getOne(int empId) {
        String query = "SELECT * FROM employee WHERE id = " + empId;
        return jdbcTemplate.queryForObject(query, new EmployeeMapper());
    }
}
