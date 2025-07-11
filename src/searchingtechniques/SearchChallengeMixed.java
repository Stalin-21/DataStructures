package searchingtechniques;

import java.util.Arrays;

public class SearchChallengeMixed {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;

        int missingPositive = findFirstMissingPositive(nums.clone());
        System.out.println("First Missing Positive Integer: " + missingPositive);

        // Binary search part
        Arrays.sort(nums); // Binary search requires sorted array
        int index = binarySearch(nums, target);
        System.out.println("Index of target (" + target + "): " + index);
    }

    // Part 1: Linear search - Find first missing positive
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Place nums[i] at its correct position if possible
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Now check which position is incorrect
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // Part 2: Binary search - Search for target
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}