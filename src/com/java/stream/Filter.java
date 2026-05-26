package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        //Write code to:
            //create list from 1 to 10
            //print only odd numbers
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        nums.stream().filter(n-> n % 2 != 0).forEach(System.out::println);

       // Write code to:
            //create list of names
            //print only names starting with "A"
        List<String> names = Arrays.asList("Anji reddy","lakshmi","premelia","anusha","adithya");
        names.stream().filter(name -> name.toUpperCase().startsWith("A")).forEach(System.out::println);

        //Write code to:

            //create list of integers
            //print numbers greater than 50
        List<Integer> nums2 = Arrays.asList(
                10, 25, 60, 80, 45, 90
        );
        nums2.stream().filter(num -> num > 50).forEach(System.out::println);

        //Write code to:

            //create list of names
            //print only names whose length is greater than 5
        List<String> names1 = Arrays.asList("Anji reddy","lakshmi","premelia","anusha","adithya");
        names1.stream().filter(name ->name.length() > 5).forEach(System.out::println);
    }

}
