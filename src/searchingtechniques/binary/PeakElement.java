package searchingtechniques.binary;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0}; // 20 is a peak
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element is: " + arr[peakIndex]);
    }

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right
                left = mid + 1;
            } else {
                // Peak is on the left (or mid)
                right = mid;
            }
        }

        return left; // or right, both are same here
    }
}
