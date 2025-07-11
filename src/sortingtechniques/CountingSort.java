package sortingtechniques;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 14, 13, 12, 10, 18, 17, 11};

        System.out.println("Before Sorting: " + Arrays.toString(ages));

        int[] sortedAges = countingSort(ages, 10, 18);  // min = 10, max = 18

        System.out.println("After Sorting: " + Arrays.toString(sortedAges));
    }

    public static int[] countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;

        // Step 1: Count occurrences
        int[] count = new int[range];
        for (int age : arr) {
            count[age - min]++;
        }

        // Step 2: Generate the sorted array
        int[] output = new int[arr.length];
        int index = 0;

        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                output[index++] = i + min;
                count[i]--;
            }
        }

        return output;
    }
}
