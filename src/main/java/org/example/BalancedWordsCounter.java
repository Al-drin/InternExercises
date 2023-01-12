package org.example;

/*
 * Exercise 2: Balanced words counter
 * Balanced words definition: The word is balanced if every letter that occurs in it occurs in the same number of time.
 * E.g. the words: “mama”, “ear”, “aabbcbcccbaa” are balanced but the words “dad”, “elephant”, “abcba” are not.
 * Additionally, the balanced word is not empty.
 * Create a “BalancedWordsCounter” class with one public method called “count” (you can create other private methods)
 * which has to count how many balanced subwords exist in the input word.
 * method should receive String (parameter name = “input”)
 * method should return Integer
 * the input should contain the letters only, throw an exception if the text contains other characters.
 * if the input is null then method should throw an exception
 */

import java.util.*;

public class BalancedWordsCounter {
    public static Integer count(String input) {
        if (input == null || !input.chars().allMatch(Character::isLetter)) {
            throw new RuntimeException();
        }

        int result = 0;

        for (int i=0; i<input.length(); i++) {
            for (int j=i+1; j<=input.length(); j++) {
                if (isBalancedWord(input.substring(i,j))) {
                    result++;
                }
            }
        }

        return result;
    }

    private static boolean isBalancedWord(String input) {
        if (input == null || input.length() < 1) {
            return false;
        }

        if (input.length() == 1) {
            return true;
        }

        Map<Character, Integer> chars = new HashMap<>();

        for (int i=0; i<input.length(); i++) {
            chars.merge(input.charAt(i), 1, Integer::sum);
        }

        return chars.values().stream().distinct().count() == 1;
    }
}
