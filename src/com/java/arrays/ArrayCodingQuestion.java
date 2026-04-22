package com.java.arrays;

public class ArrayCodingQuestion {
    public static void findingHighestElement(int[] element) {
        int highestElement = element[0];
        for (int i = 1; i < element.length; i++) {
            if (element[i] > highestElement) {
                highestElement = element[i];
            }
        }
        System.out.println("highest element:" + highestElement);
    }

    public static int[] sortingArrayOfElements(int[] element) {
        int[] sortedArray = element;
        int temp;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] elements = {1,2,6,3,0};
        findingHighestElement(elements);
        int[] sortedElements = sortingArrayOfElements(elements);
        for (int i = 0; i < sortedElements.length ; i++) {
            System.out.print(sortedElements[i]);
        }
    }
}
