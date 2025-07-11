package sortingtechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {65, 90, 70, 55, 80};

        System.out.println("Before Sorting: " + Arrays.toString(scores));

        selectionSort(scores);

        System.out.println("After Sorting: " + Arrays.toString(scores));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the smallest

            // Find the actual minimum in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
