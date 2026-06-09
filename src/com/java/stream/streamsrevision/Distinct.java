package com.java.stream.streamsrevision;

import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        /* List<Integer> numbers = List.of(
                1, 2, 3, 2, 4, 1, 5, 3, 6
        );
        //Remove duplicate numbers using Streams.
        System.out.println(numbers.stream()
                .distinct()
                .toList());*/
        List<Integer> numbers = List.of(
                10, 5, 20, 10, 30, 20, 40, 5, 50
        );
        //Using Streams:

        //Keep only numbers greater than 10
        //Remove duplicates
        //Sort in ascending order
        System.out.println(numbers.stream()
                .filter(number->number > 10)
                .distinct()
                .sorted()
                .toList());
    }
}
