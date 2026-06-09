package com.java.stream.streamsrevision;

import java.util.Comparator;
import java.util.List;

public class Skip {
    public static void main(String[] args) {
       /* List<Integer> numbers = List.of(
                10, 20, 30, 40, 50, 60, 70
        );
        //Skip the first 3 elements and return the remaining elements.
        System.out.println(numbers.stream()
                .skip(3)
                .toList());*/

        //sorted + skip + limit
        //Find the 2nd highest number using Streams.
        /*List<Integer> numbers = List.of(
                10, 50, 30, 20, 70, 40, 60
        );
        System.out.println(numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .toList());*/

        //Find the 2nd highest unique number.

        //Notice the duplicates (70, 50).
        List<Integer> numbers = List.of(
                10, 50, 30, 50, 20, 70, 40, 60, 70
        );
        System.out.println(numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .toList());
    }
}
