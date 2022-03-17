package com.aimdek.jdbc.demo;

import com.aimdek.jdbc.demo.dao.EmployeeDAO;
import com.aimdek.jdbc.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateDemoApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateDemoApplication.class, args);
    }

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void run(String... args) throws Exception {
        delete();
    }

    void insert() {
        Employee employee = new Employee(2, "Hiren", 20000);
        System.out.println("Number Of Rows Affected ---- " + employeeDAO.insert(employee));
    }

    void update() {
        Employee employee = new Employee(2, "Prit", 15000);
        System.out.println("Number Of Rows Affected ---- " + employeeDAO.update(employee));
    }

    void delete() {
        Employee employee = new Employee(2, "Prit", 15000);
        System.out.println("Number Of Rows Affected ---- " + employeeDAO.delete(employee));
    }
}