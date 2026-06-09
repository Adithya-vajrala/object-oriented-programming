package com.java.stream.streamsrevision.streamsonobjects;

import java.util.Comparator;
import java.util.List;

public class SortedMain {
    public static void main(String[] args) {
       /* List<Employee> employees = List.of(
                new Employee(1, "Sai", 60000),
                new Employee(2, "Adithya", 50000),
                new Employee(3, "Ram", 70000)
        );
        //Sort employees by salary in ascending order.
        System.out.println(employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName)
                .toList());
        //Sort employees by salary in descending order.
        System.out.println(employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList()); */
        List<Employee> employees = List.of(
                new Employee(1, "Sai", 60000),
                new Employee(2, "Arjun", 60000),
                new Employee(3, "Ram", 70000),
                new Employee(4, "Adithya", 60000)
        );
        //Multi-Level Sorting
        System.out.println(employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .map(Employee::getName)
                .toList());
    }
}
