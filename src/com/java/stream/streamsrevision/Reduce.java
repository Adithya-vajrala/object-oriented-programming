package com.java.stream.streamsrevision;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        //Find the maximum number using only reduce().
        List<Integer> numbers = List.of(10, 40, 20, 70, 30);
        System.out.println(numbers.stream()
                .reduce(0,Integer::max));
        //Find the minimum number using only reduce().
        System.out.println(numbers.stream()
                .reduce(Integer::min)
                .orElse(0));
        //Find the longest string using only reduce().
       /* List<String> names = List.of(
                "Ram",
                "Adithya",
                "Sai",
                "Arjun"
        );
        System.out.println(names.stream()
                .reduce((a,b)->a.length() > b.length() ? a:b)
                .orElse("nothing"));*/

        //Using only reduce(), produce:

        //Java-Spring-Boot

       /* List<String> names = List.of(
                "Java",
                "Spring",
                "Boot"
        );
        System.out.println(names.stream()
                .reduce((a,b)->a+"-"+b)
                .orElse("nothing")); */

        //Find the total number of characters in all names using reduce().
        List<String> names = List.of(
                "Ram",
                "Adithya",
                "Sai",
                "Arjun",
                "Krishna"
        );
        System.out.println(names.stream()
                        .map(s -> s.length())
                        .reduce(Integer::sum)
                        .orElse(0));


    }
}
