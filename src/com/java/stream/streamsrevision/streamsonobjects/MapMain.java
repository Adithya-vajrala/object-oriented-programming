package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;

public class MapMain {
    public static void main(String[] args) {
        //List<Employee> employees = List.of(new Employee(1,"adithya",200000),new Employee(2,"sai",200));
        //Create a list containing only employee names.
        //System.out.println(employees.stream().map(Employee::getName).toList());

        /*List<Employee> employees = List.of(
                new Employee(1, "Adithya", 50000),
                new Employee(2, "Sai", 60000),
                new Employee(3, "Ram", 70000)
        );

        //Create a list containing employee salaries increased by 10%.
        System.out.println(employees.stream()
                .map(Employee -> Employee.getSalary() + 1.10).toList());*/

        //Using both filter() and map():

        //Select employees whose salary is greater than 50000
        //Extract only their names
        List<Employee> employees = List.of(
                new Employee(1, "Adithya", 50000),
                new Employee(2, "Sai", 60000),
                new Employee(3, "Ram", 70000),
                new Employee(4, "Arjun", 40000)
        );
        System.out.println(employees.stream()
                .filter(Employee->Employee.getSalary() > 50000)
                .map(Employee::getName)
                .toList());
    }
}
