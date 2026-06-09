package com.java.stream.streamsrevision;

import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        // Any Match
        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        //Check whether any number is greater than 25.
        System.out.println(numbers.stream().anyMatch(n->n > 25));
    }
}
