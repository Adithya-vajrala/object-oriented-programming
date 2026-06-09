package com.java.stream.streamsrevision;

import java.util.List;

public class Count {
    public static void main(String[] args) {
       /* List<String> names = List.of(
                "Adithya",
                "Ram",
                "Sai",
                "Arjun",
                "Anil"
        );
        //Count how many names start with "A".
        System.out.println(names.stream()
                .filter(name->name.startsWith("A"))
                .count());
        //count return long */

        //count() + distinct()
        //Count the number of unique names.
        List<String> names = List.of(
                "Sai",
                "Ram",
                "Sai",
                "Arjun",
                "Ram",
                "Adithya"
        );
        System.out.println(names.stream()
                .distinct()
                .count());
    }
}
