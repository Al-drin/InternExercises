package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Create a “BubbleSortTest” class and create test methods for below cases:
 *  input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8]
 *  input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9]
 *  input = [] result = []
 *  input = [null,5.0001] result = [5.0001]
 *  input = null result = RuntimeException
 */
class BubbleSortTest {

    @Test
    void sort_positiveIntegerListGiven_sortedCollectionReturned() {
        //given
        List<Integer> input = List.of(1,4,5,6,8,3,8);
        List<Integer> expectedResult = List.of(1,3,4,5,6,8,8);
        //when
        List<Integer> result = BubbleSort.sort(input);
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void sort_floatListWithNegativesGiven_sortedCollectionReturned() {
        //given
        List<Float> input = List.of(-9.3F,0.2F,4F,0.1F,5F,9F);
        List<Float> expectedResult = List.of(-9.3F,0.1F,0.2F,4F,5F,9F);
        //when
        List<Float> result = BubbleSort.sort(input);
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void sort_emptyListGiven_emptyListReturned() {
        //given
        List<Integer> input = List.of();
        List<Integer> expectedResult = List.of();
        //when
        List<Integer> result = BubbleSort.sort(input);
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void sort_listWithNullsGiven_nullsRemovedSortedListReturned() {
        //given
        List<Float> input = Arrays.asList(null, 5.0001F);
        List<Float> expectedResult = List.of(5.0001F);
        //when
        List<Float> result = BubbleSort.sort(input);
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void sort_nullGiven_runtimeExceptionThrown() {
        //given
        //when
        //then
        assertThrows(RuntimeException.class, () -> BubbleSort.sort(null));
    }
}
