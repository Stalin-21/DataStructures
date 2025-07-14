package runtimeanalysis;

import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int size = 1_000_000;
        int target = size - 1;

        // Generate sample data
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // --- Array (Linear Search) ---
        long start = System.nanoTime();
        boolean foundArray = false;
        for (int num : array) {
            if (num == target) {
                foundArray = true;
                break;
            }
        }
        long end = System.nanoTime();
        System.out.printf("Array Search (O(N)) Found: %b | Time: %.3f ms%n", foundArray, (end - start) / 1_000_000.0);

        // --- HashSet (O(1)) ---
        start = System.nanoTime();
        boolean foundHashSet = hashSet.contains(target);
        end = System.nanoTime();
        System.out.printf("HashSet Search (O(1)) Found: %b | Time: %.3f ms%n", foundHashSet, (end - start) / 1_000_000.0);

        // --- TreeSet (O(log N)) ---
        start = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(target);
        end = System.nanoTime();
        System.out.printf("TreeSet Search (O(log N)) Found: %b | Time: %.3f ms%n", foundTreeSet, (end - start) / 1_000_000.0);
    }
}
