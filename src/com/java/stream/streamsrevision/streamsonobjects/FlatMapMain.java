package com.java.stream.streamsrevision.streamsonobjects;

import java.util.Collection;
import java.util.List;

public class FlatMapMain {
    public static void main(String[] args) {
        List<List<String>> names = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F")
        );
        System.out.println(names.stream().flatMap(Collection::stream).toList());
    }
}
