package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;

public class CountMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Sai", 60000),
                new Employee(2, "Adithya", 50000),
                new Employee(3, "Ram", 70000),
                new Employee(4, "Arjun", 80000)
        );
        //Count how many employees have a salary greater than 60000.
        System.out.println(employees.stream()
                .filter(employee -> employee.getSalary() > 60000)
                .count());

    }
}
