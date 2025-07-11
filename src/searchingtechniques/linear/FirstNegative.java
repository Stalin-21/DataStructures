package searchingtechniques.linear;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, -7, 6, -2};
        int index = findFirstNegative(arr);
        System.out.println("First negative number index: " + index);
    }

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return as soon as negative number is found
            }
        }
        return -1; // No negative number found
    }
}
