package dtalalaev.labs.laba1.primes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Lab1_4Test {


    @Test
    void testFindIndexesPrime_EmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = Lab1_4.findIndexesPrime(numbers);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesPrime_NoPrimes() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 6, 8, 9, 15, 25));
        ArrayList<Integer> result = Lab1_4.findIndexesPrime(numbers);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesPrime_AllPrimes() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13));
        ArrayList<Integer> result = Lab1_4.findIndexesPrime(numbers);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesPrime_MixedNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 4, 7, 8, 11, 12, 17));
        ArrayList<Integer> result = Lab1_4.findIndexesPrime(numbers);
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 4, 6));
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesPrime_SinglePrime() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 6, 8, 13, 15, 25));
        ArrayList<Integer> result = Lab1_4.findIndexesPrime(numbers);
        ArrayList<Integer> expected = new ArrayList<>(List.of(3));
        assertEquals(expected, result);
    }

    @Test
    void testIsPrime_NegativeNumber() {
        assertFalse(Lab1_4.isPrime(-1));
        assertFalse(Lab1_4.isPrime(-10));
        assertFalse(Lab1_4.isPrime(Integer.MIN_VALUE));
    }

    @Test
    void testIsPrime_NotPrimeNumbers() {
        assertFalse(Lab1_4.isPrime(0));
        assertFalse(Lab1_4.isPrime(1));
        assertFalse(Lab1_4.isPrime(4));
        assertFalse(Lab1_4.isPrime(8));
        assertFalse(Lab1_4.isPrime(15));
    }

    @Test
    void testIsPrime_PrimeNumbers() {
        assertTrue(Lab1_4.isPrime(2));
        assertTrue(Lab1_4.isPrime(3));
        assertTrue(Lab1_4.isPrime(5));
        assertTrue(Lab1_4.isPrime(7));
        assertTrue(Lab1_4.isPrime(11));
        assertTrue(Lab1_4.isPrime(13));
    }

    @Test
    void testIsPrime_LargePrimeNumber() {
        assertTrue(Lab1_4.isPrime(104729)); // 10,000th prime number
    }

    @Test
    void testIsPrime_LargeNonPrimeNumber() {
        assertFalse(Lab1_4.isPrime(104730)); // 104729 is the previous prime
    }
}