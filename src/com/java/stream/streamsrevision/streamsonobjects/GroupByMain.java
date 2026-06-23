package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByMain {
    public static void main(String[] args) {
        /*List<Employee> employees = List.of(
                new Employee(1, "A", 50000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 50000),
                new Employee(4, "D", 70000)
        );
        System.out.println(
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::getSalary,
                                        Collectors.mapping(
                                                Employee::getName,
                                                Collectors.toList()
                                        )
                                )
                        )
        );*/
        List<Employee> employees = List.of(
                new Employee(1,"A",50000),
                new Employee(2,"B",70000),
                new Employee(3,"C",50000),
                new Employee(4,"D",70000),
                new Employee(5,"E",70000)
        );
       // Count employees by salary.
        System.out.println(
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::getSalary,
                                        Collectors.counting()
                                )
                        )
        );


    }
}
