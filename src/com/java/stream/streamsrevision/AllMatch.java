package com.java.stream.streamsrevision;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        System.out.println(numbers.stream()
                .allMatch(n->n % 10 == 0));

        //NON match
        //Check whether none of the names start with "K".
        List<String> names = List.of(
                "Ram",
                "Sai",
                "Arjun",
                "Adithya"
        );
        System.out.println(names.stream()
                .noneMatch(n->n.startsWith("k")));
    }
}
