package dtalalaev.labs.laba1.lis;

import java.util.Scanner;

public class Lab1_5 {

    public static int calcLISLen(int[] arr) {
        int[] dp = new int[arr.length];

        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }

    public static int minRemovals(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0; //no elements
        }
        int maxLen = calcLISLen(arr);
        return n - maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Enter num of elements");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter array elements");
        scanner.close();
        System.out.println("Answer = " + minRemovals(arr));
    }
}
