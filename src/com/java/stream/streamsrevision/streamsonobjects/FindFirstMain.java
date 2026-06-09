package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;

public class FindFirstMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Sai", 40000),
                new Employee(2, "Ram", 70000),
                new Employee(3, "Arjun", 80000)
        );
        //Find the first employee whose salary is greater than 50000 and return only the employee name.
        System.out.println(employees.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .map(Employee::getName)
                .findFirst()
                .orElse("nothing like this"));
    }
}
