package com.java.string;

public class StringTest {
    public static void main(String[] args) {
        String name = "Adithya";
        // charAt(int index) method
        System.out.println(name.charAt(1));
        // codePointAt(int index) method
        System.out.println(name.codePointAt(2));
        // 	codePointBefore(int index) method
        System.out.println(name.codePointBefore(1));
        // codePointCount(int beginIndex, int endIndex)
        System.out.println(name.codePointCount(0,3));
        // compareTo(String anotherString)
        System.out.println(name.compareTo("adithya"));
        //compareToIgnoreCase(String str)
        System.out.println(name.compareToIgnoreCase("adithya"));
    }
}
