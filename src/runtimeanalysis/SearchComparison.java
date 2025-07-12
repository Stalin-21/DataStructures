package runtimeanalysis;

import java.util.Arrays;

public class SearchComparison {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1_000_000};
        int target = -1; // Worst-case target (not found)

        for (int size : datasetSizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = i; // already sorted

            System.out.println("---- Dataset Size: " + size + " ----");

            // Linear Search
            long start = System.nanoTime();
            linearSearch(arr, target);
            long end = System.nanoTime();
            System.out.printf("Linear Search Time: %.3f ms%n", (end - start) / 1_000_000.0);

            // Binary Search
            start = System.nanoTime();
            binarySearch(arr, target);
            end = System.nanoTime();
            System.out.printf("Binary Search Time: %.3f ms%n%n", (end - start) / 1_000_000.0);
        }
    }
}