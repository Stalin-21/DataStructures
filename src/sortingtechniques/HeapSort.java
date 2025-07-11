package sortingtechniques;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] salaries = {45000, 60000, 35000, 50000, 70000};

        System.out.println("Before Sorting: " + Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("After Sorting: " + Arrays.toString(salaries));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at index i (size is n)
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // Left child index
        int right = 2 * i + 2;    // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap root with largest child
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}
