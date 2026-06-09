package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;

public class DistinctMain {
    public static void main(String[] args) {
        //You want the unique employee names.
        List<Employee> employees = List.of(
                new Employee(1, "Sai", 60000),
                new Employee(2, "Sai", 70000),
                new Employee(3, "Ram", 50000),
                new Employee(4, "Ram", 80000),
                new Employee(5, "Arjun", 90000)
        );
        System.out.println(employees.stream()
                .map(Employee::getName)
                .distinct()
                .toList());
    }
}
