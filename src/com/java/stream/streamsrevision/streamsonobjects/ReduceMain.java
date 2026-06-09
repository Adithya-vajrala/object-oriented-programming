package com.java.stream.streamsrevision.streamsonobjects;

import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        /*List<Employee> employees = List.of(
                new Employee(1,"A",50000),
                new Employee(2,"B",70000),
                new Employee(3,"C",60000),
                new Employee(4,"D",90000)
        );
        //get highest employee by salary
        System.out.println(employees.stream()
                .reduce(new Employee(),(a,b)-> a.getSalary() > b.getSalary() ? a:b)
        );*/

        /*Using only reduce(), find:

        Total Salary = 270000
        Highest Salary = 90000
        Employee Count = 4
        Average Salary = 67500*/

    }
}
