package dtalalaev.labs.laba1.merge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static dtalalaev.labs.laba1.merge.Lab1_8.findMergeIndexes;
import static org.junit.jupiter.api.Assertions.*;

class Lab1_8Test {

    @Test
    void testFindMergeIndexes_EmptyLists() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(), result);
    }

    @Test
    void testFindMergeIndexes_OneEmptyList() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(), result);
    }

    @Test
    void testFindMergeIndexes_NoCommonElements() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(4, 5, 6));
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(List.of(3,3,3)), result);
    }

    @Test
    void testFindMergeIndexes_CommonElements() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(2, 4, 6, 7, 8));
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(List.of(1,2,3,4,4)), result);
    }

    @Test
    void testFindMergeIndexes_CommonElementsWithDuplicates() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(2, 3, 4, 4, 5, 6));
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(List.of(2,4,5,5,6,6)), result);
    }
}