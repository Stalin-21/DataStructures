package hashtable;

public class Main {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            hashTable.add(word, 1);
        }

        System.out.println("Word frequencies:");
        hashTable.print();
    }
}
