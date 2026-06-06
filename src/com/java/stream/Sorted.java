package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {


        /*Write code to:

            create list of integers
            sort them in ascending order
            collect into another list
            print result*/
        List<Integer> nums = Arrays.asList(10,2,30,400,5,609,7,8,90,1);
        List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNums);

        /*Write code to:

            sort numbers in descending order
            collect result into list
            print result*/
        List<Integer> descendingOrderNums = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingOrderNums);
    }
}
