package runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort (O(n^2))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization
        }
    }

    // Merge Sort (O(n log n))
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // Quick Sort (O(n log n) average case)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000}; // You can increase later
        Random rand = new Random();

        for (int size : sizes) {
            System.out.println("---- Dataset Size: " + size + " ----");

            int[] original = rand.ints(size, 0, size).toArray();

            // Bubble Sort
            int[] bubbleArr = Arrays.copyOf(original, original.length);
            long start = System.nanoTime();
            bubbleSort(bubbleArr);
            long end = System.nanoTime();
            System.out.printf("Bubble Sort Time: %.3f ms%n", (end - start) / 1_000_000.0);

            // Merge Sort
            int[] mergeArr = Arrays.copyOf(original, original.length);
            start = System.nanoTime();
            mergeSort(mergeArr, 0, mergeArr.length - 1);
            end = System.nanoTime();
            System.out.printf("Merge Sort Time: %.3f ms%n", (end - start) / 1_000_000.0);

            // Quick Sort
            int[] quickArr = Arrays.copyOf(original, original.length);
            start = System.nanoTime();
            quickSort(quickArr, 0, quickArr.length - 1);
            end = System.nanoTime();
            System.out.printf("Quick Sort Time: %.3f ms%n%n", (end - start) / 1_000_000.0);
        }
    }
}
