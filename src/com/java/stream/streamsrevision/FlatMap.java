package com.java.stream.streamsrevision;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );
        System.out.println(list.stream().flatMap(Collection::stream).toList());

        //[I, Love, Java, Streams, Are, Powerful]
        List<String> sentences = List.of(
                "I Love Java",
                "Streams Are Powerful"
        );
        System.out.println(sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList());
    }
}
