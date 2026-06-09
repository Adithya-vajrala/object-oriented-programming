package com.java.stream.streamsrevision;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        //Create a new list containing all names in uppercase.
        /*List<String> names = List.of(
                "Adithya",
                "Ram",
                "Sai",
                "Arjun"
        );
        System.out.println(names.stream().map(name->name.toUpperCase()).toList());*/

        //Create a new list containing the square of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().map(number->number*number).toList());

        //Create a list containing the length of each name.
        List<String> names = List.of(
                "Adithya",
                "Ram",
                "Sai",
                "Arjun"
        );
        System.out.println(names.stream().map(String::length).toList());
    }
}
