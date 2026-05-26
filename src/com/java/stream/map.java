package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class map {
    public static void main(String[] args) {
        //Write code to:
            //create list of integers
            //multiply every number by 5
            //print results

        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        num.stream().map(i -> i * 5).forEach(System.out::println);

        //Write code to:

        //create list of names
        //convert every name to uppercase
        //print results
        List<String> names = Arrays.asList("Adithya","vajrala","qeerdznm","error");
        names.stream().map(s->s.toUpperCase()).forEach(System.out::println);

        //Write code to:

        //create list of integers
        //convert each integer into its square
        //print results
        List<Integer> num1 = Arrays.asList(1,2,3,4,5,6);
        num1.stream().map(n->n*n).forEach(System.out::println);

        //Write code to:

        //create list of integers from 1 to 10
        //keep only even numbers
        //multiply remaining numbers by 10
        //print result
        List<Integer> num2 = Arrays.asList(1,2,3,4,5,6,8,9,10);
        num2.stream().filter(n->n % 2 == 0).map(n->n * 10).forEach(System.out::println);
    }
}
