package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        //Create a stream from a list and print all elements.
        List<String> names = new ArrayList<>();
        names.add("adithya");
        names.add("sai");
        names.add("vajrala");
        names.add("king");
        names.stream().forEach(s -> System.out.println(s));
    }
}
