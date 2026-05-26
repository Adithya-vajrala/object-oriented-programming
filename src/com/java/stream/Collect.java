package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        //Write code to:

            //create list of integers
            //keep only even numbers
            //collect them into another list
            //print new list
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNums = nums.stream().filter(n->n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);
    }
}
