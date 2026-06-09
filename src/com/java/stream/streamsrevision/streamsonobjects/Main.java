package com.java.stream.streamsrevision.streamsonobjects;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Sai", 40000),
                new Employee(2, "Ram", 70000),
                new Employee(3, "Arjun", 80000),
                new Employee(4, "Adithya", 90000)
        );
        /*Using Streams:

        Filter employees with salary > 50000
        Sort by salary descending
        Get the first employee
        Return only the employee name
        If none found, return "Not Found"*/
        System.out.println(employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .findFirst()
                .orElse("Not Found"));
    }
}
