package com.java.exam;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word1: ");
        String word1 = sc.nextLine();
        System.out.print("Word2: ");
        String word2 = sc.nextLine();
        word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();
        if (word1.length() != word2.length()) {
            System.out.println(word1 + " and " + word2 + " are NOT Anagrams");
        } else {
            int[] freq = new int[26];
            for (int i = 0; i < word1.length(); i++) {
                char ch = word1.charAt(i);
                freq[ch - 'a']++;
            }
            for (int i = 0; i < word2.length(); i++) {

                char ch = word2.charAt(i);

                freq[ch - 'a']--;
            }
            boolean isAnagram = true;
            for (int i = 0; i < 26; i++) {

                if (freq[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                System.out.println(word1 + " and " + word2 + " are Anagrams!");
            } else {
                System.out.println(word1 + " and " + word2 + " are NOT Anagrams");
            }
        }
        sc.close();
    }
}
