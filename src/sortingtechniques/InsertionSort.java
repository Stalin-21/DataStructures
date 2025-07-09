package sortingtechniques;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] empId = {103, 101, 104, 102, 105};
        int n = empId.length;
        for (int i = 1; i < n; i++) {
            int key = empId[i];
            int j = i - 1;
            while (j >= 0 && empId[j] > key) {
                empId[j + 1] = empId[j];
                j--;
            }
            empId[j + 1] = key;
        }
        System.out.println(Arrays.toString(empId));
    }
}
