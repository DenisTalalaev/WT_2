package dtalalaev.labs.laba1.lis;

import org.junit.jupiter.api.Test;

import static dtalalaev.labs.laba1.lis.Lab1_5.calcLISLen;
import static dtalalaev.labs.laba1.lis.Lab1_5.minRemovals;
import static org.junit.jupiter.api.Assertions.*;

class Lab1_5Test {

    @Test
    void testCalcLISLen_EmptyArray() {
        int[] arr = {};
        int result = calcLISLen(arr);
        assertEquals(0, result);
    }

    @Test
    void testCalcLISLen_SingleElement() {
        int[] arr = {5};
        int result = calcLISLen(arr);
        assertEquals(1, result);
    }

    @Test
    void testCalcLISLen_AllDecreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        int result = calcLISLen(arr);
        assertEquals(1, result);
    }

    @Test
    void testCalcLISLen_AllIncreasing() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = calcLISLen(arr);
        assertEquals(5, result);
    }

    @Test
    void testCalcLISLen_MixedSequence() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int result = calcLISLen(arr);
        assertEquals(6, result);
    }


    @Test
    void testMinRemovals_EmptyArray() {
        int[] arr = {};
        int result = minRemovals(arr);
        assertEquals(0, result);
    }

    @Test
    void testMinRemovals_SingleElement() {
        int[] arr = {5};
        int result = minRemovals(arr);
        assertEquals(0, result);
    }

    @Test
    void testMinRemovals_AllDecreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        int result = minRemovals(arr);
        assertEquals(4, result);
    }

    @Test
    void testMinRemovals_AllIncreasing() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = minRemovals(arr);
        assertEquals(0, result);
    }

    @Test
    void testMinRemovals_MixedSequence() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int result = minRemovals(arr);
        assertEquals(3, result);
    }

}