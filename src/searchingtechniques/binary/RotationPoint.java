package searchingtechniques.binary;

public class RotationPoint {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};  // Rotated sorted array
        int index = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Rotation point is in the right half
                left = mid + 1;
            } else {
                // Rotation point is in the left half (including mid)
                right = mid;
            }
        }

        // Left is now pointing to the smallest element
        return left;
    }
}
