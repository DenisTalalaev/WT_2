package dtalalaev.labs.laba1.gnome;

import org.junit.jupiter.api.Test;

import static dtalalaev.labs.laba1.gnome.Lab1_7.gnomeSort;
import static org.junit.jupiter.api.Assertions.*;

class Lab1_7Test {

    @Test
    void testGnomeSort_EmptyArray() {
        int[] arr = {};
        int[] sortedArr = gnomeSort(arr);
        assertArrayEquals(new int[]{}, sortedArr);
    }

    @Test
    void testGnomeSort_SingleElement() {
        int[] arr = {5};
        int[] sortedArr = gnomeSort(arr);
        assertArrayEquals(new int[]{5}, sortedArr);
    }

    @Test
    void testGnomeSort_SortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = gnomeSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    void testGnomeSort_ReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = gnomeSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    void testGnomeSort_RandomOrderArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] sortedArr = gnomeSort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, sortedArr);
    }
}