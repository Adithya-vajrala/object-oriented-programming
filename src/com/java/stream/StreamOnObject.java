package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnObject {
    public static void main(String[] args) {
        //Print only employees whose salary is greater than 50000
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Adithya", "IT", 50000),
                new Employee(2, "Ram", "HR", 40000),
                new Employee(3, "Kiran", "IT", 70000),
                new Employee(4, "Sai", "Finance", 60000)
        );
        employees.stream().filter(employee->employee.getSalary() > 50000).forEach(System.out::println);

        List<String> employeeName = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(employeeName);
        //Get names of employees whose salary is greater than 50000.
        List<String> employeeList = employees.stream().filter(e->e.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(employeeList);
    }

}
