package dtalalaev.labs.laba1.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static dtalalaev.labs.laba1.matrix.Lab1_6.fillMatrix;
import static org.junit.jupiter.api.Assertions.*;

class Lab1_6Test {

    @Test
    void testFillMatrix_EmptyList() {
        ArrayList<Integer> items = new ArrayList<>();
        int[][] result = fillMatrix(items);
        int[][] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    void testFillMatrix_SingleItem() {
        ArrayList<Integer> items = new ArrayList<>(List.of(5));
        int[][] result = fillMatrix(items);
        int[][] expected = {{5}};
        assertArrayEquals(expected, result);
    }

    @Test
    void testFillMatrix_MultipleItems() {
        ArrayList<Integer> items = new ArrayList<>(List.of(1, 2, 3, 4));
        int[][] result = fillMatrix(items);
        int[][] expected = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
        assertArrayEquals(expected, result);
    }

    @Test
    void testFillMatrix_RepeatedItems() {
        ArrayList<Integer> items = new ArrayList<>(List.of(1, 1, 1, 1));
        int[][] result = fillMatrix(items);
        int[][] expected = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        assertArrayEquals(expected, result);
    }
}