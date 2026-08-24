package com.rubeshsv.bible.month1.week2.day3;

     /*
        1. Write a separate method boolean isPalindrome(String word) — reuse your two-pointer check from Day 8
        (assume-true, disprove on mismatch, charAt + ==, break).
        2.In main, loop over words; for each word print the word and whether it's a palindrome, e.g. madam -> true.
        3. Count how many words are palindromes (a counter/accumulator) and print the total at the end, e.g. Palindromes found: 3.
     */

public class WordAnalyzer {
    public static void main(String[] args) {
        String[] word = {"madam", "hello", "level", "java", "noon"};
        int palindromeFound = 0;
        for (int i = 0; i < word.length; i++) {
            boolean result = isPalindrome(word[i]);
            if (result) {
                palindromeFound++;
            }
            System.out.println(word[i] + " -> " + result);
        }
        System.out.println("Palindromes found: " + palindromeFound);
    }
    public static boolean isPalindrome(String words) {
        int left = 0;
        int right = words.length() - 1;
        boolean assertion = true;
        while (left < right) {
            if (words.charAt(left) != words.charAt(right)) {
                assertion = false;
                break;
            }
            left++;
            right--;
        }
        return assertion;
    }
}
