package runtimeanalysis;

public class StringConcatPerformance {

    public static void main(String[] args) {
        int operations = 100_000;  // You can increase to 1_000_000 for deeper benchmarking

        // --- Using String ---
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < operations; i++) {
            s += "a";
        }
        long end = System.nanoTime();
        System.out.printf("String Time: %.3f ms%n", (end - start) / 1_000_000.0);

        // --- Using StringBuilder ---
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operations; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.printf("StringBuilder Time: %.3f ms%n", (end - start) / 1_000_000.0);

        // --- Using StringBuffer ---
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < operations; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        System.out.printf("StringBuffer Time: %.3f ms%n", (end - start) / 1_000_000.0);
    }
}
