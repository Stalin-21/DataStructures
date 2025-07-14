package runtimeanalysis;

import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) throws IOException {
        String filePath = "sample.txt";

        // ---- Using FileReader ----
        long start = System.nanoTime();
        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {
                // Reading char by char
            }
        }
        long end = System.nanoTime();
        System.out.printf("FileReader Time: %.3f ms%n", (end - start) / 1_000_000.0);

        // ---- Using InputStreamReader ----
        start = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1) {
                // Reading byte converted to char
            }
        }
        end = System.nanoTime();
        System.out.printf("InputStreamReader Time: %.3f ms%n", (end - start) / 1_000_000.0);
    }
}
