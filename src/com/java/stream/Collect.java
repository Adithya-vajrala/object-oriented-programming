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

        //Your task:

            //Keep only names starting with "a"
            //Convert remaining names to uppercase
            //Store result in another list
            //Print final list
        List<String> employees = Arrays.asList(
                "adithya",
                "anusha",
                "akhil",
                "vajrala"
        );
        List<String> employeesStartingWithA = employees.stream().filter(s -> s.startsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(employeesStartingWithA);

        //Your task:

            //Keep only numbers greater than 10
            //Square those numbers
            //Store result into another list
            //Print final list
        List<Integer> nums1 = Arrays.asList(
                5, 12, 7, 20, 3, 18, 1, 30
        );
        List<Integer> filteredAndSquared = nums1.stream().filter(integer -> integer > 10).map(integer -> integer * integer).collect(Collectors.toList());
        System.out.println(filteredAndSquared);

        //Your task:

            //Keep only names with length > 3
            //Convert remaining names into their lengths
            //Store result in another list
            //Print result
        List<String> names = Arrays.asList(
                "Ram",
                "Adithya",
                "Sai",
                "Anusha"
        );
        List<Integer> namesLength = names.stream().filter(name->name.length() > 3).map(String::length).collect(Collectors.toList());
        System.out.println(namesLength);

        //Your task:

            //Keep only words whose length is EVEN
            //Convert them to uppercase
            //Collect into list
            //Print result
        List<String> words = Arrays.asList(
                "java",
                "stream",
                "api",
                "collection",
                "lambda"
        );
       List<String> evenLengthWords = words.stream().filter(word-> word.length() % 2 == 0).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(evenLengthWords);

        /*Your task:

            Keep only Gmail addresses
            Convert them to uppercase
            Collect into list
            Print final result*/
        List<String> emails = Arrays.asList(
                "admin@gmail.com",
                "user@yahoo.com",
                "support@gmail.com",
                "test@outlook.com",
                "dev@gmail.com"
        );
        List<String> gmail = emails.stream().filter(mail->mail.endsWith("@gmail.com")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(gmail);
    }
}
