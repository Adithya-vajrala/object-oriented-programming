package com.java.string;

import java.util.Scanner;
public class ReversingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString = scanner.nextLine();
        char[] stringArray = inputString.toCharArray(); // conversion of string to array
        char[] reveredStringArray = reverseArray(stringArray);
        String reversedString = new String(reveredStringArray); // conversion of array to string
        System.out.println("Reversed String:" + reversedString);
    }

    public static char[] reverseArray(char[] inputArray) {
        int start = 0;
        int end = inputArray.length - 1;
        char temp;
        while (start < end) {
            temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
        return inputArray;
    }

}
