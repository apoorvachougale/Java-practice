package com.java.array.intro;
import java.util.Scanner;
import java.util.Arrays;

public class MinMaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first array
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Read second array
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Merge arrays
        int mergedArr[] = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArr[n1 + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArr));

        // Find min and max
        int min = mergedArr[0], max = mergedArr[0];
        for (int num : mergedArr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        scanner.close();
    }
}
