package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee(1,"adithya",200000),new Employee(2,"sai",200));
        //Using Streams, get all employees whose salary is greater than 50000
        System.out.println(employees.stream().filter(employee -> employee.getSalary() > 50000).toList());
        //salary > 50000 AND name starts with A
        System.out.println(employees.stream().filter(employee -> employee.getSalary() > 50000 && employee.getName().toUpperCase().startsWith("A")).toList());
    }
}
