package com.java.stream.streamsrevision;

import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Ram",
                "Sai",
                "Arjun",
                "Anil",
                "Krishna"
        );
        System.out.println(names.stream().collect(Collectors.groupingBy(s -> s.length())));
        List<String> names1 = List.of(
                "Ram",
                "Sai",
                "Arjun",
                "Anil",
                "Krishna",
                "Kiran"
        );
        System.out.println(
                names1.stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length,
                                        Collectors
                                        .counting()
                                )
                        )
        );
    }

}

