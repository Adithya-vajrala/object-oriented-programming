package com.java.stream.streamsrevision;

import java.util.List;

public class FindAny {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Ram",
                "Sai",
                "Arjun",
                "Adithya"
        );
        System.out.println(names.stream()
                .filter(name->name.startsWith("A"))
                .findAny()
                .orElse("Not Found"));
    }
}
