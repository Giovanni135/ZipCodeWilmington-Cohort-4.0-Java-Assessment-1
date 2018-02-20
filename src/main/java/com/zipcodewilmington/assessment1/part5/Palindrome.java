package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {

        int isItPalindromic = 0;
        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                StringBuilder reverseInput = new StringBuilder(input.substring(i, j));
                reverseInput.reverse();
                if (input.substring(i, j).equals(reverseInput.toString())) {
                    isItPalindromic++;
                }
            }
        }
        return isItPalindromic;
    }
}
