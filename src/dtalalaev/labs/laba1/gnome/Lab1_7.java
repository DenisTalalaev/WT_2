package dtalalaev.labs.laba1.gnome;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1_7 {


    public static void main(String[] args) {
        System.out.println("Enter n - size of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        arr = gnomeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] gnomeSort(int[] arr) {
        if(arr == null) {
            return null;
        }
        int n = arr.length;
        if(n == 1) {
            return arr;
        }
        int index = 0;
        while(index < n){
            if(index == 0){
                index++;
            }
            if(arr[index-1] <= arr[index]){
                index++;
            } else {
                arr[index-1] = arr[index-1] ^ arr[index];
                arr[index] = arr[index-1] ^ arr[index];
                arr[index-1] = arr[index-1] ^ arr[index];
                index--;
            }
        }
        return arr;
    }
}
