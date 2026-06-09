package com.java.stream.streamsrevision;

import java.util.List;

public class Limit {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(
                10, 20, 30, 40, 50, 60, 70
        );
        //Get the first 3 numbers using Streams.
        System.out.println(numbers.stream()
                .limit(3)
                .toList());
    }
}
