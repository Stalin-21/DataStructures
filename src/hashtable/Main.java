package hashtable;

public class Main {
    public static void main(String[] args) {
        // === UC1: Small sentence ===
        System.out.println("=== UC1: Small sentence ===");
        MyHashTable<String, Integer> smallTable = new MyHashTable<>();
        String sentence = "To be or not to be";
        String[] smallWords = sentence.toLowerCase().split(" ");

        for (String word : smallWords) {
            smallTable.add(word, 1);
        }
        smallTable.print();

        // === UC2: Large/simple paragraph ===
        System.out.println("\n=== UC2: Paragraph ===");
        MyHashTable<String, Integer> largeTable = new MyHashTable<>();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] paraWords = paragraph.toLowerCase().split(" ");

        for (String word : paraWords) {
            largeTable.add(word, 1);
        }
        largeTable.print();
    }
}
