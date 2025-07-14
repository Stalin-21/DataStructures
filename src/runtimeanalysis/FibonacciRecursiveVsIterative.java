package runtimeanalysis;

public class FibonacciRecursiveVsIterative {

    public static void main(String[] args) {
        int n = 30;  // You can test with 10, 20, 30, 40...

        // --- Recursive Approach ---
        long start = System.nanoTime();
        int fibRec = fibonacciRecursive(n);
        long end = System.nanoTime();
        System.out.printf("Recursive Fibonacci(%d) = %d | Time: %.3f ms%n", n, fibRec, (end - start) / 1_000_000.0);

        // --- Iterative Approach ---
        start = System.nanoTime();
        int fibItr = fibonacciIterative(n);
        end = System.nanoTime();
        System.out.printf("Iterative Fibonacci(%d) = %d | Time: %.3f ms%n", n, fibItr, (end - start) / 1_000_000.0);
    }

    // Recursive method (inefficient for large n)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method (efficient)
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
