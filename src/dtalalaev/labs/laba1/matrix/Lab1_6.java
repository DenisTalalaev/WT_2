package dtalalaev.labs.laba1.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab1_6 {

    public static int[][] fillMatrix(ArrayList<Integer> items) {
        int n = items.size();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = items.get((i + j) % n);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println("Enter n - size of matrix");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter elements of matrix");
        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(scanner.nextInt());
        }
        int[][] matrix = fillMatrix(items);

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        scanner.close();
    }

}
