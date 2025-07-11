package sortingtechniques;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] prices = {500, 200, 800, 300, 1000, 600};

        System.out.println("Before Sorting: " + Arrays.toString(prices));

        quickSort(prices, 0, prices.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(prices));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array, and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively apply quicksort to the left and right of the pivot
            quickSort(arr, low, pi - 1);   // Elements before pivot
            quickSort(arr, pi + 1, high);  // Elements after pivot
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Use last element as pivot
        int i = low - 1;        // i keeps track of smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the pivot index
    }
}
