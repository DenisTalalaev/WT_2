package dtalalaev.labs.laba1.primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab1_4 {

    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        N = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(N);
        System.out.println("Enter array's elements");
        for (int i = 0; i < N; i++) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        ArrayList<Integer> primeIndexes = findIndexesPrime(numbers);
        System.out.println(primeIndexes.size() == 0? "No prime numbers" : Arrays.toString(primeIndexes.toArray()));
    }

    public static ArrayList<Integer> findIndexesPrime(ArrayList<Integer> numbers) {
        ArrayList<Integer> primesIndexes = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(isPrime(numbers.get(i))) {
                primesIndexes.add(i);
            }
        }
        return primesIndexes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
