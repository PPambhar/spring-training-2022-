package com.aimdek.jdbc.demo;

import com.aimdek.jdbc.demo.dao.EmployeeDAO;
import com.aimdek.jdbc.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JdbcTemplateDemoApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateDemoApplication.class, args);
    }

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void run(String... args) throws Exception {
//        insert();
//        getAll();
    }

//    void insert() {
//        Employee employee = new Employee(2, "Prit", 5000);
//        System.out.println("Number Of Rows Affected ---- " + employeeDAO.insert(employee));
//    }
////
////    void update() {
////        Employee employee = new Employee(2, "Prit", 15000);
////        System.out.println("Number Of Rows Affected ---- " + employeeDAO.update(employee));
////    }
////
////    void delete() {
////        Employee employee = new Employee(2, "Prit", 15000);
////        System.out.println("Number Of Rows Affected ---- " + employeeDAO.delete(employee));
////    }
//
//    void getAll() {
//        List<Employee> employeeList = employeeDAO.getAll();
//        for(Employee employee : employeeList) {
//            System.out.println("Name:-  " + employee.getName());
//            System.out.println("Salary:-  " + employee.getSalary());
//        }
//    }
}