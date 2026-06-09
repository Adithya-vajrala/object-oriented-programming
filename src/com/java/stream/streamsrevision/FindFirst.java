package com.java.stream.streamsrevision;

import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(
                11, 15, 18, 21, 24, 30
        );
        //Find the first even number.
        System.out.println(numbers.stream()
                .filter(number->number % 2 == 0)
                .findFirst().get());
    }
}
