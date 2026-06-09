package com.java.stream.streamsrevision;

import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 9, 1, 7, 3);
        //Sort the numbers in ascending order using Streams.
        System.out.println(numbers.stream()
                .sorted()
                .toList());
        //Sort the numbers in descending order using Streams.
        System.out.println(numbers.stream()
                .sorted(Comparator.reverseOrder()).toList());

        //Sort the names in alphabetical order.
        List<String> names = List.of(
                "Sai",
                "Adithya",
                "Ram",
                "Arjun"
        );
        System.out.println(names.stream()
                .sorted()
                .toList());
    }
}
