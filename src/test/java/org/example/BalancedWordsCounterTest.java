package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Create a “BalancedWordsCounterTest” and create a test methods for below cases:
 * input = “aabbabcccba” result = 28
 * input = “” result = 0
 * input = “abababa1” result = RuntimeException
 * input = null result = RuntimeException
 */
class BalancedWordsCounterTest {

    @Test
    void count_validStringGiven_validCountReturned() {
        //given
        String input = "aabbabcccba";
        int expected = 28;
        //when
        int result = BalancedWordsCounter.count(input);
        //then
        assertEquals(expected, result);
    }

    @Test
    void count_emptyStringGiven_validCountReturned() {
        //given
        String input = "";
        int expected = 0;
        //when
        int result = BalancedWordsCounter.count(input);
        //then
        assertEquals(expected, result);
    }

    @Test
    void count_invalidStringGiven_runtimeExceptionThrown() {
        //given
        String input = "abababa1";
        //when
        //then
        assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(input));
    }

    @Test
    void count_nullGiven_runtimeExceptionThrown() {
        //given
        String input = null;
        //when
        //then
        assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(input));
    }
}
