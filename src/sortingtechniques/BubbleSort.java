package sortingtechniques;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
    // created array with student marks.
    int[] marks = {78, 45, 62, 89, 34};

    int n = marks.length;

    boolean swapped;

    for(int i = 0; i < n-1; i++){
        swapped = false;
        for(int j = 0; j < n-i-1; j++){
            if(marks[j] > marks[j+1]){
                int temp = marks[j];
                marks[j] = marks[j+1];
                marks[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped) break;
    }
        System.out.println(Arrays.toString(marks));
    }
}
