package com.java.stream.streamsrevision;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        //Using Streams, create a new list containing only the numbers that are divisible by 5 and greater than 20.
        //List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);
        //System.out.println(numbers.stream().filter(number->number% 5 == 0 && number > 20).toList());

        //Using Streams, create a list containing only names that:
        //Start with "A"
        //Have more than 4 characters
        /* List<String> names = List.of(
                "Adithya",
                "Ram",
                "Anil",
                "Kiran",
                "Arjun",
                "Sai"
        );
        System.out.println(names.stream().filter(name->name.startsWith("A") && name.length() > 4).toList());*/

        //Using Streams, create a list containing only numbers that:

        //are even
        //are divisible by 3
        List<Integer> numbers = List.of(5, 12, 18, 21, 24, 27, 30, 33, 36);

        System.out.println(numbers.stream().filter(number->number % 2 == 0 && number % 3 == 0).toList());

        //Using Streams, create a list that contains only:

        //Non-null names
        //Non-empty names
        List<String> names = Arrays.asList(
                "Adithya",
                "Ram",
                "",
                "Sai",
                null,
                "Arjun",
                ""
        );
        System.out.println(names.stream().filter(name->name != null && !name.isEmpty()).toList());
    }
}
